package com.example.final1;

import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Node;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextArea;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.stage.Stage;
import javafx.event.ActionEvent;
import java.io.IOException;
import java.net.URL;
import java.util.*;
import javafx.scene.control.Alert;

import static com.example.final1.TeamSelectionScreen.Logom;
import static com.example.final1.TeamSelectionScreen.Takim;

public class Oyun implements Initializable {

    Random rand = new Random();
    private int sayac=1;
    private int sayac2=0;
    private final Map<String, Integer> puanDurumuMap = new HashMap<>();
    @FXML private TextArea sonucekrani;
    @FXML private ImageView Logo;
    @FXML private Label Takimim;
    @FXML private Label takimlariyazdir;
    @FXML private Label oyuncu1;
    @FXML private Label oyuncu2;
    @FXML private Label oyuncu3;
    @FXML private Label oyuncu4;
    @FXML private Label oyuncu5;
    @FXML private Label oyuncu6;
    @FXML private Label oyuncu7;
    @FXML private Label oyuncu8;
    @FXML private Label oyuncu9;
    @FXML private Label oyuncu10;
    @FXML private Label oyuncu11;
    @FXML private Button closeButton;
    @FXML private Label Kazanmayuzdesi;
    @FXML private Button Oyunubaslat;
    @FXML private Label Rakipbilgileri;
    @FXML private Label Kazanmaihtimali;
    @FXML private Button Macibaslat;
    @FXML private Label Kullaniciadim;
    @FXML private ImageView arkaplan3;

    String[] takimlar = {
            "Fenerbahçe", "Galatasaray", "Beşiktaş", "Rizespor",
            "Sivasspor", "Eyüpspor", "Göztepe",
            "Başakşehir", "Trabzonspor", "Konyaspor"
    };
    String asadayazacakyazi;


    public ArrayList<String> takimlistesi = new ArrayList<>(Arrays.asList(takimlar));

    @Override
    public void initialize(URL location, ResourceBundle resources) {

        Image image2 = new Image(Objects.requireNonNull(getClass().getResourceAsStream("/images/fm1.png")));
        arkaplan3.setImage(image2);
        arkaplan3.setPreserveRatio(false);

        for (String takim : takimlistesi) {
            puanDurumuMap.put(takim, 0);
        }
        puanDurumuMap.put(Takim, 0);

        asadayazacakyazi = TeamSelectionScreen.Kullaniciadi;
        Kullaniciadim.setText(asadayazacakyazi);

        takimlistesi.remove(Takim);
        Takimim.setText(Takim);

        StringBuilder takimlarText = new StringBuilder();
        for (String takim : takimlistesi) {
            takimlarText.append(takim).append("\n\n");
        }
        takimlariyazdir.setText(takimlarText.toString());

        Image image = new Image(Objects.requireNonNull(getClass().getResourceAsStream(Logom)));
        Logo.setImage(image);

        List<String> oyuncular = Oyuncular.getOyuncular(Takim);
        String oyuncu1Name = !oyuncular.isEmpty() ? oyuncular.get(0) : "Oyuncu yok";
        oyuncu1.setText(oyuncu1Name + ": " + Oyuncular.getOyuncuBilgileri(Takim, oyuncu1Name));
        String oyuncu2Name = oyuncular.size() > 1 ? oyuncular.get(1) : "Oyuncu yok";
        oyuncu2.setText(oyuncu2Name + ": " + Oyuncular.getOyuncuBilgileri(Takim, oyuncu2Name));
        String oyuncu3Name = oyuncular.size() > 2 ? oyuncular.get(2) : "Oyuncu yok";
        oyuncu3.setText(oyuncu3Name + ": " + Oyuncular.getOyuncuBilgileri(Takim, oyuncu3Name));
        String oyuncu4Name = oyuncular.size() > 3 ? oyuncular.get(3) : "Oyuncu yok";
        oyuncu4.setText(oyuncu4Name + ": " + Oyuncular.getOyuncuBilgileri(Takim, oyuncu4Name));
        String oyuncu5Name = oyuncular.size() > 4 ? oyuncular.get(4) : "Oyuncu yok";
        oyuncu5.setText(oyuncu5Name + ": " + Oyuncular.getOyuncuBilgileri(Takim, oyuncu5Name));
        String oyuncu6Name = oyuncular.size() > 5 ? oyuncular.get(5) : "Oyuncu yok";
        oyuncu6.setText(oyuncu6Name + ": " + Oyuncular.getOyuncuBilgileri(Takim, oyuncu6Name));
        String oyuncu7Name = oyuncular.size() > 6 ? oyuncular.get(6) : "Oyuncu yok";
        oyuncu7.setText(oyuncu7Name + ": " + Oyuncular.getOyuncuBilgileri(Takim, oyuncu7Name));
        String oyuncu8Name = oyuncular.size() > 7 ? oyuncular.get(7) : "Oyuncu yok";
        oyuncu8.setText(oyuncu8Name + ": " + Oyuncular.getOyuncuBilgileri(Takim, oyuncu8Name));
        String oyuncu9Name = oyuncular.size() > 8 ? oyuncular.get(8) : "Oyuncu yok";
        oyuncu9.setText(oyuncu9Name + ": " + Oyuncular.getOyuncuBilgileri(Takim, oyuncu9Name));
        String oyuncu10Name = oyuncular.size() > 9 ? oyuncular.get(9) : "Oyuncu yok";
        oyuncu10.setText(oyuncu10Name + ": " + Oyuncular.getOyuncuBilgileri(Takim, oyuncu10Name));
        String oyuncu11Name = oyuncular.size() > 10 ? oyuncular.get(10) : "Oyuncu yok";
        oyuncu11.setText(oyuncu11Name + ": " + Oyuncular.getOyuncuBilgileri(Takim, oyuncu11Name));

    }
    @FXML
    public void oyuncularigoster() {
        oyuncu1.setVisible(true);
        oyuncu2.setVisible(true);
        oyuncu3.setVisible(true);
        oyuncu4.setVisible(true);
        oyuncu5.setVisible(true);
        oyuncu6.setVisible(true);
        oyuncu7.setVisible(true);
        oyuncu8.setVisible(true);
        oyuncu9.setVisible(true);
        oyuncu10.setVisible(true);
        oyuncu11.setVisible(true);
    }
    @FXML
    public void oyuncularigizle() {
        oyuncu1.setVisible(false);
        oyuncu2.setVisible(false);
        oyuncu3.setVisible(false);
        oyuncu4.setVisible(false);
        oyuncu5.setVisible(false);
        oyuncu6.setVisible(false);
        oyuncu7.setVisible(false);
        oyuncu8.setVisible(false);
        oyuncu9.setVisible(false);
        oyuncu10.setVisible(false);
        oyuncu11.setVisible(false);
    }


