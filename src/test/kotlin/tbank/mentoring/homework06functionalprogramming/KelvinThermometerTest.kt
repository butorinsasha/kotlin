package tbank.mentoring.homework06functionalprogramming

import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.Test
import tbank.mentoring.homework06functionalprogramming.KelvinThermometer.Converter.kelvinToFahrenheit


class KelvinThermometerTest {

    @Test
    fun kelvinToCelsiusTest() {
        val tempInKelvin = 0.0
        val expectedTempInCelsius = -273.15

        assertEquals(
            /* expected = */ expectedTempInCelsius,
            /* actual = */ KelvinThermometer(tempInKelvin).convert(tempInKelvin) { it - 273.15 },
            /* delta = */ 0.1
        )
    }

    @Test
    fun kelvinToFahrenheitTest() {
        val tempInKelvin = 273.15
        val expectedTempInFahrenheit = 32.0

        assertEquals(
            /* expected = */ expectedTempInFahrenheit,
            /* actual = */ KelvinThermometer(tempInKelvin).convert(tempInKelvin, kelvinToFahrenheit),
            /* delta = */ 0.1
        )
    }
}