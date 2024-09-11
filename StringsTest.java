import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class StringsTest {

    @Test
    public void testGetStringLength() {
        // Test case 1: Length of "Hello"
        String s1 = "Hello";
        int length1 = Strings.getStringLength(s1);
        assertEquals(5, length1);

        // Test case 2: Length of " World"
        String s2 = " World";
        int length2 = Strings.getStringLength(s2);
        assertEquals(6, length2);
    }

    @Test
    public void testGetSubstring() {
        // Test case 1: Substring of "Hello" from index 1 to 4
        String s1 = "Hello";
        String substring1 = Strings.getSubstring(s1, 1, 4); // Extract substring from index 1 to 3
        assertEquals("ell", substring1);

        // Test case 2: Substring of " World" from index 1 to 4
        String s2 = " World";
        String substring2 = Strings.getSubstring(s2, 1, 4); // Extract substring from index 1 to 3
        assertEquals("Wor", substring2);
    }

    @Test
    public void testConcatenateStrings() {
        // Test case 1: Concatenating "Hello" and " World"
        String s1 = "Hello";
        String s2 = " World";
        String concatenatedString = Strings.concatenateStrings(s1, s2);
        assertEquals("Hello World", concatenatedString);

        // Test case 2: Concatenating "Good" and " Morning"
        String s3 = "Good";
        String s4 = " Morning";
        String concatenatedString2 = Strings.concatenateStrings(s3, s4);
        assertEquals("Good Morning", concatenatedString2);
    }

    @Test
    public void testGetCharAtIndex() {
        // Test case 1: Character at index 1 of "Hello"
        String s1 = "Hello";
        char charAtIndex1 = Strings.getCharAtIndex(s1, 1); // Character at index 1
        assertEquals('e', charAtIndex1);

        // Test case 2: Character at index 1 of " World"
        String s2 = " World";
        char charAtIndex2 = Strings.getCharAtIndex(s2, 1); // Character at index 1
        assertEquals('W', charAtIndex2);
    }
}
