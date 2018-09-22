package extention

external class Object {
    companion object {
        fun keys(obj: Any): Array<String>
        fun <T> values(obj: Any): Array<T>
    }
}