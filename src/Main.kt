
fun main(args: Array<String>) {
    for (i in 1..20L) {
        val lt = nearestPowerLessThan(i)
        val gt = nearestPower(i)
        val differ = if (lt==gt) "" else "*"
        println("$i: $lt ... $gt $differ")
    }
}