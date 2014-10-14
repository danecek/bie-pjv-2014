/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package collections;

import java.util.Iterator;


public class MyArraySetIterator implements Iterator<MyPoint> {
    
    int actualElementIndex;
    MyArraySet mas;

    public MyArraySetIterator(MyArraySet mas) {
        this.mas = mas;
    }

    @Override
    public boolean hasNext() {
        return actualElementIndex < mas.size();
    }

    @Override
    public MyPoint next() {
        return mas.getData()[actualElementIndex++];
    }

    @Override
    public void remove() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
