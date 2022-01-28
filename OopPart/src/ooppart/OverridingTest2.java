
package ooppart;

public class OverridingTest2 extends OverridingTest1{
    
    @Override
    public void marry(){
    
        System.out.println("Second Wife");
    }
    
    public static void main(String[] args) {
        
        OverridingTest1 ot = new OverridingTest1();
        ot.marry();
        
        OverridingTest2 ot2 = new OverridingTest2();
        ot2.marry();
        
    }
}
