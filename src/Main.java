import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.Event;
import javafx.event.EventHandler;//för att fångar knapptryckning
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.control.Button;
import javafx.scene.layout.*;
import javafx.stage.Stage;
import javafx.geometry.Insets;
import javafx.scene.control.TextField;

public class Main extends Application{
    Stage window;

    public static void main(String[] args) {
    launch(args);
    }

    @Override
    public void start(Stage stage) throws Exception {
        window = stage;
        window.setTitle(" Medlemsformulär med tidtagarur (JavaFX, utan FXML) ");

        GridPane grid = new GridPane();
        grid.setPadding(new Insets(10,10,10,10));
        grid.setVgap(10);
        grid.setHgap(10);

        //Name label, namn på kolumn 0 och rad 0
        Label nameLabel = new Label("Förnamn:");
        GridPane.setConstraints(nameLabel,0,0);

        //Namn input,textfält, fält där det skrivrs in namn.
        TextField nameInput = new TextField();
        nameInput.setPromptText("Förnamn");
        GridPane.setConstraints(nameInput,1,0);

        //Efternamn label,
        Label lastName = new Label("Efternamn:");
        GridPane.setConstraints(lastName,0,1);

        //Efternamn textfält
        TextField lastnameInput = new TextField();
        lastnameInput.setPromptText("Efternamn");
        GridPane.setConstraints(lastnameInput,1,1);

        //Label Telefonnummer
        Label phoneNum = new Label("Telefonnummer:");
        GridPane.setConstraints(phoneNum,0,2);

        //Textfält för telefonnummer
        TextField phoneInput = new TextField();
        phoneInput.setPromptText("Telefonnummer");
        GridPane.setConstraints(phoneInput,1,2);

        //Label adress
        Label adress = new Label("Adress:");
        GridPane.setConstraints(adress,0,3);

        //Textfält för adress
        TextField adressInput = new TextField();
        adressInput.setPromptText("Adress");
        GridPane.setConstraints(adressInput,1,3);

        //Label som visar det sparade
        Label savedInfo = new Label();
        GridPane.setConstraints(savedInfo,1,4);

        //Knapp
        Button saveButton = new Button("Spara");
        GridPane.setConstraints(saveButton,0,4);
        saveButton.setOnAction(e ->{
            savedInfo.setText(nameInput.getText() +", " +
                    lastnameInput.getText() + ", " +
                    phoneInput.getText()+ ", " +
                    adressInput.getText() + " är sparad." );
        });

        grid.getChildren().addAll(nameLabel, nameInput, lastName, lastnameInput,phoneNum, phoneInput,adress, adressInput,savedInfo, saveButton);

        Scene scene = new Scene(grid,500,400);
        window.setScene(scene);
        window.show();
    }
//    private void info(){
//        String name = nameInput.getText()
//        System.out.println();
//    }
}