fun main() {
    val word = readln()

    val delimiter = if (word.length % 2 == 0) {
        "${word[word.length / 2 - 1]}${word[word.length / 2]}"
    } else {
        "${word[word.length / 2]}"
    }

    print("${word.substringBefore(delimiter)}${word.substringAfter(delimiter)}")
}