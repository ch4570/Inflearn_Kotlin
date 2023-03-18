package CH3

fun main() {
    Derived(300)
}

open class Base(
    open val number: Int = 200
) {
    init {
        println("Base Class")

        // 생성자나 초기화 블럭에서는 하위 클래스에서 오버라이드 하고 있는 프로퍼티에 접근하지 않도록 해야한다.
        println(number)
    }
}

class Derived(
    override val number: Int
) : Base(number) {

    init {
        println("Derived Class")
    }
}