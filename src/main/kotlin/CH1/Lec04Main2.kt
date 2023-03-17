package CH1

fun main() {

    // Lazy 연산의 의미는 논리 곱 연산자에서 이미 조건을 만족 했을때는 나머지 코드를 실행하지 않고 블럭 밖으로 나간다.
    if(fun1() || fun2()) {
        println("본문")
    }
}

fun fun1() : Boolean {
    println("fun 1")
    return true
}

fun fun2() : Boolean {
    println("fun 2")
    return false
}