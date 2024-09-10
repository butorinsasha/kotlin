package tbank.mentoring.homework06functionalprogramming

import tbank.mentoring.homework06functionalprogramming.Thermometer.Converter.celsiusToFahrenheit
import tbank.mentoring.homework06functionalprogramming.Thermometer.Converter.celsiusToKelvin
import tbank.mentoring.homework06functionalprogramming.Thermometer.Converter.fahrenheitToCelsius
import tbank.mentoring.homework06functionalprogramming.Thermometer.Converter.fahrenheitToKelvin
import tbank.mentoring.homework06functionalprogramming.Thermometer.Converter.kelvinToCelsius
import tbank.mentoring.homework06functionalprogramming.Thermometer.Converter.kelvinToFahrenheit

//ДОМАШНЕЕ ЗАДАНИЕ
//Написать класс Termometer, который хранит температуру в Кельвинах
//и написать функцию convert(), которая будет принимать функцию,
//которая может переводить в градусы Цельсия и в градусы Фаренгейта.

class Thermometer(val temperature: Double) {
    fun convert(func: (Double) -> Double): Thermometer = Thermometer(func(this.temperature))

    companion object Converter {
        fun kelvinToCelsius(tempInKelvin: Double) = tempInKelvin - 273.15
        fun celsiusToKelvin(tempInCelsius: Double) = tempInCelsius + 273.15

        fun kelvinToFahrenheit(tempInKelvin: Double) = (tempInKelvin - 273.15) * 9 / 5 + 32
        fun fahrenheitToKelvin(tempInFahrenheit: Double) = (tempInFahrenheit - 32) * 5 / 9 + 273.15

        fun celsiusToFahrenheit(tempInCelsius: Double) = tempInCelsius * 9 / 5 + 32
        fun fahrenheitToCelsius(tempInFahrenheit: Double) = (tempInFahrenheit - 32) * 5 / 9
    }
}



fun main() {
    val thermometer = Thermometer(0.0)

    println( thermometer.convert{ kelvinToCelsius(it) }.temperature )
    println( thermometer.convert{ celsiusToKelvin(it) }.temperature )
    println( thermometer.convert{ kelvinToFahrenheit(it) }.temperature )
    println( thermometer.convert{ fahrenheitToKelvin(it) }.temperature )
    println( thermometer.convert{ celsiusToFahrenheit(it) }.temperature )
    println( thermometer.convert{ fahrenheitToCelsius(it) }.temperature )
    println()
    println(thermometer
            .convert { kelvinToCelsius(it) }
            .convert { celsiusToFahrenheit(it) }
            .convert { fahrenheitToCelsius(it) }
            .convert { celsiusToKelvin(it) }
            .convert { kelvinToFahrenheit(it) }
            .convert { fahrenheitToKelvin(it) }
            .temperature
    )
}