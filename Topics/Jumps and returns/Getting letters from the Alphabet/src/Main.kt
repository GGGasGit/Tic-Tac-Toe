fun main() {
    val letter = readln()
    val alphabet = 'a'..'z'

    for (char in alphabet) {
        if (letter != char.toString()) {
            print(char)
        } else {
            break
        }
    }
}