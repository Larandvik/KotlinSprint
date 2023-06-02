package lesson_11

/*Нужно описать сущности для упрощенной версии приложения социальной сети, в которой общаются только голосом.

Функционал одного из модулей будет такой. Есть лента, в которой отображаются “комнаты” для общения по интересам.
В карточке “комнаты” отображается:
 – обложка
 – название
 – список участников, которые отображаются в виде аватарок.
 При долгом нажатии на аватар подсветится его никнейм.
 Рядом с аватаркой отображается текстовый бейдж с одним из возможных статусов говорящего: “разговаривает”,
 “микрофон выключен”, “пользователь заглушен”.

После проектирования создай список объектов карточек с несколькими “комнатами” с произвольными данными.*/
fun main() {
    val room1 = Room("black", "интроверты")
    val user1 = User("Dima")
    val user2 = User("Sveta")
    val user3 = User("Andy")
    val user4 = User("Andy")

    room1.addToRoom(user1)
    room1.addToRoom(user2)

    user1.setStatus("talking")
    user2.setStatus("muted")
    // долго жмём на аватар:
    room1.pressLongAvatar(user1)

    println(user1)

    val room2 = Room("white", "флудилка")
    room2.addToRoom(user3)
    room2.addToRoom(user4)
    room2.getListOfGuest()
    room2.removeFromRoom(user4)
    room2.getListOfGuest()
}

class Room(
    private val cover: String,
    private val name: String,
    private val listOfUser: MutableList<User> = mutableListOf(),
) {
    fun addToRoom(user: User) = listOfUser.add(user)

    fun removeFromRoom(user: User) = listOfUser.remove(user)

    fun pressLongAvatar(user: User) = user.getName()

    fun getListOfGuest() = println(listOfUser.toString())
}

class User(
    private val name: String,
    private var status: String = "",
) {
    companion object {
        private var counter = 0
        fun getNextId(): Int {
            return ++counter
        }
    }

    val id: Int = getNextId()

    fun getName() {
        println(name)
    }

    fun setStatus(options: String) {
        when (options) {
            "talking" -> status = "разговаривает"
            "micOff" -> status = "микрофон выключен"
            "muted" -> status = "пользователь заглушен"
        }
    }

    fun getStatus() = status

    override fun toString(): String {
        return "User(name='$name', status='$status', id=$id)"
    }
}