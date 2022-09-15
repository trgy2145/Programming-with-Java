import java.util.Scanner;

public class Asal {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a bigger than 2 number: ");
        int number = input.nextInt();
        boolean isPrime = true;
        if (number > 2) {
            for (int i = 2; i < number; i++) {
                if (number % i == 0) {
                    isPrime = false;
                    break;
                } else {
                    isPrime = true;
                }

            }
            System.out.println("The number " + number + " is " + isPrime);

        } else {
            System.out.println("lütfen 2 den büyük bir sayı giriniz");
        }
    }
}
