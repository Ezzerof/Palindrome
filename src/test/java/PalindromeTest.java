import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PalindromeTest {

    @Test
    void ifPalindromeReturnTrue(){
        assertTrue(Palindrome.palindromeCheck("anna"));
    }

    @Test
    void ifNotPalindromeReturnFalse(){
        assertFalse(Palindrome.palindromeCheck("ags"));
    }

    @Test
    void ifNotLowerCaseReturnFalseEvenIfPalindorme(){
        assertFalse(Palindrome.palindromeCheck("Anna"));
    }

}