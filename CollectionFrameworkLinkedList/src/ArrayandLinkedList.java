import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public class ArrayandLinkedList {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LinkedList<Integer> linkedList = new LinkedList<Integer>();
		ArrayList<Integer> arrayList = new ArrayList<Integer>();
		long a = zamanHesapla("linkedlist", linkedList);
		System.out.println("linkedlist : " +a);
		long b = zamanHesapla("arraylist", arrayList);
		System.out.println("arrayList :" +b);

		if (a > b) {
			System.out.println("linkedlist performans olarak " + (a - b) + " ms kadar arraylistten daha yavas ");
		} else if (a < b) {
			System.out.println("arraylist performans olarak " + (b - a) + " ms kadar linkedlistten daha yavas ");
		} else {
			System.out.println("performans olarak esitlerdir : " + a);
		}
	}

	public static long zamanHesapla(String veriTipi, List<Integer> list) {
		long baslangic;
		long bitis;

		baslangic = System.currentTimeMillis();

		for (int i = 0; i < 100000; i++) {
			// list.add(i); //  sona eklemede arraylist daha iyi birde başa ekleyelim..
			list.add(0, i);

		}
		bitis = System.currentTimeMillis();
		// System.out.println(veriTipi + "'nin gecen suresi : " +(bitis - baslangic) + "
		// ms dir..");
		return (bitis - baslangic);

	}

}
