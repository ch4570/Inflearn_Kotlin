package CH4

import CH3.b.printHelloWorld as printHelloWorldB
import CH4.a.printHelloWorld as printHelloWorldA


data class Person2(
    val name: String,
    val age: Int
)

// Data 클래스가 아닌 클래스에서 구조분해 문법을 사용하기 위해서는 ComponentN 함수를 정의해야 한다.
// componentN 함수는 연산자를 오버로딩 하는 것 처럼 간주되어야 하기 때문에 operator 키워드를 붙여야한다.
class Person3(
    val name: String,
    val age: Int
) {
    operator fun component1(): String {
        return this.name
    }

    operator fun component2(): Int {
        return this.age
    }
}


// 다른 패키지의 이름이 같은 함수를 호출할 경우 import ~ as를 사용해 구분해야한다.
fun main() {

    printHelloWorldA()
    printHelloWorldB()

    val person = Person2("코린이", 100)

    // 구조분해 문법을 이용한 아래의 표현은 componentN 함수 두개를 호출해서 값을 가져온 것과 같다.
    val (name, age) = person
//    val name = person.component1()
//    val age = person.component2()

    println("이름 = $name, 나이 = $age")

    val person2 = Person3("코린이", 100)

    val (name2, age2) = person2
}