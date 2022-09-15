import java.util.Scanner;

public class While {
    public static void main(String[] args) {
        int faktoriyel = 1;
        try (Scanner input = new Scanner(System.in)) {
            System.out.println("Enter a number: ");
            int number = input.nextInt();
            while (number > 0) {
                faktoriyel *= number;
                number--;
            }
        }
        System.out.println("faktoriyel = " + faktoriyel);

    }

}
