import java.util.ArrayList;

public class Arraylıst {
	public static void yazdır(ArrayList<String> a) {
		for (int i = 0; i < a.size(); i++) {
			System.out.println(a.get(i));

		}

	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<String> array = new ArrayList<String>();
		array.add("ali");
		array.add("veli");
		array.add("can");
		System.out.println(array.get(0));
		array.remove(0);
		array.set(1, "serkan");
		array.indexOf("can");
		array.lastIndexOf("ali");

		/*
		 * for (int i = 0 ; i < array.size();i++) { System.out.println(array.get(i));
		 * 
		 * }
		 */
		yazdır(array);

	}

}
