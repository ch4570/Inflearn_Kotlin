package CH4

// typealias로 별칭을 줄 수 있다.
typealias FruitFilter = (Fruit) -> Boolean

fun filterFruit(fruits: List<Fruit>, filter: FruitFilter) {

}

data class UltraSuperGuardianTribe(
    val name: String
)

typealias USGTMap = Map<String, UltraSuperGuardianTribe>