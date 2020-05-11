import org.junit.jupiter.api.Assertions
import org.junit.jupiter.api.Test

class ArrayFunctionsTest {
    private val arrayFunctions = ArrayFunctions()

    @Test
    fun `find smallest element in array`() {
        val x = arrayOf(1, 2, 3)
        val y = arrayOf(1, 0)
        val z = arrayOf(5, 2, 6, 3, 4, 8)

        Assertions.assertEquals(1, arrayFunctions.findSmallestElement(x))
        Assertions.assertEquals(0, arrayFunctions.findSmallestElement(y))
        Assertions.assertEquals(2, arrayFunctions.findSmallestElement(z))
    }

    @Test
    fun `find second smallest element in array`() {
        val x = arrayOf(1, 2, 3)
        val y = arrayOf(1, 0)
        val z = arrayOf(5, 2, 6, 3, 4, 8)

        Assertions.assertEquals(2, arrayFunctions.findSecondSmallestElement(x))
        Assertions.assertEquals(1, arrayFunctions.findSecondSmallestElement(y))
        Assertions.assertEquals(3, arrayFunctions.findSecondSmallestElement(z))
    }
}