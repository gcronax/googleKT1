abstract class coche (abstract var length: Int = 100,abstract  var width: Int = 20,abstract  var height: Int = 40){
    abstract  var volume: Int
        get() = width + height + length
        set(value) {
            height=value
        }
        abstract val consumo: Double

    fun printSize() {
        println("Width: $width cm " +
                "Length: $length cm " +
                "Height: $height cm " +
                "volumen: $volume"
        )
    }

}
