package com.example.final1;

import java.io.IOException;
import java.net.URL;
import java.util.Objects;
import java.util.ResourceBundle;
import javafx.scene.control.ChoiceBox;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Scene;
import javafx.scene.Node;
import javafx.scene.control.*;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.stage.Stage;
import javafx.event.ActionEvent;
import javafx.scene.control.TextField;

public class TeamSelectionScreen implements Initializable
{
    public static String Takim;
    private Stage stage;
    public static String Logom;
    public static String Kullaniciadi;
    @FXML
    private TextField kullaniciadial;
    @FXML
    private ImageView Logo;
    @FXML
    private Button devambutton;
    @FXML
    private ChoiceBox <String> Takimsec;
    @FXML
    private Label Takimsecme;
    @FXML
    private Label Takimim;
    @FXML
    private Label uyari;
    @FXML
    private Label isimgir;
    @FXML
    private Button devam;
    @FXML
    private ImageView arkaplan2;

        private final String[] takimlar = {"Fenerbahçe","Galatasaray","Beşiktaş","Rizespor",
                "Sivasspor","Eyüpspor","Göztepe",
                "Başakşehir","Trabzonspor","Konyaspor"};



    public void initialize(URL location, ResourceBundle resources) {
    Takimsec.getItems().addAll(takimlar);

    Takimsec.setOnAction(this::takimiAl);

        Image image = new Image(Objects.requireNonNull(getClass().getResourceAsStream("/images/fm1.png")));
        arkaplan2.setImage(image);
        arkaplan2.setPreserveRatio(false);


    }
    public void isimkontrol() {
        if(kullaniciadial.getText() != null && !kullaniciadial.getText().isEmpty()){
            Kullaniciadi = kullaniciadial.getText();
            kullaniciadial.setVisible(false);
            devam.setVisible(false);
            isimgir.setVisible(false);
            Takimsecme.setVisible(true);
            Takimsec.setVisible(true);
        }
        else {
            uyari.setVisible(true);
        }
    }



    public void takimiAl(ActionEvent event) {
        Takim = Takimsec.getValue();
        devambutton.setVisible(true);
        Takimsec.setVisible(false);
        Takimim.setText(Takim);
        Takimsecme.setVisible(false);
        Takimim.setVisible(true);
        Logo.setVisible(true);
        uyari.setVisible(false);
        switch (Takim) {
            case "Fenerbahçe" -> {
                Image image = new Image(Objects.requireNonNull(getClass().getResourceAsStream("/images/fenerbahce.png")));
                Logo.setImage(image);
                Logom = "/images/fenerbahce.png";
            }
            case "Galatasaray" -> {
                Image image = new Image(Objects.requireNonNull(getClass().getResourceAsStream("/images/galatasaray.png")));
                Logo.setImage(image);
                Logom = "/images/galatasaray.png";
            }
            case "Beşiktaş" -> {
                Image image = new Image(Objects.requireNonNull(getClass().getResourceAsStream("/images/besiktas.png")));
                Logo.setImage(image);
                Logom = "/images/besiktas.png";
            }
            case "Rizespor" -> {
                Image image = new Image(Objects.requireNonNull(getClass().getResourceAsStream("/images/rizespor.png")));
                Logo.setImage(image);
                Logom = "/images/rizespor.png";
            }
            case "Sivasspor" -> {
                Image image = new Image(Objects.requireNonNull(getClass().getResourceAsStream("/images/sivasspor.png")));
                Logo.setImage(image);
                Logom = "/images/sivasspor.png";
            }
            case "Eyüpspor" -> {
                Image image = new Image(Objects.requireNonNull(getClass().getResourceAsStream("/images/eyupspor.png")));
                Logo.setImage(image);
                Logom = "/images/eyupspor.png";
            }
            case "Göztepe" -> {
                Image image = new Image(Objects.requireNonNull(getClass().getResourceAsStream("/images/goztepe.png")));
                Logo.setImage(image);
                Logom = "/images/goztepe.png";
            }
            case "Başakşehir" -> {
                Image image = new Image(Objects.requireNonNull(getClass().getResourceAsStream("/images/basaksehir.png")));
                Logo.setImage(image);
                Logom = "/images/basaksehir.png";
            }
            case "Trabzonspor" -> {
                Image image = new Image(Objects.requireNonNull(getClass().getResourceAsStream("/images/trabzonspor.png")));
                Logo.setImage(image);
                Logom = "/images/trabzonspor.png";
            }
            case "Konyaspor" -> {
                Image image = new Image(Objects.requireNonNull(getClass().getResourceAsStream("/images/konyaspor.png")));
                Logo.setImage(image);
                Logom = "/images/konyaspor.png";
            }
            default -> {
                System.out.println("Takım bulunamadı.");
                Logom = "";
            }
        }

    }

    public void openScene3(ActionEvent event) throws IOException {
        if(Takim != null) {
        FXMLLoader loader = new FXMLLoader(getClass().getResource("oyun2.fxml"));
        Scene newScene = new Scene(loader.load());
        Stage stage = (Stage) ((Node) event.getSource()).getScene().getWindow();
        stage.setScene(newScene);
        stage.setFullScreen(true);
        Oyun gameController = loader.getController();
        gameController.setStage();
        stage.show(); }
        else {
            uyari.setVisible(true);
        }
    }



    public void setStage(Stage stage) {
        this.stage = stage;
    }
    @FXML
    public void Close() {
        if (stage != null) {
            stage.close();
        }
    }


}
