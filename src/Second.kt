import javax.swing.text.Position

fun main() {
    //    val name= readln()
//    hello(name,46,"teacher")
//    hello(name, position = "Дворник", age = 39)
//    double(intArrayOf(3,7,9))
//    sum(1,3,4,5,6,6,6)
//    val nums= intArrayOf(45,6,57,76,65,56)
//    changeNumbers(*nums, koef = 2)
    // println(sum2(5,89))
    // println(square(7))
    //  compareAge(56,45)
    //   println(Sum(1,5))
    //  println(Sum(1.0,15.8))
//    val message:()->Unit = ::hello
//    message()
//    var operation:(Int,Int)->Int=::Sum
//    val result=operation(3,4)
//    println(result)
//    displayMessage(::morning)
//    displayMessage(::evening)
//    displayMessage(::hello)
//    action(6,8,::sub)
//    action(6,8,::sum)
//    val action2=selectAction(2)
//    println(action2(6,9))
//    val sum=fun(x:Int,y:Int)=x + y
//    println(sum(5,9))
//    doOperation(4,8,fun(x:Int,y:Int):Int=x+y)
//    val action=SelectAction(1)
//    println(action(9,5))
    //Лямбда-выражения
  //  val hello={println("Hello World")}
   // {message:String->println(message)}("Hello World")
//    val sum={x:Int,y:Int-> println(x+y)}
//    val sub={x:Int,y:Int-> x-y}
//    sum(2,5)
//    println(sub(9,4))
    //Замыкания
    val fn=outer()
    fn()
    fn()
    fn()
    val func=multiply(5)
    var result=func(6)
    println(result)
}
fun outer():()->Unit{
    var n=5
    fun inner(){
        n++
        println(n)
    }
    return ::inner
}
fun multiply(n:Int):(Int)->Int{
    return {m:Int->n*m}
}
fun doOperation(x:Int,y:Int,op:(Int,Int)->Int){
    println(op(x,y))
}
fun SelectAction(key:Int):(Int,Int)->Int
{
    when(key){
        1->return fun(x:Int,y:Int):Int=x+y
        2->return fun(x:Int,y:Int):Int=x-y
        3->return fun(x:Int,y:Int):Int=x*y
        4->return fun(x:Int,y:Int):Int=x/y
        else->return fun(x:Int,y:Int):Int=0
    }
}
fun displayMessage(mes:()->Unit){
    mes()
}
fun action(n1:Int, n2:Int,op:(Int,Int)->Int){
    println(op(n1,n2))
}
fun selectAction(key:Int):(Int,Int)->Int{
    when(key){
        1->return ::sum
        2->return ::sub
        3->return ::multiple
        4->return ::division
        else ->return ::empty
    }
}
fun empty(a:Int,b:Int)=0
fun sum(a:Int,b:Int):Int=a+b
fun sub(a:Int,b:Int):Int=a-b

fun multiple(a:Int,b:Int)=a*b
fun division(a:Int,b:Int)=a/b
fun hello(){
    println("hello")
}
fun morning(){
    println("Good morning")
}
fun evening(){
    println("Good evening")
}
fun hello(name:String,age:Int=18,position: String="Student")
{
    println("Hello, $name!. I am $position. I am $age")
}
fun double(numbers:IntArray){
    numbers[0]=numbers[0]*2
    println(numbers[0])
}
//fun sum(vararg numbers:Int){
//    var result=0
//    for (num in numbers) result+=num
//    println(result)
//}
//оператор *
//Оператор * (spread operator)
// (не стоит путать со знаком умножения)
// позволяет передать параметру в качестве
// значения элементы из массива:
fun changeNumbers(vararg numbers:Int,koef:Int){
    for (num in numbers) println(num*koef)
}
fun sum2(x:Int, y:Int):Int
{
    return x + y
}
//Тип Unit
fun check(d:Int):Unit{
    println(d)
}
//Однострочные функции
//Однострочные функции (single expression function)
// используют сокращенный синтаксис определения функции
// в виде одного выражения.
fun square(n:Int):Int=n*n
//Локальные функции
//Внутренние или вложенные функции еще называют локальными.
fun compareAge(age1:Int,age2:Int)
{
    fun ageIsValid(age:Int):Boolean{
        return age in 1..149
    }
    if (!ageIsValid(age1)||!ageIsValid(age2)){
        println("Invalid age")
        return
    }
    when{
        age1==age2-> println("$age1=$age2")
        age1>age2-> println("$age1>$age2")
        age1<age2-> println("$age1<$age2")
    }
}

//Перегрузка функций (function overloading)
// представляет определение нескольких функций с одним
// и тем же именем, но с различными параметрами.
// Параметры перегруженных функций могут отличаться
// по количеству, типу или по порядку в списке параметров.
fun Sum(a:Int, b:Int):Int=a+b
fun Sum(a:Double, b:Double):Double=a+b
fun Sum(a:Int, b:Int,c:Int):Int=a+b+c
fun Sum(a:Double, b:Int):Double=a+b
fun Sum(a:Int, b:Double):Double=a+b
