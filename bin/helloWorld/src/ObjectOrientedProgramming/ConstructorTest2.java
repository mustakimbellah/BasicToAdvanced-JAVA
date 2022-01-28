
package ObjectOrientedProgramming;

public class ConstructorTest2 extends ConstructorTest{
    
    ConstructorTest2(){
    
        this(10,20);
        System.out.println("Child class constructor ");
    }
    
    ConstructorTest2(int x, int y)
    {
        super(10,20);
        System.out.println(x+y);
    }
    
    public static void main(String[] args) {
        
        ConstructorTest2 ct = new ConstructorTest2();
        
    }
    
}
