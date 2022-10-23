fun main() {
    val string = readln()
    val endOfString = string.substringAfterLast('u')
    print(string.substringBeforeLast(endOfString) + endOfString.uppercase())
}