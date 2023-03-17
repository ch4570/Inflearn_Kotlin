package CH2


fun main() {

    val numbers = listOf(1L, 2L, 3L)

    // Java 에서의 향상된 for문의 구조중 콜론(:)이 in으로 사용된다, 타입도 앞에 붙여주지 않는다.
    // Iterable한 객체라면 어떤 객체던지 순회가 가능하다.
    for (number in numbers) {
        println(number)
    }

    // 전통적인 for문
    // 1..3 은 1 ~ 3 이라는 뜻이다.
    for (i in 1..3) {
        println(i)
    }

    // 1..3 downTo 1 3~1 까지 1씩 감소하며 반복하는 뜻이다.
    for (i in 3 downTo 1) {
        println(i)
    }

    // 1..5 step 2는 i가 2씩 증가하면서 1부터 5까지 출력한다는 의미이다.
    // 1,3,5가 출력된다.
    for (i in 1..5 step 2) {
        println(i)
    }

}