
package VariableDemo;

public class VarArgTest {
    
    public static void addition(int... x)
    {
        int total = 0;
        int size=x.length;
        
        for (int i = 0; i <size; i++) {
            
            total = total +x[i];
              
        }
        
        System.out.println("output is = "+total);
    }
    
    public static void main(String[] args) {
        
        addition(10,20);
        addition(10,20,40);
        addition(10,20,30,40,50,60,70);
        addition();
    }
    
}
