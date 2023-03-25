package CH4

fun main(args: Array<String>) {
    val str = "ABC"
    println(str.lastChar())

    val number = 1

    // infix 중위 호출이 가능하다.
    1 add2 2

}

// 확장함수 정의 -> 확장함수에서는 멤버 클래스의 protected & private 멤버를 사용할 수 없다.
fun String.lastChar(): Char =  this[this.length - 1]


fun String.firstChar(): Char {
    return this[0]
}

infix fun Int.add2(other: Int): Int {
    return this + other
}

inline fun Int.add3(other: Int): Int {
    return this + other
}