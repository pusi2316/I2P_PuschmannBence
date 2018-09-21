/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Task2_Maven;

import java.util.concurrent.ThreadLocalRandom;

/**
 *
 * @author Felhasználó
 */
public class LinkedList implements IRevert{

    public Node head;
    public int ListSize;

    public LinkedList() {
        head = null;
    }

    public void Add(String value) {
        Node node = new Node();

        node.value = value;
        node.Next = null;
        if (head == null) {
            head = node;

        } else {
            Node p = new Node();
            p = head;
            while (p.Next != null) {
                p = p.Next;
            }
            p.Next = node;
        }
        ListSize++;
    }

    public void Remove(int index) {
        Node p = head;
        Node e = null;
        int i = 0;
        while ((p != null) && i != index) {
            e = p;
            p = p.Next;
            i++;
        }
        if (p != null) {
            if (e == null) {
                head = p.Next;
            } else {
             e.Next=p.Next;   
            }
        }
    }

    public void Display() {
        Node p = new Node();
        p = head;
        while (p != null) {
            System.out.print(p.value +" ");
            p = p.Next;
        }
    }

    /*@Override
    public void revert() {
        Node node = new Node();
        node = head;
        Node PrevNode= null;
        Node CurrentNode= node;
        Node next = null;
        while (CurrentNode != null){
        next = CurrentNode.Next;
        CurrentNode.Next=PrevNode;
        PrevNode=CurrentNode;
        CurrentNode = next;
             
        }
        node = PrevNode;
    }*/
    
       public void revert() {
        Node node = new Node();
        node = head;
        Node PrevNode= null;
        //Node CurrentNode= node;
        Node next = null;
        while (node != null){
            next = node.Next;
            node.Next = PrevNode;
            PrevNode=node;
            node= next;
            
            
        }
      head=PrevNode;
    }



    @Override
    public String[] get() {
        String[] t=new String[ListSize];
        Node p=new Node();
        p=head;
        int i=0;
        while  (p !=null){
        t[i] = p.value;
        p=p.Next;
        i++;
        }
        return t;
    }

}
