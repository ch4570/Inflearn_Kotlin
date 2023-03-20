package CH3

public val a = 3

public fun add(a: Int, b: Int): Int {
    return a + b
}

// 생성자 앞에 접근 제어자를 붙여주고 싶다면, constructor 키워드를 꼭 사용해줘야 한다.
// 기본 값은 public constructor이다.
public class Cat1 private constructor(

)