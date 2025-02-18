package MushroomApp;

import java.io.IOException;
import java.net.URL;
import java.sql.SQLException;
import java.util.ResourceBundle;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Node;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.Pane;
import javafx.stage.Stage;
import javafx.scene.control.PasswordField;

public class LoginController implements Initializable {
	public LoginModel loginModel = new LoginModel();
	
		@FXML
		private Label isConnected;
		
		@FXML
		private TextField txtUsername;
		
		@FXML
		private PasswordField txtPassword;
		
	@Override
	public void initialize(URL location, ResourceBundle resource) {
		if (loginModel.isDBConnected()) {
			isConnected.setText("Connected");
		} else {
			isConnected.setText("Not Connected");
		}
	}
	
	public void Login(ActionEvent event) {
		try {
			if (loginModel.isLogin(txtUsername.getText(), txtPassword.getText())) {
				isConnected.setText("username and password is correct");
				((Node)event.getSource()).getScene().getWindow().hide();
				Stage primaryStage = new Stage();
				FXMLLoader loader = new FXMLLoader();
				Pane root = loader.load(getClass().getResource("/MushroomApp/User.fxml").openStream());
				UserController userController = (UserController)loader.getController();
				userController.GetUser(txtUsername.getText());
				Scene scene = new Scene(root);
				primaryStage.setScene(scene);
				primaryStage.show();
				
			} else {
				isConnected.setText("username and password is not correct");
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
