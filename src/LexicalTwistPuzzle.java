import java.util.Scanner;

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
        }
    }
}
