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

    // when - if랑 비슷하지만 가독성을 고려하여 사용한다, switch와 비슷함..
    @Test
    fun `when`() {
        val numberType1 = getNumberType(10)
        assertEquals("positive", numberType1)

        val numberType2 = getNumberType(0)
        assertEquals("zero", numberType2)

        val numberType3 = getNumberType(-1)
        assertEquals("negative", numberType3)
    }

    private fun getNumberType(number: Int): String =
        when { // whend은 else 브렌치 필요
        // 만약에 number가 0보다 작으면
        number < 0 -> "negative"
        number == 0 -> "zero"
        number > 0 -> "positive"
        else -> "error"
    }

    // while
    @Test
    fun `while`() {
        val count = 0
        var counter = 0

        while (count < 5) {

        }
    }



    // for
}