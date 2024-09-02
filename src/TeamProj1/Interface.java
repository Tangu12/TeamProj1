package TeamProj1;

import java.util.Random;


public class Interface {
    public static void main(String[] args) {
        int x = 100;
        int S = 4;
        int size = 10000;
        Random rand = new Random();
        int[] numbers = new int[size];

        for (int i = 0; i < size; i++) {
            numbers[i] = rand.nextInt(x);
        }

        //Before:
        System.out.println("Unsorted version");
        for (int i = 0; i < size; i++) {
            System.out.println(numbers[i]);
        }

        System.out.println("End of unsorted version\n");

        MergeSort.mergesort(numbers);
        //HybridSort.hybridsort(numbers, S);

        System.out.println("Sorted version");
        //After:
        for (int i = 0; i < size; i++) {
            System.out.println(numbers[i]);
        };
        System.out.println("End of sorted version");

        System.out.println("The number of comparisons for Mergesort is ");
        //HybridSort.printhybridComparisions();
        System.out.print("The number of comparisons for Hybridsort is ");
        MergeSort.printCounter();


        HybridSort.hybridsort(new int[]{1, 9, 5, 13, 3, 11, 7, 15, 2, 10, 6, 14, 4, 12, 8, 16}, 4);
        HybridSort.printhybridComparisions();
    }
}
