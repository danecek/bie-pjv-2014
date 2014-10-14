/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package collections;

import java.util.Iterator;

/**
 *
 * @author danecek
 */
public class Collections {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        MyArraySet ms = new MyArraySet(1);
        System.out.println(ms);
        ms.add(new MyPoint(1, 2));
        System.out.println(ms);
        ms.add(new MyPoint(1, 3));
        System.out.println(ms);
        System.out.println("***********************");
        for (Iterator<MyPoint> it = ms.iterator(); it.hasNext();) {
            System.out.println(it.next());
        }
        System.out.println("***********************");
        for (MyPoint mp : ms) {
            System.out.println(mp);
        }
    }

}
