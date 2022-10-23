fun main() {
    val sequence = readln().lowercase()
    val g = sequence.count { it == 'g' }
    val c = sequence.count { it == 'c' }
    print((g + c).toDouble() / sequence.length * 100)
}