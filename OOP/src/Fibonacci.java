import java.util.Scanner;

public class Fibonacci {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter a number: ");
        int number = scanner.nextInt();
        int fibonacci1 = 0;
        int fibonacci2 = 1;
        for(int i = 0 ; i < number ; i++){
            int fibonacci = fibonacci1 + fibonacci2;
            System.out.print(fibonacci + " ");
            fibonacci1 = fibonacci2;
            fibonacci2 = fibonacci;
        }
    }
}
