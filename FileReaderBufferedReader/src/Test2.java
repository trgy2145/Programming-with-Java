import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class Test2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		 * try(Scanner scan = new Scanner(new FileReader("listeler.txt"))){ //
		 * bufferedRead kullanmak isteseydik sadece bufferedRead e birtane filereader
		 * ref gönderecektik // Scanner scan = new Scanner(new BufferedRead (new
		 * FileReader("listeler.txt"))) while (scan.hasNextLine()) { String a =
		 * scan.nextLine(); String[] array = a.split(",");
		 * 
		 * if(array[1].equals("Bilgisayar Muhendisligi")) {
		 * System.out.println("Bilgisayar muhendisligi okuyanlar :" + array[0]); }
		 * 
		 * // System.out.println(a.getClass().getSimpleName()); // System.out.println(a
		 * instanceof String); // System.out.println("okunan satir :"+ scan.nextLine());
		 * 
		 * 
		 * }
		 * 
		 * } catch (FileNotFoundException e) {
		 * System.out.println("Dosya Bulunamadi..."); e.printStackTrace(); }
		 */
		try (BufferedWriter writer = new BufferedWriter(new FileWriter("listeler.txt", true))) {
			// filewriter gibi ancak bir buffera konup gönderiliyor tek cay değilde cayları
			// tepside toplu gönderiyoruz...
			writer.write("\nhasan , Sınıf Ogretmenligi");

		} catch (IOException e) {
			System.out.println("dosya acilirken bir hata olustu...");
			e.printStackTrace();
		}

	}

}
