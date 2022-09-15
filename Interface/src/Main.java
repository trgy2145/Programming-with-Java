
public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		PcMühendisi mühendis = new PcMühendisi(false, false);
		mühendis.adliSicil();
		mühendis.askerlik();
		System.out.println(mühendis.mezuniyet(85.0));
		String[] tecrübe = { "tt", "bosch", "db" };
		mühendis.isTecrübesi(tecrübe);

	}

}
