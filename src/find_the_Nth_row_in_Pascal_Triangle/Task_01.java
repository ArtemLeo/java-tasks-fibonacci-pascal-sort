package find_the_Nth_row_in_Pascal_Triangle;

public class Task_01 {
    static void generateNthrow(long N) {

        int prev = 1;
        System.out.print(prev);

        for (int i = 1; i <= N; i++) {
            long curr = (prev * (N - i + 1)) / i;
            System.out.print(", " + curr);
            prev = (int) curr;
        }
    }

    public static void main(String[] args) {
        long N = 10;
        generateNthrow(N);
    }
}

