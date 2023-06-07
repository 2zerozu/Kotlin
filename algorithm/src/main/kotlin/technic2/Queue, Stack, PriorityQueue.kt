package technic2

import java.util.*

fun main() {

    // 1. Queue
    val q: Queue<Int> = LinkedList()// 큐로 선언하고 LinkedList 로 할당
    q.add(1)// 객체를 큐에 추가 (큐가 가득찬 상태이면 illegalStateException 발생)
    q.offer(3)// 객체를 큐에 추가 (큐가 가득찬 상태이면 false 반환)

    q.element()// 맨 앞 객체 리턴 (큐가 비어있는 상태이면 NoSuchElementException 발생)
    q.elementAt(1)// 인덱스 값의 객체 리턴
    q.peek()// 맨 앞 객체 리턴 (큐가 비어있는 상태이면 null 반환)

    q.remove()// 삭제하면서 객체 반환 (큐가 비어있는 상태이면 NoSuchElementException 발생)
    q.poll()// 삭제하면서 객체 반환 (큐가 비어있는 상태이면 false 반환)

    q.size// 큐 사이즈
    q.isEmpty()// 비어있으면 true, 아니면 false

    // 2. Stack
    val s = Stack<Int>()
    s.push(1)// 객체를 스택에 추가
    s.peek()// 맨 위의 객체 반환 (비어 있는 상태이면 EmptyStackException 발생)
    s.pop()// 맨 위의 객체 삭제하고 반환 (비어 있는 상태이면 EmptyStackException 발생)
    s.isEmpty()//비어있으면 true, 아니면 false
    s.size// 스택 사이즈

    // 3. PriorityQueue
    val pq = PriorityQueue<Int>()// 오름차순
    val pq2 = PriorityQueue<Int>(Collections.reverseOrder())// 내림차순
    val pq3 = PriorityQueue<Node>()
}

// index 기준 비교 (오름차순)
data class Node(
        val index: Int,
        val value: Int
) : Comparable<Node> {
    override fun compareTo(other: Node): Int = index - other.index
}