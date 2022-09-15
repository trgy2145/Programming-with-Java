
public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// int a = 10/ 0 ; normalde bu hata verir ve program calısmaz..
		try {
			int a = 10 / 0; // burda hata fırlatır hataya uygun catch te hata ismi varsa oraya girip
							// diğerlerini atlar..
			int[] b = { 1, 2, 3 };
			System.out.println(b[5]);
		} catch (ArithmeticException e) { // hata ismini özelden genele vermeli .exeption sınıfı hepsini kapsıyor en
											// basa yazarsak olmaz en sona yaz
			// TODO: handle exception
			System.out.println("bir sayi sifira bolunmez...");
			e.printStackTrace(); // hatanın adını daha derince verir
		} catch (ArrayIndexOutOfBoundsException e) {
			// TODO: handle exception
			System.out.println("arrayin boyunu astiniz..");
			e.printStackTrace();
		} catch (Exception e) {
			// TODO: handle exception
			System.out.println("bir hata olustu..");
			e.printStackTrace();
		} finally {
			System.out.println("burasi her turlu calisir...");
		}
		System.out.println("devam ediyor...");
	}

}
