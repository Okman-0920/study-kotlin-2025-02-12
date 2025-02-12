import org.junit.jupiter.api.Test
import kotlin.test.assertEquals

class ControlFlow {

    // if
    @Test
    fun `if`() {
        val max = max(1, 10)
        assertEquals(10, max)
    }

    private fun max(num1: Int, num2: Int): Int = /* return 타입 */ if (num1 > num2) num1 else num2

    // when


    // while


    // for
}