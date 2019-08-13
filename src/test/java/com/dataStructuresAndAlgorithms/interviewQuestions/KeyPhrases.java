package com.dataStructuresAndAlgorithms.interviewQuestions;

import java.util.ArrayList;
import java.util.HashMap;

public class KeyPhrases {
    public static void main(String[] args) {
        String text = "Suppose we have a set of English text documents and wish to rank which document is most relevant to the query ," +
                " the brown cow. A simple way to start out is by eliminating documents that do not contain all three words the brown , and cow , " +
                "but this still leaves many documents .";
        ArrayList<String> wordsToExclude = new ArrayList<>();
        wordsToExclude.add("the");
        wordsToExclude.add("a");
        wordsToExclude.add("by");
        wordsToExclude.add("to");
        wordsToExclude.add("and");
        wordsToExclude.add("of");
        wordsToExclude.add(",");
        wordsToExclude.add(".");
        wordsToExclude.add("is");

        HashMap<String,Integer> wordFrequency = new HashMap<>();
        int maxFrequency = 0;
        System.out.println(text);
        String[] textSp = text.split("\\s");
        for (String word : textSp) {

            if (wordsToExclude.contains(word) || word.trim().length()==0){
                continue;
            }
            String key = word.trim().toLowerCase();
            if (wordFrequency.get(key)==null){
                wordFrequency.put(key, 1);
            } else {
                int frequency = wordFrequency.get(key) + 1;
                wordFrequency.put(key, frequency);
            }
            if (wordFrequency.get(key) > maxFrequency){
                maxFrequency = wordFrequency.get(key);
            }
        }
        for (String key : wordFrequency.keySet()) {
            if (wordFrequency.get(key) == maxFrequency)
            System.out.println(key + ":" + wordFrequency.get(key));
        }
    }
}
