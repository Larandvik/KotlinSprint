package lesson_19

/*Разрабатываем приложение “Картотека”. Пользователь вводит имя и пол человека. Данные картотеки хранятся в списке.
Человека описывает класс, содержащий имя и пол. Пол должен храниться в enum. После ввода 5 человек, список выводится в консоль.
При старте приложения печатается инструкция в каком формате вводить имя и пол (и какие значения полов доступны)*/

fun main() {
    val fileCabinet = mutableListOf<Person>()

    println(
        """
        Для добавления пользователя в картотеку введите имя и пол пользователя
        Для мужского пола введите - "муж", для женского пола - "жен".
    """.trimIndent()
    )

    repeat(5) {
        println("Имя:")
        val namePerson = readln().replaceFirstChar {it.uppercase()}

        println("Пол муж/жен:")
        var genderPerson = readln()

        while (genderPerson != "муж" && genderPerson != "жен") {
            println("введите корректно пол пользователя $namePerson: \"муж\" или \"жен\"")
            genderPerson = readln().lowercase()
        }

        val gender = when (genderPerson) {
            "муж" -> Gender.MAN.sex
            "жен" -> Gender.WOMAN.sex
            else -> Gender.ERROR.sex
        }

        val newPerson = Person(namePerson, gender)
        fileCabinet.add(newPerson)
    }

    println("\nВ вашей картотеке следующие пользователи\n")
    for (person in fileCabinet) {
        println("имя: ${person.name}, пол: ${person.gender}")
    }
}

class Person(
    val name: String,
    val gender: String,
)

enum class Gender(val sex: String) {
    MAN("мужской"),
    WOMAN("женский"),
    ERROR("ошибка");
}