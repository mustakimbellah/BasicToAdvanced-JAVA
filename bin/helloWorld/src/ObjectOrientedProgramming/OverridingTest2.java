
package ObjectOrientedProgramming;


public class OverridingTest2 extends OverridingTest1{

   @Override
    public void marry(){
    
        System.out.println("secondWife"); // overriding
    }
 
    public static void main(String[] args) {
        OverridingTest1 ot = new OverridingTest1();
        ot.marry();
        OverridingTest1 ot2 =new  OverridingTest2();
        ot2.marry();
    }
}