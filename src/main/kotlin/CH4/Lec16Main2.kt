package CH4

fun Person.nextYearAge(): Int {
    println("확장 함수")
    return this.age + 1
}

fun main() {

    val person = Person("A", "B", 100)

    // 확장함수와 멤버함수의 시그니처가 동일할 경우에는 멤버함수가 우선 호출된다.
    person.nextYearAge()
}