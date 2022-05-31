import javafx.application.Application;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;


public class Main extends Application {

    @Override
    public void start(Stage primaryStage) throws Exception {
        Parent forn = FXMLLoader.load(getClass().getResource("view/TableView.fxml"));
        Scene scene = new Scene(forn);
        primaryStage.setScene(scene);
        primaryStage.setTitle("TableView - Teste");
        primaryStage.show();
    }

    public static void main(String[] args) {
        launch(args);

    }

}

