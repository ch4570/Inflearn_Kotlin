package CH3

fun main() {

}

class JavaHouse(
    val address: String,
    val livingRoom: LivingRoom
) {
    class LivingRoom(
        private var area: Double
    )
}

class JavaHouse2(
    val address: String,
    val livingRoom: LivingRoom2
) {

    // 코틀린에서 권장되지 않는 내부 클래스를 만들려면 inner 키워드를 붙여줘야 한다.
    inner class LivingRoom2(
        private var area: Double
    ) {

        val address: String
        // 코틀린에서 외부 클래스에 대한 참조를 얻으려면 this@외부클래스이름으로 접근해야 한다.
            get() = this@JavaHouse2.address
    }
}