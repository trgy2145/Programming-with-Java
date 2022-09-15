import java.util.Scanner;

public class AnaMethod {
    public static void main(String[] args) {
        int a, b, c;
        Scanner num = new Scanner(System.in);
        System.out.println("please enter the numbers :");
        a = num.nextInt();
        b = num.nextInt();
        c = num.nextInt();
        if(a > b && a > c){
            if(b > c){
                System.out.println("a > b > c");
            }else{
                System.out.println("a > c > b");
            }
        }
        if (b > a && b > c) {
            if (a > c) {
                System.out.println("b > a > c");
            } else {
                System.out.println("b > c > a");
            }
        }
        if (c > a && c > b) {
            if (a < b) {
                System.out.println("c > b > a");
            } else {
                System.out.println("c > a > b");
            }
        }

    }

}