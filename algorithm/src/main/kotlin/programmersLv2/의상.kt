package programmersLv2

fun main() {
    val clothes = listOf(listOf("yellow_hat", "headgear"), listOf("blue_sunglasses", "eyewear"), listOf("green_turban", "headgear"))
    println(solution(clothes))
}

private fun solution(clothes: List<List<String>>) = clothes
        .groupBy { it[1] }.values // 종류별로 group지어서 관리 [[[yellow_hat, headgear], [green_turban, headgear]], [[blue_sunglasses, eyewear]]]
        .map { it.size + 1 } // 단일 경우의 수 때문에 +1해줌 [3,2]
        .reduce(Int::times) // 모든 조합의 수를 곱한다
        .minus(1) // 아무 것도 선택되지 않을 경우 때문에 -1해줌

/**
 * reduce: reduce 함수는 리스트의 요소를 하나씩 차례로 누적하여 단일 값으로 줄입니다.
 * 여기서는 Int::times 함수를 사용하여 모든 그룹의 조합 수를 곱합니다.
 * 따라서 각 그룹의 크기에 1을 더한 값들을 모두 곱한 결과가 반환됩니다.
 */