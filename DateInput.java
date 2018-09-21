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
public class DateInput extends TextInput {

    int index = 0;

    
    
    

    public boolean add(char c) {
        boolean b = true;
        if (Character.isDigit(c) && index != 4 && index != 7) {
            b = true;
            s = s + c;
            index++;
        } else if ((index == 4 && c== '.') || (index == 7 && c == '.')) {
            b = true;
            s=s +c;
            index++;
        } else {
            b = false;
        }

        return b;
    }

    @Override
    public String get() {
        return super.get(); //To change body of generated methods, choose Tools | Templates.
    }

}
