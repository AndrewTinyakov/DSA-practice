class BFSShortestPath {

    fun bfsShortestPath(
        graph: Map<Int, List<Int>>,
        start: Int,
        target: Int,
    ): List<Int> {
        val queue = ArrayDeque<Int>()
        val visited = mutableSetOf<Int>()
        val parent = mutableMapOf<Int, Int?>()

        parent[start] = null
        visited.add(start)
        queue.add(start)

        while (queue.isNotEmpty()) {
            val current = queue.removeFirst()

            if (current == target) {
                break
            }

            for (neighbor in graph[current].orEmpty()) {
                if (neighbor !in visited) {
                    queue.add(neighbor)
                    visited.add(neighbor)
                    parent[neighbor] = current
                }
            }
        }

        if (target !in parent) {
            return emptyList()
        }

        val path = mutableListOf<Int>()
        var current: Int? = target

        while (current != null) {
            path.add(current)
            current = parent[current]
        }

        return path.reversed()
    }


}