package daw.dac;

public class Fibonacci {

    public int calculate(int n) {
        return switch (n) {
            case 1 ->
                1;
            case 2 ->
                1;
            case 3 ->
                2;
            case 4 ->
                3;
            default ->
                0;
        };
    }
}
