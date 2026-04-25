import org.w3c.dom.Node

class BasicRecursiveDFS {

    fun dfs(
        node: Int,
        graph: Map<Int, List<Int>>,
        visited: MutableSet<Int>
    ) {
        if (node in visited) return

        visited.add(node)
        println("Visited node $node")

        for (neighbor in graph[node].orEmpty()) {
            dfs(
                neighbor,
                graph,
                visited
            )
        }
    }


}