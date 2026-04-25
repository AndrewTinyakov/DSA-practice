class BFSShortestDistance {

    fun shortestDistance(
        graph: Map<Int, List<Int>>,
        start: Int,
        target: Int
    ): Int {
        val queue = ArrayDeque<Int>()
        val distance = hashMapOf<Int, Int>()

        queue.add(start)
        distance[start] = 0

        while (queue.isNotEmpty()) {
            val current = queue.removeFirst()

            if (current == target) {
                return distance[current]!!
            }

            for (neighbor in graph[current].orEmpty()) {
                if (neighbor !in distance) {
                    queue.addLast(neighbor)
                    distance[neighbor] = distance[current]!! + 1
                }
            }
        }

        return -1
    }

}