import java.util.Scanner;

public class Matematik {

	private double PI = Math.PI;

	public class Faktoriyel {
		public void factoriyel() {

			Scanner scanner = new Scanner(System.in);
			System.out.println("bir sayi giriniz:");

			int num = scanner.nextInt();
			int fakt = 1;
			for (int i = 1; i <= num; i++) {
				fakt *= i;
			}
			System.out.println(fakt);
		}
	}

	public class AsalMı {
		public boolean asalMı(int sayi) {
			for (int i = 2; i < sayi; i++) {
				if (sayi % i == 0) {
					return false;
				}

			}
			return true;
		}
	}

	public class Alan {

		public void daireAlanı(int yarıcap) {

			System.out.println("dairenin alani " + (PI * yarıcap * yarıcap) + " dir");

		}

	}

}
