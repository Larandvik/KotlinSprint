package lesson_5

import java.time.LocalDate

/*Изменить пример из видео урока. В уроке создавался блок кода, считывающий возраст.
И если возраст больше или равен 18 лет, показывали экран с ограниченным контентом
(выводили это сообщение в консоль в качестве имитации).

Новое условие:
 – Пользователь должен вводить не возраст, а год рождения;
 – Возраст пользователя высчитывать на основании текущего года;
 – Вычисляемый результат должен сравниваться с константой, в которой хранится возраст совершеннолетия (18);
 – Если год рождения подходит, выводить сообщение “Показать экран со скрытым контентом”.*/
fun main() {
    val thisYear = LocalDate.now().year

    println("Введите ваш год рождения")
    val birthYear = readln().toInt()

    if (thisYear - birthYear >= AGE_OF_MAJORITY) println("Показать экран со скрытым контентом")
}

const val AGE_OF_MAJORITY = 18
