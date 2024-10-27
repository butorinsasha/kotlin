package tbank.mentoring.homework06functionalprogramming

//ДОМАШНЕЕ ЗАДАНИЕ
//Написать класс Termometer, который хранит температуру в Кельвинах
//и написать функцию convert(), которая будет принимать функцию,
//которая может переводить в градусы Цельсия и в градусы Фаренгейта.

class KelvinThermometer(private val tempInKelvin: Double) {

    fun convert(x: Double, f: (Double) -> Double): Double {
        return f(x)
    }

    companion object Converter {
        val kelvinToCelsius = { tempInKelvin: Double -> tempInKelvin - 273.15 }
        val kelvinToFahrenheit = { tempInKelvin: Double -> (tempInKelvin - 273.15) * 9 / 5 + 32 }
    }
}