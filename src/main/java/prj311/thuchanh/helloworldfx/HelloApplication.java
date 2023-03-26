package prj311.thuchanh.helloworldfx;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.control.TextArea;
import javafx.scene.layout.VBox;
import javafx.scene.text.Text;
import javafx.stage.Stage;

import java.io.IOException;
import java.lang.reflect.Parameter;
import java.util.List;
import java.util.Map;

public class HelloApplication extends Application {
    @Override
    public void start(Stage stage) throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader(HelloApplication.class.getResource("hello-view.fxml"));
        Scene scene = new Scene(fxmlLoader.load(), 320, 240);

//        Text msg = new Text("Hello JavaFX ok");
//        VBox root = new VBox();
//        root.getChildren().add(msg);

        stage.setTitle("Hello!");
        stage.setScene(scene);
        stage.show();
        String name = Thread.currentThread().getName();
        System.out.println("FXLifeCycleApp() constructor: " + name);


        // get application parameters
        Parameters p = this.getParameters();
        Map<String, String> namedParams = p.getNamed();
        List<String> unnamedParams = p.getUnnamed();
        List<String> rawParams = p.getRaw();

        String paramStr = "Named Paramenters: " + namedParams + "\n" +
                "Unnamed Parameters: " + unnamedParams + "\n" +
                "Raw Parameters: " + rawParams;

        TextArea ta = new TextArea(paramStr);


    }

    public static void main(String[] args) {
        launch();
    }

    @Override
    public void init() {
        String name = Thread.currentThread().getName();
        System.out.println("init() method: " + name);
    }

    public void stop() {
        String name = Thread.currentThread().getName();
        System.out.println("stop () method");
    }

    // dung git lan 1
    // dung git lan 2
    // dung git lan 3
    // dung git lan 4 edit in laptop
    // dung git lan 5 edit in destop home

}
