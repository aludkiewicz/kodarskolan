package se.hiq.kodarskolan.facit;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

/**
 * Class that will filter out Swedish characters from a text source object and
 * send it to the output channel.
 */
public class TextProcessor {


    public static final String FILE_PATH = "/Users/alud/input.txt";

    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new FileReader(FILE_PATH));
        try {
            TextProcessor processor = new TextProcessor();
            processor.processText(reader);
        } finally {
            reader.close();
        }
    }

    public void processText(BufferedReader reader) throws IOException {
          String line;
        while ((line = reader.readLine()) != null) {
            System.out.println(filterSwedishCharacters(line));
        }
    }

    private String filterSwedishCharacters(String input) {
        String output = input.replace('å', 'a');
        output = output.replace('ä', 'a');
        output = output.replace('ö', 'o');
        return output;
    }
}
