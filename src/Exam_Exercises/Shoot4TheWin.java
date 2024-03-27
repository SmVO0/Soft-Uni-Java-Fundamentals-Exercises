package Exam_Exercises;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class Shoot4TheWin {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int countShotTargets = 0;
        int[] targets = Arrays.stream(scanner.nextLine().split(" ")).mapToInt(Integer::parseInt).toArray();
        String input = scanner.nextLine();
        int shotsCount = 0;
        while(!input.equals("End")){

            int shotIndex = Integer.parseInt(input);

            if(shotIndex >= 0 && shotIndex < targets.length - 1){

                int valueShotTarget = targets[shotIndex];

                for (int index = 0; index < targets.length -1; index++) {
                    int currentTarget = targets[index];

                    if(index != shotIndex && currentTarget != -1){
                        if(currentTarget > valueShotTarget){
                            currentTarget -= valueShotTarget;
                            targets[index] = currentTarget;
                        } else {
                            currentTarget += valueShotTarget;
                            targets[index] = currentTarget;
                        }
                    }
                }

                targets[shotIndex] = -1;
                shotsCount++;
            }
            input = scanner.nextLine();
        }
        System.out.printf("Shot targets: %d ->", shotsCount);
        for(int target: targets){
            System.out.print(target + " ");
        }
    }
        //" {target1} {target2}… {targetn}"
}

