package assignment1;

import org.junit.Assert;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class StringHandlerTest {

    StringHandler sh = new StringHandler();
    @Test
    void removeChar() {
        assertEquals("Heo",sh.removeChar("Hello","l"));
    }

    @Test
    void countChar() {

        assertEquals(2, sh.countChar("Hello","l"));
    }

    @Test
    void isAnagram() {
        assertTrue(sh.isAnagram("abc", "cab"));
    }

    @Test
    void isPalindromeTrue() {
        assertTrue(sh.isPalindrome("racecar"));
    }

    @Test
    void isPalindromeFalse() {
        assertFalse(sh.isPalindrome("banana"));
    }


    @Test
    void isVowelTrue() {
        assertTrue(sh.isVowel('a'));
    }
    @Test
    void isVowelFalse() {
        assertFalse(sh.isVowel('b'));
    }

    @Test
    void isCharDigitTrue() {
        assertTrue(sh.isCharDigit('4'));
    }
    @Test
    void isCharDigitFalse() {
        assertFalse(sh.isCharDigit('a'));
    }

    @Test
    void deleteVowels() {
        assertEquals("Mn",sh.deleteVowels("Moon"));
    }

    @Test
    void countVowelsAndConsonates() {
        int[] expected = {3,2};
        Assert.assertArrayEquals(expected,sh.countVowelsAndConsonates("hello"));
    }

    @Test
    void mostFreqChar() {
        assertEquals('d',sh.mostFreqChar("abdddc"));
    }

    @Test
    void countCharTypes() {
        int[] expected = {12,3,4};
        Assert.assertArrayEquals(expected, sh.countCharTypes("__DragonSlayer101__"));
    }

    @Test
    void replaceFirstVowel() {
        assertEquals("r-ce",sh.replaceFirstVowel("race"));
    }

    @Test
    void replaceSpaces() {
        assertEquals("TheBigbrownfoxjumpedoverthelazydog", sh.replaceSpaces("The Big brown fox jumped over the    lazy dog"));
    }

    @Test
    void removeRepeats() {
        assertEquals("banana",sh.removeRepeats("bananna"));
    }

    @Test
    void calculateSumOfIntegers() {
        assertEquals(10,sh.calculateSumOfIntegers("the55"));
    }

    @Test
    void getNonRepeats() {
    }

    @Test
    void sortedAscendingString() {
        assertEquals("abbc",sh.sortedAscendingString("cabb"));
    }

    @Test
    void sortedDecendingString() {
        assertEquals("cbba",sh.sortedDecendingString("cabb"));
    }


}