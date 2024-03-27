package ex_17_jan;

import java.util.Scanner;

public class ex_8 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        char a = (char)scanner.next().charAt(0);
        StringBuilder String = new StringBuilder();
        String.append(a);
        String newA = String.toString();
        if(newA.equals(newA.toLowerCase())){
            System.out.println("lower-case");
        }else System.out.println("upper-case");
    }
}
