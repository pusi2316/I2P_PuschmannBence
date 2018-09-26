/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication2;

import java.util.Vector;

/**
 *
 * @author Felhasználó
 */
public class JavaApplication2 {

    public static String chars = "qwertzuiopasdfghjklyxcvbnmQWERTZUIOPASDFGHJKLYXCVBNM*.";
    char[] t = chars.toCharArray();

    public static int shorter(String a, String b) {
        if (a.length() < b.length()) {
            return a.length();
        } else if (a.length() > b.length()) {
            return b.length();
        } else {
            return a.length();
        }
    }

    public static boolean ReplaceWithStar1(String a, String b) {
        boolean bool = false;
        int i = 0;
        if (a.contains("*")) {
            while (a.charAt(i) != '*' && i < shorter(a, b)) {
                if (a.charAt(i) == '.' || a.charAt(i) == b.charAt(i)) {
                    bool = true;
                } else {
                    bool = false;
                    break;
                }
                i++;

            }

            int NumbersLeft = 0;
            for (int k = i + 1; k < a.length(); k++) {
                NumbersLeft++;
            }

            int k = i + 1;

            while (k < a.length() && k < b.length()) {

                if (a.charAt(k) == '.' || (a.charAt(k) == b.charAt(b.length() - NumbersLeft))) {
                    bool = true;
                } else {
                    bool = false;
                    break;
                }
                k++;
                NumbersLeft--;
            }

        }

        return bool;
    }

    public static boolean SameCharsOrReplace(String a, String b) {
        boolean bool = false;
        int i = 0;

        while (i < a.length()) {

            if (a.length() != b.length()) {
                bool = false;
                break;
            }
            if (a.charAt(i) == '.' || a.charAt(i) == b.charAt(i)) {
                bool = true;
            } else {
                bool = false;
                break;
            }
            i++;
        }
        
        return bool;
    }

    public static boolean SpecChars(String a, String b) {
        boolean bool = false;
        for (int i = 0; i < a.length(); i++) {
            if (chars.contains(a.substring(i, i+1))) {
                bool = true;

            } else {
                bool = false;
                break;
            }
        }
        return bool;
    }

    public static boolean StringComp(String a, String b) {
        boolean bool = false;
        if (SpecChars(a, b) == true) {
            if (SameCharsOrReplace(a, b)) {

                bool = true;

            } else {
                bool = false;
            }
            
            if (ReplaceWithStar1(a, b)) {
                bool = true;
            } 
           if (a.length() > b.length() && a.charAt(a.length() - 1) != '*') {
                bool = false;
            }
        } else {
            System.out.println("érvénytelen karakter");
        }
        return bool;
    }

    public static void main(String[] args) {
        boolean b = StringComp("B*", "Budapest");
        /*System.out.println(SameChars("B.dapest", "Budapest"));
        System.out.println(Replace("B.dapest", "Budapest"));
        System.out.println(SameLength("B.dapest", "Budapest"));*/
        System.out.println(b);
    }

}
