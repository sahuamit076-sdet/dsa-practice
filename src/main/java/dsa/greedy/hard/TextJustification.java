package dsa.greedy.hard;

import java.util.ArrayList;
import java.util.List;

public class TextJustification {

    public static void main(String[] args) {
        String[] words = {"This", "is", "an", "example", "of", "text", "justification."};
        int maxWidth = 16;
        List<String> justifiedText = fullJustify(words, maxWidth);
        System.out.println(justifiedText);
    }


    // Algorithm:
    static List<String> fullJustify(String[] words, int maxWidth) {
        List<String> result = new ArrayList<>();
        int i = 0;
        while (i < words.length) {
            int letterCount = words[i].length();
            int gapCount = 0;
            int j = i+1;

            while (j < words.length && letterCount + gapCount + words[j].length() <= maxWidth) {
                letterCount += words[j].length();
                gapCount +=1;
                j++;
            }
            int remainSpaces = maxWidth - letterCount;

            int spacesBetweenWords = gapCount == 0 ? 0 : remainSpaces / gapCount;
            int extraSpaces = gapCount == 0 ? 0 : remainSpaces % gapCount;
            if(j == words.length) {
                spacesBetweenWords = 1;
                extraSpaces = 0;
            }
            String line  = findLine( words, i, j, spacesBetweenWords, extraSpaces, maxWidth);
            result.add(line);
            i = j;
        }

        return result;
    }

    static String findLine(String[] words, int start, int end, int spacesBetweenWords, int extraSpaces, int maxWidth) {
        StringBuilder line = new StringBuilder();
        for (int k = start; k < end; k++) {
            line.append(words[k]);
            if (k != end - 1) {
                line.append(" ".repeat(Math.max(0, spacesBetweenWords)));

                if (extraSpaces > 0) {
                    line.append(" ");
                    extraSpaces--;
                }
            }
        }
        while (line.length() < maxWidth) {
            line.append(" ");
        }
        return line.toString();

    }
}
