package programmersLv1

fun main() {
    val name = arrayOf("may", "kein", "kain", "radi")
    val yearning = intArrayOf(5, 10, 1, 3)
    val photo = arrayOf(arrayOf("may", "kein", "kain", "radi"), arrayOf("may", "kein", "brin", "deny"), arrayOf("kon", "kain", "may", "coin"))

    print(solution(name, yearning, photo).contentToString())

}

private fun solution(name: Array<String>, yearning: IntArray, photo: Array<Array<String>>): IntArray {
    val scoreMap = mutableMapOf<String, Int>()
    val result = IntArray(photo.size) { 0 }
    var sum: Int

    name.forEachIndexed { index, s ->
        scoreMap[s] = yearning[index]
    }

    photo.forEachIndexed { index, strings ->
        sum = 0
        strings.forEachIndexed { _, s ->
            sum += scoreMap[s] ?: 0
        }
        result[index] = sum
    }

    return result
}