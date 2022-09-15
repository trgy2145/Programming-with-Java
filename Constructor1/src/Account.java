
public class Account {
	private String hesapNo;
	private double bakiye;
	private String isim;
	private String email;
	private String telNo;

	

	public Account(double bakiye, String hesapNo, String isim, String email, String telNo) {

		this.hesapNo = hesapNo;
		this.bakiye = bakiye;
		this.isim = isim;
		this.email = email;
		this.telNo = telNo;
	}

	public String getHesapNo() {
		return hesapNo;
	}

	public void paraYatir(double miktar) {
		bakiye += miktar;
		System.out.println("yeni bakiyeniz :" + bakiye);

	}

	public void paraCekme(double miktar) {

		if (miktar > 1500) {
			System.out.println("bir gunde maksimum 1500 tl cekebilirsiniz");
		}
		if (bakiye - miktar < 0) {
			System.out.println("bakiyeniz :" + bakiye);
		} else {
			bakiye -= miktar;
			System.out.println("hesabınızdan " + miktar + "cekilmiştir" + "yeni bakiye:" + bakiye);
		}
	}

	public void setHesapNo(String hesapNo) {
		this.hesapNo = hesapNo;
	}

	public double getBakiye() {
		return bakiye;
	}

	public void setBakiye(double bakiye) {
		this.bakiye = bakiye;
	}

	public String getIsim() {
		return isim;
	}

	public void setIsim(String isim) {
		this.isim = isim;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getTelNo() {
		return telNo;
	}

	public void setTelNo(String telNo) {
		this.telNo = telNo;
	}

}
