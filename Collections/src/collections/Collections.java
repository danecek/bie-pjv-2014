/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package collections;

import java.util.Random;
import java.util.Set;

/**
 *
 * @author danecek
 */
public class Collections {

    static void test(Set<Object> set, int exps) {
        int max = 1000;
        Random r = new Random(1);
        MyPoint[] ap = new MyPoint[exps];
        for (int i = 0; i < ap.length; i++) {
            ap[i] = new MyPoint(r.nextInt(max), r.nextInt(max));
        }
        long start = System.currentTimeMillis();
        for (MyPoint mp : ap) {
            set.add(mp);
        }
        long time = System.currentTimeMillis() - start;
        System.out.printf("#exps: %d, time: %d ms,  final size: %d\n", exps, time, set.size());

    }

    public static void main(String[] args) {
        MyArraySet mas = new MyArraySet(1);
//        System.out.println(ms);
//        ms.add(new MyPoint(1, 2));
//        System.out.println(ms);
//        ms.add(new MyPoint(1, 3));
//        System.out.println(ms);
//        System.out.println("***********************");
//        for (Iterator<MyPoint> it = ms.iterator(); it.hasNext();) {
//            System.out.println(it.next());
//        }
//        System.out.println("***********************");
//        for (MyPoint mp : ms) {
//            System.out.println(mp);
//        }
        MyOrderedArraySet moas = new MyOrderedArraySet();
//        moas.add(new MyPoint(1, 2));
//        moas.add(new MyPoint(1, 3));
//        moas.add(new MyPoint(1, 3));
//        System.out.println(moas);
        int ne = 100000;
        test(mas, ne);
        test(moas, ne);
        ne = 200000;
        test(mas, ne);
        test(moas, ne);
    }

}
