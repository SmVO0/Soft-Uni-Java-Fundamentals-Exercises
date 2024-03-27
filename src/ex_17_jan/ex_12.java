package ex_17_jan;

import java.util.Scanner;

public class ex_12 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = Integer.parseInt(scanner.nextLine());
        int sum = 0;
        boolean check = false;

        for (int number = 1; number <= n; number++) {
            int currentNumber = number;

            while (number > 0) {
                sum += number % 10; number = number / 10;
            }

            if((sum == 5) || (sum == 7) || (sum == 11)) {
                System.out.printf("%d -> True%n", currentNumber);
            } else System.out.printf("%d -> False%n", currentNumber);
            sum = 0;
            number = currentNumber;
        }
    }
}
