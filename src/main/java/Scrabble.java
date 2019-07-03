import java.util.HashMap;
import java.util.Map;

public class Scrabble {
    private Map<Character, Integer> letter_values = new HashMap<Character, Integer>();

    private String word;

    public Scrabble(String word) {
        for(char letter : word.toCharArray()) {
            if (! Character.isAlphabetic(letter)) {
                throw new IllegalArgumentException("Given argument is not a word.");
            }
        }

        letter_values.put('Q', 10);
        letter_values.put('Z', 10);
        letter_values.put('J', 8);
        letter_values.put('X', 8);
        letter_values.put('K', 5);
        letter_values.put('F', 4);
        letter_values.put('H', 4);
        letter_values.put('V', 4);
        letter_values.put('W', 4);
        letter_values.put('Y', 4);
        letter_values.put('B', 3);
        letter_values.put('C', 3);
        letter_values.put('M', 3);
        letter_values.put('P', 3);
        letter_values.put('D', 2);
        letter_values.put('G', 2);

        this.word = word;
    }

    public int getScore() {
        return 0;
    }
}
