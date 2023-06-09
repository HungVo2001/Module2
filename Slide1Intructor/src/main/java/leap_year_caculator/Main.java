package leap_year_caculator;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the year");
        int year;
        year = sc.nextInt();
        boolean isLeapYear = false;
        boolean isDivisibleBy4, isDivisibleBy100, isDivisibleBy400;
        isDivisibleBy4 = year %4 == 0;
        if (isDivisibleBy4) {
            isDivisibleBy100 = year %100 == 0;
            if (isDivisibleBy100) {
                isDivisibleBy400 = year %400 == 0;
                if(isDivisibleBy400) {
                    isLeapYear = true;
                }
            }else {
                isLeapYear = true;
            }
        }
        if(isLeapYear) {
            System.out.printf("%d is a leap year",year);
        }else {
            System.out.printf("%d is not a leap year", year);
        }
    }
}
