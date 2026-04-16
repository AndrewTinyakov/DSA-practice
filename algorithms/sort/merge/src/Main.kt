fun main() {

    val array = intArrayOf(8, 3, 1, 7, 0, 10, 2)

    val sorted = MergeSort().sort(array)

    sorted.forEach {
        print("$it, ")
    }
}