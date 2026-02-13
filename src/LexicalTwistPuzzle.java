import java.util.Scanner;

public class LexicalTwistPuzzle {

    public static void main(String[] args) {

        System.out.println("Lexical Twist Puzzle");

        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter first word:");
        String firstWord = scanner.nextLine();

        System.out.println("Enter second word:");
        String secondWord = scanner.nextLine();

        if (!WordValidator.isSingleWord(firstWord)) {
            System.out.println(firstWord + " is an invalid word");
            return;
        }

        if (!WordValidator.isSingleWord(secondWord)) {
            System.out.println(secondWord + " is an invalid word");
            return;
        }

        if (LexicalAnalyzer.isReverse(firstWord, secondWord)) {
            String result =
                    LexicalAnalyzer.transformIfReverse(firstWord);
            System.out.println(result);
        } else {
            LexicalAnalyzer.analyzeAndPrint(firstWord, secondWord);
        }
    }
}
