package test;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class testCuenta {

	private static Cuenta cuenta;
	
	@BeforeAll
	static void setUpBeforeClass() throws Exception {//""""constructor"""
		cuenta =new Cuenta(0);
	}

	@AfterAll
	static void tearDownAfterClass() throws Exception {
	}

	@BeforeEach
	void setUp() throws Exception {
	}

	@AfterEach
	void tearDown() throws Exception {
	}

	@Test
	void testIngresar() {
		cuenta.ingresar(200);
		assetEquals(200,cuenta.getSaldo());
	}
	@Test
	void testRetirar() {
		cuenta.retirar(200);
		assetEquals(-200,cuenta.getSaldo());
	}
}
