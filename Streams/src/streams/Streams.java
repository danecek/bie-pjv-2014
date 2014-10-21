/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package streams;

/**
 *
 * @author danecek
 */
public class Streams {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        MyPointDAO myPointDAO = new MyPointDAO();
        myPointDAO.create(new MyPoint(1, 2));
        myPointDAO.create(new MyPoint(1, 3));
        myPointDAO.create(new MyPoint(2, 3));
        System.out.println(myPointDAO.getAll());
        System.out.println(myPointDAO.findPointOnX(1));
        myPointDAO.delete(new MyPoint(1, 3));
        System.out.println(myPointDAO.getAll());
        System.out.println(myPointDAO.findPointOnX(1));
    }
    
}
