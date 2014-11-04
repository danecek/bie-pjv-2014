package scanner;

import java.io.FileReader;
import java.io.IOException;
import java.io.Reader;
import static scanner.TokenEnum.*;

public class MyScanner {

    Reader reader;
    char actualChar;

    public MyScanner(Reader reader) throws IOException {
        this.reader = reader;
        actualChar = (char) reader.read();
    }

    public boolean hasNextToken() throws MyScannerException, IOException {
        return actualChar != 0xffff;// 65535;
    }

    public Token nextToken() throws MyScannerException, IOException {
        skipWhiteSpaces();
        if (Character.isDigit(actualChar)) {
            return numberToken();
        }
        switch (actualChar) {
            case '<': {
                nextChar();
                if (actualChar == '=') {
                    nextChar();
                    return new Token(LE);
                } else {
                    return new Token(LT);
                }
            }
            case '{': {
                nextChar();
                return new Token(LBRACE);
            }
            case ',': {
                nextChar();
                return new Token(COMMA);
            }
            default:
                throw new MyScannerException("unnown character: " + actualChar);
        }
    }

    private void nextChar() throws IOException {
        actualChar = (char) reader.read();
    }

    public static void main(String[] args) throws IOException, MyScannerException {
//        MyScanner sc = new MyScanner(new StringReader("/* comment*/    ,  999  <= xxx \"yyyy\"));
        MyScanner sc = new MyScanner(new FileReader("src/scanner/MyScanner.java"));
        while (sc.hasNextToken()) {
            System.out.println(sc.nextToken());
        }
    }

    private void skipWhiteSpaces() throws IOException {
        while (Character.isWhitespace(actualChar)) {
            nextChar();
        }
    }

    private Token numberToken() throws IOException {
        int value = 0;
        while (Character.isDigit(actualChar)) {
            value *= 10;
            value += (actualChar - '0');

            nextChar();
        }
        return new NumberToken(value);
    }

}
