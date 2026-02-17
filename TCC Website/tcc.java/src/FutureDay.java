import java.util.Scanner;
public class FutureDay {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int start, noOfDaysCollapsed, x;
        System.out.println("Enter today's day and number of days that have collapsed");
        start = input.nextInt();
        System.out.print("Today is ");
        switch (start) {
            case 0: System.out.print("Sunday");
                    break;
            case 1: System.out.print("Monday");
                    break;
            case 2: System.out.print("Tuesday");
                    break;
            case 3: System.out.print("Wednesday");
                    break;
            case 4: System.out.print("Thursday");
                    break;
            case 5: System.out.print("Friday");
                    break;
            case 6: System.out.print("Saturday");
                    break;
        }
        noOfDaysCollapsed = input.nextInt();
        x = start + (noOfDaysCollapsed % 7);
        System.out.print(" and the future day is ");
        switch (x) {
            case 0: System.out.print("Sunday");
                    break;
            case 1: System.out.print("Monday");
                    break;
            case 2: System.out.print("Tuesday");
                    break;
            case 3: System.out.print("Wednesday");
                    break;
            case 4: System.out.print("Thursday");
                    break;
            case 5: System.out.print("Friday");
                    break;
            case 6: System.out.print("Saturday");
                    break;
        }


    }
}
