package TeamProj1;

public class InsertionSort {

    static long insertionComparisions = 0;

    public static void printInsertionComparisions() {
        System.out.print(insertionComparisions);
    }

    public static void reset() {
        insertionComparisions = 0;
    }

    public static void insertionSort(int[] inputArray) {
        for (int i = 1; i < inputArray.length; i++) {
            for (int j = i; j > 0; j--) {
                insertionComparisions++;
                if (inputArray[j] < inputArray[j-1]){
                    int temp = inputArray[j];
                    inputArray[j] = inputArray[j-1];
                    inputArray[j-1] = temp;
                }
                else break;
            }
        }
    }
}





