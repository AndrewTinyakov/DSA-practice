class BasicIterativeDFS {

    fun dfs(
        start: Int,
        graph: Map<Int, List<Int>>,
    ) {
        val visited = hashSetOf<Int>()
        val stack = ArrayDeque<Int>()

        stack.addLast(start)

        while (stack.isNotEmpty()) {
            val node = stack.removeLast()

            if (node in visited) continue

            println("Visited node $node")
            visited.add(node)

            for (neighbor in graph[node].orEmpty()) {
                if (neighbor !in visited) {
                    stack.addLast(neighbor)
                }
            }
        }
    }


}