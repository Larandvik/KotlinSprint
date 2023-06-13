package lesson_19
/*В симуляторе аквариума есть 4 вида рыб.
Гуппи (guppy), скалярия (angelfish), золотая рыбка (Goldfish), петушок (Siamese fighting fish).
Напиши enum класс, перечисляющий этих рыб.
Сообщи пользователю, каких рыб он может добавить в свой аквариум, распечатав список в консоль.*/
fun main() {
    println(Fish.values())
    for (i in Fish.values()) println(i.fishName)
}

enum class Fish(val fishName: String) {

    GUPPY("guppy"),
    ANGELFISH("angelfish"),
    GOLDFISH("Goldfish"),
    SIAMESE_FIGHTING_FISH("Siamese fighting fish"),
}