class coche (var length: Int = 100, var width: Int = 20, var height: Int = 40){
    var volume: Int
        get() = width + height + length
        set(value) {
            height=value
        }

    fun printSize() {
        println("Width: $width cm " +
                "Length: $length cm " +
                "Height: $height cm " +
                "volumen: $volume"
        )
    }

}