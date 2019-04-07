/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package summer.project;
import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.scene.image.Image;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.scene.text.Font;
import javafx.scene.text.FontWeight;
import javafx.stage.Stage;
/**
 *
 * @author Amir Ahsan
 */

public class viewData{
    
    Stage window;
    TableView<fund> tbl;
    ObservableList<fund> funds;
    
    /**
     *
     * @param st
     * @throws java.io.IOException
     */
    public void display(Stage st) throws IOException {
        window=st;
        
         Label heading=new Label("Applicants Detail");
        heading.setFont(Font.font("Verdana", FontWeight.BOLD, 30));
        
        VBox vbox=new VBox();
        vbox.getChildren().addAll(heading);
        vbox.setAlignment(Pos.CENTER);
        
         window.getIcons().add(new Image("/summer/project/image/Indian_Railway.png"));
        TableColumn<fund,String> namecol=new TableColumn<>("Name");
        //namecol.setMinWidth(200);
        namecol.setCellValueFactory(new PropertyValueFactory<>("name"));
        
        TableColumn<fund,String> fhnamecol=new TableColumn<>("Father / Husband");
        fhnamecol.setCellValueFactory(new PropertyValueFactory<>("fhname"));
        
        TableColumn<fund,String> emailcol=new TableColumn<>("Email");
        emailcol.setCellValueFactory(new PropertyValueFactory<>("email"));
        
        TableColumn<fund,String> desigcol=new TableColumn<>("Designation");
        desigcol.setCellValueFactory(new PropertyValueFactory<>("desig"));
        
        TableColumn<fund,String> work_undercol=new TableColumn<>("Working Under");
        work_undercol.setCellValueFactory(new PropertyValueFactory<>("work_under"));
        
        TableColumn<fund,String> stationcol=new TableColumn<>("Station");
        stationcol.setCellValueFactory(new PropertyValueFactory<>("station"));
        
        TableColumn<fund,String> depcol=new TableColumn<>("Department");
        depcol.setCellValueFactory(new PropertyValueFactory<>("dep"));
        
        TableColumn<fund,String> do_appointcol=new TableColumn<>("Date of Appointment");
        do_appointcol.setCellValueFactory(new PropertyValueFactory<>("do_appoint"));
        
        TableColumn<fund,String> do_retcol=new TableColumn<>("Date Of Retirement");
        do_retcol.setCellValueFactory(new PropertyValueFactory<>("do_ret"));
        
        TableColumn<fund,String> rate_paycol=new TableColumn<>("Rate of Pay");
        rate_paycol.setCellValueFactory(new PropertyValueFactory<>("rate_pay"));
        
        TableColumn<fund,String> do_appcol=new TableColumn<>("Date Of Application");
        do_appcol.setCellValueFactory(new PropertyValueFactory<>("do_app"));
        
        TableColumn<fund,String> rswithdrawlcol=new TableColumn<>("Reson of Withdrawl");
        rswithdrawlcol.setCellValueFactory(new PropertyValueFactory<>("rswithdrawl"));
        
        TableColumn<fund,String> final_tempcol=new TableColumn<>("Final / Temp");
        final_tempcol.setCellValueFactory(new PropertyValueFactory<>("final_temp"));
        
        TableColumn<fund,String> do_sanccol=new TableColumn<>("Date Of Sanction");
        do_sanccol.setCellValueFactory(new PropertyValueFactory<>("do_sanc"));
        
        TableColumn<fund,Double> bill_unitcol=new TableColumn<>("Bill Unit");
        bill_unitcol.setCellValueFactory(new PropertyValueFactory<>("bill_unit"));
        
        TableColumn<fund,Double> amt_availcol=new TableColumn<>("Amount Available");
        amt_availcol.setCellValueFactory(new PropertyValueFactory<>("amt_avail"));
        
        TableColumn<fund,Double> amt_percol=new TableColumn<>("Amount Permissible");
        amt_percol.setCellValueFactory(new PropertyValueFactory<>("amt_per"));
        
        TableColumn<fund,Double> amt_appcol=new TableColumn<>("Amount Applied for");
        amt_appcol.setCellValueFactory(new PropertyValueFactory<>("amt_app"));
        
        TableColumn<fund,Double> amt_sanccol=new TableColumn<>("Amount Sanctioned");
        amt_sanccol.setCellValueFactory(new PropertyValueFactory<>("amt_sanc"));
        
        TableColumn<fund,String> contactcol= new TableColumn<>("Contact");
        contactcol.setCellValueFactory(new PropertyValueFactory<>("contact"));
        
        tbl=new TableView<>();
        tbl.setItems(this.getfund());
        tbl.getColumns().addAll(namecol,fhnamecol,emailcol,desigcol,work_undercol,stationcol,depcol,do_appointcol,do_retcol,rate_paycol,do_appcol,rswithdrawlcol,final_tempcol,do_sanccol,bill_unitcol,amt_availcol,amt_percol,amt_appcol,amt_sanccol,contactcol);
    
        Button homebtn=new Button("Home");
        SummerProject obj=new SummerProject();        
        homebtn.setOnAction(e->obj.start(st));
       //homebtn.setVisible(false);
       
        HBox hbox1=new HBox();
        hbox1.setPadding(new Insets(10,10,10,10));
        hbox1.setSpacing(10);
        hbox1.setAlignment(Pos.CENTER);
        hbox1.getChildren().addAll(heading);
        
        HBox hBox=new HBox();
        hBox.setPadding(new Insets(10,10,10,10));
        hBox.setSpacing(10);
        hBox.getChildren().addAll(homebtn);
     
        VBox vBox=new VBox();
        vBox.getChildren().addAll(hbox1,hBox,tbl);
        Scene scene = new Scene(vBox,1350,675);
        
        window.setTitle("Application Detail");
        window.setScene(scene);
        window.show();
    }
    
    public ObservableList<fund> getfund(){
        
        try{
                Class.forName("org.apache.derby.jdbc.ClientDriver");
                Connection con=DriverManager.getConnection("jdbc:derby://localhost:1527/training;create=true","ncralld","ncralld@123");
                String query="select * from NCRALLD.RECORD where CONFIRM=TRUE";
                PreparedStatement stmt=con.prepareStatement(query);
               ResultSet rs=stmt.executeQuery();
               funds=FXCollections.observableArrayList();
                       while(rs.next())
                       {
              funds.add(new fund(rs.getString(1),rs.getString(6),rs.getString(2),rs.getString(8),rs.getString(9),rs.getString(10),rs.getString(11),rs.getString(13),rs.getString(14),rs.getString(15),rs.getString(16),rs.getString(25),rs.getString(18),rs.getString(22),Double.parseDouble(rs.getString(12)),Double.parseDouble(rs.getString(18)),Double.parseDouble(rs.getString(19)),Double.parseDouble(rs.getString(20)),Double.parseDouble(rs.getString(21)),rs.getString(3))); 
                    }
               }catch(ClassNotFoundException | SQLException exp){
                exp.printStackTrace();
            }
        
                return funds;
    }

   
}
