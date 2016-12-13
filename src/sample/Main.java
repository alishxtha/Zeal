package sample;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.geometry.Insets;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.GridPane;
import javafx.stage.Stage;

public class Main extends Application {
    Stage window;

    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage primaryStage) throws Exception {
        window = primaryStage;
        window.setTitle("Login With CSS");

        GridPane grid = new GridPane();
        grid.setPadding(new Insets(10,10,10,10));
        grid.setVgap(8);
        grid.setHgap(10);

        //Name Label
        Label nameLabel = new Label("Username:");
        nameLabel.setId("bold-label");
        GridPane.setConstraints(nameLabel, 0, 0);

        //Name Input
        TextField nameInput = new TextField("Alish");
        GridPane.setConstraints(nameInput,1,0);

        //password Input
        Label passLabel = new Label("Password:");
        GridPane.setConstraints(passLabel,0,1);

        //password Input
        TextField passInput = new TextField();
        passInput.setPromptText("Password");
        GridPane.setConstraints(passInput,1,1);

        Button loginButton = new Button("Login");
        GridPane.setConstraints(loginButton,1,2);

        Button signUpButton = new Button("Sign Up");
        signUpButton.getStyleClass().add("button-blue");
        GridPane.setConstraints(signUpButton,1,3);


        grid.getChildren().addAll(nameLabel,nameInput,passLabel,passInput,loginButton,signUpButton);
        Scene scene = new Scene(grid, 300 , 300);
        scene.getStylesheets().add("Viper.css");
        window.setScene(scene);
        window.show();


    }
}
