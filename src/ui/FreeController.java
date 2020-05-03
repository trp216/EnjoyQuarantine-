package ui;

import java.io.IOException;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.MenuItem;
import javafx.stage.Stage;

public class FreeController {

    @FXML
    private MenuItem friends;

    @FXML
    private MenuItem addActivity;

    @FXML
    private MenuItem seeActivity;

    @FXML
    private MenuItem health;

    @FXML
    private MenuItem motquote;

    private Scene scene;
    
    private AccountController ac;

    @FXML
    void addActivity(ActionEvent event) {

    }

    @FXML
    void getHealthTip(ActionEvent event) {

    }

    @FXML
    void getMotivationalQuote(ActionEvent event) {

    }

    @FXML
    void seeActivities(ActionEvent event) {

    }

    @FXML
    void seeOtherAccounts(ActionEvent event) {
    	 try {
 			FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource("Accounts.fxml"));
 			Parent root = fxmlLoader.load();
 			Stage stage = new Stage();
 			Scene scene = new Scene(root);
 			ac = fxmlLoader.getController();
 			ac.setScene(scene);
 			stage.setScene(scene);
 			stage.show();
     }
     catch(IOException io) {
     	io.printStackTrace();
     }
    }

	public void setScene(Scene scene) {
		this.scene = scene;
		
	}

}