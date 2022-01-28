
package com.java.ExceptionMechanism;

public class Throws {
    public static void main(String[] args) {
        
        try{
            
            Thread.sleep(5000);
            System.out.println("After sleep");
        }catch(InterruptedException e){
        }
    }
    
}
