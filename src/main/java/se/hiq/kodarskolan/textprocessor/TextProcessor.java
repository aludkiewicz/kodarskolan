package se.hiq.kodarskolan.textprocessor;

import java.io.IOException;

/**
 * Class that will filter out Swedish characters from a text source object and
 * send it to the output channel.
 */
public class TextProcessor extends TextSourceFactory {

    public static void main(String[] args) throws IOException {
        TextSource source = TextSourceFactory.instance().makeTextSource();
        TextFilter filter = new TextFilter();
        filter.addReplacement('å', 'a');
        filter.addReplacement('ä', 'a');
        filter.addReplacement('ö', 'o');
        TextOutput out = new TextOutputImpl();
        while (source.hasMoreContent()) {
            String filteredString = filter.filterString(source.getNextLine());
            out.outputString(filteredString);
        }
    }
}
