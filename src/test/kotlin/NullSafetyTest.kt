import org.junit.jupiter.api.Assertions.assertNotEquals
import org.junit.jupiter.api.Assertions.assertNull
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.assertThrows
import kotlin.test.assertEquals
import kotlin.test.assertNotNull

class NullSafetyTest {

    @Test
    fun notNullableTypes() {
        val language = "kotlin" // 변수 val or var 로 함
        assertNotNull(language)
    }

    @Test
    fun nullableTypes() { // 코틀린은 널러블을 설정할 수 있따
        val language: String? = null // ???를 사용함..
        val name: String
        assertNull(language)

    }

    @Test
    fun safeCall() {
        val language: String? = null // language 라는 변수는 스트링 타입인데 null 이 될 수 있어
        val length = language?.length
        assertNull(length)

        val notNullLanguage: String = "Java"
        val notNullLanguageLength = notNullLanguage.length
        assertEquals(4, notNullLanguageLength)
    }

    @Test
    fun elvisOperator() { // 디폴트 값을 지정할 수 있음
        val language: String? = null // 랭귀지라는 변수는 스트링 타입이고 널이 될 수 있다
        val length = language?.length ?: 10 // 널에 대한 랭스를 구하려고 하는데 랭기지가 0이면 나는 10을 싶어
        // ?: 엘비스 연ㅅ간자임
        assertEquals(10, length)
    }

    @Test
    fun notNullAssertions() { // 오류 발생할수도 있으니 가능한 안아려고함
        val language: String? = null // null 가능성 제시
        language!!.length // 단언하는거, 무조건 null이 아니다

        assertThrows<NullPointerException> {
            language!!.length
        }
    }
}

// Java: String name = "jko"
// "jko"