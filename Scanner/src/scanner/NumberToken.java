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
public class NumberToken extends Token {

    int number;

    public NumberToken(int number) {
        super(TokenEnum.NUM);
        this.number = number;
    }

    @Override
    public String toString() {
        return super.toString() + "(" + number + ")";
    }
    
    
}
