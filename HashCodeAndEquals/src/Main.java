import java.util.HashSet;
import java.util.Objects;
import java.util.Set;

class Player {
	private String isim;
	private int id;

	public Player(String isim, int id) {

		this.isim = isim;
		this.id = id;
	}

	

	@Override
	public int hashCode() {
		return Objects.hash(id, isim);
	}



	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Player other = (Player) obj;
		return id == other.id && Objects.equals(isim, other.isim);
	}



	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return " ID ----> " + id + " isim ---->" + isim;
	}
}

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// Set<String> hashset = new HashSet<String>();
		Set<Player> hashset = new HashSet<Player>();
		Player p1 = new Player("mustafa", 1);
		Player p2 = new Player("mehmet", 10);
		Player p3 = new Player("emre", 6);
		Player p4 = new Player("mustafa", 1);
		/*
		 * hashset.add("java"); hashset.add("python"); hashset.add("c++");
		 * 
		 * for (String s : hashset) { System.out.println(s);
		 * 
		 * }
		 */
		hashset.add(p1);
		hashset.add(p2);
		hashset.add(p3);
		hashset.add(p4);
		for (Player s : hashset) {
			System.out.println(s);

		}
		
		//normalde hashset te aynı ike key olmaması lazım ancak bu sınıfı kendimiz olusturduk bunu anlaması icin hashcode 
		// ve equals metodlarını yazmazsak bunların aynı oldugunu anlamaz..kendi olusturdugumuz sınıfları hashset e gönderirken 
		// hashcode ve equals override etmeyi unutma
	}

}
