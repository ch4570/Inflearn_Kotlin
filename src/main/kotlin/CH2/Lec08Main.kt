package CH2

fun main() {
    // Kotlin에서 매개변수를 넣어줄 매개변수의 이름을 명시하면 명시되지 않은 매개변수는 기본 값을 가진다.
    repeat("Hello World", useNewLine = false)
}

// 함수의 결과 값이 하나라면 블럭({ })을 제거하고 = 을 사용할 수 있다.
// = 을 사용할 경우에는 타입을 명시하지 않아도 추론이 가능하다.
fun max(a: Int, b: Int) = if (a > b) a else b

// default parameter를 사용하면 기본값을 지정해서 함수를 오버로딩하지 않아도 편하게 사용할 수 있다.
// Kotlin에도 Java 처럼 오버로드 기능이 있다.
fun repeat(
    str: String,
    num: Int = 3,
    useNewLine: Boolean = true
) {
    for (i in 1..num) {
        if (useNewLine) {
            println(str)
        } else {
            print(str)
        }
    }
}

