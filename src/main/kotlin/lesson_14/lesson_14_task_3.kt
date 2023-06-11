package lesson_14

/*Создай 2 класса. Первый (родительский) описывает сообщение на форуме.
Нужно хранить текст сообщения и имя автора. Второй (наследующий) класс – для комментариев.

 – нужен метод, имитирующий публикацию поста на форуме. Сообщение должно содержать текст и автора поста;
 – нужен еще один метод для имитации комментария к посту. Сообщение должно содержать текст и автора комментария,
 а также информацию о посте, к которому оставлен комментарий;
 – выведи в консоль пост и комментарий к нему.*/
fun main() {
    val newPost = Message("Всем привет", "Batman")
    newPost.addMessage()
    println()

    val newComment = Comment("Привет", "Robin", newPost)
    newComment.addMessage()
}

open class Message(
    val text: String,
    val authorText: String,
) {

    open fun addMessage() {
        println("$authorText: $text")
    }
}

class Comment(
    text: String,
    authorText: String,
    val parentMessage: Message,
) : Message(text, authorText) {

    override fun addMessage() {
        println("комментарий к посту \"${parentMessage.text}\" от ${parentMessage.authorText}")
        super.addMessage()
    }
}