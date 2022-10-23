fun main() {
    val dna = readln()

    if (dna.isEmpty()) {
        print("")
    } else {
        var code = ""
        var currentLength = 1
        for (i in 1..dna.lastIndex) {
            if (dna[i] == dna[i - 1]) {
                currentLength++
            } else {
                code += "${dna[i - 1]}$currentLength"
                currentLength = 1
            }
        }
        code += "${dna[dna.lastIndex]}$currentLength"
        print(code)
    }
}