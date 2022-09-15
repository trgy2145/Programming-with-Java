import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.TreeMap;

public class MapMain {
	public static void yazdır(Map<Integer, String> map) {
		map.put(3, "java");
		map.put(2, "php");
		map.put(20, "css");
		map.put(15, "html");

		/*
		 * for (Map.Entry<Integer, String> entry : map.entrySet()) {
		 * System.out.println("key degeri : " + entry.getKey() + "------------>" +
		 * " value degeri : " + entry.getValue() );
		 * 
		 * }
		 */

		/*
		 * for (Integer key : map.keySet()) {
		 * 
		 * System.out.println("key degeri : " + key + "------------>" +
		 * " value degeri : " + map.get(key) );
		 * 
		 * }
		 */

		for (String value : map.values()) {

			System.out.println(" value degeri : " + value);

		}
		System.out.println("*********************************");
		
		Collection<String> value = map.values(); //  yukardaki ile aynıdır
		
		for (String s : value) {

			System.out.println(" value degeri : " + s);

		}

	}

	public static void main(String[] arg) {

		Map<Integer, String> hashmap = new HashMap<Integer, String>();
		Map<Integer, String> linkedhashmap = new LinkedHashMap<Integer, String>();
		Map<Integer, String> treemap = new TreeMap<Integer, String>();

		System.out.println("*************hashmap************");
		yazdır(hashmap);

		System.out.println("*************linkedhashmap************");
		yazdır(linkedhashmap);

		System.out.println("*************treemap************");
		yazdır(treemap);

	}
}
