
fun max(array: IntArray): Int? {
    if (array.isEmpty()) {
        return null
    }

    var maxValue = array.first()

    for (num in array) {
        if (num > maxValue) {
            maxValue = num
        }
    }

    return maxValue
}


fun doubleVaulesInPlace(array: IntArray) {
    for (i in array.indices) {
        array[i] *= 2
    }
}


fun runningSum(array: IntArray): IntArray {
    var sum = 0
    val res = IntArray(array.size)

    for (i in array.indices) {
        sum += array[i]
        res[i] = sum
    }

    return res
}

fun runningSumInPlace(array: IntArray) {
    for (i in 1..<array.size) {
        array[i] = array[i - 1]
    }
}

fun moveZeros(array: IntArray) {
    var write = 0

    for (read in array.indices) {
        if (array[read] != 0) {
            array[read] = array[write]
            write++
        }
    }


    while (write <= array.size) {
        array[write] = 0
        write++
    }
}
