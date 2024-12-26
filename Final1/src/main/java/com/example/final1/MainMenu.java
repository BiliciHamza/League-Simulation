package com.example.final1;

import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.Node;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.stage.Stage;
import javafx.event.ActionEvent;

import java.util.Objects;

public class MainMenu
{
    @FXML
    private ImageView arkaplan;
    private Stage stage;
    @FXML
    private Label NasilOynanir;
    @FXML
    private Button Kapat;
    @FXML
    private Label Oynayis;


    public void initialize() {
        Image image = new Image(Objects.requireNonNull(getClass().getResourceAsStream("/images/anaekranarkaplani.jpg")));
        arkaplan.setImage(image);
        arkaplan.setPreserveRatio(false);

    }

    public void openScene2(ActionEvent event) throws Exception {


        FXMLLoader loader = new FXMLLoader(getClass().getResource("oyun.fxml"));
        Parent root = loader.load();
        Scene newScene = new Scene(root);
        Stage stage = (Stage) ((Node) event.getSource()).getScene().getWindow();
        stage.setScene(newScene);
        stage.setFullScreen(true);
        stage.show();
        TeamSelectionScreen gamecontrollerr  = loader.getController();
        gamecontrollerr.setStage(stage);
    }

    public void setStage(Stage stage) {
        this.stage = stage;
    }

    @FXML
    public void Kapat() {
        if (stage != null) {
            stage.close();
        }
    }

    @FXML
    public void oynanisYazdir1() {
        NasilOynanir.setVisible(true);
        Oynayis.setVisible(true);
        Kapat.setVisible(true);
        Oynayis.setText(
                """
                        1)Takım Seçimi
                        Süper Lig'deki 10 takımdan birini seçin.
                        Seçtiğiniz takımın 11 oyuncusu ile birlikte oyuncuların yaşı, kilosu ve boyu gösterilecektir.
                        Takımınızın logosunu görebilir ve diğer takımların oyuncularını inceleyebilirsiniz.
                        
                        2)Lig Simülasyonu
                        Seçtiğiniz takım, 9 haftalık bir lig simülasyonuna katılır.
                        Her hafta diğer takımlarla maç yapacaksınız.
                        Ligin sonunda puan durumu ve sıralamalar gösterilecektir.
                        
                        3)Sonuçlar ve İstatistikler
                        Maç sonuçları ve oyuncu istatistikleri detaylı bir şekilde sunulacak.
                        Ligdeki performansınıza göre sıralama belirlenecek."""
        );
    }

    @FXML
    public void nasıloynanirKapat() {
        NasilOynanir.setVisible(false);
        Oynayis.setVisible(false);
        Kapat.setVisible(false);
    }
}
