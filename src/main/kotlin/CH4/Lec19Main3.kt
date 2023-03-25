package CH4

fun main() {

    val numbers = listOf(1, 2, 3)

    for (number in numbers) {
        println(number)
    }

    numbers.map { number -> number + 1 }
        .forEach { number -> println(number) }

    // break를 사용한 것과 같다.
    run {
        numbers.forEach { number ->
            if (number == 3) {
                return@run
            }
        }
    }


    // continue를 사용한 것과 같다.
    run {
        numbers.forEach { number ->
            if (number == 3) {
                return@forEach
            }
        }
    }

    // 라벨을 사용해서 가장 바깥 for 문을 종료할 수 있다.
    abc@ for (i in 1..100) {
        for (j in 1..100) {
            if (j == 2) {
                break@abc
            }
        }
    }
}