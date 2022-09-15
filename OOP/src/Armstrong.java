import java.util.Scanner;

public class Armstrong {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        System.out.println("please enter a number: ");
        int number = inp.nextInt();
        int tempNumber = number;
        int digitNumber = 0,  total = 0;
        int mod;

        while (tempNumber != 0) {
            tempNumber /= 10;
            digitNumber++;
        }
      
        tempNumber = number;
        while (tempNumber != 0) {
            mod = tempNumber % 10;
            int basPow = 1;
            for (int i = 1; i <= digitNumber; i++) {
                basPow *= mod;
               
            }
            total += basPow;
           
            tempNumber /= 10;

        }
        String result = (total == number) ? "armstrong" : "not armstrong";
        System.out.println(result);

    }
}
