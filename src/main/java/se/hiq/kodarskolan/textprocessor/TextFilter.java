package se.hiq.kodarskolan.textprocessor;

import java.util.HashMap;
import java.util.Map;

/**
 * This class filters strings by replacing any number of characters
 */
public class TextFilter {

    private Map<Character, Character> replacements = new HashMap<Character, Character>();

    public void addReplacement(char from, char to) {
        replacements.put(from, to);
    }

    public void removeReplacement(char from) {
        replacements.remove(from);
    }

    public String filterString(String input) {
        String temp = input;
        for (Character character : replacements.keySet()) {
             temp = temp.replace(character, replacements.get(character));
        }
        return temp;
    }

}
