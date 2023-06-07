package technic2

fun main() {
    val list = arrayListOf(1, 2, 3, 4, 5)

    list.forEach() { print("$it ") }// 컬렉션에 포함된 모든 요소 출력
    list.minOrNull()// 컬렉션 최솟값 반환
    list.maxOrNull()// 컬렉션 최댓값 반환

    list.first()// 첫 번째 요소 반환
    list.first { it > 3 }// 조건에 맞는 첫 번째 요소 반환
    list.last()// 마지막 요소 반환
    list.last { it < 3 }// 조건에 맞는 마지막 요소 반환

    list.filter { it < 3 }// 조건에 맞는 요소 반환
    list.map { it + 5 }// 수식을 적용하여 값 변경하여 반환
    list.count() { it < 3 }// 조건에 맞는 요소의 개수 반환
    list.any { it < 3 }// 조건에 하나라도 일치하는 요소가 있다면 true
    list.all { it < 3 }// 모든 요소가 조건에 맞다면 true
    list.none { it < 3 }// 조건에 하나도 맞지 않으면 true

    list.reduce { acc, i -> acc * i }// 내부의 데이터를 다 모아줌
    list.fold(10) { acc, i -> acc * i }// 내부의 데이터를 다 모아줌 (초기값 지정)

    list.sorted()// 컬렉션 정렬하여 반환
    list.sortedDescending()// 컬렉션 정렬하여 반환 (내림차순)
    list.sort()// 컬렉션 정렬 (Mutable 타입만 가능)

    list.sortedBy { it }// 특정 기준점으로 컬렉션 정렬하여 반환
    list.sortedByDescending { it }// 특정 기준점 기준 컬렉션 정렬하여 반환 (내림차순)
}