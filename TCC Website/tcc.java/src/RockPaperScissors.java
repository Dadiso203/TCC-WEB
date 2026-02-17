import java.util.Scanner;

public class RockPaperScissors {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int computerMove = (int) (Math.random() * (2  + 1));
        System.out.println("Let's play rock, paper, scissors.\n" +
                            "Enter 0,1,2 to represent rock, paper , scissors respectively");
        int userMove =  input.nextInt();
        if (userMove == computerMove) {
            System.out.println("It's a draw. Better than losing ");
            System.exit(1);
        }
        switch (computerMove) {
            case 0:
                //0 moves
                if (userMove == 1) {
                    System.out.println("You win. It's all a game of luck anyway");
                    break;
                }
                if (userMove == 2) {
                    System.out.println("Haha, I win. Computers rule");
                    break;
                }
            case 1:
                //1 moves
                if (userMove == 0) {
                    System.out.println("Haha, I win. Computers rule");
                    break;
                }
                if (userMove == 2) {
                    System.out.println("You win. It's all a game of luck only");
                    break;
                }
            case 2:
                //2 moves
                if (userMove == 0) {
                    System.out.println("You win. It's all a game of luck only");
                    break;
                }
                if (userMove == 1) {
                    System.out.println("Haha, I win. Computers rule");
                    break;
                }
        }

    }
}
