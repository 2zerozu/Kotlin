package technic

fun main(): Unit = with(System.`in`.bufferedReader()) {
    val numbers = mutableListOf(1, 2, 3, 4)
    val stack = MutableList<Int>(4) { it } // [0, 1, 2, 3]

    // stack.push(5)
    numbers.add(5)

    // stack.pop()
    numbers.removeLast()

    // stack.peek()
    numbers.last()

    // 비어있는지 확인
    numbers.isEmpty()

    // 내용물이 있는지 확인
    numbers.isNotEmpty()

    // 크기
    numbers.size
}