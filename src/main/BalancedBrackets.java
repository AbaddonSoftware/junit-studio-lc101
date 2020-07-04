package main;

public class BalancedBrackets {


//    public static boolean hasBalancedBrackets(String str) {
//        int open = 0;
//        int close = 0;
//        for (char ch : str.toCharArray()) {
//            if (ch == '[') {
//                open++;
//            } else if (ch == ']') {
//                close++;
//                if (close > open) {
//                    return false;
//                }
//            }
//        }
//        return open == close;
//    }
//
// if (close > open) { return false; } may be changed to if (close != open) to forbid mis-nested brackets
// such as "[[]]" or "[Tac[o]caT]"

//    public static boolean hasBalancedBrackets(String aString) {
//        boolean closeBracketLast = aString.lastIndexOf('[') < aString.lastIndexOf(']');
//        boolean equalBrackets = aString.chars().filter(ch -> ch == '[').count() - aString.chars().filter(ch -> ch==']').count() == 0;
//        boolean mayHaveNoBrackets = !aString.contains("[") && !aString.contains("]");
//        return closeBracketLast && equalBrackets || mayHaveNoBrackets;
//    }
//
// The above code allows mis-nested brackets as did the original code.

    /**
     * The function BalancedBrackets should return true if and only if
     * the input string has a set of "balanced" brackets.
     * <p>
     * That is, whether it consists entirely of pairs of opening/closing
     * brackets (in that order), none of which mis-nest. We consider a bracket
     * to be square-brackets: [ or ].
     * <p>
     * The string may contain non-bracket characters as well.
     * <p>
     * These strings have balanced brackets:
     * "[LaunchCode]", "Launch[Code]", "[]LaunchCode", "[]"
     * <p>
     * While these do not:
     * "[LaunchCode", "Launch]Code[", "[", "]["
     *
     * @param aString - to be validated
     * @return true if balanced, false otherwise
     */

    public static boolean hasBalancedBrackets(String aString) {
        int bracketsBalanced = 0;
        for (char character : aString.toCharArray()) {
            bracketsBalanced += (character == '[') ? 1 : 0;
            bracketsBalanced -= (character == ']') ? 1 : 0;
            if (bracketsBalanced < 0 || bracketsBalanced > 1) {
                return false;
            }
        }
        return bracketsBalanced == 0;
    }

    /**
     * An overloaded version of {@link #hasBalancedBrackets(String aString)}
     * that allows the user decide if they wish to allow brackletless values
     * to return true.
     *
     * <p>
     * When the mustContainBrackets parameter is set to true then strings such
     * as "", "LaunchCode" will return false.
     * </p>
     *
     * @param aString             - to be validated
     * @param mustContainBrackets - boolean value indicating whether bracketless
     *                            strings should return true or false.
     * @return true if balanced, false otherwise.
     */

    public static boolean hasBalancedBrackets(String aString, boolean mustContainBrackets) {
        if (!aString.contains("[") && mustContainBrackets) {
            return false;
        }
        return hasBalancedBrackets(aString);
    }


}