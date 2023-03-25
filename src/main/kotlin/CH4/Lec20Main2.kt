package CH4

fun main() {

    val strings = listOf("APPLE", "CAR")

    strings.map { it.length }
        .filter { it > 3 }
        .let (::println)

    val str: String?

    str = "a"

    val length = str?.let {
        println(it.uppercase())
        it.length
    }


    val numbers = listOf("one", "two", "three", "four")

    // 일회성으로 지역변수를 만들어야 할때 사용
    val modifiedFirstItem = numbers.first()
        .let { firstItem ->
            if (firstItem.length >= 5) firstItem else "!$firstItem!"
        }.uppercase()

    println(modifiedFirstItem)

    // 객체 생성과 동시에 값을 넣어줄 수 있다.
    val person = Person3("코린이", 100).run {
        PersonRepository().save(this)
    }
}

class PersonRepository {

    fun save(person3: Person3) {

    }

}