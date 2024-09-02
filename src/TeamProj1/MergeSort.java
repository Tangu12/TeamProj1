package TeamProj1;

    public class MergeSort {

        static int counter = 0;


        public static void printCounter() {
            System.out.println(counter);
        }


        public static void mergesort(int[] inputArray) {
        int inputLength = inputArray.length;
        if (inputLength < 2) {
            return;
        }


        int midIndex = inputLength / 2;
        int[] leftHalf = new int[midIndex];
        int[] rightHalf = new int[inputLength - midIndex];


        for (int i = 0; i < midIndex; i++) {
            leftHalf[i] = inputArray[i];
        }
        for (int i = 0; i < inputLength - midIndex; i++) { // test this for loop
            rightHalf[i] = inputArray[midIndex + i];
        }
        mergesort(leftHalf);
        mergesort(rightHalf);
        // Merging
        merge(inputArray, leftHalf, rightHalf);
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
                    counter++;
                }
                else {
                    inputArray[mergedIndex] = rightHalf[rightIndex];
                    rightIndex++;
                    counter++;
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
        }
    }

