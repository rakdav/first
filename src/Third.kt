fun main() {
    print("Введите имя:")
    val name = readln()
    print("Введите возраст:")
    val age = readln().toInt()
    val tom:Person=Person(name)
    tom.age=age
    tom.print()
    val bob=Employee("Bob",18,"Microsoft")
    bob.print()
}
open class Person(private val name: String) {
    private var _age=1
    var age:Int=18
        set(value) {
            if ((value > 0) and (value<110)) field=value
        }
        get() = field
    fun getName(): String {
        return name
    }
    fun sayHello(){
        println("Hello")
    }
    fun go(location:String){
        println(location)
    }
    open fun print(){
        println("Меня зовут:${getName()}, мне $age лет.")
    }
}
class Employee(name: String, age: Int,private val company:String) : Person(name){
    override fun print(){
        super.print()
        println("Работаю в $company.")
    }
}



