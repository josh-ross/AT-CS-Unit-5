/**
 * Fun With Strings
 * 
 * @author (Josh Ross) 
 * @version (11-11-2013)
 */
public class StringFun
{
    // Your task is to successfully implement each method in this class. Work from the top of this class to the bottom.

    /**
     * Prints each letter of a given string (one per line).
     * @param myName A string to analyze
     */
    public static void printEachLetter(String myName)
    {
        int string_length = myName.length();
        int position = 0;
        while (position < string_length)
        {
            System.out.println(myName.charAt(position));
            position ++;
        }
    }

 
    /**
     * Determines if the given letter is a vowel.
     * @param ltr The letter to analyze
     * @return True if the letter is a vowel, false otherwise. Y will not be considered a vowel.
     */
    private static boolean isVowel(char ltr)
    {
        if (ltr == 'a' || ltr == 'e' || ltr == 'i' || ltr == 'o' || ltr == 'u')
        {
            return true;
        }
        else
        {
            return false;
        }
    }

    /**
     * Prints only the vowels in a given string (one per line).
     * @param myName The string to analyze
     */
    public static void printVowels(String myName)
    {
        int startIndex = 0;
        int stringLength = myName.length();
        while (startIndex < stringLength)
        {
            char charExamine = myName.charAt(startIndex);
            if (isVowel(charExamine))
            {
                System.out.println(myName.charAt(startIndex));
            }
            startIndex++;
        }
    }

    /**
     * Returns a backwards copy of the original string.
     * @param original The original string to analyze
     * @return A backwards copy of the original string
     */
    public static String backwardsString (String original)
    {
        int stringLength = original.length();
        if(stringLength == 0)
        {
            return "";
        }
        else
        {
            return (original.charAt(stringLength - 1) + backwardsString(original.substring(0, stringLength-1)));
        }   
    }

    /**
     *  Returns true if the given String is a palindrome (reads the same
     *   forwards and backwards (example: "racecar")
     **/
    public static boolean isPalindrome(String myName)
    {
        String palindrome = backwardsString(myName);
        if (myName.equals(palindrome))
        {
            return true;
        }
        else
        {
            return false;
        }
    }      
    
    /**
     * Returns a copy of the given String with all the vowels removed. (NOTE: y is not considered a vowel)
     * @param s The original String to process
     * @return A copy of the given String with all the vowels removed. (NOTE: y is not considered a vowel)
     */
    public static String removeVowels(String s)
    {
        int stringLength = s.length();
        int startIndex = 0;
        while (startIndex < stringLength)
        {
            char charExamine = s.charAt(startIndex);
            if (isVowel(charExamine))
            {
                s = s.replace(charExamine,' ');
            }
            startIndex++;
        }
        return s;
    }   
}



