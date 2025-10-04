fun main() {
//    print("Введите имя:")
//    val name = readln()
//    print("Введите возраст:")
//    val age = readln().toInt()
//    val tom:Person=Person(name,age)
//    tom.age=age
//    tom.print()
//    val bob=Employee("Bob",18,"Microsoft")
//    bob.print()
//    val rect=Rectangle(6.0,9.0)
//    println(rect.perimetr())
//    println(rect.area())

//    val car=Car()
//    val aircraft=Aircraft()
//    travel(car)
//    travel(aircraft)
    val serg=WorkingStudent("Серожа")
    work(serg)
    study(serg)
}
fun travel(obj:Movable)=obj.move()
fun work(worker: Worker)=worker.doWork()
fun study(student: WorkingStudent)=student.doWork()
abstract class Human(val name:String){
    abstract var age:Int
    abstract fun print()
}
open class Person(name: String,override var age:Int):Human(name){
    private var _age=1
//    var age:Int=18
//        set(value) {
//            if ((value > 0) and (value<110)) field=value
//        }
//        get() = field
    override fun print(){
        println("Меня зовут:${name}, мне $age лет.")
    }
}
class Employee(name: String, age: Int,private val company:String) : Person(name,age){
    override fun print(){
        super.print()
        println("Работаю в $company.")
    }
}

abstract class Figure{
    abstract fun perimetr():Double
    abstract fun area():Double
}

class Rectangle(private val width:Double, private val height:Double):Figure(){
    override fun perimetr(): Double {
        return width*2+height*2
    }
    override fun area(): Double {
        return width*height
    }
}
interface Movable{
    fun move()
}
class Car:Movable{
    override fun move() {
        println("Едем на машине")
    }
}
class Aircraft:Movable{
    override fun move() {
        println("Летим на самолете")
    }
}
interface Worker{
    fun doWork()
}
interface Student{
    fun study()
}
class WorkingStudent(private val name: String):Worker, Student{
    override fun doWork() = println("$name работает")
    override fun study() = println("$name учится")
}
