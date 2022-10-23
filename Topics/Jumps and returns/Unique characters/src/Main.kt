fun main() {
    val word = readln()

    val characterMap = mutableMapOf<Char, Int>()
    for (char in word) {
        if (characterMap.containsKey(char)) {
            characterMap[char] = characterMap[char]!! + 1
        } else {
            characterMap[char] = 1
        }
    }

    var count = 0
    for (char in characterMap.keys) {
        if (characterMap[char] == 1) count++
    }

    print(count)
}