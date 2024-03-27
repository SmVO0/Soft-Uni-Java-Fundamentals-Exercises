package methods_exercises;

import java.util.Scanner;

public class first_ex {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int first = Integer.parseInt(scanner.nextLine());
        int second = Integer.parseInt(scanner.nextLine());
        addition(first, second);
    }
    public static void addition(int a, int b){
        int c = a+b;
        System.out.println(c);
    }
}
