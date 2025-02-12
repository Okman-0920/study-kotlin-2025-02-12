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

    // when -> java switch와 조금 비슷 코틀린엔 없음, if랑 비슷하지만 가독성을 고려하여 사용한다
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
//      val count = 0 // val 변경 불가
        var count = 0
        var sum = 0 // 변경 가능함

        while (count < 5) {
            sum += count
            count++
        }

        // sum = 0 + 1 + 2 + 3 + 4
        assertEquals(10, sum)
    }


    // for
    @Test
    fun `for`() {
        val list = listOf(1, 2, 3, 4, 5)
        var sum = 0 // var 은 값이 변할 수 있다.

        for (number in list) { // in절은 list를 순회하면서 하나씩 접근하는 것
            sum = sum + number
        }

        assertEquals(15, sum)
    }
}