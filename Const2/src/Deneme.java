
public class Deneme {
	private String isim;
	private String soyad;
	private int yas;
	private int boy;
	
	public Deneme() {
		this("hasan","veli",30,175);
		
		
		
	}
	
	public Deneme(String isim, String soyad,int yas, int boy) {
		this.isim =isim;
		this.soyad = soyad;
		this.yas = yas;
		this.boy = boy;
		
	}
	
	public String getIsim() {
		return isim;
	}

	public void setIsim(String isim) {
		this.isim = isim;
	}

	public String getSoyad() {
		return soyad;
	}

	public void setSoyad(String soyad) {
		this.soyad = soyad;
	}

	public int getYas() {
		return yas;
	}

	public void setYas(int yas) {
		this.yas = yas;
	}

	public int getBoy() {
		return boy;
	}

	public void setBoy(int boy) {
		this.boy = boy;
	}

	
	
	

}
