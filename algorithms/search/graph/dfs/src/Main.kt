fun main() {
    val graph = mapOf(
        1 to listOf(2, 3),
        2 to listOf(1, 4, 5),
        3 to listOf(1),
        4 to listOf(2),
        5 to listOf(2)
    )

    BasicRecursiveDFS()
        .dfs(
            1,
            graph,
            mutableSetOf()
        )

    println()

    BasicIterativeDFS()
        .dfs(
            1,
            graph
        )

}