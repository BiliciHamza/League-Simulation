package com.example.final1;

import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Node;
import javafx.scene.Scene;
import javafx.scene.control.ChoiceBox;
import javafx.scene.control.Label;
import javafx.stage.Stage;
import javafx.event.ActionEvent;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import java.io.IOException;
import java.net.URL;
import java.util.List;
import java.util.Objects;
import java.util.ResourceBundle;
import static com.example.final1.TeamSelectionScreen.Takim;

public class TakimBilgileriController implements Initializable {

    @FXML
    private ImageView Logo;
    @FXML
    private ChoiceBox<String> sec;
    @FXML
    private Label rakipadi;
    @FXML
    private Label rakip1;
    @FXML
    private Label rakip2;
    @FXML
    private Label rakip3;
    @FXML
    private Label rakip4;
    @FXML
    private Label rakip5;
    @FXML
    private Label rakip6;
    @FXML
    private Label rakip7;
    @FXML
    private Label rakip8;
    @FXML
    private Label rakip9;
    @FXML
    private Label rakip10;
    @FXML
    private Label rakip11;
    @FXML
    private ImageView arkaplan4;

    Oyun nesne = new Oyun();

    @Override
    public void initialize(URL location, ResourceBundle resources) {

        Image image = new Image(Objects.requireNonNull(getClass().getResourceAsStream("/images/fm1.png")));

        arkaplan4.setImage(image);
        arkaplan4.setPreserveRatio(false);

        nesne.takimlistesi.remove(Takim);
        sec.getItems().addAll(nesne.takimlistesi);

        sec.setOnAction(_ -> bilgilerigoster());
    }

    public void bilgilerigoster() {
        String logoyolu;
        String secilenTakim = sec.getValue();

        logoyolu = switch (secilenTakim) {
            case "Fenerbahçe" -> "/images/fenerbahce.png";
            case "Galatasaray" -> "/images/galatasaray.png";
            case "Beşiktaş" -> "/images/besiktas.png";
            case "Rizespor" -> "/images/rizespor.png";
            case "Sivasspor" -> "/images/sivasspor.png";
            case "Eyüpspor" -> "/images/eyupspor.png";
            case "Göztepe" -> "/images/goztepe.png";
            case "Başakşehir" -> "/images/basaksehir.png";
            case "Trabzonspor" -> "/images/trabzonspor.png";
            case "Konyaspor" -> "/images/konyaspor.png";
            default -> "Bilinmeyen takım";
        };

        Image image = new Image(Objects.requireNonNull(getClass().getResourceAsStream(logoyolu)));
        Logo.setImage(image);
        rakipadi.setText(secilenTakim);
        List<String> oyuncular = Oyuncular.getOyuncular(secilenTakim);

        rakip1.setText(oyuncular.get(0) + ": " + Oyuncular.getOyuncuBilgileri(secilenTakim, oyuncular.get(0)));
        rakip2.setText(oyuncular.get(1) + ": " + Oyuncular.getOyuncuBilgileri(secilenTakim, oyuncular.get(1)));
        rakip3.setText(oyuncular.get(2) + ": " + Oyuncular.getOyuncuBilgileri(secilenTakim, oyuncular.get(2)));
        rakip4.setText(oyuncular.get(3) + ": " + Oyuncular.getOyuncuBilgileri(secilenTakim, oyuncular.get(3)));
        rakip5.setText(oyuncular.get(4) + ": " + Oyuncular.getOyuncuBilgileri(secilenTakim, oyuncular.get(4)));
        rakip6.setText(oyuncular.get(5) + ": " + Oyuncular.getOyuncuBilgileri(secilenTakim, oyuncular.get(5)));
        rakip7.setText(oyuncular.get(6) + ": " + Oyuncular.getOyuncuBilgileri(secilenTakim, oyuncular.get(6)));
        rakip8.setText(oyuncular.get(7) + ": " + Oyuncular.getOyuncuBilgileri(secilenTakim, oyuncular.get(7)));
        rakip9.setText(oyuncular.get(8) + ": " + Oyuncular.getOyuncuBilgileri(secilenTakim, oyuncular.get(8)));
        rakip10.setText(oyuncular.get(9) + ": " + Oyuncular.getOyuncuBilgileri(secilenTakim, oyuncular.get(9)));
        rakip11.setText(oyuncular.get(10) + ": " + Oyuncular.getOyuncuBilgileri(secilenTakim, oyuncular.get(10)));


        rakip1.setVisible(true);
        rakip2.setVisible(true);
        rakip3.setVisible(true);
        rakip4.setVisible(true);
        rakip5.setVisible(true);
        rakip6.setVisible(true);
        rakip7.setVisible(true);
        rakip8.setVisible(true);
        rakip9.setVisible(true);
        rakip10.setVisible(true);
        rakip11.setVisible(true);
        rakipadi.setVisible(true);
    }

    @FXML
    public void geriDon(ActionEvent event) throws IOException {
        FXMLLoader loader = new FXMLLoader(getClass().getResource("oyun2.fxml"));
        Scene sahneyedon = new Scene(loader.load());
        Stage stage = (Stage) ((Node) event.getSource()).getScene().getWindow();
        stage.close();
        stage.setScene(sahneyedon);
        stage.setFullScreen(true);
        stage.show();
    }

    public void setStage(Stage ignoredStage) {
    }
}
