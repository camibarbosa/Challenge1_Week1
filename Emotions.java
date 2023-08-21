package Q02;

import java.util.Scanner;

public class Emotions {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        while (true) {
            String emotionExpressed;
            String inputLine = scanner.nextLine();
            int funCount = occurrences(inputLine, ":-)");
            int upsetCount = occurrences(inputLine, ":-(");

            if (funCount == upsetCount) {
                emotionExpressed = "neutral";
            } else if (funCount > upsetCount) {
                emotionExpressed = "fun";
            } else {
                emotionExpressed = "upset";
            }

            System.out.println(emotionExpressed);
        }
    }

    private static int occurrences(String message, String pattern) {
        int count = 0;
        int occurrencePosition = message.indexOf(pattern);
        while (occurrencePosition != -1) {
            occurrencePosition = message.indexOf(pattern,
                    occurrencePosition
                            + pattern.length());
            count++;
        }
        return count;
    }
}

