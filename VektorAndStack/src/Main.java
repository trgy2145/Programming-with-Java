import java.util.Enumeration;
import java.util.Iterator;
import java.util.ListIterator;
import java.util.Stack;
import java.util.Vector;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	/*	Vector<String> vektor =  new Vector<String>();
		vektor.add("java");
		vektor.add("php");
		vektor.add("css");
		
		for (String v: vektor) {
			System.out.println(v);
			
		}
		
		// ListIterator<String> iterator = vektor.listIterator();
		// while (iterator.hasNext()) {
		//	System.out.println(iterator.next());    }
		Enumeration<String> enumaration =  vektor.elements();
		while (enumaration.hasMoreElements()) {
			System.out.println(enumaration.nextElement()); 
			
		}
		
		*/
       Stack<String>  stack = new Stack<String>();
       stack.add("Java");
       stack.push("Php");
       stack.push("Pyhthon");
       stack.push("Go");
       
       System.out.println(stack.peek()); // son elamanı cıkarmadan yazdırır
       System.out.println("******************************************");
       
       for (String s : stack) {
    	   System.out.println(s);
		
	}
       System.out.println("******************************************");
       System.out.println(stack.pop());// son elemanı cıkarır
       System.out.println("*******************************************");
       for (String s : stack) {
    	   System.out.println(s);
		
	}
       System.out.println("*******************************************");
       System.out.println(stack.empty());
	}
	

}
