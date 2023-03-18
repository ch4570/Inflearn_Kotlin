package CH2

import java.io.BufferedReader
import java.io.File
import java.io.FileReader

fun main() {
    readFile()
}

// Kotlin에서는 예외를 다룰때 모두 Unchecked Exception으로 다룬다.
fun readFile() {
    val currentFile = File(".")
    val file = File(currentFile.absolutePath + "/a.txt")
    val reader = BufferedReader(FileReader(file))
    println(reader.readLine())
    reader.close()
}

// Kotiln에서는 try ~ with ~ resources 구문이 삭제 되었다.
// Kotlin에서는 use를 이용해서 try ~ with ~ resources와 같은 동작을 한다.
fun readFile(path: String) {
    BufferedReader(FileReader(path)).use {
        reader -> println(reader.readLine())
    }
}