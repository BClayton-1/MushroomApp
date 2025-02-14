package MushroomApp;

import java.net.URL;
import java.sql.SQLException;
import java.util.ResourceBundle;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
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
				
			} else {
				
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
