package CH1


fun main() {

    var number1 = 10L
    number1 = 5L

    val number2 = 10L

    // 에러 발생 : val은 재 할당 불가
//    number2 = 5L

    // Tip : 모든 변수는 우선 val로 만들고 필요에따라 var로 변경하는 것을 추천한다.

}