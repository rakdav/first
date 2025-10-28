fun main() {
    //?:
    //var age:Int?=23
//    val userAge: Int=age?:0
//    println(age)
    val name:String?="tom"
    val userName:String=name?:"Undefined"

    //?.
    val message: String? ="Hello"
    val length:Int=message?.length?:0
    println(length)

    //!!(not-null assertion operator)
    val last:String?="day"
    val id:String=last!!
    println(id)

    //is
    val tom = PersonSeven("Tom")
    val bob = EmployeeSeven("Bob", "JetBrains")
    checkEmployment(tom)
    checkEmployment(bob)
    checkEmployment(tom)
    checkEmployment(bob)
    //Функции расширения - позволяют добавить функционал к уже определенным типам
    val hello="hello world"
    println(hello.wordCount('l'))

    //Scope-функции (можно перевести как "функции контекста"
    // или "функции области видимости") позволяют выполнить
    // для некоторого объекта некоторый код в виде лямбда-выражение.

    //let-Лямбда-выражение в функции let в качестве параметра it получает
    // объект, для которого вызывается функция.
    val sam=PersonSeven("sam",45)
    sam.age.let { println(it) }
    //with - Лямбда-выражение в функции with в качестве
    // параметра this получает объект, для которого вызывается функция.
    val jack=PersonSeven("jack")
    val ageJack= with(jack){
        if(age==null) {
            age=0
        }
        age
    }
    println(ageJack)

    //run - Лямбда-выражение в функции run в качестве параметра 
    // this получает объект, для которого вызывается функция
    val sir=PersonSeven("sir")
    val agesir= sir.run{
        if(age==null) {
            age=0
        }
        age
    }
    println(agesir)

    //apply - Лямбда-выражение в функции apply в качестве параметра
    // this получает объект, для которого вызывается функция.
    // Возвращаемым результатом функции фактически является передаваемый
    // в функцию объект для которого выполняется функция.
    val alice=PersonSeven("Alice")
    alice.apply { if(age==null) age=0 }
    println(alice.age)

    //also - Лямбда-выражение в функции also в качестве
    // параметра it получает объект, для которого вызывается функция.
    // Возвращаемым результатом функции фактически является
    // передаваемый в функцию объект для которого выполняется функция.

    val miha=PersonSeven("Miha",34)
    miha.also { if(it.age==null) it.age=0 }
    println(miha.age)
}
fun String.wordCount(c:Char):Int{
    var count=0
    for(n in this){if(n==c) count++}
    return count
}
fun checkEmployment(person: PersonSeven)
{
    if(person is EmployeeSeven) println("${person.name} works in ${person.company}")
    else println("${person.name} не работает")
}
fun checkCompany(person: PersonSeven){
    val emp=person as? EmployeeSeven
    if(emp!=null)
        println("${emp.name} works in ${person.company}")
    else println("${person.name} is not employer")
}
open class PersonSeven(val name: String, var age:Int?=null)
class EmployeeSeven(name: String, val company: String): PersonSeven(name)