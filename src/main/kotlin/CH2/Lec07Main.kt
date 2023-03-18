package CH2


fun parseIntOrThrowV1(str: String): Int {

    try {
        // 기본타입간의 변환은 toInt, toDouble 등을 사용한다.
        return str.toInt()
    } catch (e: NumberFormatException) {
        // 예외를 던질때도 new를 사용하지 않는다.
        throw IllegalArgumentException("주어진 ${str}는 숫자가 아닙니다")
    }
}

fun parseIntOrThrowV2(str: String): Int? {

    // try 문도 expression으로 간주되기에 try문을 return 해줄 수 있다.
    return try {
        str.toInt()
    } catch (e: NumberFormatException) {
        null
    }

}