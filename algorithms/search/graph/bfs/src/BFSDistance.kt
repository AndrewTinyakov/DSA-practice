
class BFSDistance {

    fun bfsDistance(graph: Map<Int, List<Int>>, start: Int): Map<Int, Int> {
        val distance = mutableMapOf<Int, Int>()
        val queue: ArrayDeque<Int> = ArrayDeque()

        distance[start] = 0
        queue.add(start)

        while (queue.isNotEmpty()) {
            val current = queue.removeFirst()

            for (neighbor in graph[current].orEmpty()) {
                if (neighbor !in distance) {
                    distance[neighbor] = distance[current]!! + 1
                    queue.add(neighbor)
                }
            }
        }

        return distance
    }

}