package semester_one.week_eight;

public class StringMethods {

    public static void main(String[] args) {
        String message = "This is an excellent day.";

        System.out.println("Number of words: " + getWordCount(message));
        System.out.println("Number of characters: " + getCharCount(message));
        System.out.println("Number of capitals: " + getCapCount(message));
        System.out.println("Number of lowercase: " + getLowCount(message));
        System.out.print("Reverse: ");
        printReverse(message);
    }

    public static int getWordCount(String message) {
        int wordCount = 0;

        for (int i = 0; i < message.length(); i++) {
            if (message.charAt(i) == ' ') {
                wordCount++;
            }
        }

        return wordCount + 1;
    }

    public static int getCharCount(String message) {
        return message.length();
    }

    public static int getCapCount(String message) {
        int capCount = 0;

        for (int i = 0; i < message.length(); i++) {
            if (message.charAt(i) >= 'A' && message.charAt(i) <= 'Z') {
                capCount++;
            }
        }

        return capCount;
    }

    public static int getLowCount(String message) {
        int lowCount = 0;

        for (int i = 0; i < message.length(); i++) {
            if (message.charAt(i) >= 'a' && message.charAt(i) <= 'z') {
                lowCount++;
            }
        }

        return lowCount;
    }

    public static void printReverse(String message) {
        for (int i = message.length() - 1; i >= 0; i--) {
            System.out.print(message.charAt(i));
        }
    }
}