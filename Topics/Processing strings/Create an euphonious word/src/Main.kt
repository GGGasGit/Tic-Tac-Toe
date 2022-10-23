fun main() {
    val word = readln()
    val vowels = mutableListOf('a', 'e', 'i', 'o', 'u', 'y')

    val simplifiedWord = word.map { if (it in vowels) "v" else "c" }.joinToString("")

    val series = mutableListOf<Int>()
    var seriesLength = 1
    for (i in 1..simplifiedWord.lastIndex) {
        if (simplifiedWord[i] == simplifiedWord[i - 1]) {
            seriesLength++
        } else {
            if (seriesLength > 2) series.add(seriesLength)
            seriesLength = 1
        }
    }
    if (seriesLength > 2) series.add(seriesLength)

    var result = 0
    if (series.size > 0) {
        for (number in series) {
            result += if (number % 2 == 0) {
                (number - 2) / 2
            } else {
                (number - 1) / 2
            }
        }
    }
    print(result)
}