/**
 * 1972015 Andreas Yoseph Liandy
 * 1972037 Gabriel Octa Mahardika
 * 1972046 Jhonathan Oktavianus
 */

package com.example.tugaspertemuan3_1972015_1972037_1972046;

import javafx.beans.property.SimpleStringProperty;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.layout.BorderPane;
import javafx.stage.Stage;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;

public class ControllerTugasTeori2{
    public BorderPane baseLayout;
    @FXML
    private TextField txtNama;

    @FXML
    private TextField txtUAS;

    @FXML
    private TextField txtKAT;

    @FXML
    private TextField txtUTS;

    private Stage stage;

    private ObservableList<Student> students;

    private ControllerTugasTeori1 ctrl1;

    public void setController(ControllerTugasTeori1 ctrl1) {
        this.ctrl1 = ctrl1;
    }

    public void buttonAction2(ActionEvent event) throws IOException {
        Student student = new Student();
        student.setNama(txtNama.getText());
        student.setKAT(Double.parseDouble(txtKAT.getText()));
        student.setUAS(Double.parseDouble(txtUAS.getText()));
        student.setUTS(Double.parseDouble(txtUTS.getText()));
        ctrl1.getStudent().add(student);
        txtNama.setText(null);
        txtKAT.setText(null);
        txtUAS.setText(null);
        txtUTS.setText(null);

        stage = (Stage) baseLayout.getScene().getWindow();
        stage.close();

     }
}