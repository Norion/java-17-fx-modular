package com.example.graphics;

import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;


public class GraphicsController {


    @FXML
    public TextField width;
    @FXML
    public TextField height;
    @FXML
    public TextField circumference;
    @FXML
    public TextField area;
    @FXML
    public Button compute;



    private Double getWidth(){
        return Double.parseDouble(width.getText());
    }
    private Double getHeight(){
        return Double.parseDouble(height.getText());
    }

    private Rectangular rectangle;

    public void onComputeClick() {
        rectangle = new Rectangular(1.2,1.0, getHeight(), getWidth());
        area.setText(String.valueOf(rectangle.computeArea()));
        circumference.setText(String.valueOf(rectangle.computeCircumference()));

    }
}
