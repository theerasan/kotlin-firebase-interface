package extention

external class Object {
    companion object {
        fun keys(obj: Any): List<String>
        fun <T> values(obj: Any): List<T>
    }
}