package se.hiq.kodarskolan.textprocessor;

/**
 * This implementation of TextOutput uses System.out to output text
 */
public class TextOutputImpl implements TextOutput {

    public void outputString(String string) {
        System.out.println(string);
    }
}
