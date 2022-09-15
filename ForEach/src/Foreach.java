
public class Foreach {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String[] name = {"mehmet", "ahmet","can"};
		int[] num = {1,2,3};
		Deneme[] array = {new Deneme("ali"),new Deneme("ridvan"),new Deneme("salih")};
		
		for (int i : num) {
			
			System.out.println(i + " ");
			
		}
		for (String i : name) {
			System.out.println(i);
			
		}
		for (Deneme deneme : array) {
			deneme.yaz();
		}

	}

}
