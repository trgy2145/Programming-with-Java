import java.util.Scanner;

public class BiggestNumber {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter first number: ");
        int firstNumber = input.nextInt();
        System.out.println("Enter second number: ");
        int secondNumber = input.nextInt();
        System.out.println("Enter third number: ");
        int thirdNumber = input.nextInt();
        System.out.println("Enter fourth number: ");
        int fourthNumber = input.nextInt();

        if(firstNumber > secondNumber && firstNumber > thirdNumber && firstNumber > fourthNumber){
            System.out.println("The biggest number is: " + firstNumber);
        }
        else if(secondNumber > firstNumber && secondNumber > thirdNumber && secondNumber > fourthNumber){
            System.out.println("The biggest number is: " + secondNumber);
        }
        else if(thirdNumber > firstNumber && thirdNumber > secondNumber && thirdNumber > fourthNumber){
            System.out.println("The biggest number is: " + thirdNumber);
        }
        else if(fourthNumber > firstNumber && fourthNumber > secondNumber && fourthNumber > thirdNumber){
            System.out.println("The biggest number is: " + fourthNumber);
        }
        else{
            System.out.println("The numbers are equal");
        }
        
        
    }
    
}
