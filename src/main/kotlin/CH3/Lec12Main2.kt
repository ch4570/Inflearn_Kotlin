package CH3


// object 키워드만 클래스 앞에 붙여주면 Singleton이 적용된다.
object Singleton {
    var a: Int = 0
}

fun main() {

    // 코틀린에서는 익명클래스를 object : 인터페이스 이름 {중괄호내에서 멤버를 구현} 하는 식으로 변경되었다.
    moveSomething(object : Movable {
        override fun move() {
            println("무브 무브")
        }

        override fun fly() {
            println("날다 날다")
        }

    })
}

private fun moveSomething(movable: Movable) {
    movable.move()
    movable.fly()
}