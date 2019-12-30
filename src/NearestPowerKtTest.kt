import org.testng.*
import kotlin.test.assertEquals

class NearestPowerKtTest {

    @org.testng.annotations.Test
    fun testNearestPowerLessThan() {
        assertEquals(Expr("POW", 27, 3, 3, 0), nearestPowerLessThan(27))
        assertEquals(Expr("POW", 64, 8, 2, 2), nearestPowerLessThan(66))
        assertEquals(Expr("POW",81, 9, 2, 18), nearestPowerLessThan(99))
        assertEquals(Expr("POW", 49, 7, 2, 13), nearestPower(62), "n=62")
        assertEquals(Expr("POW", 100, 10, 2, 2), nearestPower(102), "n=102")
    }

    fun testNearestPower() {
        // should be same as LessThan case
        assertEquals(Expr("POW", 27, 3, 3, 0), nearestPower(27))
        assertEquals(Expr("POW", 64, 8, 2, 2), nearestPower(66))
        assertEquals(Expr("POW",81, 9, 2, 18), nearestPower(99))

        assertEquals(Expr("POW", 64, 8, 2, -2), nearestPower(62))
        assertEquals(Expr("POW", 100, 10, 2, -2), nearestPower(102))
    }
}