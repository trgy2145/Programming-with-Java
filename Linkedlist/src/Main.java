import java.util.LinkedList;
import java.util.ListIterator;

public class Main {
	public static void yaz(LinkedList<String> a) {
		/*
		 * for (String name : a) { System.out.println(name);
		 * 
		 * }
		 */
		ListIterator<String> iterator = a.listIterator();
		while (iterator.hasNext()) { // hasnext bir obje varmı onu gösterir varsa döner

			System.out.println(iterator.next());
		}

	}

	public static void sırala(LinkedList<String> gidililecek_yerler, String yeni) {
		ListIterator<String> iterator = gidililecek_yerler.listIterator();

		while (iterator.hasNext()) {
			int karsilastir = iterator.next().compareTo(yeni);
			if (karsilastir == 0) {
				// ikisi esitse
				System.out.println("listede zaten var...");
				return; // fonk void return u böyle yazarsak fonk direk işlevi keser..değer döndürmez
						// metodu durdurur
			} else if (karsilastir < 0) {
				// yenideger iterator.next () ten daha büyük
			} else if (karsilastir > 0) {
				iterator.previous(); // itera bir geri gelir ve simdi ekleyebiliriz...
				iterator.add(yeni);
				return;
			}
		}
		iterator.add(yeni);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LinkedList<String> names = new LinkedList<String>();

		sırala(names, "polat");
		sırala(names, "market");
		sırala(names, "ali");

		/*
		 * names.add("turgay"); names.add("nevzat"); names.add("sadullah");
		 * names.add("bekir");
		 * 
		 * yaz(names);
		 */

		yaz(names);

	}

}
