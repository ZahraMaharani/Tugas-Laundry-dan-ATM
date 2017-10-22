/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package laundry1;

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
import javax.swing.JOptionPane;

/**
 * FXML Controller class
 *
 * @author SMK TELKOM
 */
public class FXMLDocumentController implements Initializable {

    @FXML
    private Label label;
    @FXML
    private Label label1;
    @FXML
    private TextField nama;
    @FXML
    private TextField alamat;
    @FXML
    private TextField berat;
    @FXML
    private TextField nomor;
    @FXML
    private RadioButton ck;
    @FXML
    private ToggleGroup PilihanPaket;
    @FXML
    private RadioButton cks;
    @FXML
    private RadioButton s;
    @FXML
    private TextField tanggal;
    @FXML
    private Button oke;
    @FXML
    private Button hapus;
    @FXML
    private TextArea hasil;

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    

    @FXML
    private void oke(ActionEvent event) {
         String paket="";
        int harga=0;
        
        if(ck.isSelected())
        paket = "Cuci Kering";
        else if(cks.isSelected())
        paket = "Cuci Kering Setrika";
        else if(s.isSelected())
        paket = "Setrika";
        else
        paket="";
        
        if(!(ck.isSelected() || cks.isSelected() || s.isSelected() )){
           JOptionPane.showMessageDialog(null, "Harap pilih paket layanan");
        }else{
        String Nama = nama.getText();
        String Alamat = alamat.getText();
        String Berat = berat.getText();
        String Tanggal = tanggal.getText();
        int hitung = Integer.parseInt(berat.getText());
        
        if(ck.isSelected()){
           harga = hitung*5000;
        }
        if(cks.isSelected()){
           harga = hitung*8000;
        }
        if(s.isSelected()){
           harga = hitung*3000;
        }
        
        String nohp = nomor.getText();
        
        hasil.setText("Nama : "+Nama+"\nAlamat : "+Alamat+"\nBerat Cucian : "+Berat+"\nPembayaran yang harus dibayar : "+harga);
        
        
        }
        

    }

    @FXML
    private void hapus(ActionEvent event) {
         nama.setText("");
        alamat.setText("");
        berat.setText("");
        nomor.setText("");
        ck.setSelected(false);
        cks.setSelected(false);
        s.setSelected(false);
        tanggal.setText("");
    }

    }
    

