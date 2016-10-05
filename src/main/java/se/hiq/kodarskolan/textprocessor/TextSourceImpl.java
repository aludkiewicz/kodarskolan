package se.hiq.kodarskolan.textprocessor;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/**
 * File-based implementation of the TextSource interface.
 */
public class TextSourceImpl implements TextSource {


    private Iterator<String> iterator;

    public TextSourceImpl() throws IOException {
        BufferedReader reader = new BufferedReader(new FileReader("C:\\data\\input.txt"));
        List<String> lines = new ArrayList<String>();
        String line;
        while ((line = reader.readLine()) != null) {
            lines.add(line);
        }
        iterator = lines.iterator();
    }

    public boolean hasMoreContent() {
        return iterator.hasNext();
    }

    public String getNextLine() throws IOException {
        return iterator.next();
    }
}
