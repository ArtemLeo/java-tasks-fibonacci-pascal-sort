public class Ex_01 {
    public static void main(String[] args) {
        int[] salaries = {5, 8, 12, -18, -54, 84, -35, 17, 37};
        double sum = 0;
        double average;
    }

    public static double getAverageSalary(double[] salaries) {
        // write your code below this line
        double sum = 0;
        double average = 0;

        if (salaries.length == 0.0) {
            return average = salaries[0];
        }
        if (salaries.length > 0) {
            for (double salary : salaries) {
                sum += salary;
            }
            average = sum / salaries.length;
        }

        return average;
        // write your code above this line
    }
}

