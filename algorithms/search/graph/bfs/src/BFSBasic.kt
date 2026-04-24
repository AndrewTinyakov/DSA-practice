class BFSBasic {

    fun bfs(graph: Map<Int, List<Int>>, start: Int) {
        val visited = mutableSetOf<Int>()
        val queue = ArrayDeque<Int>()

        visited.add(start)
        queue.add(start)

        while (queue.isNotEmpty()) {
            val current = queue.removeFirst()

            println(current)

            for (node in graph[current].orEmpty()) {
                if (node !in visited) {
                    visited.add(node)
                    queue.add(node)
                }
            }
        }
    }

}