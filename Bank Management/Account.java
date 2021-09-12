
import java.io.File;
import java.io.FileNotFoundException;
import java.util.Formatter;
import java.util.Scanner;
 class Account  implements ITransactions
{   
    int accountNumber;
    double balance;


    void setAccountNumber(int accountNumber)
    {
        this.accountNumber = accountNumber;
    }

    void setBalance(double balance)
    {
        this.balance = balance;
    }

    int getAccountNumber()
    {
        return this.accountNumber;
    }

    double getBalance()
    {
        return this.balance;
    }
	public Account(int accountNumber,double balance)
	{
		this.accountNumber = accountNumber;
		this.balance=balance;
		//System.out.println("Valued Constructor in Account");
		
		try
		{
			Scanner input= new Scanner (System.in);
			  
			 
			 Formatter formatter= new Formatter("Account.txt");
			 //Scanner input= new Scanner (System.in);
			 formatter.format("%d %f \r\n",12345,5000.5);
			 formatter.format("%d %f \r\n",67890,6000.5);
			 System.out.println("how Many Input for Acccount__(put 0 if u dont want any input )");
			 int num=input.nextInt();
			 
			 for(int i=0;i<num;i++)
			 {
				 System.out.println("Input for Account accountNumber & balance");
				 accountNumber=input.nextInt();
				 balance=input.nextInt();
				 formatter.format("%d %f \r\n",accountNumber,balance);
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
			File file1=new File("Account.txt");
			Scanner scanner=new Scanner(file1);
			
			while(scanner.hasNext())
			{
			 
				accountNumber=scanner.nextInt();
				balance=scanner.nextDouble();
				//System.out.println("Employee's Name:"+name+"--->Employee's id:"+ empId);
				System.out.println(" Account Info...........");
				System.out.println(" Account Name: "+accountNumber);
				System.out.println(" Account ID: "+balance);
				//System.out.println(" Account salary: "+salary);
			}
			scanner.close();
		}
		catch(Exception e)
		{
			System.out.println(e);
		}
	}

    //abstract void showInfo();

    public void deposit(double amount)
    {
		Scanner input= new Scanner (System.in);
		//int amount;
		System.out.println("Enter your deposit amount---");
		amount=input.nextInt();
		if(amount>-1)
		{
        this.balance = balance;
		balance=balance+amount;
		System.out.println("Total Money : "+balance);
		}
		else
		{
			System.out.println("Invalid deposit");
		}
		
    }
    public void withdraw(double amount)
    {
		Scanner input= new Scanner (System.in);
		//int amount;
		System.out.println("Enter your withdraw amount---");
		amount=input.nextInt();
		if(amount>-1)
		{
		//double depbal;
		//this.balance = balance;
        balance=balance-amount;
			if(balance>=0)
			{
			System.out.println("After Withdraw Total Money in old account: "+balance);
			}
			else
			{
				System.out.println("Withdraw cross your limitations ");
			}
		
		}
		else
		{
			System.out.println("Invalid Withdraw");
		}
    }
    public void transfer(Account a, double amount)
    {
		if(amount>-1)
		{
		Scanner input= new Scanner (System.in);
		//int amount;
		/*System.out.println("Enter your Transfer amount---");
		amount=input.nextInt();
		System.out.println("  ---------After  transfer------"  );
		this.balance -= amount;*/
		System.out.println(" _______TRANSFER________ ");
		System.out.println(" withdraw for transfer from my account ");
        this.withdraw(amount);
		/*System.out.println("Total Money in old account "+balance  );
		//a.deposit(amount);
		this.balance = amount;
		System.out.println("Total Money in new account: "+balance);*/
		}
		else
		{
			System.out.println("Invalid Transfer");
		}
		
    }
	public void showaccountinfo()
    {
	    System.out.println("  Account Info...........");
		System.out.println("  Account Number: "+accountNumber);
		System.out.println("  Account balance: "+balance);
    }
   /* public void AccountTransactions()
  {
	    System.out.println("  AccountTransactions Info...........");
		System.out.println("  Deposit Money: "+balance);
		System.out.println("  Withdraw Money: "+balance);
    }*/

}