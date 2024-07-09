def toUpper(string: String): String = string.toUpperCase()

def toLower(string: String): String = string.toLowerCase()

def formatNames(string: String)(format: String => String) = format(string)

@main def q3() = {
    println(formatNames("Benny")(toUpper))
    println(formatNames("Niroshan")(string => toUpper(string.take(2)) + string.drop(2)))
    println(formatNames("Saman")(toLower))
    println(formatNames("Kumara")(string => string.head.toUpper + toLower(string.drop(1).init) + string.last.toUpper))
}
