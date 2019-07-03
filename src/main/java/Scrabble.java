import java.util.HashMap;
import java.util.Map;

public class Scrabble {
    private Map<Character, Integer> letter_values = new HashMap<Character, Integer>();

    private String word;

    public Scrabble(String word) {
        if (word.length() == 0) {
            throw new IllegalArgumentException("Argument should not be an empty string.");
        }
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
        letter_values.put('A', 1);
        letter_values.put('E', 1);
        letter_values.put('I', 1);
        letter_values.put('O', 1);
        letter_values.put('U', 1);
        letter_values.put('L', 1);
        letter_values.put('N', 1);
        letter_values.put('R', 1);
        letter_values.put('S', 1);
        letter_values.put('T', 1);

        this.word = word;
    }

    public int getScore() {
        int score = 0;

        for(char letter : word.toCharArray()) {
            score += letter_values.get(Character.toUpperCase(letter));
        }
        
        return score;
    }
}
