package com.mykh.web.utils;

public class SortArray {

    public int[] parsedNumbers(String[] numbers) {
        int[] result = new int[0];
        for (String number : numbers) {
            int parsedNumber = Integer.parseInt(number);
            result = increaseArrayAddElement(result, parsedNumber);
        }
        return result;
    }

    private int[] increaseArrayAddElement(int[] array, int number) {
        int[] result = new int[array.length + 1];
        System.arraycopy(array, 0, result, 0, array.length);
        result[array.length] = number;
        return result;
    }

}
