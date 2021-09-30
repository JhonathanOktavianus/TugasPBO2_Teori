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
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.stage.Stage;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;

public class ControllerTugasTeori1 implements Initializable {
    @FXML
    private TableView<Student> table;

    @FXML
    private TableColumn<Student, String> col1;

    @FXML
    private TableColumn<com.example.tugaspertemuan3_1972015_1972037_1972046.Student, String> col2;

    @FXML
    private TableColumn<com.example.tugaspertemuan3_1972015_1972037_1972046.Student, String> col3;

    @FXML
    private TableColumn<com.example.tugaspertemuan3_1972015_1972037_1972046.Student, String> col4;

    @FXML
    private TableColumn<com.example.tugaspertemuan3_1972015_1972037_1972046.Student, String> col5;

    private ObservableList<Student> students;
    private ObservableList<Double> kat;
    private ObservableList<Double> uts;
    private ObservableList<Double> uas;
    private ObservableList<Double> rata;

    public ObservableList<Student> getStudent() {
        return students;
    }

    public void buttonAction(ActionEvent event) throws IOException {
        Stage new_stage = new Stage();
        FXMLLoader loader = new FXMLLoader(getClass().getResource("ViewTugasTeori2.fxml"));
        Parent root = loader.load();
        ControllerTugasTeori2 ctrl2 = loader.getController();
        ctrl2.setController(this);

        Scene new_scene = new Scene(root);

        new_stage.setScene(new_scene);
        new_stage.show();
    }

    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {
        students = FXCollections.observableArrayList();
        kat = FXCollections.observableArrayList();
        uts = FXCollections.observableArrayList();
        uas = FXCollections.observableArrayList();
        rata = FXCollections.observableArrayList();
        table.setItems(students);
        col1.setCellValueFactory(data-> new SimpleStringProperty(data.getValue().getNama()));
        col2.setCellValueFactory(data-> new SimpleStringProperty(data.getValue().getStringKAT()));
        col3.setCellValueFactory(data-> new SimpleStringProperty(data.getValue().getStringUTS()));
        col4.setCellValueFactory(data-> new SimpleStringProperty(data.getValue().getStringUAS()));
        col5.setCellValueFactory(data-> new SimpleStringProperty(data.getValue().getStringRata()));
        }
}
