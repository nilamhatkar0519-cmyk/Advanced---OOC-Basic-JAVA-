class Employee{
	String name;
	String address;
	String job_Title;
	double salary;

	Employee( String name, String address, String job_Title, double salary){
		this.name = name;
		this.address = address;
		this.job_Title = job_Title;
		this.salary = salary;
	}
	double calculateBonus(){
		return salary*0.10;
	}
	void performanceReport(){
		System.out.println(job_Title+"performance is satisfactory..");
	}
}

class Manager extends Employee{
	Manager(String name, String address, double salary){
		super(name,address,"Manager",salary);
	}
	
	void managerProject(){
	System.out.println("Managing company projects..");
	}
}

class Developer extends Employee{
	Developer(String name, String address, double salary){
		super(name,address,"Developer",salary);
	}
	
	void managerProject(){
	System.out.println("Developing software projects..");
	}
}

class Programmer extends Employee{
	Programmer(String name, String address, double salary){
		super(name, address, "Programmer", salary);
	}
	
	void managerProject(){
	System.out.println("Writing and teasting code..");
	}
}

class Employee_Main{
	public static void main( String[] args){
	
	Manager m = new Manager( "Sahil" , "Gujrat" ,900000);
	System.out.println("Bonus" + m.calculateBonus());
	m.performanceRopert();
	m.managerProject();
	}
}

	