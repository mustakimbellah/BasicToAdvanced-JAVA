
package MemberLevelModifiers;

public class FinalInstanceVariableTest {
    
    final int x;
    
    {
       
    }
    
    FinalInstanceVariableTest()
    {
        x=20;
        
    }
    
    public static void main(String[] args) {
        
        
       FinalInstanceVariableTest fi = new FinalInstanceVariableTest();
        System.out.println(fi.x);
    }
    
}
