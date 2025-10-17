package test;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import pkg.Cuenta;

import org.junit.jupiter.api.*;

import pkg.Cuenta;
class testCuenta {

	private static Cuenta cuenta;
	
	@BeforeAll
	static void setUpBeforeClass() throws Exception {//""""constructor"""
		cuenta =new Cuenta(0.0);
	}

	@AfterAll
	static void tearDownAfterClass() throws Exception {
	}

	@BeforeEach
	void setUp() throws Exception {
		cuenta.setSaldo(0.0);
	}

	@AfterEach
	void tearDown() throws Exception {
	}

	@Test
	void testIngresar() {
		cuenta.ingresar(200);
        assertEquals(200.0, cuenta.getSaldo(), 0.01, "El saldo debería ser 200 tras ingresar 200");	}


	@Test
	void testRetirarConSaldoSuficiente() {
        cuenta.ingresar(300);
        cuenta.retirar(200);
        assertEquals(100.0, cuenta.getSaldo(), 0.01, "El saldo debería ser 100 tras retirar 200");
    }
	
	@Test
    void testRetirarConSaldoInsuficienteDebeLanzarExcepcion() {
        assertThrows(IllegalArgumentException.class, () -> {
            cuenta.retirar(200);
        }, "Debe lanzar excepción si se intenta retirar más de lo que hay");
    }

    @Test
    void testIngresarCantidadNegativaDebeLanzarExcepcion() {
        assertThrows(IllegalArgumentException.class, () -> {
            cuenta.ingresar(-50);
        }, "Debe lanzar excepción si se intenta ingresar una cantidad negativa");
    }

    @Test
    void testRetirarCantidadNegativaDebeLanzarExcepcion() {
        assertThrows(IllegalArgumentException.class, () -> {
            cuenta.retirar(-20);
        }, "Debe lanzar excepción si se intenta retirar una cantidad negativa");
    }
}
