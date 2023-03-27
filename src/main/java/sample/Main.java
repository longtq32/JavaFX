package sample;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.TextArea;
import javafx.stage.Stage;

import java.io.IOException;
import java.util.List;
import java.util.Map;
import java.util.Objects;

public class Main extends Application {
    @Override
    public void start(Stage primaryStage) throws IOException {
        Parent root = FXMLLoader.load(Objects.requireNonNull(getClass().getResource("main.fxml")));
        primaryStage.setTitle("My Contacts");
        primaryStage.setScene(new Scene(root, 600, 400));
        primaryStage.show();

//        FXMLLoader fxmlLoader = new FXMLLoader(Main.class.getResource("main.fxml"));
//        Scene scene = new Scene(fxmlLoader.load(), 600, 400);
//        Text msg = new Text("Hello JavaFX ok");
//        VBox root = new VBox();
//        root.getChildren().add(msg);



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
    // dung git lan 6 edit in desktop home
    // dung git Lan 8 edit in desktop office



}
