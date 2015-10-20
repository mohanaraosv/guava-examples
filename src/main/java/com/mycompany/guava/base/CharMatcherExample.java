package com.mycompany.guava.base;

import java.nio.charset.Charset;
import java.nio.charset.CharsetEncoder;

import com.google.common.base.CharMatcher;
import com.google.common.base.Predicate;

/**
 * @author mohanarao_sv
 *
 */
public class CharMatcherExample {

    public static void main(final String[] args) {
        // Remove all lowercase letters
        String allButLowerCase = CharMatcher.JAVA_LOWER_CASE.negate().retainFrom("B-double E double R U-N beer run");
        System.out.println(allButLowerCase);
        // Trim leading spaces
        String leftTrimmedString = CharMatcher.WHITESPACE.trimLeadingFrom("       Some String       ");
        System.out.println(leftTrimmedString);
        // Trim trailing spaces
        String rightTrimmedString = CharMatcher.WHITESPACE.trimTrailingFrom("       Some String       ");
        System.out.println(rightTrimmedString);
        // Trim all spaces
        String trimmedString = CharMatcher.WHITESPACE.trimFrom("       Some String       ");
        System.out.println(trimmedString);
        // Remove all * from string
        String stringWithoutAstricks = CharMatcher.is('*').removeFrom("(* This is a comment.  The compiler will ignore it. *)");
        System.out.println(stringWithoutAstricks);
        // Validate letter and digit
        boolean randomPharse = CharMatcher.JAVA_LETTER_OR_DIGIT.matchesAllOf("wefwewef3r343fwdSVD()I#KMFI");
        System.out.println(randomPharse);
        // In range between
        boolean failedGrade = CharMatcher.inRange('A', 'C').matches('F');
        System.out.println(failedGrade);
        // Obtain digits from telephone number
        // worried about performance
        CharMatcher digits = CharMatcher.inRange('0', '9').precomputed();
        String teleNumber = digits.retainFrom("123-456-7890");
        System.out.println(teleNumber);
        // Count matching chars
        int numberOfDigits = CharMatcher.DIGIT.countIn("123-LevelUpLunch");
        System.out.println(numberOfDigits);
        // Collapse whitespace to dash
        String address = "505 Williams Street";
        String addressWithDash = CharMatcher.WHITESPACE.collapseFrom(address, '-');
        System.out.println(addressWithDash);
        // Remove non ASCII characters from String
        // eclipse supporting UTF-8 only (should give ascii)
        String input = "Hellow";
        String result = CharMatcher.ASCII.retainFrom(input);
        result = CharMatcher.inRange('0', 'z').retainFrom(input);
        System.out.println(result);

        // Remove Characters not in the Charset
        Charset charset = Charset.forName("utf-8");
        CharsetEncoder encoder = charset.newEncoder();
        Predicate<Character> inRange = new Predicate<Character>() {

            @Override
            public boolean apply(final Character c) {
                return encoder.canEncode(c);
            }
        };
        String result1 = CharMatcher.forPredicate(inRange).retainFrom("hello∆ ÿ");
        System.out.println(result1);
        // Validate String
        String validate = "hello";
        System.out.println("Matching charactor " + CharMatcher.is('e').matchesAnyOf(validate));
        System.out.println("No digit is exist in given string" + CharMatcher.JAVA_DIGIT.matchesNoneOf(validate));
        // Replace string
        String replace = "apple-banana.";
        System.out.println("Replace given string with ! when char is - and . " + CharMatcher.anyOf("-.").replaceFrom(replace, '!'));
    }
}
