package com.example.calculator;


import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.geometry.Insets;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.scene.layout.Background;
import javafx.scene.layout.BackgroundFill;
import javafx.scene.layout.CornerRadii;
import javafx.scene.paint.Color;

import java.net.URL;
import java.util.ResourceBundle;


public class CalculatorController implements Initializable {

    Calculator calc = new Calculator();

    @FXML
    public TextField number1;
    @FXML
    public TextField number2;
    @FXML
    public TextField result;
    @FXML
    public Button addition;
    @FXML
    public Button subtraction;
    @FXML
    public Button multiplication;
    @FXML
    public Button division;

    private Double getNumberOne(){
        return Double.parseDouble(number1.getText());
    }
    private Double getNumberTwo(){
        return Double.parseDouble(number2.getText());
    }

    @FXML
    public void onAddClick() {
        result.setText(String.valueOf(calc.add(getNumberOne(), getNumberTwo())));
    }
    @FXML
    public void onSubtractClick() {
        result.setText(String.valueOf(calc.subtract(getNumberOne(), getNumberTwo())));
    }
    @FXML
    public void onMultiplyClick() {
        result.setText(String.valueOf(calc.multiply(getNumberOne(), getNumberTwo())));
    }
    @FXML
    public void onDivideClick() {
        result.setText(String.valueOf(calc.divide(getNumberOne(), getNumberTwo())));
    }

    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {
        result.setEditable(false);
        result.setMouseTransparent(true);
        result.setFocusTraversable(false);
        result.setBackground(new Background(new BackgroundFill(Color.CORNFLOWERBLUE, CornerRadii.EMPTY, Insets.EMPTY)));

        textFieldStyleRed(number1);
        textFieldStyleRed(number2);
        handleButtonState();
        setChangeListener(number1);
        setChangeListener(number2);
    }

    boolean number1correct = false;
    boolean number2correct = false;

    private void setChangeListener(TextField textField){
        textField.textProperty().addListener((observable, oldValue, newValue) ->{
            try{
                Double.parseDouble(newValue);
                if(textField == number1){
                    number1correct = true;
                }else number2correct=true;
                textField.setStyle("-fx-focus-color: green; -fx-faint-focus-color: rgba(102,255,0,0.21);");
            } catch (NumberFormatException e) {
                if (textField==number1){
                    number1correct = false;
                }else number2correct=false;
                textFieldStyleRed(textField);
            }finally {
                handleButtonState();
            }
        });
    }

    private void handleButtonState(){
        changeAllButtonStates(!(number1correct && number2correct));
    }

    private void changeAllButtonStates(boolean states){
        //boolean invert = !states;
        addition.setDisable(states);
        subtraction.setDisable(states);
        multiplication.setDisable(states);
        division.setDisable(states);
    }

    private void textFieldStyleRed(TextField textField){
        textField.setStyle("-fx-focus-color: red; -fx-faint-focus-color: #ff000022;");
    }
}

