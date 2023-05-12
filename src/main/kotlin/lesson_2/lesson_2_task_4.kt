package lesson_2
/*Задача 4 к Уроку 2

В мобильной стратегии есть бафф (временное усиление какого-либо юнита или процесса),
который дает +20% к добытым материалам. Было добыто 7 кристаллической и 11 железной руды без баффа
– заранее известные данные, объявить и проинициализировать.

Напиши программу, которая будет учитывать действие баффа и выводить в консоль количество “бонусных”
(то есть тех материалов, которые даются “сверху” баффом). По одной строке на материал с его названием.

Если получается нецелое число, то дробная часть должна отбрасывается.*/
fun main() {

    val crystalOreCount: Int = 7
    val ironOreCount: Int = 11

    val buffPercentage: Int = 20
    val bonusCrystalOreCount: Int = crystalOreCount * buffPercentage / 100
    val bonusIronOreCount: Int = ironOreCount * buffPercentage / 100

    println(bonusCrystalOreCount)
    println(bonusIronOreCount)
}