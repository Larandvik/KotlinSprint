package lesson_4

/*На таможенном терминале грузы сортируют по весу и объему.
Напиши программу, которая определяет – подходит ли груз в категорию Average.
Параметры категории неизменны: вес от 35 кг до 100 кг включительно, объем до 100 л не включительно.

Программа должна выводить в консоль информацию.
Пример вывода: “Average для груза с весом 42 кг и объемом 120 л: false”

– проинициализировать заранее известные ограничения;
– определить подходят ли под категорию Average грузы со следующими параметрами: 20кг / 80л и 50кг / 100л;
– выполнять сравнение сразу внутри println() и без использования диапазонов.*/
fun main() {
    println("Average для груза с весом 20 кг и объемом 80 л: ${isAverage(20, 80)}")
    println("Average для груза с весом 50 кг и объемом 100 л: ${isAverage(50, 100)}")
}

fun isAverage(weight: Int, volume: Int): Boolean {
    return weight >= CargoParameters.MIN_WEIGHT &&
            weight <= CargoParameters.MAX_WEIGHT &&
            volume < CargoParameters.VOLUME
}

class CargoParameters {
    companion object {
        const val MIN_WEIGHT: Int = 35
        const val MAX_WEIGHT: Int = 100
        const val VOLUME: Int = 100
    }
}