package collections;

import java.util.Collection;
import java.util.Iterator;
import java.util.Set;

public class MyArraySet implements Set<Object> {

    protected Object[] data;
    protected int size;

    public MyArraySet(int capacity) {
        data = new MyPoint[capacity];
    }

    public MyArraySet() {
        this(1000);
    }

    @Override
    public int size() {
        return size;
    }

    @Override
    public boolean isEmpty() {
        return size == 0;
    }

    @Override
    public boolean contains(Object o) {
        return find(o) != -1;
    }

    @Override
    public Iterator<Object> iterator() {
        return new MyArraySetIterator(this);
    }

    @Override
    public Object[] toArray() {
        Object[] ao = new Object[size];
        System.arraycopy(data, 0, ao, 0, size);
        return ao;
    }

    @Override
    public <T> T[] toArray(T[] ts) {
//        Arrays.
//        Object[] a = ts.getClass().newInstance();
        return null;
    }

    public boolean full() {
        return size == data.length;
    }

    protected void fixCapacity() {
        if (full()) {
            int newCapacity = (int) (data.length * 1.5) + 1;
            MyPoint[] newData = new MyPoint[newCapacity];
            System.arraycopy(data, 0, newData, 0, size);
            data = newData;
        }
    }

    @Override
    public boolean add(Object mp) {
        if (contains(mp)) {
            return false;
        }
        fixCapacity();
        data[size++] = mp;
        return true;
    }

    protected int find(Object o) {
        for (int i = 0; i < size; i++) {
            if (data[i].equals(o)) {
                return i;
            }
        }
        return -1;
    }

    @Override
    public boolean remove(Object o) {
        int i = find(o);
        if (i == -1) {
            return false;
        }
        data[i] = data[--size];
        data[size] = null;
        return true;
    }

    @Override
    public boolean containsAll(Collection<?> clctn) { // !!! O(m * n)
        for (Object mp : clctn) {
            if (!contains(mp)) {
                return false;
            }
        }
        return true;
    }

    @Override
    public boolean addAll(Collection<? extends Object> c) {
        boolean changed = false;
        for (Object mp : c) {
            changed |= add(mp);
        }
        return changed;
    }

    @Override
    public boolean retainAll(Collection<?> clctn) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public boolean removeAll(Collection<?> clctn) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void clear() {
        for (int i = 0; i < size; i++) {
            data[i] = null;
        }
        size = 0;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder("[");
        for (int i = 0; i < size; i++) {
            sb.append(data[i]);
            if (i < size - 1) {
                sb.append(", ");
            }
        }
        return sb.append(']').toString();
    }

    public Object[] getData() { // reveal private contract !!!
        return data;
    }

}
