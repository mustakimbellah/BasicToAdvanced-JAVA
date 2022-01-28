
package ooppart;

public class OverLoadingTest3 {
    
    public void methodOne(int i){
        System.out.println("general method");
    }
    
    public void methodOne(int...i){
        System.out.println("var age mathoid");
    }
    
    public static void main(String[] args) {
        
        OverLoadingTest3 t = new OverLoadingTest3();
        t.methodOne();
        t.methodOne(10,20);
        t.methodOne(20);
    }
    
}
