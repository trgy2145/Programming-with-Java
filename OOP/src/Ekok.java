import java.util.Scanner;

public class Ekok {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter first number: ");
        int nOne = input.nextInt();
        System.out.print("Enter first number: ");
        int nTwo = input.nextInt();
        for(int i = 1 ; i <= (nOne*nTwo) ; i++){
            if(i % nOne == 0 && i % nTwo == 0){
                System.out.println("Ekok: " + i);
                break;
            }
    }
   
    }
}

