interface ITransactions //implements Account
{
    public void deposit(double amount);
    public void withdraw(double amount);
    public void transfer(Account a, double amount);
  
}