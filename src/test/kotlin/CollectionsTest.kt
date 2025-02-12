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
    @Test
    fun immutableSet() {
        val set = setOf(1, 2, 3, 1, 1)

//        set.add
    }

    @Test
    fun mutableSet() { // 변경이 가능한 List
        val set = mutableSetOf(1, 2, 3)
        set.add(4)
        set.add(1)
        set.add(1)
        set.add(1)
        set.add(1)
        set.add(1)
        println(set)
    }


    // 3. Map
    @Test
    fun immutableMap() {
        val map = mapOf("Apple" to 100, "Banana" to 200, "Orange" to 300)
        println(map)

        // 에플리라는 키에 접속하면 뭐가나오니?
        assertEquals(100, map["Apple"])
        assertEquals(200, map["Banana"])
        assertEquals(300, map["Orange"])

        // map["Apple"] = 300 300변경해줘  못함
    }

    @Test
    fun mutableMap() { // 변경이 가능한 List
        val map = mutableMapOf("Apple" to 100, "Banana" to 200, "Orange" to 300)
        println(map)

        // 에플리라는 키에 접속하면 뭐가나오니?
        assertEquals(100, map["Apple"])
        assertEquals(200, map["Banana"])
        assertEquals(300, map["Orange"])

        map["Apple"] = 300
        assertEquals(300, map["Apple"])
    }
}