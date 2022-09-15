
public class Main {
	public static void ucuncu() { // en üstte olur ve bu fonk icinde hata yakalanmasını bekler
		System.out.println("ucuncu metod calisiyor...");
		
		int a =  20 / 0 ;
		System.out.println(a);
	/*	try {
			int a =  20 / 0 ;
			System.out.println(a);
			
		} catch (Exception e) {
			System.out.println("sayi sifira bolunmez..");
		} */
	}
	public static void ikinci() { // birinci metod üstüne gelir
		System.out.println("ikinci metod calisiyor...");
		try {
			ucuncu();
		} catch (Exception e) {
			// TODO: handle exception
			System.out.println("ucuncude hata yakalanmadi  burda yakalandi...");
		}
	}
   
	public static void birinci() {
		System.out.println("birinci metod calisiyor....");
		ikinci();
	}
	public static void main(String[] args) { // stackta en alta bu fonk gider...
		// TODO Auto-generated method stub
		
		birinci(); // mainin üstüne gelir...

	}

}
