package TeamProj1;

import java.util.Arrays;
import java.util.Random;


public class Interface {
    public static void main(String[] args) {
        int x = 10000;
        int S = 100;
        int size = 10000000;
        Random rand = new Random();
        int[] numbers = new int[size];

        for (int i = 0; i < size; i++) {
            numbers[i] = rand.nextInt(x);
        }

        //Before:
//        System.out.println("Unsorted version");
//        for (int i = 0; i < size; i++) {
//            System.out.println(numbers[i]);
////            System.out.println(Arrays.toString(numbers));
//        }

        //System.out.println("End of unsorted version\n");

        long mergeStart = System.nanoTime();
        MergeSort.mergesort(numbers);
        long mergeEnd = System.nanoTime();
        double mergeElapsedTime = (double)((mergeEnd - mergeStart)) / 1000000000;


        long hybridStart = System.nanoTime();
        HybridSort.hybridsort(numbers, S);
        long hybridEnd = System.nanoTime();
        double hybridElapsedTime = (double)((hybridEnd - hybridStart)) / 1000000000;


        //System.out.println("Sorted version");
        //After:
//        for (int i = 0; i < size; i++) {
//            System.out.println(numbers[i]);
//        };
//        System.out.println("End of sorted version");

        System.out.print("The number of comparisons for Mergesort is ");
        HybridSort.printhybridComparisions();
        System.out.println("Time taken: " + mergeElapsedTime + "s");
        System.out.print("The number of comparisons for Hybridsort is ");
        MergeSort.printCounter();
        System.out.println("Time taken: " + hybridElapsedTime + "s");

//        HybridSort.printhybridComparisions();
//        HybridSort.insertionsort(new int[]{1,2,3,4,5,6,7,8,9});
//        HybridSort.insertionsort(new int[]{1, 9, 5, 13, 3, 11, 7, 15, 2, 10, 6, 14, 4, 12, 8, 16});
//        HybridSort.hybridsort(new int[]{1, 9, 5, 13, 3, 11, 7, 15, 2, 10, 6, 14, 4, 12, 8, 16},5);
//        HybridSort.printhybridComparisions();
//        MergeSort.mergesort(new int[]{1, 9, 5, 13, 3, 11, 7, 15, 2, 10, 6, 14, 4, 12, 8, 16});
//        MergeSort.printCounter();
    }
}
