fun main() {
    val wordList = readln().split(" ")
    var longestWordSize = 0
    var longestWordIndex = 0

    for (i in wordList.indices) {
        if (wordList[i].length > longestWordSize) {
            longestWordSize = wordList[i].length
            longestWordIndex = i
        }
    }

    print(wordList[longestWordIndex])
}