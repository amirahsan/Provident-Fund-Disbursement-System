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
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;
import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.ComboBox;
import javafx.scene.control.Label;
import javafx.scene.control.PasswordField;
import javafx.scene.control.RadioButton;
import javafx.scene.control.TextField;
import javafx.scene.control.ToggleGroup;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.StackPane;
import javafx.scene.layout.VBox;
import javafx.scene.text.Font;
import javafx.scene.text.FontPosture;
import javafx.scene.text.FontWeight;
import javafx.stage.Stage;

/**
 *
 * @author Amir Ahsan
 */
public class SummerProject extends Application {
    
     
      String email="",nm,cont;
      
    @Override
    public void start(Stage primaryStage) {
        Button btn = new Button();
        btn.setText("Next >");
        
        primaryStage.getIcons().add(new Image("/summer/project/image/Indian_Railway.png"));
        
        btn.setOnAction(e -> {
            if(!"".equals(email))
                try {
                    this.form1(primaryStage);
            } catch (SQLException ex) {
                Logger.getLogger(SummerProject.class.getName()).log(Level.SEVERE, null, ex);
            }
            else
            this.loginWindow(primaryStage); });
        //
         HBox hbox=new HBox();
         hbox.setPadding(new Insets(10,10,10,10));
         hbox.setSpacing(10);
         hbox.setAlignment(Pos.TOP_RIGHT);
         hbox.getChildren().add(btn);
         
        ImageView img=new ImageView(new Image("/summer/project/image/Indian_Railway.png"));
        img.setOpacity(0.1);
        img.setFitHeight(600);
        img.setFitWidth(700);
         
        String s="Provident fund is another name for pension fund."
                + "Its purpose is to provide employees with lump sum payments at the time of exit from their place of employment. "
                + "This differs pension funds, which have elements of both lump sum as well as monthly pension payments. "
                + "As far differences between gratuity and provident funds are concerned, although both types involve lump sum payments at the end of employment, the former operates as a defined contribution plan, while the latter is a defined benefit plan."
                + "\n\nProvident fund is one of the many benefits which any employee of any firm enjoy. It is a small part of the monthly salary from employee and the firm saved in the form of a fund to be provided to the employee as a lump sum amount after his or her retirement."
                + "\n\nA compulsory, government-managed retirement savings scheme used in India, Hong Kong, Singapore, Malaysia, Mexico and other countries that is similar to the United States’ Social Security program. It is run by a government for the benefit of its citizens. A provident fund is a form of social safety net into which workers must contribute a portion of their salaries and employers must contribute on behalf of their workers. The money in the fund is then paid out to retirees, or in some cases to the disabled who cannot work."
                + "\n\nProvident is one of the most successful small saving scheme meant for retirement planning of employees."
                + "\n\nProvident fund specifics vary widely by country, but their general purpose is to provide financial support for those who meet the plan’s defined retirement age. Governments set the age limit at which penalty-free withdrawals are allowed to begin. Some pre-retirement withdrawals may be allowed under special circumstances such as medical emergencies. In Swaziland, provident fund payouts can be claimed at any age if emigrating permanently. Those who work past the minimum retirement age may face restricted withdrawals until full retirement.\n\n\n";
        
        Label heading=new Label("Provident Fund");
        heading.setFont(Font.font("Verdana", FontWeight.BOLD, 50));
        
        
        Label lbl=new Label(s);
        lbl.setWrapText(true);
        lbl.setPadding(new Insets(10,50,50,50));
        lbl.setFont(Font.font("Verdana", FontWeight.BOLD, 16));
        
        Label label=new Label("Summer Project\n");
        
         HBox hbox1=new HBox();
         hbox1.setPadding(new Insets(0,50,10,0));
         hbox1.setSpacing(10);
         hbox1.setAlignment(Pos.BOTTOM_RIGHT);
         hbox1.getChildren().add(label);
        
        VBox vbox=new VBox();
        vbox.getChildren().addAll(hbox,heading,lbl,hbox1);
        vbox.setAlignment(Pos.CENTER);
        StackPane root = new StackPane();
        root.getChildren().addAll(img,vbox);
        
        Scene scene = new Scene(root,1350,675);
        
        primaryStage.setTitle("Summer Training - Employee Provident Fund");
        primaryStage.setScene(scene);
        primaryStage.show();
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        launch(args);
    }
    
    
    public void signUp(Stage st){
        
         st.setTitle("Summer Training - Signup");
        st.getIcons().add(new Image("/summer/project/image/Indian_Railway.png"));
        GridPane grid=new GridPane();
        grid.setPadding(new Insets(20,20,20,20));
        grid.setVgap(20);
        grid.setHgap(20);
        
        //Heading label
        Label headlbl=new Label("SignUp");
        headlbl.setFont(Font.font("Ariel",FontWeight.BOLD,35));
        GridPane.setConstraints(headlbl,15,1);
        
        //name label
        Label nmlbl=new Label("Name : ");
        GridPane.setConstraints(nmlbl, 15, 5);
        nmlbl.setFont(Font.font("Ariel", FontWeight.BOLD, 15));
        
        //name Input
        TextField nmtxt=new TextField();
        nmtxt.setPromptText("Name");
        GridPane.setConstraints(nmtxt, 16, 5);
        
        //Email label
        Label emaillbl=new Label("Email : ");
        GridPane.setConstraints(emaillbl, 15, 6);
        emaillbl.setFont(Font.font("Ariel", FontWeight.BOLD, 15));
        
        //Email Input
        TextField emailtxt=new TextField();
        emailtxt.setPromptText("Email");
        GridPane.setConstraints(emailtxt, 16, 6);
        
        
         //Contact label
        Label contactlbl=new Label("Contact : ");
        GridPane.setConstraints(contactlbl, 15, 7);
        contactlbl.setFont(Font.font("Ariel", FontWeight.BOLD, 15));
        
        //name Input
        TextField contacttxt=new TextField();
        contacttxt.setPromptText("Contact no");
        GridPane.setConstraints(contacttxt, 16, 7);
        
        
        //pass label
        Label passlbl=new Label("Create Password : ");
        GridPane.setConstraints(passlbl, 15, 8);
        passlbl.setFont(Font.font("Ariel", FontWeight.BOLD, 15));
        
        //pass Input
        PasswordField passtxt=new PasswordField();
        passtxt.setPromptText("Create Password");
        GridPane.setConstraints(passtxt, 16, 8);
        
        
        //Confirm pass label
        Label cpasslbl=new Label("Confirm Password : ");
        GridPane.setConstraints(cpasslbl, 15, 9);
        cpasslbl.setFont(Font.font("Ariel", FontWeight.BOLD, 15));
        
        //pass Input
        PasswordField cpasstxt=new PasswordField();
        cpasstxt.setPromptText("Confirm Password");
        GridPane.setConstraints(cpasstxt, 16, 9);
        
         //Back Button
        Button bckbtn=new Button("< Back");
        GridPane.setConstraints(bckbtn,0, 0);
        SummerProject obj=new SummerProject();
        bckbtn.setOnAction(e->this.loginWindow(st));
        
        //login Button
        Button loginbtn=new Button("SignUp");
        GridPane.setConstraints(loginbtn, 21, 12);
         loginbtn.setOnAction((ActionEvent e) -> {
             try{
                Class.forName("org.apache.derby.jdbc.ClientDriver");
                Connection con=DriverManager.getConnection("jdbc:derby://localhost:1527/training;create=true","ncralld","ncralld@123");
              
                String query="select * from NCRALLD.RECORD where EMAIL=?";
                PreparedStatement stmt=con.prepareStatement(query);
                stmt.setString(1, emailtxt.getText());
                ResultSet rs=stmt.executeQuery();
                if(rs.next()){
                    AlertBox.display("Alert", "This email has already registered");
                }else{
                    String query1="insert into NCRALLD.RECORD values('" +nmtxt.getText()+ "','"+emailtxt.getText()+"','"+contacttxt.getText()+"' , '"+passtxt.getText()+"' , '" +""+ "', '" +""+ "', '" +""+ "', '" +""+ "', '" +""+ "', '" +""+ "', '" +""+ "', '" +""+ "', '" +""+ "', '" +""+ "', '" +""+ "', '" +""+ "', '" +""+ "', '" +""+ "', '" +""+ "', '" +""+ "', '" +""+ "', '" +""+ "', '" +"False"+ "', '" +"False"+ "','"+""+"')";
                    Statement stmt1=con.createStatement();
                   int ans=stmt1.executeUpdate(query1);
                   if(ans>0){
                    AlertBox.display("Sucess", "Your Information Saved");
                    }else{
                    AlertBox.display("Alert", "Failed to Save Information");
                }
                }
                              
            }catch(ClassNotFoundException | SQLException exp){
                exp.printStackTrace();
            }     
        });
                
        grid.getChildren().addAll(bckbtn,headlbl,nmlbl,nmtxt,emaillbl,emailtxt,contactlbl,contacttxt,passlbl,passtxt,cpasslbl,cpasstxt,loginbtn);
        
        /*ImageView img=new ImageView(new Image("/summer/project/image/Indian_Railway.png"));
        img.setOpacity(0.05);
        img.setFitHeight(600);
        img.setFitWidth(700);*/
         
        
         
        StackPane root = new StackPane();
        root.getChildren().addAll(grid);
        Scene signUp=new Scene(root,1350,675);
        
        st.setScene(signUp);
        
        st.show();         
    }
    
    
    
    
    
    
   public void loginWindow(Stage st)
    {
        
        //st=new Stage();
        st.setTitle("Summer Training - Login");
         st.getIcons().add(new Image("/summer/project/image/Indian_Railway.png"));
        GridPane grid=new GridPane();
        grid.setPadding(new Insets(20,20,20,20));
        grid.setVgap(20);
        grid.setHgap(20);
        
        //Heading label
        Label headlbl=new Label("Login");
        GridPane.setConstraints(headlbl,15,1);
        headlbl.setFont(Font.font("Ariel", FontWeight.BOLD, 35));
        
        //name label
        Label nmlbl=new Label("Email : ");
        GridPane.setConstraints(nmlbl, 15, 6);
        nmlbl.setFont(Font.font("Ariel", FontWeight.BOLD, 15));
        
        //name Input
        TextField nmtxt=new TextField();
        nmtxt.setPromptText("Email");
        GridPane.setConstraints(nmtxt, 16, 6);
        
        //pass label
        Label passlbl=new Label("Password : ");
        GridPane.setConstraints(passlbl, 15, 7);
        passlbl.setFont(Font.font("Ariel", FontWeight.BOLD, 15));
        
        //pass Input
        PasswordField passtxt=new PasswordField();
        //TextField passtxt=new TextField();
        passtxt.setPromptText("Password");
        GridPane.setConstraints(passtxt, 16, 7);
        
         //Back Button
        Button bckbtn=new Button("< Back");
        //GridPane.setConstraints(bckbtn,0, 0);
        SummerProject obj=new SummerProject();
        bckbtn.setOnAction(e->obj.start(st));
        
        //Table button
        Button table=new Button("View Applicants");
       // GridPane.setConstraints(table, 0, 1);
        viewData vd=new viewData();
        table.setOnAction(e->{
            try {
                vd.display(st);
            } catch (IOException ex) {
                Logger.getLogger(SummerProject.class.getName()).log(Level.SEVERE, null, ex);
            }
        });
        
        //login Button
        Button loginbtn=new Button("Login");
        GridPane.setConstraints(loginbtn, 17, 9);
         loginbtn.setOnAction((ActionEvent e) -> {
            try{
                Class.forName("org.apache.derby.jdbc.ClientDriver");
                Connection con=DriverManager.getConnection("jdbc:derby://localhost:1527/training;create=true","ncralld","ncralld@123");
                String query="select * from NCRALLD.RECORD where EMAIL=? and PASS=?";
                PreparedStatement stmt=con.prepareStatement(query);
                stmt.setString(1, nmtxt.getText());
                stmt.setString(2, passtxt.getText());
                ResultSet rs=stmt.executeQuery();
                if(rs.next()){
                    if(rs.getBoolean(24)){
                        AdminViewData avd=new AdminViewData();
                        avd.display(st);
                    }
                    else{    
                    nm=rs.getString(1);
                    email=rs.getString(2);
                    cont=rs.getString(3);
                    this.form1(st);}
                }else{
                    AlertBox.display("Alert", "Invalid username or password");
                }
            }catch(ClassNotFoundException | SQLException exp){
                exp.printStackTrace();
            } catch (IOException ex) {
                Logger.getLogger(SummerProject.class.getName()).log(Level.SEVERE, null, ex);
            }
        });
        //New Button
        Button newbtn=new Button("New User ?");
        GridPane.setConstraints(newbtn, 18,9);
        newbtn.setOnAction(e->this.signUp(st));
        
         HBox hbox=new HBox();
         hbox.setPadding(new Insets(10,10,10,10));
        hbox.setSpacing(10);
        hbox.getChildren().addAll(bckbtn,table);
        
        grid.getChildren().addAll(hbox,headlbl,nmlbl,nmtxt,passlbl,passtxt,loginbtn,newbtn);
        grid.setStyle("-fx-background-image: url('images\\Indian_Railway.svg.png')");
        Scene login=new Scene(grid,1350,675);
        
        st.setScene(login);
        
        st.show();         
    }
   
   
   public void form1(Stage st) throws SQLException
    {
        st.setTitle("Summer Training - Personal Details");
         st.getIcons().add(new Image("/summer/project/image/Indian_Railway.png"));
        GridPane grid=new GridPane();
        grid.setPadding(new Insets(20,20,20,20));
        grid.setVgap(20);
        grid.setHgap(20);
        
        //Heading1 label
        Label head1lbl=new Label("Personal ");
        head1lbl.setFont(Font.font("Ariel", FontWeight.BOLD, 35));
        GridPane.setConstraints(head1lbl,10,1);
        
         //Heading2 label
        Label head2lbl=new Label("Details");
        head2lbl.setFont(Font.font("Ariel", FontWeight.BOLD, 35));
        GridPane.setConstraints(head2lbl,11,1);
        
        //name label
        Label nmlbl=new Label("Name : ");
        GridPane.setConstraints(nmlbl, 10, 2);
        
        
        //name label
        Label nmshowlbl=new Label(nm);
        GridPane.setConstraints(nmshowlbl, 11, 2);
        
        //dob label
        Label doblbl=new Label("DOB (DD/MM/YYYY) : ");
        GridPane.setConstraints(doblbl, 10, 3);
        
        
        //dob Input
        TextField dobtxt=new TextField();
        dobtxt.setPromptText("DD-MM-YYYY");
        GridPane.setConstraints(dobtxt, 11, 3);
        
        //father/husband label
        Label fhlbl=new Label("Father/Husband : ");
        GridPane.setConstraints(fhlbl, 10, 4);
        
        
        //father/husband Input
        TextField fhtxt=new TextField();
        fhtxt.setPromptText("Father/husband");
        GridPane.setConstraints(fhtxt, 11, 4);
        
        //contact label
        Label cntlbl=new Label("Contact no. : ");
        GridPane.setConstraints(cntlbl, 10, 5);
        
        
        //contact label
        Label cntshowlbl=new Label(cont);
        GridPane.setConstraints(cntshowlbl, 11, 5);
        
         //email label
        Label emaillbl=new Label("Email : ");
        GridPane.setConstraints(emaillbl, 10, 6);
        
        
        //email show label
        Label emailshowlbl=new Label("Email : ");
        emailshowlbl.setText(email);
        GridPane.setConstraints(emailshowlbl, 11, 6);
                
        //Adhaar label
        Label adhrlbl=new Label("Adhaar no. : ");
        GridPane.setConstraints(adhrlbl, 10, 7);
        
        
        //Adhaar Input
        TextField adhrtxt=new TextField();
        adhrtxt.setPromptText("Adhaar no.");
        GridPane.setConstraints(adhrtxt, 11, 7);
        
         //Logout Button
        Button bckbtn=new Button("Logout");
       // GridPane.setConstraints(bckbtn,0, 0);
        bckbtn.setOnAction(e-> {email="";this.start(st);});
        
        //Home button
        Button home=new Button("Home");
       // GridPane.setConstraints(home, 1, 0);
        home.setOnAction(e->this.start(st));
        
        //Table button
        Button table=new Button("View Applicants");
       // GridPane.setConstraints(table, 2, 0);
        viewData vd=new viewData();
        table.setOnAction(e->{
            try {
                vd.display(st);
            } catch (IOException ex) {
                Logger.getLogger(SummerProject.class.getName()).log(Level.SEVERE, null, ex);
            }
        });
        
        //save Button
        Button svbtn=new Button("Save");
        GridPane.setConstraints(svbtn, 22, 8);
        
        
      
        //Next Button
        Button nextbtn=new Button("Next >");
        GridPane.setConstraints(nextbtn, 23,8);
        nextbtn.setDisable(true);
        svbtn.setOnAction(e -> {
             try{
                Class.forName("org.apache.derby.jdbc.ClientDriver");
                Connection con=DriverManager.getConnection("jdbc:derby://localhost:1527/training;create=true","ncralld","ncralld@123");
                String query="update NCRALLD.RECORD set DOB='"+dobtxt.getText()+"',FHNAME='"+fhtxt.getText()+"',ADHAAR='"+adhrtxt.getText()+"'where email='"+email+"'";
                Statement stmt=con.createStatement();
                int ans=stmt.executeUpdate(query);
                if(ans>0){
                    AlertBox.display("Sucess", "Your Information Saved");
                    nextbtn.setDisable(false);
                }else{
                    AlertBox.display("Alert", "Failed to Save Information");
                }
            }catch(ClassNotFoundException | SQLException exp){
                exp.printStackTrace();
            }              
             });
        nextbtn.setOnAction(e -> this.form2(st));
        
        //pg1 label
        Label pg1lbl=new Label(" 1 ");
       GridPane.setConstraints(pg1lbl, 28, 0);
        
        //Next Button
        Button pg2btn=new Button(" 2 ");
       GridPane.setConstraints(pg2btn, 29,0);
        pg2btn.setOnAction(e -> this.form2(st));
        
        //Next Button
        Button pg3btn=new Button(" 3 ");
       GridPane.setConstraints(pg3btn, 30,0);
        
        pg3btn.setOnAction(e -> this.form3(st));
        
         HBox hbox=new HBox();
         hbox.setPadding(new Insets(10,10,10,10));
         hbox.setSpacing(10);
         hbox.getChildren().addAll(bckbtn,home,table);
         
                 
        grid.getChildren().addAll(hbox,head1lbl,head2lbl,doblbl,dobtxt,nmlbl,nmshowlbl,fhlbl,fhtxt,cntlbl,cntshowlbl,emaillbl,emailshowlbl,adhrlbl,adhrtxt,svbtn,nextbtn,pg1lbl,pg2btn,pg3btn);
        Scene login=new Scene(grid,1350,675);
        st.setScene(login);
        
        st.show(); 
    }
   
   
   
