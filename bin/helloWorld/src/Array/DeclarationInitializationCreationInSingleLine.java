
package Array;


public class DeclarationInitializationCreationInSingleLine {
    
    public static void main(String[] args) {
        
      /*  int []a; // array declaration
        a= new int[5]; // creation
        a[0]=10; // initialization

        */
      
      int [] a = {10,20,30}; //---one line 
      
        System.out.println(a[0]);
        
        int [][][] b ={{{10,20,30},{40,50}},{{60},{70,80},{90,100,110}}};
        System.out.println(b[0][1][0]);
        
    }
    
}
