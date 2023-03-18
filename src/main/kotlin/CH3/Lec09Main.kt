package CH3

// constructor 지시자는 생략할 수 있다.
class Person (name: String, age: Int) {

    // Kotlin 에서는 프로퍼티만 만들면 getter & setter를 만들어준다.
    val name: String = name
    var age: Int = age

}

// Kotlin에서는 생성자 안에서 프로퍼티를 선언해 줄 수 있다. 주 생성자는 반드시 존재해야 한다.
// Class Body에 내용이 없다면 생략도 가능하다.
class Person2 (
    name: String = "코린이",
    var age: Int
    ) {

    // name을 사용하게 되면 무한루프에 걸리게된다.
    // field는 자기 자신을 가리키는 예약어이다(무한 루프 방지) -> backing field라고 한다.
    var name: String = name
        // custom setter도 정의할 수 있다.
        set(value) {
            field = value.uppercase()
        }
        get() = field.uppercase()


    // init 블럭은 생성자가 호출되는 시점에 호출이 된다.
    // 객체를 생성할때 validation 하는 로직을 넣어주는 용도로 사용할 수 있다.
    init {
        if (age <= 0) {
            throw IllegalArgumentException("나이는 ${age}일 수 없습니다.")
        }
        println("초기화 블럭")
    }

    // 기본 생성자를 정의한다.
    // 부 생성자는 this로 최종적으로 부생성자를 호출해야 한다. 부생성자는 부생성자를 호출할 수 있고, 블럭을 이용해 코드를 넣어줄 수 있다.
    // 코틀린에서는 부생성자보다는 default parameter 사용을 권장한다.
    constructor(name: String) : this(name, 1) {
        println("첫 번째 부생성자")
    }

    constructor() : this(name = "홍길동") {
        println("두 번째 부생성자")
    }

    // 성인인지 여부를 검사하는 custom getter를 활용하게 할 수 있다.
    // Tip : 객체의 속성이라면 custom getter, 그렇지 않다면 함수로 정의하는 것을 권장한다.
    val isAdult: Boolean
        get() = this.age >= 20
}

fun main() {
    val person = Person2("코린이")

    println(person.name)

    person.age = 10
    println(person.age)
    println(person.isAdult)

    // Java 에서 클래스를 가져다 사용할때도 . 을 이용해 프로퍼티 접근이 가능하다.
    val javaPerson = JavaPerson("코린이", 30)
    javaPerson.age = 20
    println(javaPerson.name)
    println(javaPerson.age)

    Person2()
}