fun main() {
    val input = readln()
    var result = true
    for (i in 0 until input.length - 1) {
        if (input[i].code + 1 != input[i + 1].code) {
            result = false
            break
        }
    }
    print(result)
}