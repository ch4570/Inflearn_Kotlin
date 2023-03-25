package CH4


// takeIf는 주어진 조건을 만족하면 그 값이, 그렇지 않으면 null이 반환된다.
fun getNumberOrNullV2(number: Int): Int? {
    return number.takeIf { it > 0 }
}

// takeUnless는 takeIf와 반대로 동작한다(주어진 조건을 만족하면 null, 그렇지 않으면 값을 반환)
fun getNumberOrNullV3(number: Int): Int? {
    return number.takeUnless { it <= 0 }
}