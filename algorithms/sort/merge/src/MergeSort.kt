class MergeSort {

    fun sort(array: IntArray): IntArray {
        if (array.size <= 1) {
            return array
        }

        val middle: Int = array.size / 2
        val left = sort(array.sliceArray(0..<middle))
        val right = sort(array.sliceArray(middle..<array.size))

        return merge(left, right)
    }

    private fun merge(left: IntArray, right: IntArray): IntArray {
        var i = 0 //left array pointer
        var j = 0 //right array pointer
        var k = 0 //new array pointer

        val result = IntArray(left.size + right.size)

        while (left.size > i && right.size > j) { //once left or right array has been fully checked - continue
            if (left[i] <= right[j]) {
                result[k++] = left[i++] //return k/i and then increment (varName++)
            } else {
                result[k++] = right[j++]
            }
        }

        //take elements from whatever array was not fully merged
        while (i < left.size) {
            result[k++] = left[i++]
        }
        while (j < right.size) {
            result[k++] = right[j++]
        }

        return result
    }


}