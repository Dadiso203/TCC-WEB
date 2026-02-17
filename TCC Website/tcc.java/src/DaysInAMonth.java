import java.util.Scanner;

public class DaysInAMonth {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter month number and year");
        int month = input.nextInt();
        int year = input.nextInt();
        int isLeap = 0;
        if (year % 4 == 0) {
            isLeap =1;
        }
        switch (month) {
            case 1: System.out.print("January");
                    break;
            case 3: System.out.print("March");
                break;
            case 4: System.out.print("April");
                break;
            case 5: System.out.print("May");
                break;
            case 6: System.out.print("June");
                break;
            case 7: System.out.print("July");
                break;
            case 8: System.out.print("August");
                break;
            case 9: System.out.print("September");
                break;
            case 10: System.out.print("October");
                break;
            case 11: System.out.print("November");
                break;
            case 12: System.out.print("December");
                break;
        }
        if (month <= 7) {
            if (month ==2) {
                if (isLeap == 1) {
                    System.out.print("February had 29 days");
                }
                else {
                    System.out.print("February had 28 days");
                }
            }
            else if (month % 2 != 0) {
                System.out.print(" had 31 days");
            }
            else  {
                System.out.print(" had 30 days");
            }
        } else {
            if (month % 2 != 0) {
                System.out.print(" had 30 days");
            }
            else  {
                System.out.print(" had 31 days");
            }
        }
    }
}
