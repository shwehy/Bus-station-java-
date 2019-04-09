package pkj1;

import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.stage.Stage;
import javafx.beans.value.ChangeListener;
import javafx.beans.value.ObservableValue;
import javafx.scene.control.*;
import javafx.scene.*;
import javafx.scene.layout.*;

public class Gui extends Application {
    Scene scene2 , scene;
    public void start(Stage primaryStage) {


        Label l1 = new Label("Welcome to the Station");
        Label l2 = new Label("UserName");
        Label l3 = new Label("Password");


        ToggleGroup group = new ToggleGroup();
        RadioButton button1 = new RadioButton("Manger");
        button1.setToggleGroup(group);
        button1.setSelected(true);
        RadioButton button2 = new RadioButton("Employee");
        button2.setToggleGroup(group);
        RadioButton button3 = new RadioButton("User");
        button3.setToggleGroup(group);

        TextField t1 = new TextField();
        PasswordField p1 = new PasswordField();

        Button b1 = new Button("Next");
        Button b2 = new Button("Login");
        Button b3 = new Button("Back");
        Button b4 = new Button("Sign-Up");

        GridPane gridPane = new GridPane();
        GridPane g1 = new GridPane();
        g1.setMinSize(300, 100);
        g1.setPadding(new Insets(10, 10, 10, 10));
        g1.setVgap(5);
        g1.setHgap(5);
        g1.setAlignment(Pos.CENTER);

        g1.add(l2,0,0);
        g1.add(l3,0,1);
        g1.add(t1,1,0);
        g1.add(p1,1,1);
        g1.add(b2,3,2);
        g1.add(b3,2,2);
        g1.add(b4,1,2);

        gridPane.setMinSize(300, 100);
        gridPane.setPadding(new Insets(10, 10, 10, 10));
        gridPane.setVgap(5);
        gridPane.setHgap(5);
        gridPane.setAlignment(Pos.CENTER);

        gridPane.add(l1,1,0);
        gridPane.add(button1,0,1);
        gridPane.add(button2,1,1);
        gridPane.add(button3,2,1);
        gridPane.add(b1,3,3);

        Scene scene = new Scene(gridPane);
        Scene scene2 = new Scene(g1);

        b1.setOnAction(e->primaryStage.setScene(scene2));

        b3.setOnAction(e->primaryStage.setScene(scene));
        primaryStage.setTitle("login in page");
        primaryStage.setScene(scene);
        primaryStage.show();
    }


    public void Start(String[] args) {
        Application.launch(args);
    }
}