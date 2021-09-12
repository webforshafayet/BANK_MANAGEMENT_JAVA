public class Bank implements CustomerOperations,EmployeeOperations
{
	Customer[] customers;
	Employee[] employees;
	protected int totalcustomers=0;
	protected int totalemployees=0;
	
	public  Employee getEmployee(String empId)
    {
        for(Employee EmployeeObject : employees)
        {
            if(empId == EmployeeObject.getEmpId())
            {
                return EmployeeObject;
            }
        }

        return null;
    }
	public  Bank(int no)
	{
		employees=new Employee[no];
		customers=new Customer[no];
		//System.out.println("Valued Constructor in Bank");
	}	
public void insertCustomer(Customer c)
{
		if(totalcustomers<customers.length)
		{
			customers[totalcustomers]=c;
			totalcustomers++;
		}
		else
		{
			System.out.println("WE HAVE MAXIMUM  CUSTOMER");
		}

	  
}
public void removeCustomer(Customer c)
{
		if(totalcustomers>0)
		{
			//customers[totalcustomers]=c;
			totalcustomers--;
		}
		else
		{
			System.out.println("WE HAVE MINIMUM  CUSTOMER");
		}
	
}
public int getCustomer(int nid)
{
	return nid;
}
public void showAllCustomers( )
{
	for(int i=0;i<totalcustomers;i++)
		{
			customers[i].showcustomerinfo();
		}
	
}
 public void insertEmployee(Employee e)
	{
		if(totalemployees<employees.length)
		{
			employees[totalemployees]=e;
			totalemployees++;
		}
		else
		{
			System.out.println("WE HAVE MAXIMUM EMPLOYEE");
		}
	}	
public void removeEmployee(Employee e)
{
	{
		if(totalemployees>0)
		{
			employees[totalemployees]=e;
			totalemployees--;
		}
		else
		{
			System.out.println("WE HAVE MINIMUM EMPLOYEE");
		}
	}
}

public void showAllEmployees()
{
		for(int i=0;i<totalemployees;i++)
		{
			employees[i].showemployeeinfo();
		}
	
}
	
}