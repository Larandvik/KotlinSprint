package lesson_17
/*Создай класс, описывающий элемент викторины.
В конструкторе два текстовых свойства: вопрос и ответ.
Явно пропиши для вопроса сеттер, для ответа сеттер и геттер.*/
fun main() {

}

class QuizElement(
    question: String,
    answer: String,
) {

    var question = question
        set(value) {field = value}

    var answer = answer
        set(value) {field = value}
        get() = field
}