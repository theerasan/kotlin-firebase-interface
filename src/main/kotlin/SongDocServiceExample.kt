import express.ExpressApp
import express.Request
import express.Response
import extention.asModel
import firebase.FirebassAppExample
import model.SongExample

class SongDocServiceExample(firebaseApp: FirebassAppExample) {
    private val api = express.ExpressExample().api
    val store = firebaseApp.firestore
    val database = firebaseApp.database

    fun getApi(): ExpressApp {
        api.get("/:id/details/", getSong())
        api.get("/list/", getSongs())
        api.put("/create/", createSong())
        api.post("/:id/update/", updateSong())
        api.delete("/:id/delete/", deleteSong())
        return api
    }

    private fun getSong(): (Request, Response) -> Unit = { req, res ->
        val id = req.param("id") ?: ""
        store.collection("songs")
                .doc(id)
                .get()
                .then {
                    if (!it.exists) {
                        res.status(404).send("Not fond song $id")
                        return@then
                    }
                    res.status(200).send(it.data<SongExample>())
                }
                .catch {
                    res.status(500).send(it.message ?: "")
                }
    }

    private fun getSongs(): (Request, Response) -> Unit = { _, res ->
        store.collection("songs")
                .get()
                .then {
            val songs = it.docs.map { it.data<SongExample>() }
            res.status(200).send(songs)
        }.catch {
            res.status(500).send(it.message ?: "")
        }
    }

    private fun createSong(): (Request, Response) -> Unit = { req, res ->
        val key = database.ref("songs").push().key ?: ""
        val song = req.body.asModel<SongExample>()
        song.key = key
        store.collection("songs").doc(key).set(song)
                .then {
                    res.status(200).send("${song.title} by ${song.artist} has been created")
                }.catch {
                    res.status(500).send(it.message ?: "")
                }
    }

    private fun updateSong(): (Request, Response) -> Unit = { req, res ->
        val id = req.param("id") ?: ""
        val song = req.body.asModel<SongExample>()
        store.collection("songs")
                .doc(id)
                .update(song)
                .then {
                    res.status(200).send("Song $id has been updated")
                }
                .catch {
                    res.status(500).send(it.message ?: "")
                }
    }

    private fun deleteSong(): (Request, Response) -> Unit = { req, res ->
        val id = req.param("id") ?: ""
        store.collection("songs")
                .doc(id)
                .delete()
                .then {
                    res.status(200).send("Song id $id has been deleted")
                }
                .catch {
                    res.status(500).send(it.message ?: "")
                }
    }
}