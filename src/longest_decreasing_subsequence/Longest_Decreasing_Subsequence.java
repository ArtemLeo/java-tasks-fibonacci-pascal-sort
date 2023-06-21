package longest_decreasing_subsequence;

import java.util.Arrays;
import java.util.Random;

class Longest_Decreasing_Subsequence {
    static int lds(int[] arr, int n) {
        int[] lds = new int[n];
        int i, j, max = 0;

        // Инициализация LDS с 1 для всех индексов. Минимальный LDS, начинающийся с любого элемента, всегда равен 1.
        for (i = 0; i < n; i++)
            lds[i] = 1;

        // Вычисление LDS по каждому индексу снизу вверх;
        for (i = 1; i < n; i++)
            for (j = 0; j < i; j++)
                if (arr[i] < arr[j] && lds[i] < lds[j] + 1) lds[i] = lds[j] + 1;

        // Выбираем максимальное из всех значений LDS;
        for (i = 0; i < n; i++)
            if (max < lds[i]) max = lds[i];
        return max;
    }

    public static void main(String[] args) {
        int[] arr = new int[10000];
        Random random = new Random();
        for (int i = 0; i < arr.length; i++) {
            arr[i] = random.nextInt(10000) + 100000;
        }
        Arrays.stream(arr).forEach(System.out::println);
        int n = arr.length;
        System.out.print("Length of LDS is " + lds(arr, n));
    }
}

