package technic

fun main() {
    val list = listOf(1, 2, 3)

    val list2 = mutableListOf(1, 2, 3)
    list2 += 4
    println(list2)
}