/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package collections;

import java.util.Iterator;
import java.util.Random;

/**
 *
 * @author danecek
 */
public class Collections {

    static void testSet(MyArraySet ms, int count) {
        Random r = new Random();
        MyPoint[] ar = new MyPoint[count];
        for (int i = 0; i < ar.length; i++) {
            ar[i] = new MyPoint(r.nextInt(), r.nextInt());
        }
        long start = System.currentTimeMillis();
        for (MyPoint mp : ar) {
            ms.add(mp);
        }
        System.out.printf("%s: size = %d, time = %d ms,\n", ms.getClass().getSimpleName(), ms.size, System.currentTimeMillis() - start);
    }

    public static void main(String[] args) {
        int count = 50000;
        testSet(new MyArraySet(), count);
        testSet(new MySortedArraySet(), count);

//        MyArraySet ms = new MyArraySet(1);
//        int count = 50000;
//        long start = System.currentTimeMillis();
//        for (int i = 0; i < count; i++) {
//            ms.add(new MyPoint(i, i));
//            ms.add(new MyPoint(i, i));
//        }
//        System.out.printf("MyArraySet: size = %d, time = %d ms,\n", ms.size, System.currentTimeMillis() - start);
//
//        ms = new MySortedArraySet(1);
//        start = System.currentTimeMillis();
//        for (int i = 0; i < count; i++) {
//            ms.add(new MyPoint(i, i));
//            ms.add(new MyPoint(i, i));
//
//        }
//        System.out.printf("MySortedArraySet: size = %d, time = %d ms,\n", ms.size, System.currentTimeMillis() - start);
//        System.out.println(ms);
//        ms.add(new MyPoint(1, 1));
//        ms.add(new MyPoint(1, 1));
//        System.out.println(ms);
//        ms.add(new MyPoint(3, 1));
//        ms.add(new MyPoint(3, 1));
//        ms.add(new MyPoint(2, 1));
//        ms.add(new MyPoint(2, 1));
//        System.out.println(ms);
//        System.out.println("***********************");
//        for (Iterator<Object> it = ms.iterator(); it.hasNext();) {
//            System.out.println(it.next());
//        }
//        System.out.println("***********************");
//        for (Object mp : ms) {
//            System.out.println(mp);
//        }
    }

}
