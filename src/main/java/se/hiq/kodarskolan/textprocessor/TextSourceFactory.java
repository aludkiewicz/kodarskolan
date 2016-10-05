package se.hiq.kodarskolan.textprocessor;

import java.io.IOException;

/**
 * A factory for TextSource objects.
 */
public class TextSourceFactory {

    private static TextSourceFactory instance = new TextSourceFactory();

    public static TextSourceFactory instance() {
        return instance;
    }

    public TextSource makeTextSource() throws IOException {
        return new TextSourceImpl();
    }
}
