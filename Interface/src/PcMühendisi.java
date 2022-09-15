
public class PcMühendisi implements IMühendis {
	private boolean askerlik;
	private boolean sicil;

	public PcMühendisi(boolean askerlik, boolean sicil) {

		this.askerlik = askerlik;
		this.sicil = sicil;
	}

	@Override
	public void askerlik() {
		if (askerlik) {
			System.out.println("askerlik yapmıs...");
		} else {
			System.out.println("askerlik yapta gel");
		}

	}

	@Override
	public String mezuniyet(double derece) {
		// TODO Auto-generated method stub
		return "ortalama" + derece;
	}

	@Override
	public void adliSicil() {
		// TODO Auto-generated method stub
		if (sicil) {
			System.out.println("sicil kaydı var....");
		} else {
			System.out.println("sicil kaydi yok uygun");

		}
	}

	@Override
	public void isTecrübesi(String[] array) {
		// TODO Auto-generated method stub
		System.out.println("is tecrubeleri");
		for (String kariyer : array) {
			System.out.println(kariyer);

		}

	}

}
