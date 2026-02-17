//import java.util.Scanner;

public class RandomNumberGenerator {
    public static void main(String[] args) {
       // Scanner input = new Scanner(System.in);
        for (int i =0;i<15;i++) {
            int number = 10 + (int) (Math.random() * (50-10));
            System.out.println(number);
        }

    }
}
