
package FlowControl;

public class PrimeNumberCheck {
    
    public static boolean checkprime(int numberToCheck){
    
       int remainder;
        for (int i = 2; i <numberToCheck; i++) {
            
            remainder = numberToCheck%i;
            if(remainder==0)
            {
                return false;
            }
            
        }
        
        return true;
    }
    
    public static void main(String[] args) {
        
        int x=50;
        boolean status=checkprime(x);
        
        if(status==true)
        {
            System.out.println(x+" is a prime number");
        }
        else
        {
            System.out.println(x+" is not a prime number");
        }
        
    }
}
