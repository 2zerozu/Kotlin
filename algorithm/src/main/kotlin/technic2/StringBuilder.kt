package technic2

/**
 * 코틀린에서 문자열을 합치기 위하여 자바의 StringBulider를 사용할 수 있다.
 *
 * 문자열을 단순히 + 연산을 실행하면 아예 새로운 문자열을 생성하기 때문에 효율이 떨어진다.
 *
 * 하지만 StringBulider는 문자열을 더하는 효율적인 방식으로 작동한다.
 */
fun main() {
    val sb = StringBuilder()

    sb.append("abc")// 문자열 추가
    sb.insert(2, "ef")// 2 위치에 문자열 ef 삽입

    sb.delete(0, 2)// 0 ~ 1 범위의 문자열 삭제 (마지막 범위 포함 X)
    sb.deleteCharAt(1)// 1 위치의 문자 삭제

    sb.setCharAt(1, 'g')// 1 위치의 문자 g로 변경
    sb.reverse()// 문자열 뒤집기

    sb.setLength(0)// 문자열 길이 0으로 조절 (기존보다 짧은 길이면 삭제)
    sb.setLength(5)// 문자열 길이 5으로 조절 (기존보다 긴 길이면 공백으로 채움)// 배열의 숫자를 하나의 문자열로 합침 (1 2 3 4)
    val arr = arrayOf(1, 2, 3, 4)
    arr.forEach { sb.append(it).append(' ') }
}