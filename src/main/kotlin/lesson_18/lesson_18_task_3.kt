package lesson_18

/*В тамагочи есть лиса, собака и кошка.
Они могут играть, спать и есть. Лиса ест ягоды, собака – кости, а кошка – рыбу.
У каждого животного есть имя. Эти действия отображаются в консоли по такому шаблону: “[имя] - [действие]”.
Напиши эти классы, используя полиморфизм и создай по одному экземпляру.*/
fun main() {
    val fox = Fox183("лиса")
    val dog = Dog183("собака")
    val cat = Cat183("кошка")

    fox.play()
    dog.sleep()
    cat.eat()
}

abstract class Animal183(val name: String) {

    fun play() {
        println("$name - играет")
    }
    fun sleep() {
        println("$name - спит")
    }
    open fun eat() {
        println("$name - ест")
    }
}

class Fox183(name: String) : Animal183(name) {
    override fun eat() {
        println("$name - ест ягоды")
    }
}
class Dog183(name: String) : Animal183(name) {
    override fun eat() {
        println("$name - ест кости")
    }
}
class Cat183(name: String) : Animal183(name) {
    override fun eat() {
        println("$name - ест рыбу")
    }
}