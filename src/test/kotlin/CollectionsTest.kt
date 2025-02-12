import org.junit.jupiter.api.Test
import kotlin.test.assertEquals

class CollectionsTest {

    // 1. List
    @Test
    fun `List - Immutable`() { // 변경이 불가능한 List
        // listOf 는 안전하다, 정해진 값이 불변임
        // 코틀린은 기본적로 이뮤터블하게 만든다
        val list = listOf("a","b","c","d","e","f")
        assertEquals("a", list[0])
        assertEquals(6, list.size)
        assertEquals(true, list.contains("a")) // 포함

        // 아래 두개 변경 불가
        // list.add("test")
        // list[0] = "change"
    }

    @Test
    fun `List - Mutable`() { // 변경이 가능한 List
        val list = mutableListOf("a","b","c","d","e","f")
        assertEquals("a", list[0])
        assertEquals(6, list.size)
        assertEquals(true, list.contains("a")) // 포함

        list.add("test")
        list.remove("a")
        list[0] = "change"

        println(list)
    }

    // 2. Set



    // 3. Map
}