package CH2

fun startsWithA(obj: Any) : Boolean {

    // 스마트 캐스팅과 when을 사용해서 코드를 간결하게 작성할 수 있다.
    return when(obj) {
        is String -> obj.startsWith("A")
        else -> false
    }
}

fun judgeNumber(number: Int) {

    when (number) {
        1, 0, -1 -> println("어디서 많이 본 숫자 입니다")
        else -> println("1, 0, -1이 아닙니다")

    }
}

fun judgeNumber2(number: Int) {

    // when은 값 없이 사용할 수 있다.
    when {
        number == 0 -> println("주어진 숫자는 0입니다.")
        number % 2 == 0 -> println("주어진 숫자는 짝수 입니다.")
        else -> println("주어진 숫자는 홀수입니다.")
    }
}