    public void form2(Stage st){
        
        st.setTitle("Summer Training - Professional Details");
         st.getIcons().add(new Image("/summer/project/image/Indian_Railway.png"));
        GridPane grid=new GridPane();
        grid.setPadding(new Insets(20,20,20,20));
        grid.setVgap(20);
        grid.setHgap(20);
        
        //Heading1 label
        Label head1lbl=new Label("Professional ");
        head1lbl.setFont(Font.font("Ariel", FontWeight.BOLD, 35));
        GridPane.setConstraints(head1lbl,10,1);
        
         //Heading2 label
        Label head2lbl=new Label("Details");
        head2lbl.setFont(Font.font("Ariel", FontWeight.BOLD, 35));
        GridPane.setConstraints(head2lbl,11,1);
        
        //Designation label
        Label deslbl=new Label("Designation : ");
        GridPane.setConstraints(deslbl, 10, 2);
        
        //Designation Input
        TextField destxt=new TextField();
        destxt.setPromptText("Designation");
        GridPane.setConstraints(destxt, 11, 2);
        
         //Working under label
        Label wulbl=new Label("Working Under : ");
        GridPane.setConstraints(wulbl, 10, 3);
        
        //Working under Input
        TextField wutxt=new TextField();
        wutxt.setPromptText("Working Under");
        GridPane.setConstraints(wutxt, 11, 3);
        
        //Station label
        Label stlbl=new Label("Station : ");
        GridPane.setConstraints(stlbl, 10, 4);
        
        //Station Input
       ComboBox<String> stcombo=new ComboBox<>();
        stcombo.getItems().addAll(
        "NYN","COI","KCN","BEP","MJA","UND","MNF","JIA","GAE","BEO","BDL","MZP","JHG","PRE","DAP","CAR", 
        "CPU","AGY","CUK","RBGJ","KHRY","LUS","SKGH","KYT","ARW","JEP","MGS");
        stcombo.setPromptText("Select Station");
        GridPane.setConstraints(stcombo, 11, 4);
        
        //Department label
        Label deplbl=new Label("Department : ");
        GridPane.setConstraints(deplbl, 10, 5);
        
        //Department Input
        ComboBox<String> depcombo=new ComboBox<>();
        depcombo.getItems().addAll(
        "General Admin",
        "Signal & Tele",
        "Personal",
        "Commercial",
        "Engineering",
        "Operating",
        "Medical",
        "Electrical",
        "Mechanical",
        "Stores");
        depcombo.setPromptText("Select Department");
        GridPane.setConstraints(depcombo, 11, 5);
        
         //Bill Unit label
        Label billlbl=new Label("Bill Unit : ");
        GridPane.setConstraints(billlbl, 10, 6);
        
        //Bill Unit Input
        TextField butxt=new TextField();
        butxt.setPromptText("Bill Unit");
        GridPane.setConstraints(butxt, 11, 6);
        
        //Appointment label
        Label aptlbl=new Label("Dt. of Appointment : ");
        GridPane.setConstraints(aptlbl, 10, 7);
        
        //Appointment Input
        TextField apttxt=new TextField();
        apttxt.setPromptText("(DD-MM-YYYY)");
        GridPane.setConstraints(apttxt, 11, 7);
        
       //Retirement label
        Label retlbl=new Label("Dt. of Retirement : ");
        GridPane.setConstraints(retlbl, 10, 8);
        
        //Retirement Input
        TextField rettxt=new TextField();
        rettxt.setPromptText("(DD-MM-YYYY)");
        GridPane.setConstraints(rettxt, 11, 8);
        
        //Pay label
        Label paylbl=new Label("Rate Of Pay : ");
        GridPane.setConstraints(paylbl, 10, 9);
        
        //Pay Input
        TextField paytxt=new TextField();
        paytxt.setPromptText("Rate Of Pay");
        GridPane.setConstraints(paytxt, 11, 9);
        
         //Logout Button
        Button bckbtn=new Button("Logout");
        GridPane.setConstraints(bckbtn,0, 0);
        bckbtn.setOnAction(e-> {email="";this.start(st);});
        
        //Home button
        Button home=new Button("Home");
        GridPane.setConstraints(home, 1, 0);
        home.setOnAction(e->this.start(st));
        
        //Table button
        Button table=new Button("View Applicants");
        GridPane.setConstraints(table, 2, 0);
        viewData vd=new viewData();
        table.setOnAction(e->{
            try {
                vd.display(st);
            } catch (IOException ex) {
                Logger.getLogger(SummerProject.class.getName()).log(Level.SEVERE, null, ex);
            }
        });
        
        //save Button
        Button svbtn=new Button("Save");
        GridPane.setConstraints(svbtn, 21, 11);
      
        //Next Button
        Button nextbtn=new Button("Next >");
        GridPane.setConstraints(nextbtn, 23,11);
        nextbtn.setOnAction(e -> this.form3(st));
        
         nextbtn.setDisable(true);
        svbtn.setOnAction(e -> {
             try{
                Class.forName("org.apache.derby.jdbc.ClientDriver");
                Connection con=DriverManager.getConnection("jdbc:derby://localhost:1527/training;create=true","ncralld","ncralld@123");
                String query="update NCRALLD.RECORD set DESIG='"+destxt.getText()+"',WORK_UNDER='"+wutxt.getText()+"',STATION='"+stcombo.getValue()+"',DEPARTMENT='"+depcombo.getValue()+"',BILL_UNIT='"+butxt.getText()+"',DO_APPOINT='"+paytxt.getText()+"',DO_RET='"+rettxt.getText()+"',RATE_PAY='"+rettxt.getText()+"'where email='"+email+"'";
                Statement stmt=con.createStatement();
                int ans=stmt.executeUpdate(query);
                if(ans>0){
                    AlertBox.display("Sucess", "Your Information Saved");
                    nextbtn.setDisable(false);
                }else{
                    AlertBox.display("Alert", "Failed to Save Information");
                }
            }catch(ClassNotFoundException | SQLException exp){
                exp.printStackTrace();
            }              
             });
        
        //Prev Button
        Button pg1btn=new Button(" 1 ");
        GridPane.setConstraints(pg1btn, 25,0);
        pg1btn.setOnAction(e -> {
            try {
                this.form1(st);
            } catch (SQLException ex) {
                Logger.getLogger(SummerProject.class.getName()).log(Level.SEVERE, null, ex);
            }
        });
        
        //pg1 label
        Label pg2lbl=new Label(" 2 ");
        GridPane.setConstraints(pg2lbl, 26, 0);
        
        //Next Button
        Button pg3btn=new Button(" 3 ");
        GridPane.setConstraints(pg3btn, 27,0);
        pg3btn.setOnAction(e -> this.form3(st));
        
         HBox hbox=new HBox();
         hbox.setPadding(new Insets(10,10,10,10));
         hbox.setSpacing(10);
         hbox.getChildren().addAll(bckbtn,home,table);
        
        
        grid.getChildren().addAll(hbox,head1lbl,head2lbl,deslbl,destxt,wulbl,wutxt,stlbl,stcombo,deplbl,depcombo,billlbl,butxt,aptlbl,apttxt,retlbl,rettxt,paylbl,paytxt,svbtn,nextbtn,pg2lbl,pg1btn,pg3btn);
        Scene login=new Scene(grid,1350,675);
        st.setScene(login);
        
        st.show();  
    }
    
    
    
