
package ObjectOrientedProgramming;

public class OverLoadingTest3 {
    
    public void methodOne(int i){
    
        System.out.println("general method");
    }
    
    public void methodOne(int...i){
    
        System.out.println("var-arg method");
    }
    
    public static void main(String[] args) {
        
        OverLoadingTest3 t = new OverLoadingTest3();
        
        t.methodOne();  // var arg method
        t.methodOne(20,30); // var arg method
        t.methodOne(20); // genrea method
    }
    
    
}
