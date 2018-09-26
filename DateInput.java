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
        if (index < 10) {
            if (Character.isDigit(c) && index != 4 && index != 7 && index != 5 && index != 6 && index != 8 && index != 9) {
                b = true;
                s = s + c;
                index++;

            } else if (Character.isDigit(c) && index == 5 && (c == '0' || c == '1')) {
                b = true;
                s = s + c;
                index++;
            } else if (Character.isDigit(c) && index == 6 && (c == '0' || c == '1' || c == '2')) {
                b = true;
                s = s + c;
                index++;
            } else if (Character.isDigit(c) && index == 8 && (c == '0' || c == '1' || c == '2' || c == '3')) {
                b = true;
                s = s + c;
                index++;
            } else if (Character.isDigit(c) && index == 9) {
                if (s.charAt(8) == '3') {
                    if (c == '0' || c== '1'){
                    b = true;
                    s = s + c;
                    index++;
                    }
                } else {
                    b = true;
                    s = s + c;
                    index++;
                }
            } else if ((index == 4 && c == '.') || (index == 7 && c == '.')) {
                b = true;
                s = s + c;
                index++;
            } else {
                b = false;
            }
        }

        return b;
    }

    @Override
    public String get() {
        return super.get(); //To change body of generated methods, choose Tools | Templates.
    }

}


