package CH2


// 코틀린에서는 Unit(void) 생략이 가능하다
fun validateScoreIsNotNegative(score: Int) {

    // score가 0부터 100사이의 값인지 in을 이용해서 간결하게 표현이 가능하다.
    if (score !in 0..100) {
        throw IllegalArgumentException("${score}는 0부터 100입니다")
    }
}

fun getPassOrFail(score: Int): String{

    // Java에서는 if ~ else는 문장이지만 코틀린에서는 식이다.
    // 코틀린에서는 if ~ else를 바로 연산해서 return 해줄 수 있다. 코틀린에서는 삼항연산자가 삭제 되었다
    return if (score >= 50) {
        "P"
    } else {
        "F"
    }
}

fun getGrade(score: Int): String {

    // if ~ else if ~ else 또한 바로 연산해서 return 해줄 수 있다.
    return if (score >= 90) {
         "A"
    } else if (score >= 80) {
        "B"
    } else if (score >= 70) {
        "C"
    } else {
        "D"
    }
}


// 코틀린에서는 switch ~ case 문이 사라졌다
fun getGradeWithSwitch(score: Int): String {

    // when도 식으로 연산을 통해 값을 return 해줄 수 있다.
    return when (score) {
        in 90..99 -> "A"
        in 80..89 -> "B"
        in 70..79 -> "C"
        else -> "D"
    }
}