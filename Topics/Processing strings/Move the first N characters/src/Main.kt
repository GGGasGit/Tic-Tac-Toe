fun main() {
    val (word, number) = readln().split(" ")
    if (number.toInt() > word.length) {
        print(word)
    } else {
        val delimiter = word.substring(0, number.toInt())
        print(word.substringAfter(delimiter) + delimiter)
    }
}