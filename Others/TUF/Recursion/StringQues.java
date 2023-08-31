package Others.TUF.Recursion;

import java.util.List;

public class StringQues {

        public static String findSmallestWord(String input, List<String> dictionary) {
            String smallestWord = null;

            for (String word : dictionary) {
                if (isSubsequence(input, word)) {
                    if (smallestWord == null || word.compareTo(smallestWord) < 0) {
                        smallestWord = word;
                    }
                }
            }

            return smallestWord != null ? smallestWord : "-1";
        }

        public static boolean isSubsequence(String subsequence, String word) {
            int i = 0, j = 0;
            while (i < subsequence.length() && j < word.length()) {
                if (subsequence.charAt(i) == word.charAt(j)) {
                    i++;
                }
                j++;
            }
            return i == subsequence.length();
        }

        public static void main(String[] args) {
            String input = "hop";
            List<String> dictionary = List.of("coffee", "coding", "happy", "hello", "hop");

            String result = findSmallestWord(input, dictionary);
            System.out.println(result);
        }
}
