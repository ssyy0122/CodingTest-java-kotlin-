import java.util.Arrays

//배열
fun main() {
  var intArr:Array<Int> = arrayOf(1,2,3,4)
    //type 생략 가능
    var intArr2 = arrayOfNulls<Int>(5)
    //Any는 데이터 타입 최상(어느 데이터든 들어갈 수 있음)
    var anyArr : Array<Any> = arrayOf(1,"awd",3.2,4)
    println(intArr[0])
    println(intArr2[1])
    println(anyArr[1])
}