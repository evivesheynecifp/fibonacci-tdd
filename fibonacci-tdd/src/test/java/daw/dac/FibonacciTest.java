package daw.dac;

import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;

class FibonacciTest {

    private Fibonacci fibonacci = new Fibonacci();

    @Test
    void fibonacciOfZeroIsZero() {
        assertEquals(0, fibonacci.calculate(0));
    }

    @Test
    void fibonacciOfOneIsOne() {
        assertEquals(1, fibonacci.calculate(1));
    }

    @Test
    void fibonacciOfTwoIsOne() {
        assertEquals(1, fibonacci.calculate(2));
    }

    @Test
    void fibonacciOfThreeIsTwo() {
        assertEquals(2, fibonacci.calculate(3));
    }
}
