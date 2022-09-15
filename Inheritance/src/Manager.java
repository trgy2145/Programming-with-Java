
public class Manager extends Mitarbeiter{//subclass
	private int salary;
	
	public Manager(String name, String surname, int age, String department,int salary) {
		super(name,surname,age,department);
		this.salary =  salary;
	}
	   public void zeigtData() { // wir haben diese method override gemacht..(supperclassın methodunu overload yapmaktır)
	    	/* System.out.println("name : " + getName() );
	    	 System.out.println("surname : " + getSurname());
	    	 System.out.println("age : " + getAge());
	    	 System.out.println("depart : " + getDepartment());
	    	 */
		   
		   super.zeigtData(); // yukardaki bilgileri tanıtmak yerine bunu yapabiliriz
	    	 System.out.println("salary : " + salary);
	     }
	public int getSalary() {
		return salary;
	}
	public void setSalary(int salary) {
		this.salary = salary;
	}
	     

}
