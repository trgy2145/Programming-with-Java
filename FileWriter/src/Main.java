import java.io.FileWriter;
import java.io.IOException;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		FileWriter writer = null; //try icinde tanımlarsak bunu finally de yakalayamayız bu yüzden burda nul veriyoruz..
		 try {
			writer =  new FileWriter("dosya.txt",true);
			writer.write("merhablar ben bu yerlerden biriyim \n");
			writer.write("uzun zaman once \n");
		} catch (IOException e) {
			// TODO Auto-generated catch block
			System.out.println("doysa acilirken hata olustu.... "  );
			e.printStackTrace();
		}finally {
			try {
				if(writer != null) {
					writer.close();
				}
				
			} catch (IOException e) {
				// TODO Auto-generated catch block
				System.out.println("dosya kapanirken hata olustu...");
				e.printStackTrace();
			}
		}
	}

}
