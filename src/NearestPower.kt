import kotlin.math.*

data class Expr(val op: String,     // pow, fact, etc
                val value: Long,    // evaluated result of expr
                val x: Long,        // radix
                val k: Long?,       // exponent for POW
                val dist: Long    // dist from N, +/-
) {
    override fun toString(): String = "$value=$x^$k\tdist:$dist"
}

/**
 * compute z=x^k <= n
 * @return an expression describing the computed value z, x and k as a POW operation.
 */
fun nearestPowerLessThan(n: Long): Expr {
    val kmax = floor(log(n.toDouble(), 2.0))
    var dist: Long
    var best_dist: Long = n
    var z: Double
    var x: Double
    var k: Double = 2.0
    var best_k: Double = 0.0
    var best_x: Double = 0.0
    var best_z: Double = 0.0

    while (k <= kmax + 1) {
        x = floor(n.toDouble().pow(1.0 / k))
        z = x.pow(k)
        dist = n - z.toLong()

        if (abs(dist) < best_dist) {
            best_dist = dist
            best_k = k
            best_x = x
            best_z = z
        }
        k ++
    }

    return Expr("POW", best_z.toLong(), best_x.toLong(), best_k.toLong(), best_dist)
}

/**
 * compute z=x^k near n, above or below
 *
 * @return an expression describing the computed value z, x and k as a POW operation.
 */
fun nearestPower(n: Long): Expr {
    val target = 2*n
    val kmax = log(target.toDouble(), 2.0)
    var dist: Long
    var best_dist: Long = n
    var z: Double
    var x: Double
    var k: Double = 2.0
    var best_k: Double = 0.0
    var best_x: Double = 0.0
    var best_z: Double = 0.0

    while (k <= kmax + 1) {
        x = floor(n.toDouble().pow(1.0 / k))
        z = x.pow(k)
        dist = n - z.toLong()

        if (abs(dist) < best_dist) {
            best_dist = dist
            best_k = k
            best_x = x
            best_z = z
        }
        k ++
    }

    return Expr("POW", best_z.toLong(), best_x.toLong(), best_k.toLong(), best_dist)
}