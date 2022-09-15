import java.util.Scanner;

public class Main {
public static void deneme(int yas) {
	if(yas < 18) {
		throw new ArithmeticException();
	}
	else {
		System.out.println("mekana hosgeldiniz...");
	}
}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan =  new Scanner(System.in);
		System.out.print("lutfen sayi giriniz :");
		int yas = scan.nextInt();
		try {
			deneme(yas);
		} catch (Exception e) {
			System.out.println("normalde boyle bir hata olmaz...");
		}
		System.out.println("burasi calisir..");
		deneme(yas); // bu durumda alttaki kodlar calısmaz bu hatayı yakalarsak kodlar calısır
		System.out.println("hata alursa bu kod calismaz");

	}

}
