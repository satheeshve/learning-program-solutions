import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

public class StringUtilsTest {

    public boolean isPalindrome(String str) {
        return new StringBuilder(str).reverse().toString().equalsIgnoreCase(str);
    }

    @ParameterizedTest
    @ValueSource(strings = { "madam", "racecar", "level" })
    void testPalindrome(String word) {
        assertTrue(isPalindrome(word));
    }
}
