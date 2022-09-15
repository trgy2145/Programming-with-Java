
public class Hund extends Tier{
	private String land;
	
	public String getLand() {
		return land;
	}

	public void setLand(String land) {
		this.land = land;
	}

	public Hund(String name, String art, int age,String land) {
		super(name,art,age);
		this.land = land;
	}
	public void rennen(int hız) {
		System.out.println("hund rennst " + hız + "km");
	}

	public void kos(int hız) {
		System.out.println("kopek kosuyor...");
		super.rennen(hız);
		rennen(hız);
	}

}
