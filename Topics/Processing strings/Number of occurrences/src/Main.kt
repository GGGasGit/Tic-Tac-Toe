fun main() {
    val mainString = readln()
    val subString = readln()

    val stringList = mainString.split(subString)

    print(stringList.size - 1)
}