package technic

fun main() {
    val deque = ArrayDeque<Int>()

    // 아래 함수들은 모두 first last 모두 가지고 있지만 생략
    deque.addLast(1) // exception 반환
    deque.addFirst(2) // exception 반환 x

    deque.removeFirst() // exception 반환
    deque.removeLast() // exception 반환 x

    deque.first()
    deque.last()
}