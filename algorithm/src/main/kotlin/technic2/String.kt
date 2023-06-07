package technic2

fun main() {
    var str = "abcd"
    val str2 = "123"

    str.length// 문자열의 길이
    str[1]// 문자열의 특정 위치 접근
    str2.toInt()// 문자열 타입 변환 to'Type'()

    str.isEmpty()// 문자열 길이가 0이면 true, 아니면 false
    str.isBlank()// 문자열 길이가 0이거나 공백으로만 이루어져 있다면 true, 아니면 false
    str.contains("a")// 문자열에 a가 포함되어 있으면 true, 아니면 false
    str.compareTo("abd")// 문자열 사전순 비교, str 이 앞이면 -1, 같으면 0, 뒤면 1

    str.split(" ")// 공백으로 구분하여 List<String> 반환
    str.substring(2, 4)// 2 ~ 3 위치 문자열 반환 (마지막 범위 포함 X)
    str.substring(1)// 1부터 끝까지 문자열 반환

    str.trim()// 문자열 앞 뒤 공백 제거 (문자열 사이 공백 제거 X) 결과 반환
    str.lowercase()// 대문자 => 소문자 결과 반환
    str.uppercase()// 소문자 => 대문자 결과 반환
    str.replace("a", "b")// 문자열 "a"를 전부 "b"로 바꾼 결과 반환
    str.reversed()// 문자열 뒤집은 결과 반환

    str += "ef"// 문자열 추가
}