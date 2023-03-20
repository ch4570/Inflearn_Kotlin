package CH3


fun main() {

}

// Enum에 대한 분기처리를 할때 when을 사용해서 조금 더 효율적인 분기처리가 가능하다.
fun handleCountry(country: Country) {
    when (country) {
        Country.KOREA -> TODO()
        Country.AMERICA -> TODO()
    }
}

// Sealed 클래스는 컴파일 타임에 하위 클래스를 전부 기억하기 때문에, 런타임에 클래스 타입이 추가 될 수 없다.
// 추상화가 필요한 Entity or DTO에 사용하기도 한다.
sealed class HyundaiCar(
    val name: String,
    val price: Long
)

class Avante : HyundaiCar("아반떼", 1_000L)

class Sonata : HyundaiCar("소나타", 2_000L)

class Grandeur : HyundaiCar("그렌저", 3_1000L)

