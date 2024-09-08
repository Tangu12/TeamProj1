package TeamProj1;

import java.util.Arrays;
import java.util.Random;


public class Interface {
    public static void main(String[] args) {
        int x = 1000;
        int S = 100;
        int size = 1000000;
        Random rand = new Random();
        int[] numbers = new int[size];

        for (int i = 0; i < size; i++) {
            numbers[i] = rand.nextInt(x);
        }

        long mergeStart = System.nanoTime();
        MergeSort.mergesort(numbers);
        long mergeEnd = System.nanoTime();
        double mergeElapsedTime = (double)((mergeEnd - mergeStart)) / 1000000000;


        System.out.print("The number of comparisons for Mergesort is ");
        MergeSort.printCounter();
        System.out.println("Time taken: " + mergeElapsedTime + "s");

        for (int i = 0; i <= 100; i++) {
            long hybridStart = System.nanoTime();
            HybridSort.hybridsort(numbers, S);
            long hybridEnd = System.nanoTime();
            double hybridElapsedTime = (double)((hybridEnd - hybridStart)) / 1000000000;
            System.out.print(i);
            System.out.print("  ");
            System.out.print(HybridSort.hybridComparisions);
            System.out.print("  ");
            System.out.print(hybridElapsedTime);
            System.out.println(" ");
        }
    }
}
