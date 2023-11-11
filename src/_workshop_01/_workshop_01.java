package _workshop_01;

import java.util.Scanner;

public class _workshop_01 {
    public static void main(String[] args) {

        double userNum;
        double serviceFee;

        Scanner scanner = new Scanner(System.in);

        System.out.println("Change Maker Machine");
        System.out.println("====================");
        System.out.print("Enter dollars and cents amount to convert to coins: $");
        userNum = scanner.nextDouble();

        serviceFee = userNum * 0.05;
        System.out.printf("Service fee (5.0 percent): %.2f\n", serviceFee);

        userNum = userNum - serviceFee;
        System.out.printf("Balance to dispense: $%.2f\n", userNum);

        int numToonies = (int) (userNum * 100) / 200;
        double remain = (int) (userNum * 100) % 200;
        double tooniesRemain = remain / 100;

        int numLoonies = (int) (tooniesRemain * 100) / 100;
        remain = (int) (tooniesRemain * 100) % 100;
        double looniesRemain = remain / 100;

        int numQuarters = (int) (looniesRemain * 100) / 25;
        remain = (int) (looniesRemain * 100) % 25;
        double quartersRemain = remain / 100;

        int numDimes = (int) (quartersRemain * 100) / 10;
        remain = (int) (quartersRemain * 100) % 10;
        double dimesRemain = remain / 100;

        int numNickels = (int) (dimesRemain * 100) / 5;
        remain = (int) (dimesRemain * 100) % 5;
        double nickelsRemain = remain / 100;

        int numPennies = (int) (nickelsRemain * 100);
        remain = (int) (nickelsRemain * 100) % 1;
        double penniesRemain = remain / 100;

        System.out.println();
        System.out.printf("$2.00 Toonies  X %d (remaining: $%.2f)\n", numToonies, tooniesRemain);
        System.out.printf("$1.00 Loonies  X %d (remaining: $%.2f)\n", numLoonies, looniesRemain);
        System.out.printf("$0.25 Quarters X %d (remaining: $%.2f)\n", numQuarters, quartersRemain);
        System.out.printf("$0.10 Dimes    X %d (remaining: $%.2f)\n", numDimes, dimesRemain);
        System.out.printf("$0.05 Nickels  X %d (remaining: $%.2f)\n", numNickels, nickelsRemain);
        System.out.printf("$0.01 Pennies  X %d (remaining: $%.2f)\n", numPennies, penniesRemain);

        System.out.println();
        System.out.println("All coins dispensed!");

        scanner.close();
    }


}
