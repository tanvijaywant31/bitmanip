
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

/**
 * Checks if the number is a bit manip palindrome.
 */
public final class BitManipPalindrome {
    
    private BitManipPalindrome() {}
    
    public static boolean isPalindrome(int x) {
        
        // finding the position of the last set bit. eg: for 8, the position of last set bit is 4.
        int workingX = x;
        int ctr = 0;
        while (workingX != 0) {
            ctr++;
            workingX = workingX >>> 1; // needed so that -1 does not go in infinite loop
        }
        
        for (int low = 0, high = ctr - 1; low < high;  low++, high--) {
            int lowShift = 1 << low;
            int highShift = 1 << high;
            
            
            if (((x & lowShift) != 0) != ((x & highShift) != 0)) {
                return false;
            }
        }
   
        return true;
    }
    
    
    public static void main(String args[]) {
        assertTrue(isPalindrome(5));
        assertTrue(isPalindrome(9));
        assertTrue(isPalindrome(Integer.MAX_VALUE));
        assertTrue(isPalindrome(-1));
        assertFalse(isPalindrome(-2));
    }
}
