import java.util.*
import kotlin.math.sqrt
import kotlin.random.Random

const val maxAge=150
fun main() {
//    print("Введите a:")
//    val a= readln().toFloat()
//    print("Введите b:")
//    val b= readln().toFloat()
//    print("Введите c:")
//    val c= readln().toFloat()

//    val z=a+b
//    println(String.format("%.2f", sqrt(z.toDouble())))

//    val d=b*b-4*a*c
//    if(d>0){
//        val x1=(-b+ sqrt(d))/(2*a)
//        val x2=(-b- sqrt(d))/(2*a)
//        println("x1=${String.format("%.2f", x1)}," +
//                " x2=${String.format("%.2f", x2)}")
//    }
//    else if (d.toDouble()==0.0){
//        val x=-b/(2*a)
//        println("x=${String.format("%.2f", x)}")
//    }
//    else println("Корней нет")

//    print("Введите номер дня недели:")
//    val n= readln().toInt()
//    when(n){
//        1-> println("Понедельник")
//        2-> println("Вторник")
//        3-> println("Среда")
//        4-> println("Четверг")
//        5-> println("Пятница")
//        6-> println("Суббота")
//        7-> println("Воскресенье")
//        else-> println("Такого дня недели нет!")
//    }

//    println("Введите номер месяца:")
//    val n= readln().toInt()
//    when (n) {
//        12,1,2-> println("Зима")
//        3,4,5-> println("Весна")
//        6,7,8-> println("Лето")
//        9,10,11-> println("Осень")
//        else-> println("Нет такого месяца")
//    }
//    var dayOfWeek=when (n) {
//        12,1,2-> "Зима"
//        3,4,5-> "Весна"
//        6,7,8-> "Лето"
//        9,10,11-> "Осень"
//        else-> "Нет такого месяца"
//    }
//    println(dayOfWeek)

    //циклы
//    var i=10
//    while (i>0){
//        println(i*i)
//        if(i==5) continue
//        i--
//    }
//    i=1
//    do {
//        print("${i*i} ")
//        if(i==5) break
//        i++
//    }while (i<11)

//    for(n in 1..9) print("${n*n} ")
//    println()
//    for (k in 1..9){
//        for (l in 1..9){
//            print("${k*l} ")
//        }
//        println()
//    }
//    for (k in 9 downTo 1) print("${k} ")
//    println()
//    for (k in 10 downTo 1 step 2) print("${k} ")
//    println()
//    for (k in 2..10 step 2) print("${k} ")
//    println()
//    for (k in 1 until 11 step 3) print("${k} ")
//    println()
//
//    if(7 in 1..10) println("yes")
//    else println("no")
//    if(4 !in 1..10) println("yes")
//    else println("no")

//массивы
//    val meArray= arrayOf(1,2,3,4,5)
//    println(meArray[3])
//    println(meArray.size)
//    var myArray = arrayOf(1,2,3,4,5,"Serge",'t',6.0)
//    println(myArray[5])
//    val array1= arrayOf<Int>(1,2,3,4,5)
//    println(array1[2])
//    val array2= intArrayOf(1,2,3,4,5)
//    println(array2[2])
//    //перебор элементов
//    for((i,v) in array1.withIndex()) {
//        println("Индекс $i значение $v")
//    }
//    for (index in array2.indices) {
//        println("Индекс $index значение ${array2[index]}")
//    }
    //сложение массивов
//    val num1=intArrayOf(1,2,3,4,5)
//    val num2=intArrayOf(6,7,8,9)
//    var num3=num1+num2
//    for (index in num3.indices) {
//        println("Индекс $index значение ${num3[index]}")
//    }
    //массив со значениями null
//    var nullArray=arrayOfNulls<String>(3)
//    for (index in nullArray.indices) {
//        println("Индекс $index значение ${nullArray[index]}")
//    }
//    nullArray[1] = "1"
//    for (index in nullArray.indices) {
//        println("Индекс $index значение ${nullArray[index]}")
//    }
    //emptyArray()
//    var arr1=emptyArray<String>()
//    arr1+="one"
//    arr1+="two"
//    for (index in arr1.indices) {
//        println("Индекс $index значение ${arr1[index]}")
//    }
    //конструктор Array
    val array1=Array(5) { i -> i * 2 }
    for (i in array1) {
        print("$i ")}
    println()
    val letters = Array<String>(26) { i -> ('A' + i).toString() }
    for (i in letters) {
        print("$i ")}
    println()
    letters.forEach { i->print("$i ") }
    println()
    letters.forEachIndexed{ i,j->println("$i:$j")}
    println()
    //Перевернуть массив
    val revLetters=letters.reversedArray()
    revLetters.forEach { i->print("$i ") }
    println()
    letters.reverse()
    letters.forEach { i->print("$i ") }
    println()
    //Сортировка элементов массива
    val mas= Array(20) { _ -> Random.nextInt(100) }
    mas.forEach { i->print("$i ") }
    println()
    //mas.sort()
    mas.sort(0,10)
    mas.forEach { i->print("$i ") }
    println()
    mas.sortDescending()
    mas.forEach { i->print("$i ") }
    println()
    //Содержится ли элемент в массиве
    val isContains = mas.contains(9)
    println(isContains)
    //Найти среднее значение чисел в массиве
    println(mas.average())
    //Подсчитать сумму чисел в массиве
    println(mas.sum())
    //Найти наибольшее и наименьшее число в массиве
    println(mas.max())
    println(mas.min())
    //Функция intersect(): найти общие элементы двух массивов
    val mas2= Array(20) { _ -> Random.nextInt(100) }
    mas2.forEach { i->print("$i ") }
    println()
    val intersectMas=mas.intersect(mas2.toList()).toIntArray()
    println(intersectMas.contentToString())
    //shuffle(): Перемешать элементы
    mas.shuffle()
    println(mas.contentToString())
    //Операция с каждым элементом массива по очереди
    var str=""
    val numbers= arrayOf(1,2,3,4,5)
    numbers.onEach {str+="${it*2} "}
    println(str)
    //Удалить дубликаты
    val newSet=mas.distinct()
    println(mas.joinToString())
    println(mas.toSet().joinToString())
    //Двумерные массивы
    var cinema = arrayOf<Array<Int>>()
    for (i in 0..10){
        var array= arrayOf<Int>()
        for (j in 0..10){
            array+=Random.nextInt(100)
        }
        cinema+=array
    }
    for (array in cinema) {
        for (value in array) {
            print("$value")
        }
        println()
    }
}