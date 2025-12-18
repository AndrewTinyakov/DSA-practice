fun main() {
    val array = intArrayOf(33, 9, 4, 5, 11, 8, 7)
    val sort = QuickSort()
        .sort(array, 0, array.size - 1)
    println(
        sort.joinToString(separator = ", ")
    )
}