open class coche (open var length: Int = 100,open  var width: Int = 20,open  var height: Int = 40){
    open  var volume: Int
        get() = width + height + length
        set(value) {
            height=value
        }
        open var consumo: Double =0.0

    fun printSize() {
        println("Width: $width cm " +
                "Length: $length cm " +
                "Height: $height cm " +
                "volumen: $volume"
        )
    }

}
