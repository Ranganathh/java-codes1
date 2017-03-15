package SamplePack;

public class Employee {
	int eno;
	String ename;
	double salary;
	
	public Employee()
	{
	eno=35;
	ename="Raju";
	salary=4000;
	}
	
	
	public Employee(int x, String y, double z)
	{
		eno= x;
		ename=y;
		salary=z;
	}
	public Employee(Employee p)
	{
		eno=p.eno;
		ename=p.ename;
		salary=p.salary;
	}
	
	public void Dispaly()
	
	{
		System.out.println("Employee Details");
		System.out.println("------------------");
		System.out.println("Number:"+eno);
		System.out.println("Name:"+ename);
		System.out.println("salary :"+salary);
		
	}

	public static void main(String[] args) {
	Employee a=new Employee(25,"Ramesh",25000);
	Employee b=new Employee();
	Employee c=new Employee(a);
	

	a.Dispaly();
	b.Dispaly();
	c.Dispaly();
	
		
		

	}

}
