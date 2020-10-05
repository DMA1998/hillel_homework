package com.mykh.regex.runner;

import com.mykh.regex.utils.FileHelper;

public class Runner {
    public static void main(String[] args) {
        FileHelper fh = new FileHelper();
        String path = "D:\\Text.txt";
        fh.countWords(path);
        fh.replaceSymbol(path,'G');
        fh.firstAndLastLetterMatch(path);
        fh.countPunctuationMarks(path);
    }
}
