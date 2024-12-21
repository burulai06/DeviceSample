package com.example.demo13;

import javafx.fxml.FXML;
import javafx.scene.control.*;

public class HelloController {
    @FXML
    private TextField textNameSmartphone;
    @FXML
    private TextField textPriceSmartphone;
    @FXML
    private TextField textWeightSmartphone;
    @FXML
    private TextField textScreenSize;
    @FXML
    private TextField textCameraResolution;

    @FXML
    private TextField textNameLaptop;
    @FXML
    private TextField textPriceLaptop;
    @FXML
    private TextField textWeightLaptop;
    @FXML
    private TextField textRamSize;
    @FXML
    private TextField textProcessorType;

    @FXML
    private TextField textNameTablet;
    @FXML
    private TextField textPriceTablet;
    @FXML
    private TextField textWeightTablet;
    @FXML
    private TextField textBatteryLife;
    @FXML
    private TextField textHasStylus;

    @FXML
    private ListView<String> listView;
    @FXML
    private Label label;

    // Метод для добавления устройства
    @FXML
    private void onAddClick() {
        String name = textNameSmartphone.getText(); // Измените в зависимости от активной вкладки
        listView.getItems().add("Added: " + name);
    }

    // Метод для удаления устройства
    @FXML
    private void onRemoveClick() {
        String selectedItem = listView.getSelectionModel().getSelectedItem();
        if (selectedItem != null) {
            listView.getItems().remove(selectedItem);
        }
    }
}
