package lesson_17
/*В приложении для хранения облачных файлов есть папки и файлы.
Создай класс папки, который имеет имя, количество файлов и флаг “секретно”.
Если флаг имеет значение true, то при попытке прочитать имя, возвращать строку “скрытая папка” и количество файлов – 0.
В ином случай возвращать ее название и реальное количество файлов.

Создай экземпляр “скрытой” папки. Протестируй попытку чтения ее данных. Используй геттеры.*/
fun main() {
    val secretFolder = Folder("Windows", 1000, true)

    println(secretFolder.nameFolder)
    println(secretFolder.counterFile)
    println()

    val folder = Folder("Picture", 1000, false)
    println(folder.nameFolder)
    println(folder.counterFile)
}

class Folder(

    private var name: String,
    private var counter: Int,
    private var isHide: Boolean,
) {

    val nameFolder: String
        get() = if (isHide) "скрытая папка" else name

    val counterFile: Int
        get() = if (isHide) 0 else counter
}