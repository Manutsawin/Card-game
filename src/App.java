
import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;


public class App extends Application{

    public static void main(String[] args) throws Exception {
        String text = "test pull request from phuwadon Dev";
        launch(args);
    }

    @Override
    public void start(Stage stage) throws Exception {

        Parent root = FXMLLoader.load(getClass().getResource("Scene.fxml"));
        stage.setScene(new Scene(root));
        stage.setTitle("Slave");
        stage.show();
        
    }
}
