
package ObjectOrientedProgramming;

public class OverLoadingTest2 {
    
    public void methodOne(String s){
    
        System.out.println("String version");
    }
    
    public void methodOne(Object o){   //both methods are said to be overloaded methods
    
        System.out.println("Object version");
        
    }
    
    public static void main(String[] args) {
        
        OverLoadingTest2 t  = new OverLoadingTest2();
        
        t.methodOne("java"); // string version
        t.methodOne(new Object()); // object version
        t.methodOne(null);// string version
        
        
    }
    
}
