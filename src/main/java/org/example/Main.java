package org.example;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Is it weekend today?");


        boolean isWeekend = scanner.nextBoolean();

        System.out.println("Is it rainy today?");


        boolean isRain = scanner.nextBoolean();


        if (isWeekend == true && isRain == false) {

            boolean canWalk = true;

            System.out.println("canWalk = " + canWalk);

        } else {

            boolean canWalk = false;

            System.out.println("canWalk= " + canWalk);

        }
    }
}
