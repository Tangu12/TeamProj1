package TeamProj1;

import java.util.Arrays;

public class HybridSort {

    static long hybridComparisions = 0;

    public static void printhybridComparisions() {
        System.out.print(hybridComparisions);
    }


    public static void reset() {
        hybridComparisions = 0;
    }


    public static void insertionsort(int[] inputArray) {
        for (int i = 1; i < inputArray.length; i++) {
            for (int j = i; j > 0; j--) {
                hybridComparisions++;
                if (inputArray[j] < inputArray[j-1]){
                    int temp = inputArray[j];
                    inputArray[j] = inputArray[j-1];
                    inputArray[j-1] = temp;
                }
                else break;
            }
        }
    }

    public static void hybridsort(int[] inputArray, int S) {
        int inputLength = inputArray.length;

//        int[] copyArray = new int[inputLength];
//
//        System.arraycopy(inputArray, 0, copyArray, 0, inputArray.length);

        if (inputLength < 2) {
            return;
        }
        else if  (inputLength <= S) {
            insertionsort(inputArray);  //copyArray
            return;
        }

        int midIndex = inputLength / 2;
        int[] leftHalf = new int[midIndex];
        int[] rightHalf = new int[inputLength - midIndex];


        for (int i = 0; i < midIndex; i++) {
            leftHalf[i] = inputArray[i]; //copy
        }
        for (int i = 0; i < inputLength - midIndex; i++) { // test this for loop
            rightHalf[i] = inputArray[midIndex + i]; //copy
        }

        hybridsort(leftHalf, S);
        hybridsort(rightHalf, S);

        // Merging
        merge(inputArray, leftHalf, rightHalf); //copyArray
    }


    private static void merge(int[] inputArray, int[] leftHalf, int[] rightHalf) {
        int leftSize = leftHalf.length;
        int rightSize = rightHalf.length;

        int leftIndex = 0;
        int rightIndex = 0;
        int mergedIndex = 0;

        while (leftIndex < leftSize && rightIndex < rightSize) {
            if (leftHalf[leftIndex] < rightHalf[rightIndex]) {
                inputArray[mergedIndex] = leftHalf[leftIndex];
                leftIndex++;
                hybridComparisions++;
            }
            else {
                inputArray[mergedIndex] = rightHalf[rightIndex];
                rightIndex++;
                hybridComparisions++;
            }
            mergedIndex++;
        }
        while (leftIndex < leftSize) {
            inputArray[mergedIndex] = leftHalf[leftIndex];
            leftIndex++;
            mergedIndex++;
        }
        while (rightIndex < rightSize) {
            inputArray[mergedIndex] = rightHalf[rightIndex];
            rightIndex++;
            mergedIndex++;
        }
//        System.out.println(Arrays.toString(inputArray));
    }

}

