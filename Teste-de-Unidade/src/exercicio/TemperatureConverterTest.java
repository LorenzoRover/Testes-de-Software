package exercicio;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class TemperatureConverterTest {

	@Test
	void testTemperatureConverterToCelsius() {
		TemperatureConverter conversor = new TemperatureConverter();
		double fahrenheit = 32.0;
		
		assertEquals(0.0, conversor.fahrenheitToCelsius(fahrenheit));
	}
	
	@Test
	void testTemperatureConverterToFahrenheit() {
		TemperatureConverter conversor = new TemperatureConverter();
		double celsius = 100.0;
		
		assertEquals(212.0, conversor.celsiusToFahrenheit(celsius));
	}

}
