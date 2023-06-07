package programmersLv1

fun main() {
    val players = arrayOf("mumu", "soe", "poe", "kai", "mine")
    val callings = arrayOf("kai", "kai", "mine", "mine")
    val result = solution(players, callings)
    print(result.contentToString())
}

private fun solution(players: Array<String>, callings: Array<String>): Array<String> {
    val rankMap = mutableMapOf<String, Int>()
    players.forEachIndexed { index, s ->
        rankMap[s] = index
    }

    callings.forEachIndexed { _, s ->
        val callRank = rankMap[s] ?: 0
        val frontPlayer = players[callRank - 1]

        players[callRank - 1] = s
        players[callRank] = frontPlayer

        rankMap[s] = callRank - 1
        rankMap[frontPlayer] = callRank
    }

    return players
}