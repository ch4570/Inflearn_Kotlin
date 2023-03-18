package CH2

fun main() {
    printAll("A", "B", "C")

    val array = arrayOf("A", "B", "C")
    printAll(*array)
}

// Kotlin에서는 가변인자를 사용할때 ... 대신 vararg 키워드를 사용해야 한다.
// Kotlin에서는 가변인자를 매개변수로 받는 함수를 호출할때 배열을 바로 넣어 줄 수 없고 스프레드 연산자(*)를 앞에 붙여줘야 한다.
fun printAll(vararg strings : String) {

    for (str in strings) {
        println(str)
    }
}