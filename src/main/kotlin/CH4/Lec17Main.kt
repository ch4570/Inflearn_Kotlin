package CH4

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

    val isApple = fun(fruit: Fruit): Boolean {
        return fruit.name == "사과"
    }

    val isApple2 = { fruit: Fruit -> fruit.name == "사과"}

    // 함수를 호출할때 함수를 전달할 수 있다.
    filterFruits(fruits, isApple)

    // 함수의 파라미터가 하나일 경우에는 it 키워드로 간결하게 처리가 가능하다.
    // it 키워드 보다는 직접 변수의 값을 써주는 것을 추천한다.
    filterFruits(fruits) { fruit -> fruit.name == "사과" }
    filterFruits(fruits) { it.name == "사과"}

    var targetFruitName = "바나나"
    targetFruitName = "수박"

    // 코틀린은 람다가 실행되는 시점에 람다가 사용하는 변수들을 모두 포획해 정보를 가지고 있는 것을 Closer라고 한다.
    filterFruits(fruits) {it.name == targetFruitName}
}

// Java에처럼 Predicate를 사용하지 않고 직접 함수를 파라미터에 정의해줘야한다.
private fun filterFruits(fruits: List<Fruit>, filter: (Fruit) -> Boolean): List<Fruit> {
    val result = mutableListOf<Fruit>()

    for (fruit in fruits) {
        if (filter.invoke(fruit)) {
            result.add(fruit)
        }
    }

    return result
}