package com.example.junit;

import static org.junit.Assert.assertEquals;
import org.junit.Test;

/**
 * Kelas uji (test class) untuk menguji kelas SimpleCalculator.
 */
public class SimpleCalculatorTest {
    // Membuat objek SimpleCalculator untuk digunakan dalam pengujian.
    private SimpleCalculator simpleCalculator = new SimpleCalculator();

    /**
     * Metode uji (test method) untuk menguji penambahan dua bilangan.
     * Harapannya, penambahan 2 + 2 menghasilkan 4.
     */
    @Test
    public void twoPlusTwoShouldEqualFour() {
        // Melakukan penambahan 2 + 2 menggunakan SimpleCalculator.add.
        int result = SimpleCalculator.add(2, 2);

        // Memeriksa apakah hasil penambahan sama dengan 4.
        assertEquals(4, result);
    }
}
