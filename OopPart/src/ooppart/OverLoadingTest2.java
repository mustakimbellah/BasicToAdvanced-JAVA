
package ooppart;


public class OverLoadingTest2 {
    
    public void methodOne(String s){
    
        System.out.println("String versiton");
    }
    
    public void methodOne(Object o){
    
        System.out.println("Object versiton");
    }
    
    public static void main(String[] args) {
        
        OverLoadingTest2 t = new OverLoadingTest2();
        t.methodOne("java");
        t.methodOne(new Object());
        t.methodOne(null);
        
    }
    
    
}
