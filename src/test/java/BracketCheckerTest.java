import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class BracketCheckerTest {
    @Test
    public void checkIfConstructorThrowsExceptionWhenInvalidArgumentProvided() {
        String invalidArgument1 = "";
        String invalidArgument2 = "[]a";
        String invalidArgument3 = "(1)";

        assertThrows(RuntimeException.class, () -> new BracketChecker(invalidArgument1));
        assertThrows(RuntimeException.class, () -> new BracketChecker(invalidArgument2));
        assertThrows(RuntimeException.class, () -> new BracketChecker(invalidArgument3));
    }
}