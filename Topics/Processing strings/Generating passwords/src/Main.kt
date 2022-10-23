fun main() {
    val (a, b, c, n) = readln().split(" ").map { it.toInt() }

    val upperCase = 'A'..'Z'
    val lowerCase = 'a'..'z'
    val digits = '0'..'9'
    val anyChar = ('A'..'Z') + ('a'..'z') + ('0'..'9')

    var password = ""

    var upperCaseCount = a
    var lowerCaseCount = b
    var digitsCount = c

    do {
        if (upperCaseCount > 0) {
            if (password.isEmpty()) {
                password += "${upperCase.random()}"
                upperCaseCount--
            } else {
                val newChar = upperCase.random()
                if (newChar != password[password.lastIndex]) {
                    password += "$newChar"
                    upperCaseCount--
                }
            }
        }

        if (lowerCaseCount > 0) {
            if (password.isEmpty()) {
                password += "${lowerCase.random()}"
                lowerCaseCount--
            } else {
                val newChar = lowerCase.random()
                if (newChar != password[password.lastIndex]) {
                    password += "$newChar"
                    lowerCaseCount--
                }
            }
        }

        if (digitsCount > 0) {
            if (password.isEmpty()) {
                password += "${digits.random()}"
                digitsCount--
            } else {
                val newChar = digits.random()
                if (newChar != password[password.lastIndex]) {
                    password += "$newChar"
                    digitsCount--
                }
            }
        }
    } while (password.length != a + b + c)

    if (n > a + b + c) {
        do {
            if (password.isEmpty()) {
                password += "${anyChar.random()}"
            } else {
                val newChar = anyChar.random()
                if (newChar != password[password.lastIndex]) {
                    password += "$newChar"
                }
            }
        } while (password.length != n)
    }

    print(password)
}