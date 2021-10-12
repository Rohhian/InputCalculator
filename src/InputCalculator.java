import java.util.Scanner;

public class InputCalculator {

    public static void inputThenPrintSumAndAverage() {
        Scanner scan = new Scanner(System.in);
        int sum = 0;
        int avg = 0;
        int count = 0;
        while (true) {
            if (scan.hasNextInt()) {
                sum = sum + scan.nextInt();
                count++;
            } else {
                break;
            }
        }
        scan.nextLine();
        avg = (int) Math.round( (double) sum / count);
        System.out.println("SUM = " + sum + " AVG = " + avg);
        scan.close();
    }
}

