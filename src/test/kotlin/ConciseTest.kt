import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.Test

class ConciseTest {

    @Test
    fun functions() {
        val result = sum(3, 4)
        val result2 = sum(2, 5)

        assertEquals(4, result)
        assertEquals(7, result2)

    }

    private fun sum(num1: Int, num2: Int) = num1 + num2

    @Test
    fun dataclass() { // getter가 필요없다
        val person = Person("jok", "aarrll@naver.com")
        assertEquals("jok", person.name)
        assertEquals("aarrll@naver.com", person.email)

        val person2 = person.copy(name = "okman")
        assertEquals("jok", person.name)
        assertEquals("aarrll@naver.com", person.email)
    }

    data class Person(val name: String, val email: String)


    @Test
    fun stringTemplates() {
        val lan = "kotlin"
        val version = 2.0

        val concat = "Language is ${lan} and version is ${version}"
        assertEquals("Language is ${lan} and version is ${version}", concat)
    }

    @Test
    fun 확장함수() {
        val text: String = "Hello World!"
        println(text.repeatCustom(5))
    }

    fun String.repeatCustom(times: Int):String {
        return this.repeat(times)
    }
}