package Formulario;

import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.layout.GridPane;
import javafx.stage.Stage;

public class Controls extends Application {
    @Override
    public void start(Stage primaryStage) {
        primaryStage.setTitle("Controls");

    
        GridPane grid = new GridPane();
        grid.setPadding(new Insets(10, 10, 10, 10));
        grid.setVgap(10);
        grid.setHgap(10);  

        // etiquetasdecada control
        Label buttonLabel = new Label("Button:");
        GridPane.setConstraints(buttonLabel, 0, 0);
        Button button = new Button("Click me");
        GridPane.setConstraints(button, 1, 0);

        Label checkBoxLabel = new Label("CheckBox:");
        GridPane.setConstraints(checkBoxLabel, 0, 1);
        CheckBox checkBox = new CheckBox("Check me");
        GridPane.setConstraints(checkBox, 1, 1);

        Label hyperlinkLabel = new Label("Hyperlink:");
        GridPane.setConstraints(hyperlinkLabel, 0, 2);
        Hyperlink hyperlink = new Hyperlink("Musica");
        hyperlink.setOnAction(e -> getHostServices().showDocument("https://www.youtube.com/watch?v=XJcXjUB0yqY&list=RDXJcXjUB0yqY&start_radio=1"));
        GridPane.setConstraints(hyperlink, 1, 2);

        Label toggleButtonLabel = new Label("ToggleButton:");
        GridPane.setConstraints(toggleButtonLabel, 0, 3);
        ToggleButton toggleButton = new ToggleButton("Toggle me");
        GridPane.setConstraints(toggleButton, 1, 3);

        Label radioButtonLabel = new Label("RadioButton:");
        GridPane.setConstraints(radioButtonLabel, 0, 4);
        RadioButton radioButton = new RadioButton("Choose me");
        GridPane.setConstraints(radioButton, 1, 4);

        Label labelLabel = new Label("Label:");
        GridPane.setConstraints(labelLabel, 0, 5);
        Label label = new Label("CONTROLES DE JAVA");
        GridPane.setConstraints(label, 1, 5);

        Label textFieldLabel = new Label("TextField:");
        GridPane.setConstraints(textFieldLabel, 0, 6);
        TextField textField = new TextField();
        textField.setPromptText("Enter text here");
        GridPane.setConstraints(textField, 1, 6);

        Label passwordFieldLabel = new Label("PasswordField:");
        GridPane.setConstraints(passwordFieldLabel, 0, 7);
        PasswordField passwordField = new PasswordField();
        passwordField.setPromptText("INGRESA CONTRASEÑA");
        GridPane.setConstraints(passwordField, 1, 7);

        Label textAreaLabel = new Label("TextArea:");
        GridPane.setConstraints(textAreaLabel, 0, 8);
        TextArea textArea = new TextArea();
        textArea.setPromptText("Enter more text here");
        textArea.setPrefHeight(100);
        textArea.setPrefWidth(200);
        GridPane.setConstraints(textArea, 1, 8);

        Label progressIndicatorLabel = new Label("ProgressIndicator:");
        GridPane.setConstraints(progressIndicatorLabel, 0, 9);
        ProgressIndicator progressIndicator = new ProgressIndicator(0.6);
        GridPane.setConstraints(progressIndicator, 1, 9);

        Label progressBarLabel = new Label("ProgressBar:");
        GridPane.setConstraints(progressBarLabel, 0, 10);
        ProgressBar progressBar = new ProgressBar(0.6);
        GridPane.setConstraints(progressBar, 1, 10);

        Label sliderLabel = new Label("Slider:");
        GridPane.setConstraints(sliderLabel, 0, 11);
        Slider slider = new Slider(0, 100, 60);
        GridPane.setConstraints(slider, 1, 11);

        grid.getChildren().addAll(buttonLabel, button, checkBoxLabel, checkBox, hyperlinkLabel, hyperlink, toggleButtonLabel, toggleButton, radioButtonLabel, radioButton, labelLabel, label, textFieldLabel, textField, passwordFieldLabel, passwordField, textAreaLabel, textArea, progressIndicatorLabel, progressIndicator, progressBarLabel, progressBar, sliderLabel, slider);

        Scene scene = new Scene(grid, 400, 600);
        primaryStage.setScene(scene);
        primaryStage.show();
    }

    public static void main(String[] args) {
        launch(args);
    }
}
