package lesson_20

/*В игре есть запертая дверь. Игрок должен найти ключ.
Нужно написать лямбда-функцию, которая будет проверять, есть ли у игрока ключ.
Если ключ есть, нужно вывести сообщение, что игрок дверь открыл, иначе – что дверь заперта.
Для проверки работы функции нужно написать класс игрока, в котором будет храниться информация о наличии ключа.*/

fun main() {
    val holmes = Player203("Шерлок")
    openDoor(holmes)

    getKey(holmes)
    openDoor(holmes)
}

val openDoor: (Player203) -> Unit =
    { player203 -> if (player203.isHasKey) println("${player203.name} открыл дверь") else println("Дверь заперта") }

val getKey: (Player203) -> Unit = { player203 -> player203.isHasKey = true }

class Player203(
    val name: String,
    var isHasKey: Boolean = false,
)