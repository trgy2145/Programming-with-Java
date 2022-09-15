
public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		class Hesapla{    //  basında oublic ve static kullanamayız cunku  public ve static classların özellik ve sınıflarına verilir.
			public void hesapla(int sayi) {
				int a = 1;
				int fakt = 1;
				while(a <= sayi) {
					fakt *= a;
					a++;
					
				}
				System.out.println(fakt);
			}
		}
		Hesapla faktoriyel =  new Hesapla();  // o method icinde cagırabiliyoruz
		faktoriyel.hesapla(5);

	}
	
	// Hesapla faktoriyel =  new Hesapla(); method dısında localınnerclass cagrılamaz
}
