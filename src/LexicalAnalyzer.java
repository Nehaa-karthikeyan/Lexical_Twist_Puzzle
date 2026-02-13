import java.util.LinkedHashSet;
import java.util.Set;

public class LexicalAnalyzer {

    public static boolean isReverse(String firstWord, String secondWord) {
        String reversed =
                new StringBuilder(firstWord).reverse().toString();
        return reversed.equalsIgnoreCase(secondWord);
    }

    public static String transformIfReverse(String word) {
        return new StringBuilder(word)
                .reverse()
                .toString()
                .toLowerCase()
                .replaceAll("[aeiou]", "@");
    }

    public static void analyzeAndPrint(String firstWord, String secondWord) {

        String combined = (firstWord + secondWord).toUpperCase();

        int vowelCount = 0;
        int consonantCount = 0;

        Set<Character> vowelsSet = new LinkedHashSet<>();
        Set<Character> consonantsSet = new LinkedHashSet<>();

        for (char ch : combined.toCharArray()) {
            if ("AEIOU".indexOf(ch) != -1) {
                vowelCount++;
                vowelsSet.add(ch);
            } else if (Character.isLetter(ch)) {
                consonantCount++;
                consonantsSet.add(ch);
            }
        }

        if (vowelCount > consonantCount) {
            printFirstTwo(vowelsSet);
        } else if (consonantCount > vowelCount) {
            printFirstTwo(consonantsSet);
        } else {
            System.out.println("Vowels and consonants are equal");
        }
    }

    private static void printFirstTwo(Set<Character> set) {
        int count = 0;
        for (char ch : set) {
            System.out.print(ch);
            count++;
            if (count == 2) break;
        }
    }
}
