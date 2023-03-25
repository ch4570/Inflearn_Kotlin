package CH4

//data class Fruit(
//    val id: Long,
//    val name: String,
//    val factoryPrice: Long,
//    val currentPrice: Long
//)

fun main() {

    val fruits = listOf(
        Fruit("사과", 1_100),
        Fruit("사과", 1_200),
        Fruit("사과", 1_200),
        Fruit("사과", 1_500),
        Fruit("바나나", 3_000),
        Fruit("바나나", 3_200),
        Fruit("바나나", 2_500),
        Fruit("수박", 10_000)
    )


    val map: Map<String, List<Fruit>> = fruits.groupBy { fruit -> fruit.name }

}


private fun filterFruits(
    fruits: List<Fruit>, filter: (Fruit) -> Boolean
): List<Fruit> {
    return fruits.filter(filter)
}
