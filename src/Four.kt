//Data-классы
//data class Person(val name: String, val age: Int)
//equals()
//hashCode()
//toString()
//copy()
fun main() {
//    val alice = Person("Alice", 29)
//    println(alice.toString())
//    val bob = alice.copy(name = "Bob", age = 45)
//    println(bob.toString())
//    val (name, age) = bob
//    println("$name, $age")
//    val day=Day.Friday
//    println(day.value)
//    println(Day.Monday.value)
//    var day1=Day.Tuesday
//    var day2=Day.Saturday
//    println(day1.getDuration(day2))
//    println(day1.name)
//    println(day1.ordinal)
//    for (d in Day.entries) println(d)
//    println(Day.valueOf("Friday"))
//    DayTime.DAY.printName()
//    DayTime.NIGHT.printName()
    //println(operate(6,9,Operation.ADD))
//    val telegram=InstantMessenger("Telegram")
//    val samsung=SmartPhone("Samsung A55",telegram)
//    samsung.sendMessage("Hello Hadezhda")
    //Анонимные классы и объекты
//    val person=object {
//        val name="Tom"
//        var age=20
//        fun sayHello(){
//            println("Hello, my name is $name")
//        }
//    }
//    println("$person.name $person.age")
//    person.sayHello()
//    Person.printCounter()
//    Person("Tom")
//    Person.printCounter()
//    Person("Bob")
//    Person("Sam")
//    Person.printCounter()
    val tom:Person<Int> = Person(456,"Tom")
    val bob:Person<String> = Person("A67","Bob")
    println("${tom.id}-${tom.name}")
    println("${bob.id}-${bob.name}")
    tom.checkId(456)
    display("Hello World")
    display(1668)
    display(true)
}
//Обобщенные функции
fun<T> display(obj: T){
    println("${obj}")
}
//Обобщенные классы и функции

//Generics или обобщения представляют технику,
//посредством которой методы и классы могут использовать объекты,
//типы которых на момент определения классов и функций неизвестны.
//Обобщения позволяют определять шаблоны, в которые можно подставлять различные типы.

//Обобщенные типы
class Person<T>(var id:T, var name: String){
    fun checkId(_id:T){
        if(id == _id){
            println("The same")
        }
        else println("Different")
    }
}



//Companion-объекты
//class Person(val name:String){
//    init {
//        counter++
//    }
//    companion object{
//        private var counter=0
//        fun printCounter()=println("Counter: $counter")
//    }
//}
//Делигирование - возможность одного объекта перенаправлять все запросы другому объекту

interface Messanger{
    fun sendMessage(message: String)
}
class InstantMessenger(val programName:String) : Messanger {
    override fun sendMessage(message: String) {
        println("Message $message has been sent")
    }
}
class SmartPhone(val name:String,m:Messanger) : Messanger by m


enum class Operation{
    ADD, SUBTRACT,MULTIPLY
}
fun operate(n1:Int,n2:Int,operation:Operation):Int
{
    return when(operation){
        Operation.ADD-> n1+n2
        Operation.SUBTRACT-> n1-n2
        Operation.MULTIPLY-> n1*n2
    }
}
//перечисления
enum class Day(val value: Int) {
    Monday(1),Tuesday(2),Wednesday(3),
    Thursday(4),Friday(5),Saturday(6),
    Sunday(100500);
    fun getDuration(day: Day):Int{
        return value-day.value
    }
}
enum class DayTime{
    DAY{
        override val startHour=6
        override val endHour=21
        override fun printName(){
            println("День")
        }
    },
    NIGHT{
        override val startHour=22
        override val endHour=5
        override fun printName(){
            println("Ночь")
        }
    };
    abstract val startHour:Int
    abstract val endHour:Int
    abstract fun printName()
}