
package busticketbookingmanagementsystem;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.input.MouseEvent;
import javafx.stage.Stage;
import javafx.stage.StageStyle;

/**
 * Main class for the Bus Ticket Booking Management System.
 * This class extends the Application class from JavaFX and sets up the primary stage (window) of the application.
 * It also includes functionality for handling user interactions with the window.
 * 
 * @author Saurabh Pardeshi
 */
public class BusTicketBookingManagementSystem extends Application {

    // Variables to store the position of the mouse for dragging the window
    private double x = 0;
    private double y = 0;

    /**
     * The start method is overridden from Application class.
     * This method sets up the initial UI of the application by loading the FXMLDocument.fxml file.
     * It also handles mouse events for dragging the window.
     * 
     * @param stage The primary stage (window) for this application.
     * @throws Exception If there is an issue loading the FXML file.
     */
    @Override
    public void start(Stage stage) throws Exception {
        // Loading the FXML document for the UI layout
        Parent root = FXMLLoader.load(getClass().getResource("FXMLDocument.fxml"));

        // Creating a new scene with the loaded FXML document
        Scene scene = new Scene(root);

        // Setting an event handler for mouse pressed action on the root element
        root.setOnMousePressed((MouseEvent event) -> {
            x = event.getSceneX();
            y = event.getSceneY();
        });

        // Setting an event handler for mouse dragged action on the root element
        root.setOnMouseDragged((MouseEvent event) -> {
            // Updating the position of the stage based on the drag
            stage.setX(event.getScreenX() - x);
            stage.setY(event.getScreenY() - y);

            // Setting the stage opacity during the drag
            stage.setOpacity(.8);
        });

        // Finalizing and showing the stage
        stage.setScene(scene);
        stage.initStyle(StageStyle.UNDECORATED);
        stage.show();
    }
    
    // The main method that launches the application
    public static void main(String[] args) {
        launch(args);
    }
}
