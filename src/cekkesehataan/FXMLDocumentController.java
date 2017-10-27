/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cekkesehataan;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.RadioButton;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;
import javafx.scene.control.ToggleGroup;

/**
 * FXML Controller class
 *
 * @author Pesek
 */
public class FXMLDocumentController implements Initializable {

    @FXML
    private Label label;
    @FXML
    private TextField editnama;
    @FXML
    private TextField edittinggi;
    @FXML
    private TextField editberat;
    @FXML
    private RadioButton rdLaki;
    @FXML
    private RadioButton rdPerempuan;
    @FXML
    private Button buttonproses;
    @FXML
    private Button buttonreset;
    @FXML
    private TextArea hasil;
    @FXML
    private TextArea saran;
    @FXML
    private ToggleGroup pilihan;
        @FXML
    private TextField ideal;

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    

    @FXML
    private void proses(ActionEvent event) {
        String nama=editnama.getText();
        int tinggi=Integer.parseInt(edittinggi.getText());
        int berat=Integer.parseInt(editberat.getText());
        
        int ideall = tinggi - 105;
        int idealp = tinggi - 110;
        String Saran = null;
        String analisa = null;
    
       
        if (rdLaki.isSelected()){
           
            if (ideall == berat){
                ideal.setText("50");
                analisa = "Ideal";
                Saran = "Saran : \n1. ok siipp";
            }else if (ideall > berat){
                ideal.setText("50");
                analisa = "UnderWeight";
                Saran = "Saran : \n1. Makan yang banyak \n2. Minum susu";
            }else if (ideall < berat){
                ideal.setText("50");
                analisa = "OverWeight";
                Saran = "Saran : \n1. Makan yang sedikit \n2. Jangan Minum susu";
                
            }
        }
       if (rdPerempuan.isSelected()){
            
            if (idealp==berat){
                ideal.setText("50");
                analisa = "Ideal";
                Saran = "Saran : \n1. ok siipp";
            }else if (idealp > berat){
                analisa = "UnderWeight";
                Saran = "Saran : \n1. Makan yang banyak \n2. Minum susu";
            }else if (idealp < berat){
                analisa = "OverWeight";
                Saran = "Saran : \n1. Makan yang sedikit \n2. Jangan Minum susu";
                
            }
        }            
          
    hasil.setText("Nama Anda: " +nama+"\n"+"Berat Anda : " +berat+"\n"+"Tinggi Anda : " +tinggi+"\n Anda: "+analisa);
   saran.setText(""+Saran);
 }
     

    @FXML
    private void reset(ActionEvent event) {
        hasil.setText("");
        editnama.setText("");
        edittinggi.setText("");
        editberat.setText("");
        ideal.setText("");
        saran.setText("");
        rdLaki.setSelected(false);
        rdPerempuan.setSelected(false);
    }
}

    
    


