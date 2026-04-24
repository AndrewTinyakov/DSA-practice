fun main() {
    val graph = mapOf(
        1 to listOf(2, 3),
        2 to listOf(1, 4, 5),
        3 to listOf(1, 5),
        4 to listOf(2),
        5 to listOf(2, 3)
    )

    BFSBasic().bfs(graph, 1)

    val distance = BFSDistance().bfsDistance(graph, 1)
    for (node in distance) {
        println("node: ${node.key} distance is ${node.value}")
    }


}