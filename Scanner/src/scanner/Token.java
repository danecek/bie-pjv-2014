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
public class Token {

    public Token(TokenEnum te) {
        this.te = te;
    }
    TokenEnum te;

    @Override
    public String toString() {
        return te.toString();
    }
    
    
}
