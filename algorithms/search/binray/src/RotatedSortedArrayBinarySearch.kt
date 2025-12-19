class RotatedSortedArrayBinarySearch {

    fun search(array: IntArray, target: Int): Int {
        var l = 0
        var r = array.size - 1

        while (l <= r) {
            val mid = (l + r) / 2

            if (array[mid] == target) {
                return mid
            }

            if (array[l] <= array[mid]) { // left side is sorted
                if (array[mid] <= target && target < array[mid]) {
                    r = mid - 1 //search left
                } else {
                    l = mid + 1 //search right
                }
            } else { // right side is sorted
                if (array[mid] < target && target <= array[r]) {
                    l = mid + 1 //search right
                } else {
                    r = mid - 1 //search left
                }
            }
        }
        return -1

    }

}