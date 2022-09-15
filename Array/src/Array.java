import java.util.Iterator;
import java.util.Scanner;

public class Array {
	public static double avarage(int[] array) {
		int counter = 0;
		for (int i = 0; i < array.length; i++) {
			counter += array[i];
		}

		return counter / array.length;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] a = new int[10];

		Scanner number = new Scanner(System.in);
		System.out.print("please enter a number:");
		for (int i = 0; i < a.length; i++) {
			a[i] = number.nextInt();
		}
		System.out.println("-----------------------------");
		for (int x = 0; x < a.length; x++) {
			System.out.print(a[x] + " ");

		}

		System.out.println(avarage(a));

	}

}
