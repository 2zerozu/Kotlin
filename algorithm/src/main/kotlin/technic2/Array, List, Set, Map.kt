package technic2

fun main() {

    // 1. Array
    // 배열은 사이즈가 할당되어 있다.
    val arr1 = arrayOf(1, 2, 3)// 1,2,3을 담은 배열 생성
    val arr2 = Array(3) { 0 }// 크기가 3이고 초기값이 0인 배열 생성
    val arr3 = emptyArray<Int>()// Int 타입의 빈 배열 생성
    arr1[0] = 7// 0번째 값을 7로 바꾼다 (배열은 Mutable 타입이기 때문에 수정 가능)

    // 2. List
    // 리스트는 순서를 가지고, 사이즈가 자동으로 정해지며 기본은 Immutable 타입
    val list1 = listOf(1, 2, 3)// 1,2,3을 담은 리스트 생성
    val list2 = List(3) { 0 }// 크기가 3이고 초기값이 0인 리스트 생성
    val list3 = arrayListOf<Int>(1, 2, 3)// 1,2,3을 담은 arrayList 생성 (Mutable)// list1[0] = 1 --> 오류발생 (수정 불가능)
    list3[0] = 1// 0번째 값을 1로 바꾼다 (arrayList 는 Mutable 타입)
    list3.add(10)// 다음 값으로 10을 추가

    // 3. Set
    // 집합은 순서를 가지지 않고, 중복 불가능. 사이즈가 자동으로 정해지며 기본은 Immutable 타입
    val set1 = setOf(1, 2, 3)// 1,2,3을 담은 Set 생성 (수정 불가)
    val set2 = mutableSetOf(1, 2, 3)// 1,2,3을 담은 mutableSet 생성 (수정 가능)
    set2.remove(2)// 집합에서 2 삭제

    // 4. Map
    // 요소를 키와 값의 쌍의 형태로 저장. 키는 중복 불가능. 사이즈 자동, 기본 Immutable
    val map1 = mapOf(1 to "Kim", 2 to "Han")// 수정 불가능
    val map2 = mutableMapOf(1 to "Kim", 2 to "Han")// 수정 가능

    map2.size// 맵의 사이즈 반환
    map2.keys// 맵의 모든 키 반환
    map2.values// 맵의 모든 값 반환
    map2.isEmpty()// 맵이 비어있으면 true, 아니면 false
    map2.containsKey(1)// 1에 해당하는 키가 있으면 true, 아니면 false
    map2.containsValue("Kim")// Kim에 해당하는 값이 있다면 true, 아니면 false
    map2[1]// 키에 해당하는 값 반환, 없다면 null
    map2.getOrDefault(1, "2")// 키에 해당하는 값 반환, 없다면 "2" 반환
    map2[3] = "Lee"// 3과 Lee의 쌍 추가
    map2.remove(1)// 1에 해당하는 요소 제거
    map2.clear()// 초기화
}