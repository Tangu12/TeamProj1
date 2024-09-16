package TeamProj1;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.PrintStream;
import java.util.Arrays;
import java.util.Random;


public class Interface {
    public static void main(String[] args) throws FileNotFoundException {
        int x = 1000000000;
        int S = 3;
        int size = 1000000;
        Random rand = new Random();
        int[] numbers = new int[size];

        for (int i = 0; i < size; i++) {
            numbers[i] = rand.nextInt(x);
        }

//        int[] copiedArray = new int[size];

//        int[] test = new int[]{1,4,2,8,21,11,15,18,30,42,3,34,27,234,69,12,14,84,70,63,54};

//        HybridSort.hybridsort(test, 3);
//        HybridSort.printhybridComparisions();
//        System.out.println("  ");
//        HybridSort.reset();




        File outfile = new File("FixedNVaryS.CSV");
        FileOutputStream fos;
        try {
            fos = new FileOutputStream(outfile, false);
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        }
        PrintStream ps = new PrintStream(fos);

        int[] copiedArray = new int[size];

        for (int i = 0; i <= 1000000; i+= 50000) {
            System.arraycopy(numbers, 0, copiedArray, 0, i);
//            long hybridStart = System.nanoTime();
            HybridSort.hybridsort(copiedArray, 100);
//            long hybridEnd = System.nanoTime();
//            double hybridElapsedTime = (double)((hybridEnd - hybridStart)) / 1000000000;
            ps.print(i);
            ps.print(" , ");
            ps.print(HybridSort.hybridComparisions);
            HybridSort.reset();
            ps.print("  ");
//            System.out.print(hybridElapsedTime);
            ps.println();
        }




//        File outfile = new File("VaryNFixedS.CSV");
//        FileOutputStream fos;
//        try {
//            fos = new FileOutputStream(outfile, false);
//        } catch (FileNotFoundException e) {
//            throw new RuntimeException(e);
//        }
//        PrintStream ps = new PrintStream(fos);
//
//        int[] copiedArray = new int[size];
//
//        for (int i = 0; i < 100; i++) {
//            System.arraycopy(numbers, 0, copiedArray, 0, size);
////            long hybridStart = System.nanoTime();
//            HybridSort.hybridsort(copiedArray, i);
////            long hybridEnd = System.nanoTime();
////            double hybridElapsedTime = (double)((hybridEnd - hybridStart)) / 1000000000;
//            ps.print(i);
//            ps.print("  ");
//            ps.print(HybridSort.hybridComparisions);
//            HybridSort.reset();
//            ps.print("  ");
////            System.out.print(hybridElapsedTime);
//            ps.println();
//        }
    }
}

//            long mergeStart = System.nanoTime();
//            MergeSort.mergesort(numbers);
//            long mergeEnd = System.nanoTime();
//            double mergeElapsedTime = (double) ((mergeEnd - mergeStart)) / 1000000000;
//
//
//            System.out.print("comparisons for Mergesort: ");
//            MergeSort.printCounter();
//            MergeSort.reset();
//            System.out.print("  ,  ");
//            System.out.print("   Time: " + mergeElapsedTime);
//            System.out.println(" ");

//        HybridSort.hybridsort(new  int[]{3,4,89,94,104,10, 3,1} ,3);


//        File outfile = new File("HYBRID.CSV");
//        FileOutputStream fos;
//        try {
//            fos = new FileOutputStream(outfile, false);
//        } catch (FileNotFoundException e) {
//            throw new RuntimeException(e);
//        }
//
//        PrintStream ps = new PrintStream(fos);
//
//
////        long mergeStart = System.nanoTime();
////        MergeSort.mergesort(numbers);
////        long mergeEnd = System.nanoTime();
////        double mergeElapsedTime = (double) ((mergeEnd - mergeStart)) / 1000000000;
////
////
////        System.out.print("comparisons for Mergesort: ");
////        MergeSort.printCounter();
////        System.out.println("Time: " + mergeElapsedTime);
//
//
////        long insertStart = System.nanoTime();
////        InsertionSort.insertionSort(numbers);
////        long insertEnd = System.nanoTime();
////        double insertElapsedTime = (double) ((insertEnd - insertStart)) / 1000000000;
////
////
////        System.out.print("comparisons for Insertion sort: ");
////        InsertionSort.printInsertionComparisions();
////        System.out.println("Time: " + insertElapsedTime);
//
//
////        long hybridStart = System.nanoTime();
////        HybridSort.hybridsort(numbers, S);
////        long hybridEnd = System.nanoTime();
////        double hybridElapsedTime = (double)((hybridEnd - hybridStart)) / 1000000000;
//////        System.out.print(S);
//////        System.out.print(size);
////        System.out.print("  ");
////        System.out.print(HybridSort.hybridComparisions);
////        HybridSort.reset();
////        System.out.print("  ");
////        System.out.print(hybridElapsedTime);
////        System.out.println(" ");
//
//        for (int i = 0; i < 50; i++) {
//            for (int j = 0; j < size; j++) {
//                numbers[j] = rand.nextInt(x);
//            }
//            for (int k = 0; k < 10; k++) {
//                long hybridStart = System.nanoTime();
//                HybridSort.hybridsort(numbers, k);
//                long hybridEnd = System.nanoTime();
//                double hybridElapsedTime = (double) ((hybridEnd - hybridStart)) / 1000000000;
////            System.out.print(i);
////            System.out.print("  ");
////            System.out.print(HybridSort.hybridComparisions);
////            HybridSort.reset();
////            System.out.print("  ");
////            System.out.print(hybridElapsedTime);
////            System.out.println(" ");
//                ps.print(k);
//                ps.print("  ");
//                ps.print(HybridSort.hybridComparisions);
//                HybridSort.reset();
//                ps.print("   ");
//                ps.print(hybridElapsedTime);
//                ps.println("  ");
//            }
//
//
//        }






