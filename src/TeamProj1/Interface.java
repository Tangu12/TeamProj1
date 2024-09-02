package TeamProj1;

import java.util.Arrays;
import java.util.Random;


public class Interface {
    public static void main(String[] args) {
        int x = 1000;
        int S = 10;
        int size = 10000;
        Random rand = new Random();
        int[] numbers = new int[size];

        for (int i = 0; i < size; i++) {
            numbers[i] = rand.nextInt(x);
        }

//        Before:
//        System.out.println("Unsorted version");
//        for (int i = 0; i < size; i++) {
//            System.out.println(numbers[i]);
//            System.out.println(Arrays.toString(numbers));
//        }
//
//        System.out.println("End of unsorted version\n");

        long mergeStart = System.nanoTime();
        MergeSort.mergesort(numbers);
        long mergeEnd = System.nanoTime();
        double mergeElapsedTime = (double)((mergeEnd - mergeStart)) / 1000000000;


//        long hybridStart = System.nanoTime();
//        HybridSort.hybridsort(numbers, S);
//        long hybridEnd = System.nanoTime();
//        double hybridElapsedTime = (double)((hybridEnd - hybridStart)) / 1000000000;


//        System.out.println("Sorted version");
//        After:
//        for (int i = 0; i < size; i++) {
//            System.out.println(numbers[i]);
//        };
//        System.out.println("End of sorted version");


        // Create function for using test cases:
        System.out.print("The number of comparisons for Mergesort is ");
        MergeSort.printCounter();
        MergeSort.reset();
        // Test reset:
        System.out.println("Time taken: " + mergeElapsedTime + "s");
        System.out.println();


        for (int i = 0; i <= 100; i++) {
            long hybridStart = System.nanoTime();
            HybridSort.hybridsort(numbers, i);
            long hybridEnd = System.nanoTime();
            double hybridElapsedTime = (double)((hybridEnd - hybridStart)) / 1000000000;
            System.out.print("when i is " );
            System.out.println(i);
            System.out.print("The number of comparisons for Hybridsort is ");
            HybridSort.printhybridComparisions();
            HybridSort.reset();
            System.out.println("Time taken: " + hybridElapsedTime + "s");
            System.out.println();



        }
        // Create function for using test cases:









    }
}
