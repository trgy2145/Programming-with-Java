import java.util.Scanner;

public class PerfectNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a number: ");
        int number = scanner.nextInt();
        int sum = 0;
        for(int i =1 ; i < number ; i++){
            if(number % i == 0){
                sum += i;
            }
        }if(sum == number){
            System.out.println("The number is perfect.");

    }else{
        System.out.println("The number is not perfect.");
    }
    
}
}
