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

    NavigableMap<Integer, Collection<MyPoint>> pointMapByX = new TreeMap<>();
    Set<MyPoint> pointSet = new HashSet<>();

    void create(MyPoint mp) {
        Collection<MyPoint> colpoints = pointMapByX.get(mp.getX());
        if (colpoints == null) {
            colpoints = new HashSet<>();
            pointMapByX.put(mp.getX(), colpoints);
        }
        pointSet.add(mp);
        colpoints.add(mp);
    }

    Collection<MyPoint> getAll() {
        return new ArrayList<>(pointSet);
    }

    void delete(MyPoint mp) {
        pointSet.remove(mp);
        pointMapByX.get(mp.getX()).remove(mp);
    }

    Collection<MyPoint> findPointOnX(int x) {
        return pointMapByX.get(x);
    }

    Collection<MyPoint> findPointInArea(int xmin, int xmax, int ymin, int ymax) {
        return null;

    }

}
