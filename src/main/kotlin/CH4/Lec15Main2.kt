package CH4

fun main() {

    // listOf 메서드를 사용해서 불변 List를 만들 수 있다.
    val numbers = listOf(100, 200)

    // 배열에 접근하는 것 처럼 인덱스 접근도 가능하다.
    println(numbers[0])

    for (number in numbers) {
        println(number)
    }

    for ((idx, value) in numbers.withIndex()) {
        println("$idx $value")
    }

    // 빈 List를 만들때는 타입을 추론할 수 없다면 생략이 불가능하다.
    val emptyList = emptyList<Int>()

    // 타입을 추론할 수 있다면 생략이 가능하다.
    printNumbers(emptyList())
}

private fun printNumbers(numbers: List<Int>) {

}