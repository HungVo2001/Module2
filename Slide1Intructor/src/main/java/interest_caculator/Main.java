package interest_caculator;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double money = 1.0;
        int month = 1;
        double interestRate = 1.0;

        System.out.println("Enter investment amount:");
        money = Double.parseDouble(sc.nextLine());

        System.out.println("Enter number of months: ");
        month = Integer.parseInt(sc.nextLine());

        System.out.println("Enter annual interest rate in percentage:");
        interestRate = Double.parseDouble(sc.nextLine());

        double totalInterest = 0;
        for (int i = 0; i < month; i++) {
            totalInterest += money *(interestRate / 100) / 12 * month;
        }
        System.out.println("Total of interest: "+ totalInterest);
    }
}
