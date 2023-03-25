package CH4

fun main() {

    val array = arrayOf(100,200)

    for (i in array.indices) {
        println("${i} ${array[i]}")
    }

    // withIndex를 사용하면 value도 한번에 가져올 수 있다.
    for ((idx, value) in array.withIndex()) {
        println("${idx} ${value}")
    }

    // plus 메서드로 배열에 요소를 추가할 수 있다.
    array.plus(300)
}