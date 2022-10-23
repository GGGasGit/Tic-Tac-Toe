fun main() {
    val input = readln()
    val alphabet = 'a'..'z'

    for (char in alphabet) {
        if (char !in input) print(char)
    }
}