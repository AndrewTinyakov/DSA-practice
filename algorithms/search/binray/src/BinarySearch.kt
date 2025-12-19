class BinarySearch {

    fun search(array: IntArray, target: Int): Int {
        var l = 0
        var r = array.size - 1

        while (l <= r) {
            val mid = (l + r) / 2

            if (array[mid] == target) {
                return mid
            }
            if (array[mid] < target) {
                l = mid + 1
            }
            if (array[mid] > target) {
                r = mid - 1
            }
        }

        return -1
    }


}