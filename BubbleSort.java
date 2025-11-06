public class BubbleSort {
    private int stepCount;

    public BubbleSort() {
        this.stepCount = 0;
    }

    public int[] sort(int[] array) {
        stepCount = 0;
        int n = array.length;
        
        for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j < n - i - 1; j++) {
                stepCount++; // Count comparison operation
                if (array[j] > array[j + 1]) {
                    // Swap elements
                    int temp = array[j];
                    array[j] = array[j + 1];
                    array[j + 1] = temp;
                    stepCount++; // Count swap operation
                }
            }
        }
        return array;
    }

    public int getStepCount() {
        return stepCount;
    }

    public void displaySortedArray(int[] array) {
        System.out.print("Bubble Sort Result: ");
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
