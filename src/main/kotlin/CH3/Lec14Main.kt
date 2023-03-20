package CH3

fun main() {
    val person1 = PersonDto("코린이1", 100)
    val person2 = PersonDto("코린이1", 100)

    println(person1 == person2)

    println(person1)
}

// Data Class는 equals, hashcode, toString을 자동으로 만들어준다.
data class PersonDto(
    val name: String,
    val age: Int
)

// Java의 Enum 클래스와 선언하는 방법이 상당히 유사하다
enum class Country(
    private val code: String
) {
    KOREA("KO"),
    AMERICA("US")
}