package _workshop_02;
import java.util.Scanner;


public class _workshop_02 {
    static final int MIN_YEAR = 2010;
    static final int MAX_YEAR = 2021;
    static final int LOG_DAYS = 3;
    public static void main(String[] args) {

        final int JAN = 1, DEC = 12;
        int year = 0;
        int month = 0;
        int y = 0, m = 0, i = 0, flag;
        double morningRate;
        double eveningRate;

        Scanner scanner = new Scanner(System.in);

        System.out.println("General Well-being Log");
        System.out.println("======================");

        while (year == 0 && month == 0) {
            System.out.print("Set the year and month for the well-being log (YYYY MM): ");
            y = scanner.nextInt();
            m = scanner.nextInt();

            if (y < MIN_YEAR || y > MAX_YEAR) {
                System.out.println("   ERROR: The year must be between 2010 and 2021 inclusive");
                if (m < JAN || m > DEC) {
                    System.out.println("   ERROR: Jan.(1) - Dec.(12)");
                }
            } else if (m < JAN || m > DEC) {
                System.out.println("   ERROR: Jan.(1) - Dec.(12)");
            } else {
                year = y;
                month = m;
            }
        }

        System.out.println("\n*** Log date set! ***\n");
        System.out.println();

        double sumMorning = 0;
        double sumEvening = 0;

        for (i = 1; i <= LOG_DAYS; i++) {

            System.out.printf("%d-", year);
            switch (month) {
                case 1:
                    System.out.print("JAN");
                    break;
                case 2:
                    System.out.print("FEB");
                    break;
                case 3:
                    System.out.print("MAR");
                    break;
                case 4:
                    System.out.print("APR");
                    break;
                case 5:
                    System.out.print("MAY");
                    break;
                case 6:
                    System.out.print("JUN");
                    break;
                case 7:
                    System.out.print("JUL");
                    break;
                case 8:
                    System.out.print("AUG");
                    break;
                case 9:
                    System.out.print("SEP");
                    break;
                case 10:
                    System.out.print("OCT");
                    break;
                case 11:
                    System.out.print("NOV");
                    break;
                case 12:
                    System.out.print("DEC");
                    break;
            }
            System.out.printf("-0%d\n", i);

            do {
                System.out.print("   Morning rating (0.0-5.0): ");
                morningRate = scanner.nextDouble();
                if (morningRate < 0 || morningRate > 5) {
                    System.out.println("      ERROR: Rating must be between 0.0 and 5.0 inclusive!");
                    flag = 1;
                } else {
                    flag = 0;
                    sumMorning += morningRate;
                }
            } while (flag == 1);

            do {
                System.out.print("   Evening rating (0.0-5.0): ");
                eveningRate = scanner.nextDouble();
                if (eveningRate < 0 || eveningRate > 5) {
                    System.out.println("      ERROR: Rating must be between 0.0 and 5.0 inclusive!");
                    flag = 1;
                } else {
                    flag = 0;
                    sumEvening += eveningRate;
                }
            } while (flag == 1);

            System.out.println();
        }

        System.out.println("Summary");
        System.out.println("=======");
        System.out.printf("Morning total rating: %.3f\n", sumMorning);
        System.out.printf("Evening total rating: %.3f\n", sumEvening);
        System.out.println("----------------------------");
        System.out.printf("Overall total rating: %.3f\n", sumMorning + sumEvening);
        System.out.println();

        System.out.printf("Average morning rating: %4.1f\n", sumMorning / LOG_DAYS);
        System.out.printf("Average evening rating: %4.1f\n", sumEvening / LOG_DAYS);
        System.out.println("----------------------------");
        System.out.printf("Average overall rating: %4.1f\n", (sumMorning + sumEvening) / (LOG_DAYS * 2));

        scanner.close();
    }

}
