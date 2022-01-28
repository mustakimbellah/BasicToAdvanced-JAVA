
package com.java.Enum;


public class EnumTest2 {
    public static void main(String[] args) {
        
        EnumTest et = EnumTest.BMW;
        
       // System.out.println(et);
       
       EnumTest [] et2 = EnumTest.values();
       
        for (int i = 0; i < et2.length; i++) {
            
            System.out.println(et2[i]);
        }
        
        for(EnumTest et3: EnumTest.values())
        {
            System.out.println(et3+" *** "+et3.ordinal());
        }
        
        EnumTest ret = et.valueOf("BMW");
        {
            System.out.println(ret);
        }
       
    }
    
}
