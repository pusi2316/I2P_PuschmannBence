/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package task3;

/**
 *
 * @author Felhasználó
 */
public class NumericInput extends TextInput {

    

  //private static  String s = "";
    

    
    
  

    public boolean add(char c) {
        boolean b = true;
        if (Character.isDigit(c)) {
            b = true;
            s=s+c;
        } else {
            b=false;   
        }
        return b;
    }

    @Override
    public String get() {
        return super.get(); 
    }

   

  
    
    
}
