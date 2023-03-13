fun main(){
    var age: Int = 200

    println(age)

//    Floating Point
    var decimal: Double = 97.8

    println(decimal)

//    Long Integer
    var longInt: Long = 2000000000L

    println(longInt)

//    Literals
    var decimalLiteral: Int = 100
    var hexaDecimal: Int = 0xFF
    var binaryLiteral: Int = 0b0001

    println(decimalLiteral)
    println(hexaDecimal)
    println(binaryLiteral)

//    Underscore in number
    var price: Int = 1_000_000
    var long: Long = 2_000_000_000L

    println(price)
    println(long)

//    Number Conversion
    var number: Int = 100;

    var byte: Byte = number.toByte()
    var priceLongInt: Long = price.toLong()


}