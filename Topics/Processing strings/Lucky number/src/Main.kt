fun main() {
    val number = readln()

    var count1 = 0
    var count2 = 0
    for (i in 0 until number.length / 2) {
        count1 += number[i].toString().toInt()
    }
    for (i in number.length / 2..number.lastIndex) {
        count2 += number[i].toString().toInt()
    }

    print(if (count1 == count2) "YES" else "NO")
}