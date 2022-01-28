
package VariableDemo;

public class VariableTest {
    
    int x = 10;
    static int y = 20;
    
    void instanceVariableTest()
    {
        System.out.println(y);
    }
    
    public static void main(String[] args) {
        
       // System.out.println(y);
        
        VariableTest vt = new VariableTest();
       // System.out.println(vt.x);
       
       vt.x=888;
       vt.y=999;
       // System.out.println(vt.x+"...."+vt.y);
        
         VariableTest vt2 = new VariableTest();
         
          System.out.println(vt.x+"...."+vt.y);
        
        
          
          for (int i = 0; i < 10; i++) { // local value
            
              System.out.println(i);
        }
          
          
    }
    
}
