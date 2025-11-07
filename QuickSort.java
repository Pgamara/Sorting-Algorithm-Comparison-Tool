public class QuickSort {
    private int stepCount;

    public QuickSort() {
        this.stepCount = 0;
    }

    public int[] sort(int[] array) {
        stepCount = 0;
        if (array.length <= 1) {
            return array;
        }
        quickSort(array, 0, array.length - 1);
        return array;
    }

    private void quickSort(int[] array, int low, int high) {
        if (low < high) {
            // Partition the array and get the pivot index
            int pi = partition(array, low, high);
            
            // Recursively sort elements before and after partition
            quickSort(array, low, pi - 1);
            quickSort(array, pi + 1, high);
        }
    }

    private int partition(int[] array, int low, int high) {
        int pivot = array[high];
        int i = (low - 1); // Index of smaller element
        
        for (int j = low; j < high; j++) {
            stepCount++; // Count comparison
            // If current element is smaller than or equal to pivot
            if (array[j] <= pivot) {
                i++;
                
                // Swap array[i] and array[j]
                int temp = array[i];
                array[i] = array[j];
                array[j] = temp;
                stepCount++; // Count swap
            }
        }
        
        // Swap array[i+1] and array[high] (or pivot)
        int temp = array[i + 1];
        array[i + 1] = array[high];
        array[high] = temp;
        stepCount++; // Count swap
        
        return i + 1;
    }

    public int getStepCount() {
        return stepCount;
    }

    public void displaySortedArray(int[] array) {
        System.out.print("Quick Sort Result: ");
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