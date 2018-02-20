package com.dhamacher.retailwarehousepoc;

import com.dhamacher.retailwarehousepoc.model.Car;
import java.io.IOException;
import java.net.URL;
import java.util.List;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.AnchorPane;

public class FXMLController implements Initializable {
    
    private FXMLLoader loader;    
    
    @FXML
    private Label label;
    @FXML
    private AnchorPane start;
    @FXML
    private Button button;
    
//    @FXML
//    private void handleButtonAction(ActionEvent event) {
//         Car newCar = new Car();
//
//        newCar.setName("Toyota");
//        newCar.setPrice(34500);
//
//        CarService.save(newCar);
//
//        List<Car> cars = CarService.getCars();
//
//        for (Car mycar : cars) {
//
//            System.out.println(mycar);
//        }
//
//        HibernateUtil.shutdown();        
//        label.setText("Hello World!");        
//    }
    
     @FXML
    private void handleButtonAction(ActionEvent event) throws IOException {
        AnchorPane root = FXMLLoader.load(getClass().getResource("/fxml/Home.fxml")); 
        start.getChildren().setAll(root);
    }
    
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        //        
    }    
}
