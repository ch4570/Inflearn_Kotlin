package CH3

// 파일 최상단에 함수를 정의하면 Utils 클래스처럼 인스턴스화를 막고 편리하게 Java에서 접근이 가능하다.
fun isDirectoryPath(path: String): Boolean {
    return path.endsWith("/")
}

class Car(
    internal val name: String,
    private var owner: String,
    _price: Int
) {

    // Setter에만 private 가시성을 부여할 수 있다.
    var price = _price
      private set

}