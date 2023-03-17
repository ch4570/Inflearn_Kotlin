package CH1

fun main() {

    val str: String? = "ABC"

    // Null이 들어갈 수 있는 변수에 대해서는 바로 접근이 불가능하다.
//    println(str.length)

    // Null이 아닐때만 호출하는 Safe Call을 활용한 코드이다.
    println(str?.length)

    // Elvis(엘비스) 연산자를 사용하면 앞의 연산 결과가 null이면 뒤의 값을 사용한다.
    val str2: String? = null
    println(str2?.length ?: 0)
}