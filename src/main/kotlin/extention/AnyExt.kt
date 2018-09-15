package extention

fun <T> Any.asModel(): T {
    return JSON.parse((JSON.stringify(this.asDynamic())))
}