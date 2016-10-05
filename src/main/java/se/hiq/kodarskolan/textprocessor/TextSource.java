package se.hiq.kodarskolan.textprocessor;

import java.io.IOException;

/**
 * Defines a producer of text
 */
public interface TextSource {

    boolean hasMoreContent();

    String getNextLine() throws IOException;

}
