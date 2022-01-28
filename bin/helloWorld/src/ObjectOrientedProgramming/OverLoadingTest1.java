
package ObjectOrientedProgramming;

public class OverLoadingTest1 {
    
    public void methodOne(){
    
        System.out.println("No-arg method");
    }
    
     public void methodOne(int i){
    
        System.out.println("int-arg method"); // overloading Method
    }
     
      public void methodOne(double d){
    
        System.out.println("double-arg method");
    }
      
      public static void main(String[] args) {
       
          OverLoadingTest1 t = new OverLoadingTest1();
          t.methodOne();
          t.methodOne(10);
          t.methodOne(10.5);
          
          
    }
    
}
