/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package linkedlist_;
import java.util.ArrayList;
import java.util.List;

public class Program {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        LinkedList Linked = new LinkedList();
        Linked.Add("adsa");
        Linked.Add("e");
        Linked.Add("fsdfsdf");
        Linked.Add("rwerew");
         Linked.Add("fsdfsdfjhgjhgjg");
        Linked.Add("rwerewfdsfdsfsd");
        Linked.Display();
        System.out.println("");
        Linked.revert();
        Linked.Display();
        System.out.println("");
       for (int i = 0; i < Linked.get().length; i++) {
            System.out.print(Linked.get()[i]+" ");
        }
        System.out.println("");
       Stack s=new Stack();
        s.push("fsdfs");
        s.push("fdvdsfsd");
        s.push("ffsdfsdfdfs");
        s.Display();
        
        System.out.println("");
       s.revert();
       
       s.Display();
        System.out.println("");
        for (int i = 0; i < s.get().length; i++) {
            System.out.println(s.get()[i]);
            
        }
        System.out.println(s.pop());
       
        
    }
    
}
