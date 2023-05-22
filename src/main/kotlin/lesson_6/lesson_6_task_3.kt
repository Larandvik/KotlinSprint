package lesson_6
/*Скопируй код из предыдущей задачи в новый файл. Нужно усовершенствовать таймер так,
чтобы он показывал пользователю сколько секунд осталось в процессе отсчета.
 – каждую секунду выводить сообщение такого формата: “Осталось секунд: N”;
 – по истечению таймера выводить сообщение “Время вышло”;
 – таймер должен быть написан, используя цикл while.*/
fun main() {
    println("Введите количество секунд, которую нужно засечь:")
    val userTimer = readln().toInt()
    timer(userTimer)
}

fun timer(userTimer: Int) {
    var counter = userTimer
    while (counter > 0) {
        println("Осталось секунд: ${counter--}")
        Thread.sleep(1000)
    }
    println("Время вышло")
}