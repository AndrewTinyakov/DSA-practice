class BoubleSort {

    fun sort(array: IntArray): IntArray {
        if (array.size <= 1) {
            return array
        }
        val copy = array.copyOf()

        for (pass in 0..<copy.size - 1) {
            for (j in 0..<copy.size - pass - 1) {
                if (copy[j] > copy[j + 1]) {
                    val temp = copy[j]
                    copy[j] = copy[j + 1]
                    copy[j + 1] = temp
                }
            }
        }

        return copy
    }

    fun sortOptimized(array: IntArray): IntArray {
        if (array.size <= 1) {
            return array
        }
        val copy = array.copyOf()
        var limit = copy.size - 1

        for (pass in 0..<copy.size - 1) {
            var swapped = false
            var lastSwap = 0

            for (j in 0..<limit) {
                if (copy[j] > copy[j + 1]) {
                    val temp = copy[j]
                    copy[j] = copy[j + 1]
                    copy[j + 1] = temp
                    swapped = true
                    lastSwap = j + 1
                }
            }

            limit = lastSwap
            if (!swapped) {
                break
            }
        }

        return copy
    }


}