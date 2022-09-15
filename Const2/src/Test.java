
public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Deneme deneme =  new Deneme();
		Deneme deneme1 =  new Deneme("trgy", "prc",35, 176);
		System.out.println("soyad :"+ deneme1.getSoyad());
		System.out.println("soyad :"+ deneme.getSoyad());
		
		Deneme deneme2 =  deneme;
		
		if (deneme == deneme1) {
			System.out.println("equal");
		}
		else {
			System.out.println("not equal");
		}
		
		if (deneme == deneme2) {
			System.out.println("equal");
		}
		else {
			System.out.println("not equal");
		}
		
		System.out.println("soyad :" + new Deneme().getSoyad());
		// bir referansa atamadıgımızda o an fonk ozellikler kullanılabilir ancak sonra kullanılmaz...
	}

}
