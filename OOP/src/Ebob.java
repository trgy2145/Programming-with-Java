import java.util.Scanner;

public class Ebob {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter first number: ");
        int nOne = input.nextInt();
        System.out.print("Enter first number: ");
        int nTwo = input.nextInt();
        int ebob = 1;
        int x = (nOne > nTwo) ? nTwo : nOne;
        for (int i = 1; i <= x ; i++) {
            if (nOne % nTwo == 0) {
                ebob = nTwo;
                System.out.println("ilk if");
                break;
            } else if (nTwo % nOne == 0) {
                ebob = nOne;
                System.out.println("ikinci if");
                break;
            }
            if (nOne % i == 0 && nTwo % i == 0) {
                ebob = i;
            }

        }
        System.out.println("Ebob: " + ebob);

    }

}
