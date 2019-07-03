import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class BracketChecker {
    String input;
    Map<Character, Character> matchingBrackets = new HashMap<>();

    public BracketChecker(String input){
        if (input.length() == 0){
            throw new IllegalArgumentException("Given string is empty.");
        }
        for (char sign : input.toCharArray()) {
            if (sign != '(' && sign != ')' && sign != '[' && sign != ']' && sign != '{' && sign != '}') {
                throw new IllegalArgumentException("String should constain only brackets.");
            }
        }
        this.input = input;
        matchingBrackets.put('(', ')');
        matchingBrackets.put('[', ']');
        matchingBrackets.put('{', '}');
    }

    public boolean areBracketsMatchedAndNestedCorrectly() {
        int openingBracketsCount = 0;
        int closingBracketsCount = 0;
        char lastOpeningBracket = '-';

        for (char bracket : input.toCharArray()) {
            if (bracket == '(' || bracket == '[' || bracket == '{') {
                openingBracketsCount += 1;
                lastOpeningBracket = bracket;
            } else {
                closingBracketsCount += 1;
                if (closingBracketsCount > openingBracketsCount) {
                    return false;
                }
                if (matchingBrackets.get(lastOpeningBracket) != bracket) {
                    return false;
                }
            }
        }

        return true;
    }
}
