
public class Daire extends Sekil {
	
	private int yarıCap;
	

	public Daire(String isim, int yarıCap) {
		super(isim);
		this.yarıCap = yarıCap;
	}


	@Override
	void alanHesapla() {
		// TODO Auto-generated method stub
		System.out.println(getIsim() + " alani " + (Math.PI * yarıCap * yarıCap)+ " dir");
	}
	

}
