fun main(args: Array<String>) {
    println("TEST")
    var sum = 0;
    args.forEach {
        sum += it.toInt()
    }
    println("Sum:  $sum")
}
