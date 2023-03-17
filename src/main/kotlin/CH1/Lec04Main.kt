package CH1

fun main() {


    // 코틀린은 객체간에 비교 연산자를 사용하면 자동으로 compareTo를 호출해준다.
    val money1 = JavaMoney(2000)
    val money2 = JavaMoney(1000)

    if (money1 > money2) {
        println("Money1이 Money2보다 금액이 큽니다")
    }

    // 동등성 : 두 객체의 값이 같은가?
    // 동일성 : 두 객체의 주소가 같은가?

    // Kotlin에서는 동일성에는 ===를 사용해야하고, 동등성 비교에는 ==를 사용한다.
    // == 연산자를 사용하면 자동으로 equals를 호출해준다.
    val money3 = JavaMoney(1_000L)
    val money4 = money3
    val money5 = JavaMoney(1_000L)

    println("money3 === money5 => ${money3 === money5}")
    println("money3 == money5 => ${money3 == money5}")

}

data class Money(
    val amount : Long
) {
    // 연산자 오버로딩
    // 코틀린에서는 기본 연산자들을 오버로딩 할 수 있다.ㅌ
    operator fun plus(other: Money): Money {
        return Money(this.amount + other.amount)
    }

}