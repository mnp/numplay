import java.math.BigInteger

fun Long.toBigInteger() = BigInteger.valueOf(this)
fun Int.toBigInteger() = BigInteger.valueOf(toLong())

val a = BigInteger("1")
val b = 12.toBigInteger()
val c = 2L.toBigInteger()

fun mxain(argv:Array<String>){
    println((a + b)/c) // prints out 6
}