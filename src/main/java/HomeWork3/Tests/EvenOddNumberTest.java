package HomeWork3.Tests;

import HomeWork3.Methods;
import org.junit.Test;

import static org.junit.Assert.*;

public class EvenOddNumberTest {

    // Задание 1. Напишите тесты, покрывающие на 100% метод evenOddNumber, который проверяет, является ли переданное число четным или нечетным
    Methods tester = new Methods();
    @Test
    public void testEvenNumber() {
        assertTrue(tester.evenOddNumber(4));
    }

    @Test
    public void testOddNumber() {
        assertFalse(tester.evenOddNumber(7));
    }

    @Test
    public void testZero() {
        assertTrue(tester.evenOddNumber(0));
    }

    @Test
    public void testNegativeEvenNumber() {
        assertTrue(tester.evenOddNumber(-6));
    }

    @Test
    public void testNegativeOddNumber() {
        assertFalse(tester.evenOddNumber(-9));
    }

    // Задание 2. Разработайте и протестируйте метод numberInInterval, который проверяет, попадает ли переданное число в интервал (25;100)
    @Test
    public void testNumberInInterval() {
        // Тестирование чисел, которые попадают в интервал
        assertTrue(tester.numberInInterval(30));
        assertTrue(tester.numberInInterval(50));
        assertTrue(tester.numberInInterval(75));

        // Тестирование чисел, которые не попадают в интервал
        assertFalse(tester.numberInInterval(10));
        assertFalse(tester.numberInInterval(150));
        assertFalse(tester.numberInInterval(25));
        assertFalse(tester.numberInInterval(100));
    }
}