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
    @Test
    fun `when`() {

    }

    private fun getNumberType(number: Int): String {
        return when { // whend은 else 브렌치 필요
            // 만약에 number가 0보다 작으면
            number < 0 -> "negative"
            number == 0 -> "zero"
            number > 0 -> "positive"
            else -> "error"
        }
    }

    // while


    // for
}