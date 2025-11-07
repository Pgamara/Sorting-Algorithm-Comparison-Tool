import java.util.Random;
import java.util.Scanner;

public class DataManager {
    private int[] data;
    private Scanner scanner;

    public DataManager() {
        this.scanner = new Scanner(System.in);
        this.data = new int[0];
    }

    public void enterNumbersManually() {
        System.out.print("How many numbers would you like to enter? ");
        int count = getPositiveIntegerInput();
        
        data = new int[count];
        System.out.println("Enter " + count + " numbers:");
        
        for (int i = 0; i < count; i++) {
            System.out.print("Number " + (i + 1) + ": ");
            data[i] = getIntegerInput();
        }
        
        System.out.println("Numbers entered successfully!");
        displayCurrentData();
    }

    public void generateRandomNumbers() {
        System.out.print("How many random numbers would you like to generate? ");
        int count = getPositiveIntegerInput();
        
        System.out.print("Enter maximum value for random numbers: ");
        int max = getPositiveIntegerInput();
        
        Random random = new Random();
        data = new int[count];
        
        for (int i = 0; i < count; i++) {
            data[i] = random.nextInt(max) + 1;
        }
        
        System.out.println("Random numbers generated successfully!");
        displayCurrentData();
    }

    public void displayCurrentData() {
        if (data.length == 0) {
            System.out.println("No data available. Please enter or generate numbers first.");
            return;
        }
        
        System.out.print("Current data: ");
        for (int i = 0; i < data.length; i++) {
            System.out.print(data[i]);
            if (i < data.length - 1) {
                System.out.print(", ");
            }
        }
        System.out.println();
    }

    public int[] getData() {
        return data.clone(); // Return copy to prevent modification of original
    }

    public boolean hasData() {
        return data.length > 0;
    }

    private int getIntegerInput() {
        while (!scanner.hasNextInt()) {
            System.out.print("Invalid input. Please enter an integer: ");
            scanner.next();
        }
        return scanner.nextInt();
    }

    private int getPositiveIntegerInput() {
        int input;
        do {
            input = getIntegerInput();
            if (input <= 0) {
                System.out.print("Please enter a positive number: ");
            }
        } while (input <= 0);
        return input;
    }
}
