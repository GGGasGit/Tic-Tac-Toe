const val TABLESIZE = 5

fun main() {
    val (x1, y1) = readln().split(" ").map { it.toInt() }
    val (x2, y2) = readln().split(" ").map { it.toInt() }
    val (x3, y3) = readln().split(" ").map { it.toInt() }

    val rows = mutableListOf<Int>()
    val columns = mutableListOf<Int>()

    for (i in 1..TABLESIZE) {
        if (i != x1 && i != x2 && i != x3) {
            rows.add(i)
        }
        if (i != y1 && i != y2 && i != y3) {
            columns.add(i)
        }
    }

    println(rows.joinToString(" "))
    print(columns.joinToString(" "))
}