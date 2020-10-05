package com.mykh.regex.utils;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class FileHelper {

    private final static String REGEX_SYMBOLS = "[-.?!)(,:;]";
    private final static int LETTER_TO_REPLACE = 4;

    public void countPunctuationMarks(String text) {
        int counter = 0;
        String sentences = readFile(text);
        Pattern patter = Pattern.compile(REGEX_SYMBOLS);
        Matcher matcher = patter.matcher(sentences);
        while (matcher.find()) {
            counter++;
        }
        System.out.println("punctuation marks quantity : " + counter);
    }

    public void firstAndLastLetterMatch(String text) {
        Set<String> set = new TreeSet<>();
        String sentences = readFile(text);
        String[] words = sentences.toLowerCase().replaceAll(REGEX_SYMBOLS, "").split("\\s");
        for (String word : words) {
            if (!word.isEmpty()) {
                if (word.charAt(0) == word.charAt(word.length() - 1)) {
                    set.add(word);
                }
            }
        }
        for (String word : set) {
            System.out.println(word);
        }
    }

    public void replaceSymbol(String text,char symbol) {
        StringBuilder sb;
        int k = LETTER_TO_REPLACE;
        String sentences = readFile(text);
        String[] words = sentences.replaceAll(REGEX_SYMBOLS, "").split("\\s");
        for (String word : words) {
            sb = new StringBuilder(word);
            if (k <= word.length()) {
                sb.setCharAt(k- 1, symbol);
            }
            System.out.println(sb.toString());
        }
    }

    public void countWords(String text) {
        Map<String, Integer> map = new HashMap<>();
        String sentences = readFile(text);
        String[] words = sentences.replaceAll(REGEX_SYMBOLS, "").split("\\s");
        for (String word : words) {
            if (!word.isEmpty()) {
                if (map.containsKey(word)) {
                    map.put(word, map.get(word) + 1);
                } else {
                    map.put(word, 1);
                }
            }
        }
        for (String word : map.keySet()) {
            System.out.println(word + " - " + map.get(word));
        }
    }

    private String readFile(String path) {
        String result = null;
        try (FileInputStream fis = new FileInputStream(new File(path))) {
            byte[] buffer = new byte[fis.available()];
            fis.read(buffer);
            result = new String(buffer);
        } catch (IOException e) {
            e.printStackTrace();
        }
        return result;
    }
}
