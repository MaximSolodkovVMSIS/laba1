package test.demo.parallel;

import demo.parallel.Complex;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class ComplexTest {
    @Test
    void minus() {
        // Создаем два комплексных числа
        Complex a = new Complex(5, 3);
        Complex b = new Complex(2, 1);

        // Выполняем операцию вычитания
        Complex result = a.minus(b);

        // Проверяем результат
        assertEquals(3, result.getRe(), "Real part should be 3");
        assertEquals(2, result.getIm(), "Imaginary part should be 2");
    }
}
