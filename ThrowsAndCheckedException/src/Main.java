import java.io.IOException;
import java.util.Scanner;

public class Main {
	public static void deneme(int yas) throws IOException {
		if (yas < 18) {
			throw new IOException(); // BU bir checked exception yani java öngörebilir bunun için metoda throws
										// eklenmeli
		} else {
			System.out.println("mekana hosgeldiniz...");
		}
	}

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
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
