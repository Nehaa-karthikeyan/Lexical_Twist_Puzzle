import java.util.LinkedHashSet;
import java.util.Scanner;
import java.util.Set;

public class LexicalTwistPuzzle {
    public static void main(String[] args) {

        System.out.println("Lexical Twist Puzzle");

        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter first word:");
        String firstWord = scanner.nextLine();

        System.out.println("Enter second word:");
        String secondWord = scanner.nextLine();

        if (firstWord.contains(" ")) {
            System.out.println(firstWord + " is an invalid word");
            return;
        }

        if (secondWord.contains(" ")) {
            System.out.println(secondWord + " is an invalid word");
            return;
        }

        String reversedFirstWord =
                new StringBuilder(firstWord).reverse().toString();

        boolean isReverse =
                reversedFirstWord.equalsIgnoreCase(secondWord);

        if (isReverse) {
            String transformedWord = reversedFirstWord
                    .toLowerCase()
                    .replaceAll("[aeiou]", "@");

            System.out.println(transformedWord);
        } else {

            String combined = (firstWord + secondWord).toUpperCase();

            int vowelCount = 0;
            int consonantCount = 0;

            Set<Character> vowelsSet = new LinkedHashSet<>();
            Set<Character> consonantsSet = new LinkedHashSet<>();

            for (char ch : combined.toCharArray()) {
                if (ch == 'A' || ch == 'E' || ch == 'I'
                        || ch == 'O' || ch == 'U') {
                    vowelCount++;
                    vowelsSet.add(ch);
                } else if (Character.isLetter(ch)) {
                    consonantCount++;
                    consonantsSet.add(ch);
                }
            }

            if (vowelCount > consonantCount) {
                int count = 0;
                for (char v : vowelsSet) {
                    System.out.print(v);
                    count++;
                    if (count == 2) break;
                }
            } else if (consonantCount > vowelCount) {
                int count = 0;
                for (char c : consonantsSet) {
                    System.out.print(c);
                    count++;
                    if (count == 2) break;
                }
            } else {
                System.out.println("Vowels and consonants are equal");
            }
        }
    }
}
