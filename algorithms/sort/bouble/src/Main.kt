fun main() {
    run {
        val array = intArrayOf(1, 8, 5, 8, 9, 4, 2, 5, 6, 0, 11)

        val sorted = BoubleSort().sort(array)

        sorted.forEach {
            print("$it, ")
        }
        println()
    }
    run {
        val array = intArrayOf(1, 8, 5, 8, 9, 4, 2, 5, 6, 0, 11)

        val sorted = BoubleSort().sortOptimized(array)

        sorted.forEach {
            print("$it, ")
        }
    }


}