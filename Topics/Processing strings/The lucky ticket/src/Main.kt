fun main() {
    val ticket = readln()
    val numbers = MutableList(6) { 0 }
    for (i in ticket.indices) {
        numbers[i] = ticket[i].toString().toInt()
    }

    print(
        if (numbers[0] + numbers[1] + numbers[2] == numbers[3] + numbers[4] + numbers[5]) {
            "Lucky"
        } else {
            "Regular"
        }
    )
}