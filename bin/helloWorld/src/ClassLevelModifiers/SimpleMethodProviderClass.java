
package ClassLevelModifiers;
import MemberLevelModifiers.MemberPublic;

public class SimpleMethodProviderClass {
   
    
    public static void methodM1()
    {
        System.out.println("Hello Boss.. I'm default class");
    }

    public static void main(String[] args) {
        
        
        MemberPublic mp = new MemberPublic();
        mp.methodM1();
        
        int m3 = mp.m2;
        
    }
    
    
 //   AbstractDemonstration ad = new AbstractDemonstration();
    
    
}
