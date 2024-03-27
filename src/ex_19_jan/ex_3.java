package ex_19_jan;

import java.util.Scanner;

public class ex_3 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int peopleCount = Integer.parseInt(scanner.nextLine());
        int capacity = Integer.parseInt(scanner.nextLine());

        double courses = Math.ceil(peopleCount * 1.0 / capacity);

        System.out.printf("%.0f", courses);
    }
}

