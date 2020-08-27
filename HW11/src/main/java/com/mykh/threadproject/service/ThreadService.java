package com.mykh.threadproject.service;


import java.util.Arrays;
import java.util.Scanner;



public class ThreadService extends Thread {


    public void start() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter min number");
        int min = scanner.nextInt();
        System.out.println("Enter max number");
        int max = scanner.nextInt();
        System.out.println("Threads amount");
        int threads = scanner.nextInt();
        int[] rangesCoordinatesPairs = splitRangeByTreadsAmount(min, max, threads);
        int[] allPrimeNumbers = findPrimeNumbersConcurrent(rangesCoordinatesPairs);
        System.out.println(Arrays.toString(allPrimeNumbers));
    }


    private int[] findPrimeNumbersConcurrent(int[] rangeCoordinatePairs) {

        final int[][] allPrimeNumbers = new int[1][];
        allPrimeNumbers[0] = null;
        for (int i = 0; i < rangeCoordinatePairs.length; i += 2) {
            int marker = i;
            Runnable runnable = () -> {
                allPrimeNumbers[0] = increaseAndAppend(allPrimeNumbers[0], findPrimeNumbers(rangeCoordinatePairs[marker],
                        rangeCoordinatePairs[marker + 1]));
            };
            Thread t = new Thread(runnable);
            t.start();
        }
        try {
            Thread.sleep(MIN_PRIORITY);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        return allPrimeNumbers[0];
    }

    private int[] splitRangeByTreadsAmount(int min, int max, int threads) {
        int[] result = null;
        int range = (max - min) / threads;
        if (range < threads) {
            result = new int[2];
            result[0] = min;
            result[1] = max;
            return result;
        }
        for (int i = min; i < max + 1; i += range) {
            if (i + range > max) {
                result = increaseAndAppend(result, i + 1);
                result = increaseAndAppend(result, max);
                return result;
            }
            if (i == min) {
                result = increaseAndAppend(result, i);
                result = increaseAndAppend(result, i + range);
            } else {
                result = increaseAndAppend(result, i + 1);
                result = increaseAndAppend(result, i + range);
            }
        }
        return result;
    }

    public int[] findPrimeNumbers(int min, int max) {
        int[] result = null;
        if (min == max) {
            if (isPrime(min) && min > 1) {
                result = increaseAndAppend(result, min);
            } else {
                return new int[0];
            }
        }
        for (int i = min; i < max; i++) {
            if (isPrime(i) && i > 1) {
                result = increaseAndAppend(result, i);
            }
        }
        return result;
    }

    public boolean isPrime(int n) {
        for (int i = 2; i <= Math.sqrt(n); i++)
            if (n % i == 0) {
                return false;
            }
        return true;
    }

    public int[] increaseAndAppend(int[] array, int number) {
        int[] result;
        if (array == null) {
            result = new int[1];
            result[0] = number;
            return result;
        }
        result = new int[array.length + 1];
        System.arraycopy(array, 0, result, 0, array.length);
        result[array.length] = number;
        return result;
    }

    public int[] increaseAndAppend(int[] array, int[] numbers) {
        if (array == null) {
            return numbers;
        }
        int[] result = new int[array.length + numbers.length];
        System.arraycopy(array, 0, result, 0, array.length);
        System.arraycopy(numbers, 0, result, array.length, numbers.length);
        return result;
    }
}




