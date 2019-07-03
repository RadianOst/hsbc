import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

class ScrabbleTest {
    @Test
    public void testIfConstructorThrowsExceptionIfInvalidWordProvided(){
        String invalidWord1 = "few words";
        String invalidWord2 = "someDigits123";
        String invalidWord3 = "./#";
        String invalidWord4 = "";

        assertThrows(RuntimeException.class, () -> {
            Scrabble scrabble = new Scrabble(invalidWord1);
        });
        assertThrows(RuntimeException.class, () -> {
            Scrabble scrabble = new Scrabble(invalidWord2);
        });
        assertThrows(RuntimeException.class, () -> {
            Scrabble scrabble = new Scrabble(invalidWord3);
        });
        assertThrows(RuntimeException.class, () -> {
            Scrabble scrabble = new Scrabble(invalidWord4);
        });
    }

    @Test
    public void testIfScoreIsCountedCorrectly(){
        String testWord1 = "cabbage";
        int expectedScore1 = 14;
        String testWord2 = "tomatoe";
        int expectedScore2 = 9;
        String testWord3 = "quiz";
        int expectedScore3 = 22;

        int actualScore1 = new Scrabble(testWord1).getScore();
        int actualScore2 = new Scrabble(testWord2).getScore();
        int actualScore3 = new Scrabble(testWord3).getScore();

        assertEquals(expectedScore1, actualScore1);
        assertEquals(expectedScore2, actualScore2);
        assertEquals(expectedScore3, actualScore3);
    }

    @Test
    public void testIfScrabbleIsCaseInsensitive() {
        String lowerCase = "test";
        String upperCase = "TEST";
        String mixCase = "tEsT";
        int expectedScore = 4;

        int lowerCaseScore = new Scrabble(lowerCase).getScore();
        int upperCaseScore = new Scrabble(upperCase).getScore();
        int mixCaseScore = new Scrabble(mixCase).getScore();

        assertEquals(expectedScore, lowerCaseScore);
        assertEquals(expectedScore, upperCaseScore);
        assertEquals(expectedScore, mixCaseScore);
    }

    @Test
    public void testIfAllLettersAreHandled() {
        String alphabet = "abcdefghijklmnopqrstuvwxyz";
        int expectedAlphabetScore = 87;

        int actualScore = new Scrabble(alphabet).getScore();

        assertEquals(expectedAlphabetScore, actualScore);
    }
}