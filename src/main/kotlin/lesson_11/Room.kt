package lesson_11

class Room(
    private val cover: String,
    private val name: String,
    private val listOfUser: MutableList<User> = mutableListOf()
) {
    fun addToRoom(user: User) =listOfUser.add(user)

    fun removeFromRoom(user: User) = listOfUser.remove(user)

    fun pressLongAvatar(user: User) = user.getName()

    fun getListOfGuest() = println(listOfUser.toString())
}