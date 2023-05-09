package day_of_month;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int month,year;

        System.out.println("Which month that you want to count days?");
        month = sc.nextInt();

        System.out.println("Which year that you want to count months?");
        year = sc.nextInt();
        String dayIsMonth;

        switch (month) {
            case 1:
            case 3:
            case 5:
            case 7:
            case 8:
            case 10:
            case 12:
                dayIsMonth = "31";
                break;
            case 4:
            case 6:
            case 9:
            case 11:
                dayIsMonth = "30";
            case 2:
                if((year %4 == 0 && year %100 != 0) || (year %400 == 0)) {
                    dayIsMonth = "29";
                }else {
                    dayIsMonth = "28";
                }
                break;
            default:
                dayIsMonth = "";
                break;
        }
        if(!dayIsMonth.equals("")) {
            System.out.printf("The month '%d' has %s days!", month, dayIsMonth);
        }else {
            System.out.println("Invalid input!");
        }
    }
}
