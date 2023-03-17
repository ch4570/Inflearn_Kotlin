package CH1

fun main() {
    println(startWithA4("BC"))

    // !! 연산자를 사용할때는 null이 혹시나 들어오게 되면 런타임에 NPE가 일어나게 된다.
    println(startWithA4(null))
}

fun startWithA1(str: String?) : Boolean {
    if (str == null) {
        throw IllegalArgumentException("null이 들어왔습니다.")
    }

    return str.startsWith("A")
}

// 함수의 반환타입 뒤에 ?를 붙이면 Null을 반환할 수 있는 함수를 의미한다.
fun startWithA2(str: String?) : Boolean? {
    if (str == null) {
        return null
    }

    return str.startsWith("A")
}

fun startWithA3(str: String?) : Boolean {
    if (str == null) {
        return false
    }

    return str.startsWith("A")
}

// 엘비스 연산자를 사용한 함수 리팩토링
fun refactorStartWithA1(str: String?) : Boolean {
    return str?.startsWith("A")
        ?: throw IllegalArgumentException("null이 들어왔습니다")
}

// SafeCall을 이용해서 Null일 경우 Null이 반환된다.
fun refactorStartWithA2(str: String?) : Boolean? {
    return str?.startsWith("A")
}

// 엘비스 연산자를 사용해서 str이 Null이면 false를 반환하도록 리팩토링
fun refactorStartWithA3(str: String?) : Boolean {
    return str?.startsWith("A") ?: false
}

fun startWithA4(str: String?) : Boolean {
    // Null이 아니라고 단언하는 연산자 !!이다.
    return str!!.startsWith("A")
}