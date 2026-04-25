fun main() {
    val graph = mapOf(
        1 to listOf(2, 3),
        2 to listOf(1, 4, 5),
        3 to listOf(1, 5),
        4 to listOf(2),
        5 to listOf(2, 3)
    )

    BFSBasic().bfs(graph, 1)
    println()

    val distance = BFSDistance().bfsDistance(graph, 1)
    for (node in distance) {
        println("node: ${node.key} distance is ${node.value}")
    }
    println()

    val path = BFSShortestPath().bfsShortestPath(graph, 1, 4)
    if (path.isNotEmpty()) {
        println("shortest path is ")
        path.forEach {
            print("$it, ")
        }
        println()
    } else {
        println("there is no path")
    }



    val shortest = BFSShortestDistance().shortestDistance(
        graph,
        1,
        4
    )
    println("shortest distance is ")
    println(shortest)


}