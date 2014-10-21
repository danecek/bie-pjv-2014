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
public class MySortedArraySet extends MyArraySet {

//    @Override
//    public boolean add(Object mp) {
//        boolean b = super.add(mp); //To change body of generated methods, choose Tools | Templates.
//        if (b) {
//            Arrays.sort(getData(), 0, size());
//        }
//        return b;
//    }
    @Override
    public boolean add(Object o) {
        fixCapacity();
        int i = Arrays.binarySearch(data, 0, size, o);
        int ip;
        if (i >= 0 && i < size) {
            if (data[i].equals(o)) {
                return false;
            }
            ip = i;
        } else if (i == size) {
            ip = size;
        } else {
            ip = -(i + 1);
        }
        System.arraycopy(data, ip, data, ip + 1, size - ip);
        data[ip] = o;
        size++;
        return true;
    }

    public MySortedArraySet() {
    }

    public MySortedArraySet(int capacity) {
        super(capacity);
    }

    @Override
    protected int find(Object o) {
        int i = Arrays.binarySearch(getData(), 0, size(), o);
        if (i < 0 || i >= size()) {
            return -1;
        }
        if (getData()[i].equals(o)) {
            return i;
        }
        return -1;
    }

}
