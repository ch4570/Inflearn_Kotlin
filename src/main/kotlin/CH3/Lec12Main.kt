package CH3

fun main() {
    println(Singleton.a)
    Singleton.a += 10
    println(Singleton.a)
}

class Person3 private constructor(
    var name: String,
    var age: Int
) {

    // Kotlin에서는 static 키워드가 삭제 되었고, companion object 블럭을 사용해서 정의해줘야한다.
    companion object Factory : Log {
        private const val MIN_AGE = 1

        // @JvmStatic 애너테이션을 붙여주면 Java에서도 static 멤버에 접근하는 것처럼 접근이 가능하다.
        @JvmStatic
        fun newBaby(name: String): Person3 {
            return Person3(name, MIN_AGE)
        }

        override fun log() {
            println("나는 Person 클래스의 동행객체 Factory에요!")
        }
    }

}

interface Log {

    fun log()
}