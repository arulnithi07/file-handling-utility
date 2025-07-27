
import java.io.*;
import java.util.Scanner;

public class FileHandler {

    // Path to the text file
    static final String FILE_PATH = "sample.txt";

    // Method to write content to a file (overwrite)
    public static void writeToFile(String content) {
        try (FileWriter writer = new FileWriter(FILE_PATH, false)) {
            writer.write(content);
            System.out.println("✅ File written successfully (overwritten).");
        } catch (IOException e) {
            System.out.println("❌ Error writing to file: " + e.getMessage());
        }
    }

    // Method to append content to the file
    public static void appendToFile(String content) {
        try (FileWriter writer = new FileWriter(FILE_PATH, true)) {
            writer.write(content);
            System.out.println("✅ Content appended successfully.");
        } catch (IOException e) {
            System.out.println("❌ Error appending to file: " + e.getMessage());
        }
    }

    // Method to read the content of the file
    public static void readFile() {
        try (BufferedReader reader = new BufferedReader(new FileReader(FILE_PATH))) {
            String line;
            System.out.println("📄 File Content:");
            while ((line = reader.readLine()) != null) {
                System.out.println("→ " + line);
            }
        } catch (IOException e) {
            System.out.println("❌ Error reading file: " + e.getMessage());
        }
    }

    // Main method to test file operations
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Ensure file exists before any operations
        try {
            File file = new File(FILE_PATH);
            if (file.createNewFile()) {
                FileWriter writer = new FileWriter(file);
                writer.write("Welcome to File Handling in Java!\nThis file is for testing.\n");
                writer.close();
                System.out.println("📄 sample.txt created with default content.");
            }
        } catch (IOException e) {
            System.out.println("❌ Failed to create sample.txt: " + e.getMessage());
        }

        System.out.println("📁 File Handling Operations");
        System.out.println("1. Write to file");
        System.out.println("2. Append to file");
        System.out.println("3. Read file");
        System.out.print("Choose an option (1/2/3): ");
        int choice = scanner.nextInt();
        scanner.nextLine(); // consume newline

        switch (choice) {
            case 1:
                System.out.print("Enter text to write (overwrite): ");
                String writeContent = scanner.nextLine();
                writeToFile(writeContent);
                break;
            case 2:
                System.out.print("Enter text to append: ");
                String appendContent = scanner.nextLine();
                appendToFile("\n" + appendContent);
                break;
            case 3:
                readFile();
                break;
            default:
                System.out.println("❌ Invalid option!");
        }

        scanner.close();
    }
}
