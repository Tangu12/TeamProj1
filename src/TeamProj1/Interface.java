package TeamProj1;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.PrintStream;
import java.util.Arrays;
import java.util.Random;


public class Interface {
    public static void main(String[] args) throws FileNotFoundException {
        int x = 1000000;
        int S = 100;
//        int size = 100;
//        Random rand = new Random();
//        int[] numbers = new int[size];

//        for (int i = 0; i < size; i++) {
//            numbers[i] = rand.nextInt(x);
//        }


        for (int i = 1; i < 200; i++) {
            Random rand = new Random();
            int[] numbers = new int[i];
            for (int j = 0; j < i; j++) {
                numbers[j] = rand.nextInt(x);
            }

            long mergeStart = System.nanoTime();
            MergeSort.mergesort(numbers);
            long mergeEnd = System.nanoTime();
            double mergeElapsedTime = (double) ((mergeEnd - mergeStart)) / 1000000000;


//            System.out.print("comparisons for Mergesort: ");
            MergeSort.printCounter();
            MergeSort.reset();
            System.out.print("  ,  ");
//            System.out.print("   Time: " + mergeElapsedTime);


            long insertStart = System.nanoTime();
            InsertionSort.insertionSort(numbers);
            long insertEnd = System.nanoTime();
            double insertElapsedTime = (double) ((insertEnd - insertStart)) / 1000000000;


//            System.out.print("comparisons for Insertion sort: ");
            InsertionSort.printInsertionComparisions();
            InsertionSort.reset();
            System.out.println(" ");
//            System.out.println("   Time: " + insertElapsedTime);


        }

//        File outfile = new File("STATS.CSV");
//        FileOutputStream fos;
//        try{
//            fos = new FileOutputStream(outfile, false);
//        } catch (FileNotFoundException e) {
//            throw new RuntimeException(e);
//        }

//        PrintStream ps = new PrintStream(fos);



//        long mergeStart = System.nanoTime();
//        MergeSort.mergesort(numbers);
//        long mergeEnd = System.nanoTime();
//        double mergeElapsedTime = (double) ((mergeEnd - mergeStart)) / 1000000000;
//
//
//        System.out.print("comparisons for Mergesort: ");
//        MergeSort.printCounter();
//        System.out.println("Time: " + mergeElapsedTime);
//
//
//        long insertStart = System.nanoTime();
//        InsertionSort.insertionSort(numbers);
//        long insertEnd = System.nanoTime();
//        double insertElapsedTime = (double) ((insertEnd - insertStart)) / 1000000000;
//
//
//        System.out.print("comparisons for Insertion sort: ");
//        InsertionSort.printInsertionComparisions();
//        System.out.println("Time: " + insertElapsedTime);


//        long hybridStart = System.nanoTime();
//        HybridSort.hybridsort(numbers, S);
//        long hybridEnd = System.nanoTime();
//        double hybridElapsedTime = (double)((hybridEnd - hybridStart)) / 1000000000;
////        System.out.print(S);
//        System.out.print(size);
//        System.out.print("  ");
//        System.out.print(HybridSort.hybridComparisions);
//        HybridSort.reset();
//        System.out.print("  ");
//        System.out.print(hybridElapsedTime);
//        System.out.println(" ");


//        for (int i = 0; i <= 50; i++) {
//            long hybridStart = System.nanoTime();
//            HybridSort.hybridsort(numbers, i);
//            long hybridEnd = System.nanoTime();
//            double hybridElapsedTime = (double) ((hybridEnd - hybridStart)) / 1000000000;
//            System.out.print(i);
//            System.out.print("  ");
//            System.out.print(HybridSort.hybridComparisions);
//            HybridSort.reset();
//            System.out.print("  ");
//            System.out.print(hybridElapsedTime);
//            System.out.println(" ");
//    }
//            ps.print(i);
//            ps.print("  ");
//            ps.print(HybridSort.hybridComparisions);
//            HybridSort.reset();
//            ps.print("  ");
//            ps.print(hybridElapsedTime);
//            ps.println(" ");

        }


    }



