
package com.java.ExceptionMechanism;

public class Test {
    public static void main(String[] args) {
        
        try{
            
            System.out.println("try block executed");
            System.out.println(10/0);
        }catch(ArithmeticException e){  // NullPointerException....
        
            System.out.println("catch block executed");
        }finally{
        
            System.out.println("finally block executed");
        }
    }
    
}
