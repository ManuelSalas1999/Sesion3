package test;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.*;
import pkg.Cuenta;

class testCuentaBancariaCompleta {

    private Cuenta cuenta1; // 12345
    private Cuenta cuenta2; // 67890

    @BeforeEach
    void setUp() {
        cuenta1 = new Cuenta(50.0);
        cuenta2 = new Cuenta(0.0);
    }

    @Test
    void testCasoDePruebaCompleto() {
        // 1. Reintegro de 200€ de la cuenta 12345
        cuenta1.retirar(200);

        // 2. Reintegro de 350€ de la cuenta 67890
        cuenta2.retirar(350);

        // 3. Ingreso de 100€ en la cuenta 12345
        cuenta1.ingresar(100);

        // 4. Reintegro de 200€ de la cuenta 67890 → debe fallar
        assertThrows(IllegalArgumentException.class, () -> cuenta2.retirar(200));

        // 5. Reintegro de 150€ de la cuenta 67890
        cuenta2.retirar(150);

        // 6. Reintegro de 200€ de la cuenta 12345
        cuenta1.retirar(200);

        // 7. Ingreso de 50€ en la cuenta 67890
        cuenta2.ingresar(50);

        // 8. Reintegro de 100€ de la cuenta 67890 → debe fallar
        assertThrows(IllegalArgumentException.class, () -> cuenta2.retirar(100));

        // ---- Verificaciones finales ----
        assertEquals(-250.0, cuenta1.getSaldo(), 0.01, "Saldo final cuenta 12345 incorrecto");
        assertEquals(-450.0, cuenta2.getSaldo(), 0.01, "Saldo final cuenta 67890 incorrecto");
    }
}
