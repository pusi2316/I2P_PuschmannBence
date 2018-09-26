/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package linkedlist_;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Felhasználó
 */
public class Stack implements IRevert{

    public LinkedList s;

    public Stack() {
        s = new LinkedList();
    }

    public boolean isEmpty() {
        if (s.ListSize == 0) {
            return true;
        } else {
        return false;
        }
    }

    public void push(String value) {
        s.Add(value);
    }

    public String pop() {
        return s.get()[0];
    }

    public void Display(){
    s.Display();
    }
    
   @Override
    public void revert() {
      s.revert();
       
    }

    @Override
    public String[] get() {
      return  s.get();
    }

}
