package technic

fun main() = with(System.`in`.bufferedReader()) {
    // 배열
    val arr = intArrayOf(1, 2, 3)

    // 확장 함수로 배열 생성
    val arr2 = IntArray(4) { it }

    // 내용물 전체를 확인하는 코드
    println(arr2.contentToString()) // 결과 : [0, 1, 2, 3]

    val arr3 = IntArray(4) { it * 2 }
    // 내용물 전체를 확인하는 코드
    println(arr3.contentToString()) // 결과 : [0, 2, 4, 6]

    val n = 2
    val m = 3
    val h = 4

    // 다차원 배열
    val booleanArray = Array(n) {
        BooleanArray(m) { false }
    }
    booleanArray[1][2] = true

    // 정수로 이루어진 3차원 배열
    val arr4 = Array(h) {
        Array(n) {
            readLine().split(" ").map { it.toInt() }.toIntArray()
        }
    }
}