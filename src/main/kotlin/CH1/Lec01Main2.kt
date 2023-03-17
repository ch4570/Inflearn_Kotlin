package CH1


fun main() {

    // 코틀린에서는 프로그래머가 boxing unboxing을 고려하지 않아도 자동으로 처리를 해준다.
    var number1: Long = 10L

    // 코틀린에서 Null을 처리하는 방법
    var number2 = 1_000L
    // 에러 -> 기본적으로 코틀린은 변수에 null을 넣을 수 없다.
//    number2 = null

    // 코틀린에서는 Null을 허용하려면 타입뒤에 ?를 붙여줘야한다.
    // 코틀린에서는 Null을 아예 다른 타입으로 간주한다.
    var number3: Long? = 1000L
    number3 = null

    // 코틀린에서는 New 연산자를 사용하지 않고 객체의 인스턴스를 생성해야한다.
    var person = Person("코린이", 100)

}