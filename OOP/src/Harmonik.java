import java.util.Scanner;

public class Harmonik {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a number: ");
        double number = input.nextDouble();
        double harmonik = 0.0;
        while(number > 0) {
            harmonik += 1 / number;
            number--;
        } System.out.println("harmonik = " + harmonik);

    }
}
