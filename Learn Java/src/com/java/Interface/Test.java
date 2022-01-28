
package com.java.Interface;

import java.io.Serializable;


public class Test implements Right,Left,Serializable,Cloneable{

    @Override
    public void methodOne() {
        
    }

    @Override
    public void methodOne(int x) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
