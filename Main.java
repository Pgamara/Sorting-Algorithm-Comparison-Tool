import java.util.Scanner;

public class Main {
    private static Scanner scanner = new Scanner(System.in);
    private static DataManager dataManager = new DataManager();
    private static BubbleSort bubbleSort = new BubbleSort();
    private static MergeSort mergeSort = new MergeSort();
    private static QuickSort quickSort = new QuickSort();
    private static PerformanceComparator comparator = new PerformanceComparator();

    public static void main(String[] args) {
        displayMenu();
    }

    private static void displayMenu() {
        int choice;
        do {
            System.out.println("\n--- Data Sorter: Sorting Algorithm Comparison Tool ---");
            System.out.println("1. Enter numbers manually");
            System.out.println("2. Generate random numbers");
            System.out.println("3. Perform Bubble Sort");
            System.out.println("4. Perform Merge Sort");
            System.out.println("5. Perform Quick Sort");
            System.out.println("6. Compare all algorithms (show performance table)");
            System.out.println("7. Exit");
            System.out.print("Enter your choice: ");

            choice = getMenuChoice();

            switch (choice) {
                case 1:
                    dataManager.enterNumbersManually();
                    break;
                case 2:
                    dataManager.generateRandomNumbers();
                    break;
                case 3:
                    performBubbleSort();
                    break;
                case 4:
                    performMergeSort();
                    break;
                case 5:
                    performQuickSort();
                    break;
                case 6:
                    comparator.compareAlgorithms(dataManager.getData());
                    break;
                case 7:
                    System.out.println("Thank you for using Data Sorter!");
                    break;
                default:
                    System.out.println("Invalid choice. Please try again.");
            }
        } while (choice != 7);
    }

    private static void performBubbleSort() {
        if (!dataManager.hasData()) {
            System.out.println("Please enter or generate numbers first.");
            return;
        }
        int[] data = dataManager.getData();
        bubbleSort.sort(data);
        bubbleSort.displaySortedArray(data);
    }

    private static void performMergeSort() {
        if (!dataManager.hasData()) {
            System.out.println("Please enter or generate numbers first.");
            return;
        }
        int[] data = dataManager.getData();
        mergeSort.sort(data);
        mergeSort.displaySortedArray(data);
    }

    private static void performQuickSort() {
        if (!dataManager.hasData()) {
            System.out.println("Please enter or generate numbers first.");
            return;
        }
        int[] data = dataManager.getData();
        quickSort.sort(data);
        quickSort.displaySortedArray(data);
    }

    private static int getMenuChoice() {
        while (!scanner.hasNextInt()) {
            System.out.print("Invalid input. Please enter a number (1-7): ");
            scanner.next();
        }
        return scanner.nextInt();
    }
}
