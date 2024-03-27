package ex_19_jan;

import java.util.Scanner;

public class ex_5 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int start = Integer.parseInt(scanner.nextLine());
        int end = Integer.parseInt(scanner.nextLine());

        for (int aciiSymbol = start; aciiSymbol <= end; aciiSymbol++){
            System.out.print((char)aciiSymbol + " ");
        }
    }
}

