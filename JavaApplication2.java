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



    public static boolean ReplaceWithStar(String a, String b) {
        boolean bool = false;
        int i = 0;
        if (a.contains("*")) {
            while (a.charAt(i) != '*') {
                if (a.charAt(i) == '.' || a.charAt(i) == b.charAt(i)) {
                    bool = true;
                }
                i++;
            }
            int NumbersLeft = 0;
            for (int k = i+1; k < a.length(); k++) {
                NumbersLeft++;
            }
            int k = i +1;
            while (k < a.length() && k < b.length()) {

                if (a.charAt(k) == '.' || (a.charAt(k) == b.charAt(b.length() - NumbersLeft))) {
                    bool = true;
                } else {
                    bool = false;
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

    public static boolean StringComp(String a, String b) {
        boolean bool = false;

        if (SameCharsOrReplace(a, b)) {

            bool = true;
        } else {
            bool = false;
        }
        if (ReplaceWithStar(a, b)) {
            bool = true;
        }

        return bool;
    }

    public static void main(String[] args) {
        boolean b = StringComp("B.dap*", "Budapest");
        /*System.out.println(SameChars("B.dapest", "Budapest"));
        System.out.println(Replace("B.dapest", "Budapest"));
        System.out.println(SameLength("B.dapest", "Budapest"));*/
        System.out.println(b);
    }

}
