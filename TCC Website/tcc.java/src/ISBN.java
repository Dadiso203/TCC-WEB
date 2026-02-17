import java.util.Scanner;

public class ISBN {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int d1, d2, d3, d4, d5 , d6, d7, d8, d9, checksum;
        System.out.println("Enter 9 digits seperated by space");
        d1 = input.nextInt();
        d2 = input.nextInt();
        d3 = input.nextInt();
        d4 = input.nextInt();
        d5 = input.nextInt();
        d6 = input.nextInt();
        d7 = input.nextInt();
        d8 = input.nextInt();
        d9 = input.nextInt();
        checksum = (d1 + 2*d2 + 3*d3 + 4*d4 + 5*d5 + 6*d6 + 7*d7 + 8*d8 + 9*d9)%11;
        if (checksum == 10){
            System.out.println("The ISBN-10 number is " + d1 + d2 +d3 +d4 +d5 +d6 +d7 +d8 +d9 + 'X') ;
        }
        else {
            System.out.println("The ISBN-10 number is " + d1 + d2 +d3 +d4 +d5 +d6 +d7 +d8 +d9 + checksum) ;
        }

    }

}
