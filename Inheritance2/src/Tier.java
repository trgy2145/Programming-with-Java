
public class Tier {
	
	private String name;
	private String art;
	private int age;

	public Tier(String name, String art, int age) {
		this.name = name;
		this.art = art;
		this.age = age;
	}

	

	public void rennen(int hız) {
		System.out.println("tier rennst " + hız + "km");
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getArt() {
		return art;
	}

	public void setArt(String art) {
		this.art = art;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	

}
