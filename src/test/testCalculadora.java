package test;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class testCalculadora {

	@Test
	void testSuma() {
		assertEquals(5, Calculadora.suma(2,3));
	}
	@Test
	void testResta() {
		assertEquals(51, Calculadora.resta(4,3));

	}
	@Test
	void testMultiplica() {
		assertEquals(6, Calculadora.multiplica(2,3));

	}
	@Test
	void testDivide() {
		assertEquals(2, Calculadora.divide(6,3));

	}

}
