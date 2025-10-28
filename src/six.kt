fun main() {
//    var people= listOf("Tom","Sam","Mike","Bob","Alice")
//    people= people.filter { it.length>3 }
//    println(people.joinToString())
//    val employer= listOf(Chel("Tom",37),
//        Chel("Bob",41),
//        Chel("Alice",15))
//    val employers= employer.filter { it.age>18 }
//    println(employers.joinToString())
//    val filtered= people.filterIndexed{ index, _ ->(index%2==0)}
//    println(filtered.joinToString())
//    val group= listOf(Misha("Misha"),Masha("Masha"),
//        Misha("Serge"),null,Masha("Nataly"),null)
//    val mash=group.filterIsInstance<Masha>()
//    println(mash.joinToString())
//    val fil=people.filterNotNull()
//    println(fil.joinToString())
//    //all
//    println(people.all{it.length==3})
//    println(people.all{it.length!=3})
//    println(people.none{it.length == 3})
//    println(people.any{it.length == 3})
//    println(people.contains("Sam"))
//    println(people.containsAll(listOf("Tom","Bob","Alice")))

    //трансформации
//    val people = listOf(Chel("Tom",28), Chel("Sam",34),
//        Chel("Bob",29))
//    val names=people.map { it.name }
//    println(names)
//    val numbers=listOf(1,2,3,4,5)
//    val squares=numbers.map{it * it}
//    println(squares)
//    val group= listOf(Misha("Misha"),Misha("Masha"),
//        Misha("Serge"))
//    val namesList=group.mapIndexed{index,element ->"${index+1}.${element.name}"}
//    println(namesList)

    //Группировка
//    val employees = listOf(
//        Employee("Tom", "Microsoft"),
//        Employee("Bob", "JetBrains"),
//        Employee("Sam", "Google"),
//        Employee("Alice", "Microsoft"),
//        Employee("Kate", "Google")
//    )
//    val companies = employees.groupBy( { it.company }){it.name}
//    println(companies)
//    for (company in companies){
//        println(company.key) // название компании
//        // перебор списка сотрудников
//        for (employee in company.value){
//            println(employee)
//        }
//        println() // для отделения групп
//    }
//    val people = listOf("Tom", "Mike", "Bob", "Sam", "Alice")
//    val numbers = listOf(3, 5, 2, -4, -6, 9, 1)
//    val sortedPeople = people.sorted()
//    val sortedNumbers = numbers.sorted()
//    println(sortedPeople)
//    println(sortedNumbers)
//    val reversed = numbers.reversed()
//    println(reversed)
//    println(numbers.minOrNull())
//    println(numbers.maxOrNull())
//    println(people.minOrNull())
//    println(people.maxOrNull())
//    println(numbers.average())
//    println(numbers.sum())
//    println(numbers.count())
//    println(numbers.reduce{a,b->a+b})
//    val people = listOf("Tom", "Bob", "Sam")
//    var result1 = people.plus("Alice")
//    println(result1)
//    result1=result1.minus("Alice")
//    println(result1)
    val english = listOf("red", "blue", "green")
    val russian = listOf("красный", "синий", "зеленый")
    val words = english.zip(russian)
    for(word in words)
        println("${word.first}: ${word.second}")
    val dictionary = listOf("red", "blue", "green")
        .zip(listOf("красный", "синий", "зеленый"))
    val word = dictionary.unzip()
    println(word.first)    // [red, blue, green]
    println(word.second)   //
}
data class Chel(var name: String, var age: Int)
open class Misha(var name: String){
    override fun toString(): String=name
}
class Masha(name:String): Misha(name){}

class Employee(val name: String, val company: String){
    override fun toString(): String = name
}

