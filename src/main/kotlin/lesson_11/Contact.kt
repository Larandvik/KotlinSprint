package lesson_11

class Contact(

    private val name: String = "",
    private val secondName: String = "",
    private val cellularPhone: String = "",
    private val homePhone: String = "",
    private val iCloud: String = "",
    private val category1: String = "",
    private val category2: String = "",
    private val category3: String = "",
    private val photo: String = "photo",

    ) {
    fun runFaceTimeCall() {
        println("аудиозвонок по FaceTime")
    }

    fun runFaceTimeVideoCall() {
        println("видеозвонок по FaceTime")
    }

    fun sendMessage(text: String) {
        println("отправляем cмс $text, на номер $cellularPhone")
    }

    fun runCall() {
        println("аудиозвонок на номер $cellularPhone")
    }

    fun runVideoCall() {
        println("видеозвонок по номеру $cellularPhone")
    }

    fun sendEmail() {
        println("Открываем экран для отправки email по адресу $iCloud")
    }
}