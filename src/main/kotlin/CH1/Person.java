package CH1;

import org.jetbrains.annotations.NotNull;

public class Person {

    private final String name;
    private final int age;

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    // 코틀린에서 자바의 코드를 사용할때에는 Null에 관련된 애너테이션을 명시해주는 것이 좋다.
    @NotNull
    public String getName() {
        return name;
    }

    @NotNull
    public int getAge() {
        return age;
    }
}
