import java.util.Arrays;
import java.util.Scanner;

public class Audience {

    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        // declare arrays
        int[] audienceIds = new int[3];
        String[][] audience = new String[3][3];
        String[] menuOptions = {
                "Current storage",
                "Expand storage",
                "All audience",
                "Find audience by id",
                "Add an audience",
                "Delete an audience",
                "Exit"
        };
        while (true) {
            // show Menu
            System.out.println("\nMenu:");
            for (int i = 0; i < menuOptions.length; i++) {
                System.out.println((i + 1) + " - " + menuOptions[i]);
            }
            int choice = 0;
            do {
                System.out.print("Enter your choice: ");
                // scan choice
                if (scanner.hasNextInt()) {
                    choice = scanner.nextInt();
                } else {
                    System.out.println("Invalid input. Please enter a number.");
                    return;
                }
            } while (choice < 1 || choice > 7);

            switch (choice) {
                case 1:
                    // show storage
                    System.out.println("Current storage : " + audienceIds.length);
                    break;
                case 2:
                    // Expand audienceIds array
                    audienceIds = Arrays.copyOf(audienceIds, audienceIds.length + 3);
                    // Expand audience array
                    String[][] newAudience = new String[audience.length + 3][3];
                    audience = newAudience;

                    System.out.println("Arrays expanded." + "\n" +
                            "audienceIds: " + audienceIds.length + " \n" + "audience: " + audience.length);

                    break;
                case 3:
                    // Show all Audience
                    System.out.println("All Audience:");
                    for (int i = 0; i < audienceIds.length; i++) {
                        System.out.println(
                                "-> " + audienceIds[i] +
                                        "\t" + audience[i][0] +
                                        "\t" + audience[i][1] +
                                        "\t" + audience[i][2]);
                    }
                    break;
                case 4:
                case 5:
                case 6:
                    // scan Id
                    System.out.print("Enter ID: ");
                    int id = scanner.nextInt();
                    int index = -1;
                    int emptyIndex = -1;
                    // get index and empty index
                    for (int i = 0; i < audienceIds.length; i++) {
                        if (audienceIds[i] == id) {
                            index = i;
                        }
                        if (audienceIds[i] == 0) {
                            emptyIndex = i;
                        }
                    }
                    // show Audience by id
                    if (choice == 4) {
                        if (index == -1) {
                            System.out.println("Audience not found with ID: " + id);
                            break;
                        }
                        System.out.println("Id\t: " + id);
                        System.out.println("Name\t: " + audience[index][0]);
                        System.out.println("Age\t: " + audience[index][1]);
                        System.out.println("Gender\t: " + audience[index][2]);
                    }
                    // add Audience
                    if (choice == 5) {
                        if (emptyIndex == -1) {
                            System.out.println("array is full Please Expand Arrays");
                            break;
                        }
                        System.out.print("Enter Name: ");
                        String name = scanner.next();
                        System.out.print("Enter Age: ");
                        String age = scanner.next();
                        System.out.print("Enter Gender (M|F): ");
                        String gender = scanner.next();
                        audienceIds[emptyIndex] = id;
                        audience[emptyIndex] = new String[] { name, age, gender };
                        System.out.println("Audience added successfully.");
                        break;
                        // delete Audience
                    } else if (choice == 6) {
                        if (index == -1) {
                            System.out.println("Audience not found with ID: " + id);
                            break;
                        }
                        audienceIds[index] = 0;
                        audience[index] = null;
                        System.out.println("Audience deleted successfully.");
                    }
                    break;
                case 7:
                    return;
                default:
                    System.out.println("Invalid choice.");
            }
        }

    }
}
