import java.util.Scanner;

public class FindRootsOfAQuadraticEqn {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int a, b,c;
        System.out.println("Enter a, b and c");
        a = input.nextInt();
        b = input.nextInt();
        c = input.nextInt();
        int discriminant = (int)(Math.pow(b, 2)) - (4*a*c);
        if (discriminant < 0) {
            System.out.println("There are no real roots");
        }
        else if (discriminant == 0) {
            System.out.println("The equation has one root" + (-b+Math.sqrt(discriminant))/2*a);
        }
        else {
            System.out.println("The equation has two roots" + (-b+Math.sqrt(discriminant))/2*a + "and " + (-b-Math.sqrt(discriminant))/2*a );
        }

    }
}
