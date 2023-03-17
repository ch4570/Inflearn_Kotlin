package CH1



fun main() {

    // Java -> 기본 타입간의 변환은 암시적으로 이루어진다.
    // Kotlin -> 기본 타입간의 변환은 명시적으로 이루어져야한다.
    val number1: Int? = 3
    val number2: Long = number1?.toLong() ?: 0

    printAgeIfPersonRefactor(Person("", 100))
}

fun printAgeIfPerson(obj: Any?) {

    // Java의 instanceOf와 같지만 형변환을 as 키워드를 사용해서 해줘야 한다.
    // val person = (Person) obj; 와 같은 코드이다.
    if (obj is Person) {
        val person = obj as Person
        println(person.age)
    }

    // !is는 obj가 Person 타입이 아니라면 ~ 이라는 의미가 된다.
    if (obj !is Person) {

    }
}

fun printAgeIfPersonRefactor(obj: Any?) {

    // printAgeIfPerson 함수를 간결하게 리팩토링
    // Safe Call 처럼 안전한 타입 캐스팅을 한다고 생각하면 된다.
    val person = obj as? Person
    println(person?.age)
}
