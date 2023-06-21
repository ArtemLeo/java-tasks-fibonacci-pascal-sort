package find_the_Nth_row_in_Pascal_Triangle;

import java.math.BigInteger;
import java.util.ArrayList;

public class lesson_04 {

    public static ArrayList<BigInteger> getRow(int rowIndex) {
        ArrayList<BigInteger> currow = new ArrayList<BigInteger>();
        currow.add(BigInteger.valueOf(1));

        if (rowIndex == 0) {
            return currow;
        }
        ArrayList<BigInteger> prev = getRow(rowIndex - 1);

        BigInteger curr = null;
        for (int i = 1; i < prev.size(); i++) {
            curr = prev.get(i - 1).add(prev.get(i));
            currow.add(curr);
        }
        currow.add(BigInteger.valueOf(1));
        return currow;
    }

    public static void main(String[] args) {
        int n = 1000;
        ArrayList<BigInteger> arr = getRow(n);

        for (int i = 0; i < arr.size(); i++) {
            if (i == arr.size() - 1)
                System.out.print(arr.get(i));
            else
                System.out.print(arr.get(i) + ", ");
        }
    }
}
