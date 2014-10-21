/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package collections;

import java.util.Arrays;

/**
 *
 * @author danecek
 */
public class MyOrderedArraySet extends MyArraySet {

    @Override
    public boolean add(MyPoint mp) {
        fixCapacity();
        MyPoint[] data = getData();
        int index = Arrays.binarySearch(data, 0, size, mp);
        if (index >= 0 && index < size) {
            if (data[index].equals(mp)) {
                return false;
            }
        }
        int insertionPoint = -(index + 1);
        System.arraycopy(data, insertionPoint, data, insertionPoint + 1, size - insertionPoint);
        data[insertionPoint] = mp;
        size++;
        return true;
    }

    @Override
    public boolean contains(Object o
    ) {
        MyPoint[] data = getData();
        int index = Arrays.binarySearch(data, 0, size, o);
        if (index >= 0 && index < size()) {
            if (data[index].equals(o)) {
                return true;
            }
        }
        return false;
    }

}
