package ex_17_jan;

import java.util.Scanner;

public class ex_2 {
    public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

    double input = Double.parseDouble(scanner.nextLine());
    double dollar = input*1.36;

    System.out.printf("%.3f", dollar);
}
}
