import java.util.Arrays

//조건문
fun main(){
    var a =7
    if (a>6){
        println(a)
    }else{
        println("exit")
    }
}
//문자열 템플릿
fun main2(args: Array<String>){
    val name = if (args.size>0) args[0]else "kotlin"
    println("hello,$name")
}