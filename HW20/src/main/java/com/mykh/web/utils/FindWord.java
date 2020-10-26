package com.mykh.web.utils;

import java.io.IOException;
import java.io.InputStream;

public class FindWord {

    public int countWords(String givenWord) {
        int counter = 0;
        String text = readFile();
        String[] words = text.replaceAll("[-.?!)(,:;]", " ").split("\\s");
        for (String word : words) {
            if (!word.isEmpty()) {
                if (word.equals(givenWord)) {
                    counter++;
                }
            }
        }
        return counter;
    }

    public String readFile() {
        String result = null;
        try (InputStream inputStream = this.getClass().getClassLoader().getResourceAsStream("text.txt")) {
            byte[] buffer = new byte[inputStream.available()];
            inputStream.read(buffer);
            result = new String(buffer);
        } catch (IOException e) {
            e.printStackTrace();
        }
        return result;
    }
}
