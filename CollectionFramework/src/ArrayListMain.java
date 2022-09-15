import java.util.ArrayList;
import java.util.List;

public class ArrayListMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// ArrayList<String> arrayList = new ArrayList<String>();
		List<String> list = new ArrayList<String>();

		list.add("ali");
		list.add("veli");
		list.add("can");
		// System.out.println(list.get(0));
		// System.out.println(list.get(1));
		for (String name : list) {
			System.out.println(name);

		}

	}

}
