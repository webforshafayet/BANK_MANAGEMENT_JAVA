import java.io.File;
import java.io.FileNotFoundException;
import java.util.Formatter;
import java.util.Scanner;
class Employee
{
	//public static Employee[] players;
    String name;
    String empId;
    double salary;
    

    void setName(String name)
    {
        this.name = name;
    }
    void setEmpId(String empId)
    {
        this.empId = empId;
    }
    void setSalary(double salary)
    {
        this.salary = salary;
    }
    String getName()
    {
        return this.name;
    }
    String getEmpId()
    {
        return this.empId;
    }
    double getSalary() 
    {
        return this.salary;
    }
	 
	public Employee(String name,String empId,double salary)
	{
		this.name=name;
		this.empId=empId;
		this.salary=salary;
		
		try
		{
			Scanner input= new Scanner (System.in);
			  
			 
			 Formatter formatter= new Formatter("Employee.txt");
			 //Scanner input= new Scanner (System.in);
			 formatter.format("%s %s \r\n","jamal","001");
			 formatter.format("%s %s \r\n","kamal","002");
			 System.out.println("how Many Input for employee__(put 0 if u dont want any input )");
			 int num=input.nextInt();
			 
			 for(int i=0;i<num;i++)
			 {
				 System.out.println("Input for Employee's Name & empId");
				 name=input.next();
				 empId=input.next();
				 formatter.format("%s %s\r\n",name,empId);
			 }
			 
			 
			 formatter.close();
		}
		catch(Exception e)
		{
			System.out.println(e);
		}
		

		////employeee
		try
		{
			File file1=new File("Employee.txt");
			Scanner scanner=new Scanner(file1);
			
			while(scanner.hasNext())
			{
			 
				name=scanner.next();
				empId=scanner.next();
				//System.out.println("Employee's Name:"+name+"--->Employee's id:"+ empId);
				System.out.println(" employee Info...........");
				System.out.println(" employee Name: "+name);
				System.out.println(" employee ID: "+empId);
				System.out.println(" employee salary: "+salary);
			}
			scanner.close();
		}
		catch(Exception e)
		{
			System.out.println(e);
		}
		
	 
		 
	}
	
	
	
	
	public void showemployeeinfo()
	{
		System.out.println(" employee Info...........");
		System.out.println(" employee Name: "+name);
		System.out.println(" employee ID: "+empId);
		System.out.println(" employee salary: "+salary);
		
	}	


}