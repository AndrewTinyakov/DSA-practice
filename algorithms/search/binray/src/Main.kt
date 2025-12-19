//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
fun main() {
    val array = intArrayOf(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11)
    val res = BinarySearch().search(array, 7)
    println(res)

    val rotated = intArrayOf(6, 7, 8, 9, 10, 11, 1, 2, 3, 4, 5)
    val res2 = RotatedSortedArrayBinarySearch().search(rotated, 7)
    println(res)
}