
package com.java.ExceptionMechanism;


public class MultiCatchEx1 {
    
    public static void main(String[] args) {
        
        try{
            int arr[] = new int [6];
            arr[7] = 20/2; // excemption occurred
            
            System.out.println("I am in try block");
        }catch(ArithmeticException ae){
            System.out.println("A number cannot be divided by zero. illegal operation in java");
        }catch(ArrayIndexOutOfBoundsException e){
            System.out.println("Accessing array element outside of specified limit");
        }catch(Exception e){
        
            System.out.println(e.getMessage());
        }
        System.out.println("i am out of try catch block");
    }
    
}
