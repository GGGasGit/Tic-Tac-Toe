fun main() {
    val url = readln()

    val parameterList = url.substringAfter('?').split("&")
    var thereIsPassword = false
    var password = ""
    for (parameter in parameterList) {
        val (parameterName, parameterValue) = parameter.split("=")
        if (parameterName == "pass") {
            thereIsPassword = true
            password = parameterValue
        }
        print("$parameterName : ")
        println(if (parameterValue == "") "not found" else parameterValue)
    }
    if (thereIsPassword) print("password : $password")
}