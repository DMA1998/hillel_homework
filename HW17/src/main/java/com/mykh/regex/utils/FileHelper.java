package com.mykh.regex.utils;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class FileHelper {

    public void countPunctuationMarks(String path) {
        int counter = 0;
        String text = readFile(path);
        Pattern patter = Pattern.compile("[-.?!)(,:;]");
        Matcher matcher = patter.matcher(text);
        while (matcher.find()) {
            counter++;
        }
        System.out.println("punctuation marks quantity : " + counter);
    }

    public void firstAndLastLetterMatch(String path) {
        Set<String> set = new TreeSet<>();
        String text = readFile(path);
        String[] words = text.toLowerCase().replaceAll("[-.?!)(,:]", "").split("\\s");
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

    public void replaceSymbol(String path) {
        StringBuilder sb;
        int k = 4;
        String text = readFile(path);
        String[] words = text.replaceAll("[-.?!)(,:]", "").split("\\s");
        for (String word : words) {
            sb = new StringBuilder(word);
            if (k <= word.length()) {
                sb.setCharAt(k - 1, 'G');
            }
            System.out.println(sb.toString());
        }
    }

    public void countWords(String path) {
        Map<String, Integer> map = new HashMap<>();
        String text = readFile(path);
        String[] words = text.replaceAll("[-.?!)(,:]", "").split("\\s");
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
