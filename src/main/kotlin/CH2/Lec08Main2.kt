package CH2

// named argument를 사용하게 되면 빌더 패턴을 사용하는 것과 같은 이점을 얻을 수 있다.
// Kotiln에서 Java 메서드를 사용하게 되면, named argument를 사용할 수 없다.
fun main() {
    printNameAndGender(name= "코린이", gender = "MALE")
}


fun printNameAndGender(name: String, gender: String) {
    println(name)
    println(gender)
}