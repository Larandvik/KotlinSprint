package lesson_20

/*В компьютерной игре игрок может подобрать лечебное зелье, которое восстанавливает всё его здоровье.
Создай класс игрока (у него должно быть имя, текущее и максимальное здоровье).
Затем напиши лямбда-функцию, реализующую лечебное зелье.
Создай экземпляр игрока с неполным здоровьем, примени к нему созданную лямбду-функцию.*/

fun main() {
    val warrior = Player("воин", 500)
    val healingPotion: (Player) -> Unit = { player -> player.currentHealth = player.maxHealth }

    healingPotion(warrior)

    println(warrior.currentHealth)
}

class Player(
    val name: String,
    var currentHealth: Int,
    val maxHealth: Int = 1000,
)