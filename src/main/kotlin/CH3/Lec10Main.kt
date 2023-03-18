package CH3


// 자바와 코틀린모두 추상클래스는 인스턴스화 할 수 없다.
abstract class Animal (
    protected val species: String,

    // 코틀린에서는 모든 프로퍼티에 기본적으로 final이 붙어있기 때문에 open 키워드를 꼭 붙여주어야 한다.
    protected open val legCount: Int
    ) {

    abstract fun move()
}

class Cat(
    species: String
    // 코틀린에서는 상속을 받았을때 부모 생성자를 바로 호출해야 한다.
) : Animal(species, 4) {

    override fun move() {
        println("고양이가 사뿐 사뿐 걸어가 ~ ")
    }

}

class Penguin(
    species: String
) : Animal(species, 2), Flyable, Swimable {

    private val wingCount: Int = 2

    override fun move() {
        println("펭귄이 움직인다 ~ 꿱꿱")
    }

    override val legCount: Int
        get() = super.legCount + this.wingCount

    // 인터페이스를 여러개 구현할때 함수의 이름이 겹칠 경우에는, super<인터페이스이름>.함수이름()으로 사용이 가능하다.
    override fun act() {
        super<Swimable>.act()
        super<Flyable>.act()
    }

    override val swimAbility: Int
        get() = 6

}