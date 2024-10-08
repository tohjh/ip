package chobo;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.stage.Stage;


public class Main extends Application {

    private Chobo chobo = new Chobo();

    public Main() throws InputException {
    }

    @Override
    public void start(Stage stage) {
        MainWindow mainWindow = new MainWindow();
        mainWindow.setChobo(chobo);

        Scene scene = new Scene(mainWindow);
        stage.setScene(scene);
        stage.setTitle("Chobo Chatbot");
        stage.show();
    }

    /**
     * Represents the entry point of application.
     *
     * @param args the input arguments
     */
    public static void main(String[] args) {
        launch(args);
    }
}




