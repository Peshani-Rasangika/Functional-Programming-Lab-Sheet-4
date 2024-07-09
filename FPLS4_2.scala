def classifyNumber(num: Int): String = num match {
    case num if num <= 0 => s"$num is Negative/Zero"
    case num if num % 2 == 0 => s"$num is even"
    case _ =>  s"$num is odd"
}

def main(args: Array[String]): Unit = {
    print("Enter an integer: ")
    val num = scala.io.StdIn.readInt()
    val intNum = num.toInt
    print(classifyNumber(intNum))
}
