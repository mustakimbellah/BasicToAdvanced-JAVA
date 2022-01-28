
package testImport;
import testPackage.PackageDemo;
import java.lang.Math;



public class demoImport {
    
    public static void main(String[] args) {
        
        PackageDemo pdemo = new PackageDemo();
        
        pdemo.methodM1();
        
        int x = 9;
        System.out.println(Math.sqrt(x));
    }
    
    
}
