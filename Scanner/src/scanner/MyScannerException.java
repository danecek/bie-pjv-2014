/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package scanner;

/**
 *
 * @author danecek
 */
public class MyScannerException extends Exception {

    /**
     * Creates a new instance of <code>MyScannerException</code> without detail
     * message.
     */
    public MyScannerException() {
    }

    /**
     * Constructs an instance of <code>MyScannerException</code> with the
     * specified detail message.
     *
     * @param msg the detail message.
     */
    public MyScannerException(String msg) {
        super(msg);
    }
}