    public void form3(Stage st){
        
         st.setTitle("Summer Training - Provident Fund Details");
         st.getIcons().add(new Image("/summer/project/image/Indian_Railway.png"));
        GridPane grid=new GridPane();
        grid.setPadding(new Insets(20,20,20,20));
        grid.setVgap(20);
        grid.setHgap(20);
        
        
        
        //Heading2 label
        Label head2lbl=new Label(" P.F. Details");
        head2lbl.setFont(Font.font("Ariel", FontWeight.BOLD, 35));
        GridPane.setConstraints(head2lbl,11,1);
        
        
        //Application label
        Label applbl=new Label("Date Of Application : ");
        GridPane.setConstraints(applbl, 10, 2);
        
        //Application Input
        TextField apptxt=new TextField();
        apptxt.setPromptText("(DD-MM-YYYY)");
        GridPane.setConstraints(apptxt, 11, 2);
        
                 
        //Reason label
        Label rslbl=new Label("Reason : ");
        GridPane.setConstraints(rslbl, 10, 3);
        
        //Reason Input
       ComboBox<String> rscombo=new ComboBox<>();
        rscombo.getItems().addAll(
            "Medical Treatment",
            "Marriage purposes",
            "Construction of house or purchase of property",
            "Repaying the existing home loan",
            "Education purposes",
            "Alterations or repairs for your house"
        );
        rscombo.setPromptText("Select Reason for withdrawl");
        GridPane.setConstraints(rscombo, 11, 3);
        
        final ToggleGroup group = new ToggleGroup();

        RadioButton rb1 = new RadioButton("Final");
        rb1.setToggleGroup(group);
        GridPane.setConstraints(rb1, 10, 4);
        //rb1.setSelected(true);

        RadioButton rb2 = new RadioButton("Temporary");
        rb2.setToggleGroup(group);
        GridPane.setConstraints(rb2, 11, 4);
        
         //Available label
        Label avlbl=new Label("Amount Available : ");
        GridPane.setConstraints(avlbl, 10, 5);
        
        //Available Input
        TextField avtxt=new TextField();
        avtxt.setPromptText("Amount Available");
        GridPane.setConstraints(avtxt, 11, 5);
        
        //Permissible label
        Label aplbl=new Label("Amount Permissible : ");
        GridPane.setConstraints(aplbl, 10, 6);
        
        //Permissible Input
        TextField aptxt=new TextField();
        aptxt.setPromptText("Amount Permissible");
        GridPane.setConstraints(aptxt, 11, 6);
        
        //Applied label
        Label amtlbl=new Label("Amount Applied : ");
        GridPane.setConstraints(amtlbl, 10, 7);
        
        //Applied Input
        TextField amttxt=new TextField();
        amttxt.setPromptText("Amount Applied");
        GridPane.setConstraints(amttxt, 11, 7);
        
        //Sanctioned label
        Label sanlbl=new Label("Amount Sanctioned : ");
        GridPane.setConstraints(sanlbl, 10, 8);
        
        //Sanctioned Input
        TextField santxt=new TextField();
        santxt.setPromptText("Amount Sanctioned");
        GridPane.setConstraints(santxt, 11, 8);
        
        //Dt. of Sanction label
        Label dtsanlbl=new Label("Date Of Sanction : ");
        GridPane.setConstraints(dtsanlbl, 10, 9);
        
        //Dt. of Sanction Input
        TextField dtsantxt=new TextField();
        dtsantxt.setPromptText("(DD-MM-YYYY)");
        GridPane.setConstraints(dtsantxt, 11, 9);
        
         //Logout Button
        Button bckbtn=new Button("Logout");
        GridPane.setConstraints(bckbtn,0, 0);
        bckbtn.setOnAction(e-> {email="";this.start(st);});
        
        //Home button
        Button home=new Button("Home");
        GridPane.setConstraints(home, 1, 0);
        home.setOnAction(e->this.start(st));
        
        //Table button
        Button table=new Button("View Applicants");
        GridPane.setConstraints(table, 1,1 );
        viewData vd=new viewData();
        table.setOnAction(e->{
            try {
                vd.display(st);
            } catch (IOException ex) {
                Logger.getLogger(SummerProject.class.getName()).log(Level.SEVERE, null, ex);
            }
        });
        
        //save Button
        Button svbtn=new Button("Save");
        GridPane.setConstraints(svbtn, 18, 12);
      
        //Submit Button
        Button subbtn=new Button("Submit");
        GridPane.setConstraints(subbtn, 19,12);
        ConfirmBox objc=new ConfirmBox();
                
         subbtn.setDisable(true);
        svbtn.setOnAction(e -> {
             try{
                Class.forName("org.apache.derby.jdbc.ClientDriver");
                Connection con=DriverManager.getConnection("jdbc:derby://localhost:1527/training;create=true","ncralld","ncralld@123");
                String query;
                String ft="";
                if(rb1.isSelected()){
                    ft="Final";
                query="update NCRALLD.RECORD set DO_APP='"+apptxt.getText()+"',REASON='"+rscombo.getValue()+"',FINAL_TEMP='Final',AMT_AVAIL='"+avtxt.getText()+"',AMT_PER='"+aptxt.getText()+"',AMT_APP='"+amttxt.getText()+"',AMT_SANC='"+santxt.getText()+"',DO_SANC='"+dtsantxt.getText()+"'where email='"+email+"'";
                }else{
                    ft="Temporary";
                    query="update NCRALLD.RECORD set DO_APP='"+apptxt.getText()+"',REASON='"+rscombo.getValue()+"',FINAL_TEMP='Temporary',AMT_AVAIL='"+avtxt.getText()+"',AMT_PER='"+aptxt.getText()+"',AMT_APP='"+amttxt.getText()+"',AMT_SANC='"+santxt.getText()+"',DO_SANC='"+dtsantxt.getText()+"'where email='"+email+"'";
                }
                Statement stmt=con.createStatement();
                int ans=stmt.executeUpdate(query);
                if(ans>0){
                    AlertBox.display("Sucess", "Your Information Saved");
                    subbtn.setDisable(false);
                }else{
                    AlertBox.display("Alert", "Failed to Save Information");
                }
            }catch(ClassNotFoundException | SQLException exp){
                exp.printStackTrace();
            }              
             });
        
        
        subbtn.setOnAction(e->{
        try{
                Class.forName("org.apache.derby.jdbc.ClientDriver");
                Connection con=DriverManager.getConnection("jdbc:derby://localhost:1527/training;create=true","ncralld","ncralld@123");
                int ans=0;
                String query="update NCRALLD.RECORD set CONFIRM=TRUE where email='"+email+"'";
                if(objc.display("Confirm","After you submit you will not be able to make change.\n Are you sure you want to submit?"))
                {
                    Statement stmt=con.createStatement();
                    ans=stmt.executeUpdate(query);
                }
                if(ans>0){
                    //AlertBox.display("Sucess", "Your Information Saved");
                    //subbtn.setDisable(false);
                }else{
                    //AlertBox.display("Alert", "Failed to Save Information");
                }
            }catch(ClassNotFoundException | SQLException exp){
                exp.printStackTrace();
            } 
        });
        
        
        
        //Prev Button
        Button pg1btn=new Button(" 1 ");
        GridPane.setConstraints(pg1btn,22,0);
        pg1btn.setOnAction(e -> {
             try {
                 this.form1(st);
             } catch (SQLException ex) {
                 Logger.getLogger(SummerProject.class.getName()).log(Level.SEVERE, null, ex);
             }
         });
        
        //Next Button
        Button pg2btn=new Button(" 2 ");
        GridPane.setConstraints(pg2btn,23,0);
        pg2btn.setOnAction(e -> this.form2(st));
        
        //pg1 label
        Label pg3lbl=new Label(" 3 ");
        GridPane.setConstraints(pg3lbl,24, 0);
        
         HBox hbox=new HBox();
         hbox.setPadding(new Insets(10,10,10,10));
         hbox.setSpacing(10);
         hbox.getChildren().addAll(bckbtn,home,table);
        
        
        grid.getChildren().addAll(hbox,head2lbl,applbl,apptxt,rslbl,rscombo,rb1,rb2,avlbl,avtxt,aplbl,aptxt,amtlbl,amttxt,sanlbl,santxt,dtsanlbl,dtsantxt,svbtn,subbtn,pg1btn,pg2btn,pg3lbl);
        Scene login=new Scene(grid,1350,675);
        st.setScene(login);
        
        st.show(); 
    }
    
}
