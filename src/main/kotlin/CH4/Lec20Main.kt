package CH4

fun main() {

    val person = Person3("코린이", 100)


    val value1 = person.let {
        it.age
    }

    val value2 = person.run {
        this.age
    }

    val value3 = person.also {
        it.age
    }

    val value4 = person.apply {
        this.age
    }

    with(person) {
        println(name)
        println(this.age)
    }

}


fun printPerson(person: Person3?) {

    // safeCall을 사용하여, let 키워드를 통해 scope function을 사용한다.
    person?.let {
        println(it.name)
        println(it.age)
    }


    if (person != null) {
        println(person.name)
        println(person.age)
    }
}