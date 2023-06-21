package find_Nth_Fibonacci_number;

import java.math.BigInteger;

class Fibonacci_number {
    public static void main(String[] args) {
        BigInteger a, b = BigInteger.valueOf(0), c = BigInteger.valueOf(1);
        System.out.print("Fibonacci Series:");
        for (int i = 1; i <= 1000; i++) {
            a = b;
            b = c;
            c = a.add(b);
            System.out.print(a + " ");
        }
    }
}
