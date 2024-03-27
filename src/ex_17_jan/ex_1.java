package ex_17_jan;

import java.util.Scanner;

public class ex_1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int input = Integer.parseInt(scanner.nextLine());
        double kilometer = (double) input /1000;

        System.out.printf("%.2f", kilometer);
    }
}