    @FXML
    public void haftalar() {
        int yuzde = rand.nextInt(50) + 40;

        if(sayac<= 9 )
        {Kazanmayuzdesi.setText(String.valueOf(yuzde)); }

        if (sayac <= 9) {
            sayac++;
            List<String> takimlarHaftalik = new ArrayList<>(takimlistesi);
            takimlarHaftalik.add(Takim);
            Collections.shuffle(takimlarHaftalik);

            StringBuilder sonucText = new StringBuilder();
            sonucText.append("\n\n\n===")
                    .append(sayac-1)
                    .append(". Hafta Sonuçları ===\n");

            for (int i = 0; i < takimlarHaftalik.size(); i += 2) {
                String evSahibi = takimlarHaftalik.get(i);
                String misafir = takimlarHaftalik.get(i + 1);

                int evSahibiSkor = rand.nextInt(5);
                int misafirSkor = rand.nextInt(5);


                if (evSahibiSkor > misafirSkor) {
                    puanDurumuMap.put(evSahibi, puanDurumuMap.get(evSahibi) + 3);
                    sonucText.append(evSahibi).append(" ").append(evSahibiSkor)
                            .append(" - ").append(misafirSkor).append(" ").append(misafir)
                            .append(" (Kazanan: ").append(evSahibi).append(")\n");
                } else if (evSahibiSkor < misafirSkor) {
                    puanDurumuMap.put(misafir, puanDurumuMap.get(misafir) + 3);
                    sonucText.append(evSahibi).append(" ").append(evSahibiSkor)
                            .append(" - ").append(misafirSkor).append(" ").append(misafir)
                            .append(" (Kazanan: ").append(misafir).append(")\n");
                } else {
                    puanDurumuMap.put(evSahibi, puanDurumuMap.get(evSahibi) + 1);
                    puanDurumuMap.put(misafir, puanDurumuMap.get(misafir) + 1);
                    sonucText.append(evSahibi).append(" ").append(evSahibiSkor)
                            .append(" - ").append(misafirSkor).append(" ").append(misafir)
                            .append(" (Beraberlik)\n");
                }
            }

            // Puan Durumu Yazdırma
            StringBuilder puanDurumuText = new StringBuilder("=== Puan Durumu ===\n");
            puanDurumuMap.entrySet()
                    .stream()
                    .sorted(Map.Entry.<String, Integer>comparingByValue().reversed())
                    .forEach(entry -> puanDurumuText.append(entry.getKey())
                            .append(": ")
                            .append(entry.getValue())
                            .append(" Puan\n"));

            sonucekrani.setText(sonucText + puanDurumuText.toString());


            if (sayac2 == 8) {

                int maxPuan = puanDurumuMap.values().stream().max(Integer::compareTo).orElse(0);
                int takimPuan = puanDurumuMap.getOrDefault(Takim, 0);

                Alert alert = new Alert(Alert.AlertType.INFORMATION);
                if (takimPuan == maxPuan) {

                    alert.setTitle("Tebrikler!");
                    alert.setHeaderText(null);
                    alert.setContentText("Tebrikler, kazandınız!");
                    alert.showAndWait();
                    Stage stage = (Stage) alert.getOwner();
                    if (stage != null) {
                        stage.toFront();
                    }
                }
                else {
                    alert.setTitle("Lose");
                    alert.setHeaderText(null);
                    alert.setContentText("Kaybettiniz.");
                    alert.showAndWait();
                    Stage stage = (Stage) alert.getOwner();
                    if (stage != null) {
                        stage.toFront();
                    }
                }
            }
        }
        sayac2++;
    }






    @FXML
    public void baslat() {
        Oyunubaslat.setVisible(false);
        Kazanmaihtimali.setVisible(true);
        Rakipbilgileri.setVisible(true);
        Macibaslat.setVisible(true);
        Kazanmayuzdesi.setVisible(true);
    }

    public void openScene4(ActionEvent event) throws IOException {

        FXMLLoader loaderr = new FXMLLoader(getClass().getResource("bilgiler.fxml"));
        Scene newScene = new Scene(loaderr.load());
        Stage stage = (Stage) ((Node) event.getSource()).getScene().getWindow();
        stage.close();
        stage.setScene(newScene);
        stage.setFullScreen(true);
        TakimBilgileriController takimBilgileriController = loaderr.getController();
        takimBilgileriController.setStage(stage);
        stage.show();

    }

    public void setStage() {
    }

    @FXML
    public void closeScene() {
        Stage stage = (Stage) closeButton.getScene().getWindow();
        stage.close();
    }
}
