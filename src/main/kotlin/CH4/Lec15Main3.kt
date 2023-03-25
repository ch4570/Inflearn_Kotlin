package CH4

fun main() {

    // Tip -> 불변 List로 만들고 꼭 필요한 경우 가변 List를 사용하자
    // 기본적인 구현체는 LinkedList이다
    val numbers = mutableListOf(100, 200)
    numbers.add(300)

    // 기본적인 구현체는 LinkedHashSet이다.
    val numbers2 = mutableSetOf(100, 200)

    val oldMap = mutableMapOf<Int, String>()

    // Map에 값을 넣어줄때 Map[Key] = VALUE식으로 넣어 줄 수 있다.
    oldMap[1] = "MONDAY"
    oldMap.put(1, "MONDAY")

    // mapOf를 사용하면 Key to Value의 형식으로 Map을 만들 수 있다.
    mapOf(1 to "MONDAY", 2 to "TUESDAY")

    for (key in oldMap.keys) {
        println(key)
        println(oldMap[key])
    }

    for ((key, value) in oldMap.entries) {
        println(key)
        println(value)
    }

}