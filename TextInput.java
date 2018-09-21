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
public class TextInput {

    protected static String s = "";

    public boolean add(char c) {
        boolean b = true;
       
        s = s + c;
        return b;
    }

    public String get() {
        return s;
    }
}
