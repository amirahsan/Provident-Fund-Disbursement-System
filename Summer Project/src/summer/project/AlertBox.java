/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package summer.project;
import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.StackPane;
import javafx.scene.layout.VBox;
import javafx.stage.Modality;
import javafx.stage.Stage;
/**
 *
 * @author Amir Ahsan
 */
public class AlertBox {
    
    public static void display(String title,String message){
        Stage window=new Stage();
        window.initModality(Modality.APPLICATION_MODAL);
        window.setTitle(title);
        window.setMinWidth(500);
        
        Label lbl=new Label();
        lbl.setText(message);
        
        Button btn=new Button("Ok");
        btn.setOnAction(e-> window.close());
        
        VBox layout=new VBox(10);
        layout.getChildren().addAll(lbl,btn);
        layout.setAlignment(Pos.CENTER);
        
        Scene sc=new Scene(layout);
        window.setScene(sc);
        window.show();
    }
    
}
