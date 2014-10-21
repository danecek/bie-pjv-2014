/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package streams;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;
import java.util.NavigableMap;
import java.util.Set;
import java.util.TreeMap;

/**
 *
 * @author danecek
 */
public class MyPointDAO {

    NavigableMap<Integer, Collection<MyPoint>> nm = new TreeMap<>();
    Set<MyPoint> pointset = new HashSet<>();

    void create(MyPoint mp) {
        Collection<MyPoint> colpoints = nm.get(mp.getX());
        if (colpoints == null) {
            colpoints = new HashSet<>();
            nm.put(mp.getX(), colpoints);
        }
        pointset.add(mp);
        colpoints.add(mp);
    }

    Collection<MyPoint> getAll() {
        return new ArrayList<>(pointset);
    }

    void delete(MyPoint mp) {
        pointset.remove(mp);
        nm.get(mp.getX()).remove(mp);
    }

    Collection<MyPoint> findPointOnX(int x) {
        return nm.get(x);
    }

    Collection<MyPoint> findPointInArea(int xmin, int xmax, int ymin, int ymax) {
        return null;

    }

}
