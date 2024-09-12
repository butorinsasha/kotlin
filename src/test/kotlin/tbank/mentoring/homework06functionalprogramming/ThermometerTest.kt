package tbank.mentoring.homework06functionalprogramming

import org.junit.jupiter.api.Assertions.assertTrue
import org.junit.jupiter.api.Test
import tbank.mentoring.homework06functionalprogramming.Thermometer.Converter.celsiusToFahrenheit
import tbank.mentoring.homework06functionalprogramming.Thermometer.Converter.celsiusToKelvin
import tbank.mentoring.homework06functionalprogramming.Thermometer.Converter.fahrenheitToCelsius
import tbank.mentoring.homework06functionalprogramming.Thermometer.Converter.fahrenheitToKelvin
import tbank.mentoring.homework06functionalprogramming.Thermometer.Converter.kelvinToCelsius
import tbank.mentoring.homework06functionalprogramming.Thermometer.Converter.kelvinToFahrenheit

class ThermometerTest {

    @Test
    fun kelvinToCelsiusTest() {
        val kelvinThermometer = Thermometer(0.0)
        val expectedCelsiusThermometer = Thermometer(-273.15)

        assertTrue(
            expectedCelsiusThermometer == kelvinThermometer.convert { kelvinToCelsius(it) }
        )
    }

    @Test
    fun celsiusToKelvinTest() {
        val celsiusThermometer = Thermometer(25.6)
        val expectedKelvinThermometer = Thermometer(298.75)

        assertTrue(
            expectedKelvinThermometer == celsiusThermometer.convert { celsiusToKelvin(it) }
        )
    }

    @Test
    fun kelvinToFahrenheitTest() {
        val kelvinThermometer = Thermometer(273.15)
        val expectedFahrenheitThermometer = Thermometer(32.0)

        assertTrue(
            expectedFahrenheitThermometer == kelvinThermometer.convert { kelvinToFahrenheit(it) }
        )
    }

    @Test
    fun fahrenheitToKelvinTest() {
        val fahrenheitThermometer = Thermometer(-10.99)
        val expectedKelvinThermometer = Thermometer(249.26667)

        assertTrue(
            expectedKelvinThermometer == fahrenheitThermometer.convert { fahrenheitToKelvin(it) }
        )
    }

    @Test
    fun celsiusToFahrenheitTest() {
        val celsiusThermometer = Thermometer(0.0)
        val expectedFahrenheitThermometer = Thermometer(32.0)

        assertTrue(
            expectedFahrenheitThermometer == celsiusThermometer.convert { celsiusToFahrenheit(it) }
        )
    }

    @Test
    fun fahrenheitToCelsiusTest() {
        val fahrenheitThermometer = Thermometer(-40.0)
        val expectedCelsiusThermometer = Thermometer(-40.0)

        assertTrue(
            expectedCelsiusThermometer == fahrenheitThermometer.convert { fahrenheitToCelsius(it) }
        )
    }

    @Test
    fun multipleCycleConvertTest() {
        val kelvinThermometer = Thermometer(1234.56)
        val expectedKelvinThermometer = Thermometer(1234.56)

        assertTrue(
            expectedKelvinThermometer == kelvinThermometer
                .convert { kelvinToCelsius(it) }
                .convert { celsiusToFahrenheit(it) }
                .convert { fahrenheitToCelsius(it) }
                .convert { celsiusToKelvin(it) }
                .convert { kelvinToFahrenheit(it) }
                .convert { fahrenheitToKelvin(it) }
        )
    }
}