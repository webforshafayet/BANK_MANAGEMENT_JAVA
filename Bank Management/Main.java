import java.io.File;
import java.io.FileNotFoundException;
import java.util.Formatter;
import java.util.Scanner;
public class Main
{
	public static void main(String[] args)
	{
		Scanner input= new Scanner (System.in);

		int digit;
		System.out.println("_____----HERE IS  YOUR OPTION-------------_____");
		System.out.println("_____----SELECT ONLY FRONT NUMBER---------_____");
		System.out.println("_____----1.Employee Management------------_____");
		System.out.println("_____----2.Customer Management------------_____");
		System.out.println("_____----3.Customer Account Management----_____");
		System.out.println("_____----4.Account Transactions-----------_____");
		System.out.println("_____----5.Exit---------------------------_____");
		
		System.out.println("Enter your option---");
		digit=input.nextInt();
		
		//File dir=new File("person");
		//dir.mkdir();
		
		//File file1=new File("Employee.txt");
		//File file2=new File("Customer.txt");
		
		
		//Write
		/*String name,empId;
		try
		{
			 //file1.createNewFile();
			 //file2.createNewFile();
			 
			 Formatter formatter= new Formatter("Employee.txt");
			 //Scanner input= new Scanner (System.in);
			 formatter.format("%s %s\r\n","jamal","001");
			 formatter.format("%s %s\r\n","kamal","002");
			 System.out.println("how Many Input for employee");
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
		}*/
		
		////read
		/*try
		{
			File file1=new File("Employee.txt");
			Scanner scanner=new Scanner(file1);
			
			while(scanner.hasNext())
			{
				name=scanner.next();
				empId=scanner.next();
				System.out.println("Employee's Name:"+name+"--->Employee's empId:"+ empId);
				
			}
			scanner.close();
		}
		catch(Exception e)
		{
			System.out.println(e);
		}*/
		
		
		
		switch(digit)
		{
		case 1:
		System.out.println("_____----1.Insert New Employee-----------_____");
		System.out.println("_____----2.Remove Existing Employee-------_____");
		System.out.println("_____----3.Show All Employees ------------_____");
		System.out.println("_____----4.Exit---------------------------_____");
		System.out.println("Enter your Employee Management option---");
		digit=input.nextInt();
		//System.out.println("How many New Employee will be inserted---");
		//int n=input.nextInt();
		/*String[] name= new int[10];
		String[] empId= new int[10];
		int[] salary= new int[10];*/
		/*for(int i=0;i<n;i++)
		System.out.println("Enter your name--");
		String name=input.next();
		for(int i=0;i<n;i++)
		System.out.println("Enter your empid--");
		String empId=input.next();
		for(int i=0;i<n;i++)
		System.out.println("Enter your salary--");
		int salary=input.nextInt();*/
		
		/*int i = 0;
    int n ;
    //int[] myArray = new int[100];
    System.out.printf("enter a value>>");
	 n=input.nextInt();
	double [] salary = new double[100];
    //while (input.nextInt() > 0) {
        for (i = 0; i < n; i++) {
			//int salary=0;
            //myArray[i] = input.nextInt();
			System.out.printf("enter salary>>");
			 salary[i] = input.nextInt();
			Employee e1=new Employee("name","empId",salary[i]);
        }
        //System.out.printf("enter name>>");
		//System.out.printf("enter id>>");
		//System.out.printf("enter salary>>");
    
	
		Employee e1=new Employee("name","empId",salary[i]);
		Employee e2=new Employee("name","empId",salary[i]);
		Employee e3=new Employee("name","empId",salary[i]);*/
		

		////employeee
		/*try
		{
			File file1=new File("Employee.txt");
			Scanner scanner=new Scanner(file1);
			
			while(scanner.hasNext())
			{
				name=scanner.next();
				empId=scanner.next();
				System.out.println("Employee's Name:"+name+"--->Employee's id:"+ empId);
				
			}
			scanner.close();
		}
		catch(Exception e)
		{
			System.out.println(e);
		}
		
		File file1=new File("Employee.txt");
		if (file1.exists()) {
		System.out.println("File name: " + file1.getName());
		System.out.println("Absolute path: " + file1.getAbsolutePath());
		System.out.println("Writeable: " + file1.canWrite());
		System.out.println("Readable :" + file1.canRead());
		System.out.println("File size in bytes " + file1.length());
		//System.out.println("Employee's Name:"+ file1.getname());
		}
		else 
		{
		System.out.println("The file does not exist.");
		}
		//file1.name=name;
		//file1.empid=empId;
		//static public void run (String[] args) throws  Exception{
		//File file1=new File("Employee.txt");
		//Employee e1=new Employee(name,empId,10);
		//file1.name=name;
		//file1.empid=empid;*/
		/*{
        for (i = 0; i < n; i++) {
			Employee e[i]=new Employee("q","12",10);
			//int salary=0;
            //myArray[i] = input.nextInt();
			//System.out.printf("enter salary>>");
			// e[i] = input.nextInt();
			//Employee e1=new Employee("name","empId",salary[i]);
        }*/
		//System.out.println("Enter employee number---");
		//digit=input.nextInt();
		//for (int i = 0; i < digit; i++) 
		
		Employee e1=new Employee("q","12",10000);
		//Employee e2=new Employee("w","13",11);
		//Employee e3=new Employee("e","14",12);
		//Employee e2=new Employee("w","13",11);
		//Employee e3=new Employee("e","14",12);
		switch(digit)
		{
		case 1:
		Bank b1=new Bank(2);
	 
		b1.insertEmployee(e1);
		//b1.insertEmployee(e2);
		//b1.insertEmployee(e3);
		//b1.showAllEmployees();
		break;
		
		case 2:
		//Employee e2=new Employee("jamal","001",11);
		//Employee e3=new Employee("kamal","002",12);
		Bank b2=new Bank(2);
		b2.removeEmployee(e1);
		//b2.removeEmployee(e1);
		//b2.removeEmployee(e1);
		System.out.println("result remove");
		//b2.showAllEmployees();
		break;
		
		case 3:
		//Employee e1=new Employee("q","12",10);
		Bank b3=new Bank(2);
		b3.insertEmployee(e1);
		//b3.insertEmployee(e2);
		b3.showAllEmployees();
		System.out.println("Show All Employees");
		break;
		
		case 4:
		System.out.println("Exit");
		break;
		
		default:
		{
		System.out.println("Wrong input, Try again");
	    }
		
		}
				
		break;
			
		 
	case 2:
		System.out.println("_____----1.Insert New Customer------------_____");
		System.out.println("_____----2.Remove Existing Customer------------_____");
		System.out.println("_____----3.Show All Customer ------------_____");
		System.out.println("_____----4.Exit---------------------------_____");
		System.out.println("Enter your Customer Management option---");
		digit=input.nextInt();
		////customer
		Customer c1=new Customer("w",100);
		//Customer c2=new Customer("e",100);
		//Customer c3=new Customer("r",100);
		switch(digit)
		{
		case 1:
		Bank b6=new Bank(2);
		b6.insertCustomer(c1);
		//b3.insertCustomer(c2);
		//b3.insertCustomer(c3);
		//b3.showAllCustomers();
		break;
		
		case 2:
		Bank b4=new Bank(2);
		System.out.println("result remove");
		b4.removeCustomer(c1);
		//b4.removeCustomer(c2);
		//b4.removeCustomer(c3);
		b4.showAllCustomers();
		break;
		
		case 3:
		System.out.println("Show All Customer");
		//Employee e1=new Employee("q","12",10);
		Bank b5=new Bank(2);
		b5.insertCustomer(c1);
		//b3.insertEmployee(e2);
		b5.showAllCustomers();
		System.out.println("Show All Customer");
		break;
		
		case 4:
		System.out.println("Exit");
		break;
		
		default:
		{
		System.out.println("Wrong input, Try again");
	    }
		}
		break;
	
		
	case 3:
	
		System.out.println("_____----1.Insert New Account------------_____");
		System.out.println("_____----2.Remove Existing Account------------_____");
		System.out.println("_____----3.Show All Accounts ------------_____");
		System.out.println("_____----4.Exit---------------------------_____");
		System.out.println("Enter your Account Management option---");
		digit=input.nextInt();
		///account mnaager
		Account a1=new Account(1,2);
		//a1.accountNumber=1;
		//a1.balance=2;
		/*Account a2=new Account();
		a2.accountNumber=4;
		a2.balance=5;
		Account a3=new Account();
		a3.accountNumber=6;
		a3.balance=7;*/
		
		switch(digit)
		{
		case 1:
		Customer cc1=new Customer(2);
		cc1.insertAccount(a1);
		//cc1.insertAccount(a2);
		//cc1.insertAccount(a3);
		//cc1.showAllAccounts();
		break;
		
		case 2:
		Customer cc2=new Customer(2);
		System.out.println("result remove");
		cc2.removeAccount(a1);
		//cc2.removeAccount(a2);
		//cc2.removeAccount(a3);
		//cc2.showAllAccounts();
		break;
		
		case 3:
		System.out.println("Show All Account");
		break;
		
		case 4:
		System.out.println("Exit");
		break;
		
		default:
		{
		System.out.println("Wrong input, Try again");
	    }
		}
		break;
			
			
			
	case 4:
		
		System.out.println("_____----1.Deposit Money------------_____");
		System.out.println("_____----2.Withdraw Moneye------------_____");
		System.out.println("_____----3.Transfer Money ------------_____");
		System.out.println("_____----4.Exit---------------------------_____");
		System.out.println("Enter your Account Transactions option---");
		digit=input.nextInt();
		//Account a1;
		//////account transiction
		 
		 
		Account aa1=new Account(12345,20000);
		//aa1.accountNumber=1;
		//aa1.balance=2;
		switch(digit)
		{
		case 1:
		if(digit>-1)
		{
		aa1.deposit(digit);
		}
		break;
		
		case 2:
		if(digit>-1)
		{
		aa1.withdraw(digit);
		}
		break;
		
		case 3:
		if(digit>-1)
		{
		aa1.transfer(aa1,digit);
		}
		aa1.deposit(0);
		aa1.withdraw(digit);
		
		aa1.transfer(aa1,digit);	
		break;
		
		case 4:
		System.out.println("Exit");
		break;
		
		default:
		{
		System.out.println("Wrong input, Try again");
	    }
		}	
		break;
		case 5:
		{
		System.out.println(" Thank you for visiting us");
		}
		break;
	
		default:
		{
		System.out.println(" sorry, you have wrong input, Try again later");
	    } 
		}
	}
	    	
		
	
}
