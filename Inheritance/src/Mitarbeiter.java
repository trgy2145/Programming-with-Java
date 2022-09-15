import java.util.Scanner;

public class Mitarbeiter {//superclass
     private String name;
     private String surname;
     private int age ;
     private String department;

		public Mitarbeiter(String name, String surname, int age, String department) {

		this.name = name;
		this.surname = surname;
		this.age = age;
		this.department = department;
	}
	 
	 public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getSurname() {
		return surname;
	}

	public void setSurname(String surname) {
		this.surname = surname;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String getDepartment() {
		return department;
	}

	public void setDepartment(String department) {
		this.department = department;
	}

	public void start() {
		 System.out.println("program begint...");
	 }
     public void zeigtData() {
    	 System.out.println("name : " + name);
    	 System.out.println("surname : " + surname);
    	 System.out.println("age : " + age);
    	 System.out.println("depart : " + department);
     }
     
     public void changeDepartman() {
    	 
    	 Scanner scan = new Scanner(System.in);
    	 
    	 System.out.print("bitte geben sie depertmant ein :");
    	 
    	 String depart = scan.nextLine();
    	
    	 
    	 System.out.println("dein department :" + depart);
    	 
     }
     
}
