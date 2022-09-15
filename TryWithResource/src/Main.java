import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        // dosya ile işimiz bitince otomatikmen kapatılır...
		try (FileWriter writer = new FileWriter("dosya.txt"))// boylece fazladan dosya kapatmak icin ugrasmayız kendimiz
															// kapatır ancak bu sınıf closeable dan extend edilmeli..
				//; FileWriter writer1 = new FileWriter("dosya1.txt"))  birden fazla dosya acılabilir
		{
			Scanner scan = new Scanner(System.in);

			while (true) {
				System.out.print("lutfen isimleri giriniz : ");
				String name = scan.nextLine();
				if (name.equals("-1")) {
					System.out.println("sistemden cikiliyor...");
					break;
				}
				writer.write(name + "\n");
			}

		} catch (IOException e) {
			// TODO Auto-generated catch block
			System.out.println("bir hata olustu...");
			e.printStackTrace();
		}
	}

}
