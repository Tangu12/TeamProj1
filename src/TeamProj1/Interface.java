package TeamProj1;

import java.util.Random;


public class Interface {
    public static void main(String[] args) {
        int x = 100;
        int S = 1;
        Random rand = new Random();
        int[] numbers = new int[10];

        for (int i = 0; i < 10; i++) {
            numbers[i] = rand.nextInt(x);
        }

        //Before:
        System.out.println("Unsorted version");
        for (int i = 0; i < 10; i++) {
            System.out.println(numbers[i]);
        }

        System.out.println("End of unsorted version\n");

        MergeSort.mergesort(numbers);
        HybridSort.hybridsort(numbers, S);

        System.out.println("Sorted version");
        //After:
        for (int i = 0; i < 10; i++) {
            System.out.println(numbers[i]);
        };
        System.out.println("End of sorted version");

        System.out.println("The number of comparisons for mergesort is ");
        HybridSort.printhybridComparisions();
        System.out.print("The number of comparisons is ");
        MergeSort.printCounter();

    }
}
