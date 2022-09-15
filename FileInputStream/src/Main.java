import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class Main {

	public static void main(String[] args) {

		FileInputStream fis = null;
		try {
			fis = new FileInputStream("dosya.txt");
			int deger;
			String s = "";
			while ((deger = fis.read()) != -1) { // dosyanın hepsini okuduk
				s += (char) deger;

			}
			System.out.println(s);

			// fis.read(); tek karakter okur ve byte olarak okur buna karaktere cevirmek
			// değer yoksa -1 çevirir
			// lazım..dosya okurken imlec hep dosyanın basında bulunur
			/*
			 * System.out.println("birinci karakter ----------> : " + (char) fis.read()); //
			 * imlec bir karakter okudu System.out.println("ikinci karakter ----------> : "
			 * + (char) fis.read()); // ikinci karakter okundu
			 * System.out.println("ucuncu karakter ----------> : " + (char) fis.read()); //
			 * ücüncü karakter okundu
			 */

			/*
			 * // eger imlec basta değilde belli karakterden sonra okunsa fis.skip(5);
			 * System.out.println("altinci karakter ----------> : " + (char) fis.read());
			 */

		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			System.out.println("dosya acilamadi..");
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			System.out.println("okurken hata olustu........");
			e.printStackTrace();
		} finally {
			try {
				if (fis != null) {
					fis.close();
				}

			} catch (IOException e) {
				// TODO Auto-generated catch block
				System.out.println("dosya kapanirken hata olustu...");
				e.printStackTrace();
			}
		}

	}

}
