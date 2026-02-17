import java.util.Scanner;

public class PickACard {
    public static void main(String[] args) {
        Scanner input  = new Scanner(System.in);
        System.out.println("Pick any number from 1 to 52");
        int card = input.nextInt();
        if (card > 52 || card < 1) {
            System.out.println("Invalid card number");
            System.exit(1);
        }
        int Rank = 1 + (int)(Math.random() * 13);
        int suite = 1 + (int)(Math.random() * 4);
        System.out.print("The card you picked is ");
        switch (Rank) {
            case 1:
                //Ace
                System.out.print("Ace ");
                break;
            case 11:
                //Jack
                System.out.print("Jack ");
                break;
            case 12:
                //Queen
                System.out.print("Queen ");
                break;
            case 13:
                //King
                System.out.print("King ");
                break;
            default:
                System.out.print(Rank + " ");
        }

        //Checking suite
        switch (suite) {
            case 1:
                System.out.print("of Clubs");
                break;
            case 2:
                System.out.print("of Diamonds");
                break;
            case 3:
                System.out.print("of Hearts");
                break;
            case 4:
                System.out.print("of Spades");
                break;
        }
    }
}
