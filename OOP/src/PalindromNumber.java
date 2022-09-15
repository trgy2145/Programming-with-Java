import java.util.Scanner;

public class PalindromNumber {
     static int palindrom(int number){
        int temp = number ;
        int remainder = 0;
        int reverse = 0;
        while(temp > 0){
            remainder = number % 10;
            reverse = remainder * 10 + reverse;
            temp /= 10;
        }
        return reverse;
    }

 
    public static void main(String[] args) {
        PalindromNumber c = new PalindromNumber();
        Scanner input = new Scanner(System.in);
        System.out.println("please enter a number");
        int number = input.nextInt();
        c.palindrom(number);
        
    }
    
}
