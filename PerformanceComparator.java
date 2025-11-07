public class PerformanceComparator {
    public void compareAlgorithms(int[] originalData) {
        if (originalData.length == 0) {
            System.out.println("No data available for comparison.");
            return;
        }

        // Create copies of original data for each algorithm
        int[] bubbleData = originalData.clone();
        int[] mergeData = originalData.clone();
        int[] quickData = originalData.clone();

        // Initialize sorting algorithms
        BubbleSort bubbleSort = new BubbleSort();
        MergeSort mergeSort = new MergeSort();
        QuickSort quickSort = new QuickSort();

        // Measure Bubble Sort performance
        long bubbleStartTime = System.nanoTime();
        bubbleSort.sort(bubbleData);
        long bubbleEndTime = System.nanoTime();
        long bubbleTime = bubbleEndTime - bubbleStartTime;

        // Measure Merge Sort performance
        long mergeStartTime = System.nanoTime();
        mergeSort.sort(mergeData);
        long mergeEndTime = System.nanoTime();
        long mergeTime = mergeEndTime - mergeStartTime;

        // Measure Quick Sort performance
        long quickStartTime = System.nanoTime();
        quickSort.sort(quickData);
        long quickEndTime = System.nanoTime();
        long quickTime = quickEndTime - quickStartTime;

        // Display comparison results
        System.out.println("\n=== PERFORMANCE COMPARISON ===");
        System.out.println("+-----------------+------------------+-----------------+");
        System.out.println("| Algorithm       | Time (nanoseconds) | Steps         |");
        System.out.println("+-----------------+------------------+-----------------+");
        System.out.printf("| Bubble Sort     | %16d | %13d |\n", bubbleTime, bubbleSort.getStepCount());
        System.out.printf("| Merge Sort      | %16d | %13d |\n", mergeTime, mergeSort.getStepCount());
        System.out.printf("| Quick Sort      | %16d | %13d |\n", quickTime, quickSort.getStepCount());
        System.out.println("+-----------------+------------------+-----------------+");
        
        // Display sorted arrays
        System.out.println("\nSorted Arrays:");
        bubbleSort.displaySortedArray(bubbleData);
        mergeSort.displaySortedArray(mergeData);
        quickSort.displaySortedArray(quickData);
    }
}
