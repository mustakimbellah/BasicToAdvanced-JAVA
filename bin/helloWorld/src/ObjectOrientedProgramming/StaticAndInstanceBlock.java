
package ObjectOrientedProgramming;


public class StaticAndInstanceBlock {
    
    static int counter;
    
    
    {
        counter++;
    }
    
    public static void main(String[] args) {
        
        StaticAndInstanceBlock ob1 = new StaticAndInstanceBlock();
        StaticAndInstanceBlock ob2 = new StaticAndInstanceBlock();
        StaticAndInstanceBlock ob3 = new StaticAndInstanceBlock();
        System.out.println(counter);
        
    }
    
}
