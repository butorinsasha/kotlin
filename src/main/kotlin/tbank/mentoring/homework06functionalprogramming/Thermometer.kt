package tbank.mentoring.homework06functionalprogramming

import kotlin.math.abs

//ДОМАШНЕЕ ЗАДАНИЕ
//Написать класс Termometer, который хранит температуру в Кельвинах
//и написать функцию convert(), которая будет принимать функцию,
//которая может переводить в градусы Цельсия и в градусы Фаренгейта.

class Thermometer(val temperature: Double) {

    fun convert(func: (Double) -> Double): Thermometer = Thermometer(func(this.temperature))

    companion object Converter {
        const val COMPARISON_DELTA = 0.1

        fun kelvinToCelsius(tempInKelvin: Double) = tempInKelvin - 273.15
        fun celsiusToKelvin(tempInCelsius: Double) = tempInCelsius + 273.15

        fun kelvinToFahrenheit(tempInKelvin: Double) = (tempInKelvin - 273.15) * 9 / 5 + 32
        fun fahrenheitToKelvin(tempInFahrenheit: Double) = (tempInFahrenheit - 32) * 5 / 9 + 273.15

        fun celsiusToFahrenheit(tempInCelsius: Double) = tempInCelsius * 9 / 5 + 32
        fun fahrenheitToCelsius(tempInFahrenheit: Double) = (tempInFahrenheit - 32) * 5 / 9

    }

    override fun toString() = "Thermometer{temperature=$temperature}"

    override fun equals(other: Any?) = COMPARISON_DELTA > abs(this.temperature - (other as Thermometer).temperature)
}