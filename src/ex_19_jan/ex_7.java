package ex_19_jan;
import java.util.Scanner;
public class ex_7 {

        public static void main(String[] args) {

            Scanner scanner = new Scanner(System.in);

            int n = Integer.parseInt(scanner.nextLine());
            int litters = 0;

            for (int i = 1; i <= n; i++) {

                int pouredLiters = Integer.parseInt(scanner.nextLine());
                litters += pouredLiters;

                if (litters > 255) {
                    System.out.println("Insufficient capacity!");
                    litters -= pouredLiters;
                }
            }

            System.out.println(litters);
        }
    }
