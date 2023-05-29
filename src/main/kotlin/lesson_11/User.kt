package lesson_11

class User (
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
