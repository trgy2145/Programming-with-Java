import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

class Player implements Comparable<Player> {
	private String isim;
	private int id;

	public Player(String isim, int id) {

		this.isim = isim;
		this.id = id;
	}

	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return " ID ----> " + id + " isim ---->" + isim;
	}

	@Override
	public int compareTo(Player player) {
		// System.out.println(this.isim +" "+ this .id); // suanki objenin id gönderilen
		// obj id kucukse -1
		if (this.id < player.id) { // this.id ilk gönderilen obj id si
			return -1;
		} else if (this.id > player.id) {
			return 1;
		}
		return 0;
	}
}

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		 * List<String> list = new ArrayList<String>(); list.add("Java");
		 * list.add("C++"); list.add("Python"); list.add("Php"); list.add("Go");
		 * Collections.sort(list); for (String s : list) { System.out.println(s);
		 */

		List<Player> list = new ArrayList<Player>();

		list.add(new Player("murat", 5));
		list.add(new Player("emre", 1));
		list.add(new Player("oguz", 10));
		list.add(new Player("yusuf", 4));

		/*
		 * Player p1 = new Player("ali", 1); Player p2 = new Player("vali", 2);
		 * System.out.println(p1.compareTo(p2)); // deneme amaclı
		 */

		Collections.sort(list); // hata veriyor sebebi ise String sınıfında olup bizim sınıfta olmayan compareTo
								// metodu override yap.tabi önce implement et..

		for (Player p : list) {
			System.out.println(p);

		}

	}
}
