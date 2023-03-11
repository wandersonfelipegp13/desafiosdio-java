package bancopan;

import java.util.Scanner;

public class PositivosEMedia {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int positiveNumbers = 0;
        double average = 0;

        for(int i = 0; i < 6; i++) {
            double number = scanner.nextDouble();

            if (number >= 0) {
                positiveNumbers++;
                average += number;
            }
        }
        System.out.println(positiveNumbers + " valores positivos");
        System.out.printf("%.1f", average/positiveNumbers);
    }
}
