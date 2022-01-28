
package ooppart;


public class SimpleGetterAndSetter {
    
   private int balance = 80;
    
    public int getBalance()
    {
        return balance;
    }
    
    public void setBalance(int value)
    {
        if(value<10 || value>100)
        {
            System.out.println("Value out of range");
        }
        else
        {
            this.balance=value;
        }
        
    }
    
}
