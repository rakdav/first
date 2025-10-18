fun main() {
    //List
    var numbers= listOf(1,2,3,4,5)
    var names= listOf("Tom","Sam","Serge","Bob","Dog")
    for (number in numbers) {
        print("$number ")}
    println()
   // println(numbers.get(2))
    println(numbers[3])
    val sunNames=names.subList(1,3)
    for (name in sunNames) print("$name ")
    println()
    var mutNumbers1= arrayListOf(1,2,3,4,5)
    var mutNumbers2= mutableListOf(6,7,8,9)
    println(mutNumbers2)
    mutNumbers2.add(0)
    println(mutNumbers2)
    mutNumbers1.addAll(mutNumbers2)
    println(mutNumbers1)
    mutNumbers1.removeAt(5)
    println(mutNumbers1)
    mutNumbers1.remove(7)
    println(mutNumbers1)
    mutNumbers1.clear()
    //set
    val set1= setOf(6,7,8,9,7,5)
    println(set1)
    val set2= mutNumbers2.toSet()
    println(set2)
    println(set2.union(set1))
    println(set2.intersect(set1))
    println(set2.subtract(set2))
    val set3= hashSetOf(11,12,13,12)
    println(set3)
    val set4=linkedSetOf(25,26,26,21)
    println(set4)
    val set5=mutableSetOf(11,12,13,12)
    println(set5)
    set5.add(8)
    set5.remove(11)
    set4.clear()
    //Коллекция Map представляет коллекцию объектов,
    // где каждый элемент имеет ключ и сопоставляемое с ним значение
    val people=mapOf(1 to "Tom", 2 to "Sam", 3 to "Serge")
    println(people)
    for (man in people) println("${man.key}-${man.value}")
    println(people[1])
    println(people.containsKey(1))
    println(people.containsValue("Sam"))
    var dinPeople=mutableMapOf(1 to "Tom", 2 to "Sam", 3 to "Serge")
    dinPeople[7] = "Bob"
    dinPeople.putAll(people)
    println(dinPeople)
    dinPeople[7]="Bill"
    println(dinPeople[7])
    dinPeople.remove(7)
    //последовательности
    val seq1=sequenceOf("Tom","Sam","Serge","Bob","Dog")
    println(seq1.joinToString())
    val emp=names.asSequence()
    println(emp.joinToString())
    var nums=0
    val snums= generateSequence { nums+=2;if (nums>8) null else nums }
    println(snums.joinToString())

    var narod=listOf(HumanMan("Tom",38),
        HumanMan("Sam",28),
        HumanMan("Bobik",23),)
    narod=narod.filter { println("Age filter:${it}");it.age>20 }.
            filter { println("Name filter:${it}");it.name.length==3 }.take(1)
    println(narod)
    println(seq1.all { it.length==3})
    println(seq1.any { it.length==3 })
    println(seq1.none{ it.length==3 })
    println(seq1.contains("Tom"))
    println(names.containsAll(listOf("Tom","Sam","Serge")))
}
data class HumanMan(val name:String,val age:Int)