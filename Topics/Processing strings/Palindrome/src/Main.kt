fun main() {
    val word = readln()
    print(
        if (word == word.reversed()) {
            "yes"
        } else {
            "no"
        }
    )
}