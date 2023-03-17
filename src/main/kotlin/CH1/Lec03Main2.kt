package CH1

fun main() {

    val person = Person("코린이", 23)

    // 기존 자바에서의 방식
    System.out.println(String.format("이름 : %s", person.name))

    // 코틀린에서의 문자열 템플릿 사용방식
    println("이름 : ${person.name}")

    // """ 따옴표를 세개 사용하면 멀티라인 문자열처럼 활용이 가능하다.
    val str = """
        ABC
        EFG
        ${person.name}
    """.trimIndent()

    println(str)

    // Java 에서의 String.charAt() 메서드는 코틀린에서 문자열[인덱스]로 사용가능하다.
    val str2 = "ABC"
    println(str[0])
    println(str[2])

    // Tip -> 변수 이름만 사용하더라도 ${변수}로 작성하는 것을 가독성 측면에서 추천

}