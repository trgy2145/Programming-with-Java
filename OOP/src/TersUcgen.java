import java.util.Scanner;

public class TersUcgen {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int number = input.nextInt();
        for(int i = 1 ; i <= number ; i++){
            for(int j = 1 ; j <= (2*number-(2*i-1)) ; j++){
                System.out.print("*");
            }
            System.out.println();
          
            for(int k = 0 ; k <=(i-1)  ; k++){
                System.out.print(" ");
            }
           
        }
    }
    
}
