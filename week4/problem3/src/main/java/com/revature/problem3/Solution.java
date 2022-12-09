package com.revature.problem3;

import java.util.*;

public class Solution {
    public String wordCount(String sentence) {
        String[] words = sentence.split("\\s+");
        List<String> wordList = new ArrayList<>(Arrays.asList(words));
        Collections.sort(wordList);

        Map<String, Integer> wordCounts = new HashMap<>();

        for (String word : words) {
            String convertedWord = word.toLowerCase();

            if (wordCounts.containsKey(convertedWord)) {
                wordCounts.put(convertedWord, wordCounts.get(convertedWord) + 1);
            } else {
                wordCounts.put(convertedWord, 1);
            }
        }

        StringBuilder builder = new StringBuilder("");

        List<String> sortedKeys = new LinkedList<>(wordCounts.keySet());
        Collections.sort(sortedKeys);

        for (String word : sortedKeys) {
            int count = wordCounts.get(word);
            if (count > 1) {
                builder.append(word + ": " + count + "\n");
            }
        }

        builder.setLength(builder.length() - 1);
        return builder.toString();
    }
}
