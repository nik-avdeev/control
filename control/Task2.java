package control;

import java.util.HashMap;
import java.util.Map;
import java.util.Random;

public class Task2 {
    public static void main(String[] args) {
        int[] arr = generateRandomArray(1000, -300, 300);
        int mostFrequentNumber = findMostFrequentNumber(arr);
        System.out.println("Число, которое встречается чаще всего: " + mostFrequentNumber);
    }

    private static int[] generateRandomArray(int size, int minValue, int maxValue) {
        int[] arr = new int[size];
        Random random = new Random();

        for (int i = 0; i < size; i++) {
            arr[i] = random.nextInt(maxValue - minValue + 1) + minValue;
        }

        return arr;
    }

    private static int findMostFrequentNumber(int[] arr) {
        Map<Integer, Integer> numberFrequencyMap = new HashMap<>();

        for (int num : arr) {
            numberFrequencyMap.put(num, numberFrequencyMap.getOrDefault(num, 0) + 1);
        }

        int mostFrequentNumber = 0;
        int maxFrequency = 0;

        for (Map.Entry<Integer, Integer> entry : numberFrequencyMap.entrySet()) {
            int number = entry.getKey();
            int frequency = entry.getValue();

            if (frequency > maxFrequency) {
                maxFrequency = frequency;
                mostFrequentNumber = number;
            }
        }

        return mostFrequentNumber;
    }
}
