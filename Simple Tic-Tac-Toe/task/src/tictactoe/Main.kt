package tictactoe

fun main() {
    val input = "_________".split("").filter { it != "" }.toMutableList()

    fun printGrid(gameState: MutableList<String>) {
        println("---------")
        for (i in 0..2) {
            print("|")
            for (j in 1..3) {
                print(" ${gameState[i * 3 - 1 + j]}")
            }
            println(" |")
        }
        println("---------")
    }

    fun xWins(gameState: MutableList<String>): Boolean {
        return (gameState[0] == "X" && gameState[1] == "X" && gameState[2] == "X" ||
                gameState[3] == "X" && gameState[4] == "X" && gameState[5] == "X" ||
                gameState[6] == "X" && gameState[7] == "X" && gameState[8] == "X" ||
                gameState[0] == "X" && gameState[4] == "X" && gameState[8] == "X" ||
                gameState[2] == "X" && gameState[4] == "X" && gameState[6] == "X" ||
                gameState[0] == "X" && gameState[3] == "X" && gameState[6] == "X" ||
                gameState[1] == "X" && gameState[4] == "X" && gameState[7] == "X" ||
                gameState[2] == "X" && gameState[5] == "X" && gameState[8] == "X")
    }

    fun oWins(gameState: MutableList<String>): Boolean {
        return (gameState[0] == "O" && gameState[1] == "O" && gameState[2] == "O" ||
                gameState[3] == "O" && gameState[4] == "O" && gameState[5] == "O" ||
                gameState[6] == "O" && gameState[7] == "O" && gameState[8] == "O" ||
                gameState[0] == "O" && gameState[4] == "O" && gameState[8] == "O" ||
                gameState[2] == "O" && gameState[4] == "O" && gameState[6] == "O" ||
                gameState[0] == "O" && gameState[3] == "O" && gameState[6] == "O" ||
                gameState[1] == "O" && gameState[4] == "O" && gameState[7] == "O" ||
                gameState[2] == "O" && gameState[5] == "O" && gameState[8] == "O")
    }

    fun hasEmptyCell(gameState: MutableList<String>): Boolean {
        return gameState.any { it == "_" }
    }

    fun coordinateConverter(xCoord: Int, yCoord: Int): Int {
        return (xCoord - 1) * 3 + yCoord - 1
    }

    fun userInput(gameState: MutableList<String>): MutableList<Int> {
        while (true) {
            try {
                val (xCoord, yCoord) = readln().split(" ").map { it.toInt() }
                if (xCoord !in 1..3 || yCoord !in 1..3) {
                    println("Coordinates should be from 1 to 3!")
                } else if (gameState[coordinateConverter(xCoord, yCoord)] != "_") {
                    println("This cell is occupied! Choose another one!")
                } else {
                    return mutableListOf(xCoord, yCoord)
                }
            } catch (err: NumberFormatException) {
                println("You should enter numbers!")
            }
        }
    }

    var isFinished = false
    var nextPlayer = "X"

    do {
        printGrid(input)
        if (xWins(input)) {
            print("X wins")
            isFinished = true
        } else if (oWins(input)) {
            print("O wins")
            isFinished = true
        } else {
            if (hasEmptyCell(input)) {
                println("Make a move $nextPlayer. Enter the coordinates separated by a space (x = 1-3 and y = 1-3), e.g. 1 1.")
                val (xCoord, yCoord) = userInput(input)
                input[coordinateConverter(xCoord, yCoord)] = nextPlayer
                nextPlayer = if (nextPlayer == "X") "O" else "X"
            } else {
                print("Draw")
                isFinished = true
            }
        }
    } while (!isFinished)
}