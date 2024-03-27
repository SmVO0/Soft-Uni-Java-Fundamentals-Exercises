package ex_19_jan;

import java.util.Scanner;

public class ex_4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = Integer.parseInt(scanner.nextLine());
        int sum = 0;
        for (int i = 0; i<n; i++){
            int converter = scanner.next().charAt(0);
            sum += converter;
        }
        System.out.println("The sum equals: " + sum);
    }
}
