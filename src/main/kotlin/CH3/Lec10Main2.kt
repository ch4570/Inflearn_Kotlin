package CH3


interface Flyable {

    // 인터페이스 내부에 디폴트 메서드와 추상 메서드를 넣을 수 있다.
    // default 키워드를 사용하지 않아도 디폴트 메서드를 정의할 수 있다.

    fun act() {
        println("파닥 파닥")
    }
}

interface Swimable {

    fun act() {
        println("어푸 어푸")
    }

    val swimAbility: Int
        get() = 3

}