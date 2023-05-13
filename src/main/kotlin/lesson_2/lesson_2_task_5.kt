package lesson_2

import kotlin.math.pow
import kotlin.Unit as Unit1

/*Напиши программу-калькулятор для банковского приложения (такой функционал бывает на промо экранах).
Используя формулу сложных процентов (ее можно загуглить),
нужно посчитать размер вклада через 20 лет с такими условиями:

 – Клиент ввел в приложении сумму 70_000 рублей (считать ее известной заранее и проинициализировать переменную);
 – Процентная ставка 16,7% (проценты начисляются в конце года);
 – Подсчитать размер вклада через 20 лет;
 – Результат должен быть дробным числом с 3 знаками после запятой;
 – Ответ должен получиться таким 1536438.428.*/
fun main() {

    val initialAmount: Double = 70000.0
    val interestRate: Double = 16.7
    val years: Int = 20

    val finalAmount = String.format ("%.3f", initialAmount * (1 + interestRate / 100).pow(years.toDouble()))
//    println(finalAmount)

}