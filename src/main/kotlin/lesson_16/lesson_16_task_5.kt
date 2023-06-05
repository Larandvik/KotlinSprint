package lesson_16
/*Для компьютерной игры создать класс игрока.
У него есть имя, здоровье и сила удара. Здоровье должно изменяться только через методы получения урона и лечения.

Добавить приватный метод death(), который вызывается, если при получении урона заканчивается здоровье.
Смерть обнуляет силу удара, здоровье и не позволяет лечиться.

Сымитируй бой, вызвав несколько раз методы урона и лечения. В конце игрок должен умереть.*/
fun main() {
    val warrior1 = Warrior("Achilles")
    val warrior2 = Warrior("Gektor")

    warrior1.strike(warrior2)
    warrior2.treat()
    warrior2.strike(warrior1)
    warrior1.strike(warrior2)
    warrior2.treat()
    warrior1.strike(warrior2)
    warrior1.strike(warrior2)
}

class Warrior(
    private val name: String,
    private var health: Int = 1000,
    private var brunt: Int = 350,
    private val healingPotion: Int = 50,
) {
    fun strike(unit: Warrior) {
        unit.health -= brunt
        println("$name нанёс удар силой $brunt войну ${unit.name}")
        if (unit.health <= 0) return unit.death()
        println("у ${unit.name} осталось ${unit.health} здоровья")
    }

    fun treat() {
        health += healingPotion
        println("$name выпил бутылочку здоровья и теперь его здоровье $health")
    }

    private fun death() {
        health = 0
        brunt = 0
        println("$name убит")
    }
}