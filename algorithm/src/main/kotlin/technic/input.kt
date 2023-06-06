package technic

fun main() = with(System.`in`.bufferedReader()) {
    /**
     * 10
     * 10
     */
    // 정수 하나 읽기
    val num = readLine().toInt()

    /**
     * 10 20 30 40 50
     * [10, 20, 30, 40, 50]
     */
    // 공백 기준으로 읽기
    val nums = readLine().split(" ").map { it.toInt() }

    // 문자열을 char 배열로 받기
    val char = readLine().toCharArray()
}
