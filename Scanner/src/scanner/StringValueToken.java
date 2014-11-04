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
public class StringValueToken extends Token {

    String value;

    public StringValueToken(TokenEnum te, String value) {
        super(te);
        this.value = value;
    }

}
