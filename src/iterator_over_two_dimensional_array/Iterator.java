package iterator_over_two_dimensional_array;

import java.util.LinkedList;
import java.util.Queue;

public class Iterator {
    int[][] array;
    int outerCursor;
    int lastArrayLen;
    int totalElems;
    int tracker = 1;
    Queue<Integer> myQueue = new LinkedList<>();

    public Iterator(int[][] arr) {
        this.array = arr;
        this.outerCursor = 0;
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                totalElems += 1;
            }
        }
        for (int i = 0; i < array[0].length; i++) {
            myQueue.add(array[0][i]);
        }
    }

    public boolean hasNext() {
        return array.length > outerCursor && totalElems >= tracker;
    }

    public Integer next() {
        if (myQueue.isEmpty()) {
            outerCursor++;
            for (int i = 0; i < array[outerCursor].length; i++) {
                myQueue.add(array[outerCursor][i]);
            }
            if (!myQueue.isEmpty()) {
                tracker++;
                return myQueue.remove();
            }
        } else {
            tracker++;
            return myQueue.remove();
        }
        return -1;
    }

    public static void main(String[] args) {
        int[][] arr = {{32, 84, 30, 95, 80},
                       {19, 69, 47, 67, 59},
                       {16, 25, 51, 87, 92}};
        Iterator iter = new Iterator(arr);
        while (iter.hasNext()) {
            System.out.println(iter.next());
        }
        System.out.println(iter);
    }
}
