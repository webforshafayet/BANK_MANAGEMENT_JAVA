import java.io.File;
import java.io.FileNotFoundException;
import java.util.Formatter;
import java.util.Scanner;
public class Customer implements AccountOperations
{
    String name;
    int nid;
    Account[] accounts;
	protected int totalaccounts=0;
	
	public Account getAccount(String accountNumber)
    {
        for(Account A : accounts)
        {
            if(accountNumber == A.getAccountNumber()+"")
            {
               return A;
            }
       }

        return null;
    }
 
	
	public  Customer(int no)
	{
		accounts=new Account[no];
		//System.out.println("Valued Constructor in Customer");
	}
    void setName(String name)
    {
        this.name = name;
    }
    void setNid(int nid)
    {
        this.nid = nid;
    }
    String getName()
    {
        return this.name;
    }
	int getNid()
    {
        return this.nid;
    }
	
	
public void insertAccount(Account a)
{
	if(totalaccounts<accounts.length)
		{
			accounts[totalaccounts]=a;
			totalaccounts++;
		}
		else
		{
			System.out.println("WE HAVE MAXIMUM ACCOUNTS");
		}
}
public void removeAccount(Account a)
{
		if(totalaccounts>0)
		{
			//accounts[totalaccounts]=a;
			totalaccounts--;
		}
		else
		{
			System.out.println("WE HAVE MINIMUM ACCOUNTS");
		}
}
public void showAllAccounts( )
{
	for(int i=0;i<totalaccounts;i++)
		{
			accounts[i].showaccountinfo();
		}
}
public Customer(String name,int nid )
	{
		this.name = name;
		this.nid = nid;
		//this.salary = salary;
		//System.out.println("Valued Constructor in Customer");
		
		try
		{
			Scanner input= new Scanner (System.in);
			  
			 
			 Formatter formatter= new Formatter("Customer.txt");
			 //Scanner input= new Scanner (System.in);
			 formatter.format("%s %d \r\n","Rafiq",001);
			 formatter.format("%s %d \r\n","Shafiq",002);
			 System.out.println("how Many Input for customer__(put 0 if u dont want any input )");
			 int num=input.nextInt();
			 
			 for(int i=0;i<num;i++)
			 {
				 System.out.println("Input for customer's Name & nId");
				 name=input.next();
				 nid=input.nextInt();
				 formatter.format("%s %d\r\n",name,nid);
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
			File file2=new File("Customer.txt");
			Scanner scanner=new Scanner(file2);
			
			while(scanner.hasNext())
			{
			 
				name=scanner.next();
				nid=scanner.nextInt();
				//System.out.println("Employee's Name:"+name+"--->Employee's id:"+ empId);
				System.out.println(" Customer Info...........");
				System.out.println(" Customer Name: "+name);
				System.out.println(" Customer ID: "+nid);
				//System.out.println(" Customer salary: "+salary);
			}
			scanner.close();
		}
		catch(Exception e)
		{
			System.out.println(e);
		}
	}
public void showcustomerinfo()
{
	    System.out.println("  Customer Info...........");
		System.out.println("  Customer Name: "+name);
		System.out.println("  Customer ID: "+nid);
}

}