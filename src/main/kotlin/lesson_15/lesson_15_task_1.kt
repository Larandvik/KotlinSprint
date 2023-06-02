package lesson_15
/*В мобильной игре есть разные существа. Напиши интерфейсы для летающих и плавающих существ.

 – создай интерфейсы с методами передвижения для следующих существ: карась, чайка, утка;
 – затем создай для каждого существа классы, реализующие соответствующие интерфейсы;
 – выведи сообщения в консоль, о том как они могут передвигаться.*/
fun main() {
    val carp = Carp()
    carp.swim()
    println()

    val gull = Gull()
    gull.fly()
    gull.move()
    println()

    val duck = Duck()
    duck.swim()
    duck.move()
    duck.fly()
}

class Carp : Swimable {
    init {
        println("Карась")
    }
}

class Gull : Flyable, Movable {
    init {
        println("Чайка")
    }
}

class Duck : Movable, Flyable, Swimable {
    init {
        println("Утка")
    }
}

interface Movable {
    fun move() {
        println("ходит")
    }
}

interface Flyable  {
    fun fly() {
        println("летает")
    }
}

interface Swimable {
    fun swim() {
        println("плавает")
    }
}