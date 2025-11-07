public class MergeSort {
    private int stepCount;

    public MergeSort() {
        this.stepCount = 0;
    }

    public int[] sort(int[] array) {
        stepCount = 0;
        if (array.length <= 1) {
            return array;
        }
        return mergeSort(array, 0, array.length - 1);
    }

    private int[] mergeSort(int[] array, int left, int right) {
        if (left < right) {
            int mid = (left + right) / 2;
            
            // Recursively sort both halves
            mergeSort(array, left, mid);
            mergeSort(array, mid + 1, right);
            
            // Merge the sorted halves
            merge(array, left, mid, right);
        }
        return array;
    }

    private void merge(int[] array, int left, int mid, int right) {
        // Create temporary arrays
        int n1 = mid - left + 1;
        int n2 = right - mid;
        
        int[] leftArray = new int[n1];
        int[] rightArray = new int[n2];
        
        // Copy data to temporary arrays
        for (int i = 0; i < n1; i++) {
            leftArray[i] = array[left + i];
            stepCount++;
        }
        for (int j = 0; j < n2; j++) {
            rightArray[j] = array[mid + 1 + j];
            stepCount++;
        }
        
        // Merge the temporary arrays
        int i = 0, j = 0, k = left;
        
        while (i < n1 && j < n2) {
            stepCount++; // Count comparison
            if (leftArray[i] <= rightArray[j]) {
                array[k] = leftArray[i];
                i++;
            } else {
                array[k] = rightArray[j];
                j++;
            }
            k++;
            stepCount++; // Count assignment
        }
        
        // Copy remaining elements
        while (i < n1) {
            array[k] = leftArray[i];
            i++;
            k++;
            stepCount++; // Count assignment
        }
        
        while (j < n2) {
            array[k] = rightArray[j];
            j++;
            k++;
            stepCount++; // Count assignment
        }
    }

    public int getStepCount() {
        return stepCount;
    }

    public void displaySortedArray(int[] array) {
        System.out.print("Merge Sort Result: ");
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i]);
            if (i < array.length - 1) {
                System.out.print(", ");
            }
        }
        System.out.println();
        System.out.println("Total steps: " + getStepCount());
    }
}