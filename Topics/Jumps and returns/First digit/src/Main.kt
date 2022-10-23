fun main() {
    val input = readln()
    val digits = '0'..'9'

    for (char in input) {
        if (char in digits) {
            print(char)
            break
        }
    }
}