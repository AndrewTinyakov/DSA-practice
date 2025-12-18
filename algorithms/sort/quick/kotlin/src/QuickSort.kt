class QuickSort {

    fun sort(array: IntArray, st: Int, en: Int): IntArray {
        if (st >= en) {
            return array
        }
        val pivot = partition(
            array,
            st,
            en
        )
        sort(array, st, pivot)
        sort(array, pivot + 1, en)

        return array
    }

    private fun partition(array: IntArray, st: Int, end: Int): Int {
        val pivot = array[st]
        var leftP = st + 1
        var rightP = end

        while (leftP <= rightP) {
            while (leftP <= end && array[leftP] <= pivot) leftP++
            while (rightP >= st && array[rightP] > pivot) rightP--

            if (leftP < rightP) {
                swap(array, leftP, rightP)
            }
        }

        swap(array, st, rightP)
        return rightP
    }


    private fun swap(array: IntArray, i: Int, j: Int) {
        val temp = array[j]
        array[j] = array[i]
        array[i] = temp
    }


}