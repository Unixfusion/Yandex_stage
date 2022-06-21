fun main(args: Array<String>) {
    var count = readLine()!!.toInt()
    var set = readLine()!!.split(" ").map { it.toInt() }
    var negative = mutableListOf<Int>()
    var positive = mutableListOf<Int>()
    var result = 0
    for (item in set) {
        if (item < 0)  {
            negative.add(item)
        } else {
            positive.add(item)
        }
    }

    result = when {
        negative.isEmpty() -> positive.minOrNull()!!
        positive.isEmpty() -> if (negative.size%2 == 0) {
                                negative.minOrNull()!!
                              } else { negative.maxOrNull()!! }
        negative.size%2 == 0 -> positive.minOrNull()!!
        else -> negative.maxOrNull()!!
    }
    println(result)
}
