import org.junit.jupiter.api.Test
import kotlin.test.assertEquals

class InterOperWithJava { // 자바랑 어떻게 호완이 되나?

    @Test
    fun `java class call`() {
        // 객체 생성 시 New 도 안해도 됨
        val personJava = PersonJava(30, "Okman")

        personJava.name // 게터

        assertEquals(30, personJava.age)
        assertEquals("Okman", personJava.name)
    }
}