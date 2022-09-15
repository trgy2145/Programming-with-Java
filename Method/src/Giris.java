
public class Giris {
	public static boolean asalMi(int i) {
		boolean a = true;
		for (int x = 2 ; x < i;x++) {
			if (i % x == 0) {
				a = false;
			}
			
		}
		return a;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		for(int y = 2 ;  y < 1000 ; y++ ) {
			if(asalMi(y)) {
				System.out.println(y);
			}
		}

	}

}
