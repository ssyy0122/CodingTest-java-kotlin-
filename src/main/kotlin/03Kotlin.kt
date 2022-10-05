//함수
fun main() {
    println(add(1,2,3))
    println(max(2,5))
}
//함수의 기본 fun 함수이름(매개변수: type): 리턴 타입
fun add(a: Int,b: Int,c:Int):Int {
    return a + b + c;
}
//결과를 반환하는 함수
fun max(a: Int,b:Int): Int{
        return if (a>b) a else b
//더 간결한 식
//fun max(a: Int, b: Int): Int = if (a > b) a else b
}