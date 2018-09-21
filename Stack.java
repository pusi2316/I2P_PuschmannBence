/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Task2_Maven;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Felhasználó
 */
public class Stack implements IRevert {

    public List<String> s;

    public Stack() {
        s = new ArrayList<>();
    }

    public boolean isEmpty() {
        return s.isEmpty();
    }

    public void push(String value) {
        s.add(value);
    }

    public String pop() {
        return s.remove(0);
    }

    @Override
    public void revert() {
        String[] t = new String[s.size()];
        int j = s.size();
        for (int i = 0; i < s.size(); i++) {
            t[j-1] = s.get(i);
           
           
            j--;
        }
       
        s.removeAll(s);
        for (int i = 0; i < t.length; i++) {
            s.add(t[i]);
        
        }
       
    }

    @Override
    public String[] get() {
    String[] t= new String[s.size()];
        for (int i = 0; i < s.size(); i++) {
            t[i]=s.get(i);
        }
    return t;
    }

}
