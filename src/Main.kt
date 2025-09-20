import kotlin.math.sqrt

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

    println("Введите номер месяца:")
    val n= readln().toInt()
//    when (n) {
//        12,1,2-> println("Зима")
//        3,4,5-> println("Весна")
//        6,7,8-> println("Лето")
//        9,10,11-> println("Осень")
//        else-> println("Нет такого месяца")
//    }
    var dayOfWeek=when (n) {
        12,1,2-> "Зима"
        3,4,5-> "Весна"
        6,7,8-> "Лето"
        9,10,11-> "Осень"
        else-> "Нет такого месяца"
    }
    println(dayOfWeek)

    //циклы

}