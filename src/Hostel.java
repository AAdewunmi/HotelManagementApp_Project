import javafx.application.Application;
import javafx.stage.Stage;

import java.util.Scanner;

/**
 * Hostel Class: A JavaFX User Interface (UI) for the Student Hostel Application.
 * @author Adrian Adewunmi
 * @version 22nd March 2021
 * Reproduced from "Java in Two Semesters: Featuring JavaFX. Springer" (Case Study - Part 1 / Case Study - Part 2).
 * Charatan, Q., & Kans, A. (2019). Java in Two Semesters: Featuring JavaFX. Springer.
 */

public class Hostel extends Application {

    // Attributes
    private TenantList list;
    private int noOfRooms;

    // Methods
    Scanner scanner = new Scanner(System.in);

    @Override
    public void start(Stage primaryStage) throws Exception {
        noOfRooms = getNumberOfRooms(); // call private method
        // initialise tenant list
        list = new TenantList(noOfRooms);
        TenantFileHandler.readRecord(list);
        // code to layout components, process event handling routines and initialise the list here
    }

    /**
     * Method to request number of hostel rooms from the user
     */
    private int getNumberOfRooms() {
        System.out.println("How many rooms?: ");
        int num = scanner.nextInt();
        return num;
    }

    public static void main(String[] args) {
        launch(args);
    }

}
