package ex_17_jan;

import java.util.Scanner;

public class ex_11 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double lenght, widht, height = 0;

        System.out.print("Length: ");

        lenght = Double.parseDouble(scanner.nextLine());

        System.out.print("Width: ");

        widht = Double.parseDouble(scanner.nextLine());

        System.out.print("Height: ");

        height = Double.parseDouble(scanner.nextLine());

        System.out.printf("Pyramid Volume: %.2f", (lenght * widht * height) / 3);
    }
}
