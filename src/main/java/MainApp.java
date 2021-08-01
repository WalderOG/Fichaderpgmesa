import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;
import java.io.IOException;

public class MainApp extends Application {
    @Override
    public void start(Stage primaryStage) throws IOException {
        Stage stage = primaryStage;
        Parent fxmlMain = FXMLLoader.load(getClass().getResource("/fxml/menu.fxml"));
        Scene mainScene = new Scene(fxmlMain);
        primaryStage.setScene(mainScene);
        primaryStage.setTitle("Sistema Personagem");
        primaryStage.setResizable(false);
        primaryStage.show();
    }

    public static void main(String[] args) {
        launch(args);
    }

}
