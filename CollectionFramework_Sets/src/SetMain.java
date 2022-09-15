import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

public class SetMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Set<String> s1 = new HashSet<String>();
		Set<String> s2 = new LinkedHashSet<String>();
		Set<String> s3 = new TreeSet<String>();
		Set<String> s4 = new HashSet<String>();
		Set<String> s5 = new HashSet<String>();

		System.out.println("***********************HashSet eklenme sirasi onemli degil*****************************");
		s1.add("ali");
		s1.add("turgay");
		s1.add("gokan");
		s1.add("zeynep");

		// s1.add("ali"); her üc ünde de bir element bir kez eklenir
		for (String s : s1) {
			System.out.println(s);

		}

		System.out.println("***********************linkedhashset eklenme sirasi onemli*****************************");
		s2.add("ali");
		s2.add("turgay");
		s2.add("gokan");
		s2.add("zeynep");
		for (String s : s2) {
			System.out.println(s);

		}

		System.out.println("***********************treeSet alfabetik sirasi onemli *****************************");
		s3.add("ali");
		s3.add("turgay");
		s3.add("gokan");
		s3.add("zeynep");

		for (String s : s3) {
			System.out.println(s);

		}
		System.out.println("***********************fark ve kesisim bulacagiz *****************************");

		s4.add("ali");
		s4.add("turgay");
		s4.add("gokan");
		s4.add("zeynep");

		s5.add("turgay");
		s5.add("gokan");
		s5.add("zeynep");
		s5.add("serpil");

		/*
		 * Set<String> fark = new HashSet<String>(s5); // constructora s5 verdik ve fark
		 * suan s5 tir
		 * 
		 * System.out.println("************fark*******************");
		 * System.out.println(fark.removeAll(s4)); System.out.println(fark);
		 */
		Set<String> kesisim = new HashSet<String>(s5);
		System.out.println("************kesisim*******************");
		System.out.println(kesisim.retainAll(s4));
		System.out.println(kesisim);

	}

}
