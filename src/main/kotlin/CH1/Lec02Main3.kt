package CH1

fun main() {

    val person = Person("코린이", 100)
    startWithA(person.name)
}

fun startWithA(str: String) : Boolean {
    return str.startsWith("A")
}