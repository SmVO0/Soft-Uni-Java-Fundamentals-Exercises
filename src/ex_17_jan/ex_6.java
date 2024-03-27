package ex_17_jan;

import java.util.Scanner;

public class ex_6 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        char a = (char)scanner.next().charAt(0);
        char b = (char)scanner.next().charAt(0);
        char c = (char)scanner.next().charAt(0);

        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append(c);
        stringBuilder.append(" ");
        stringBuilder.append(b);
        stringBuilder.append(" ");
        stringBuilder.append(a);

        String concat = stringBuilder.toString();
        System.out.println(concat);
    }
}
