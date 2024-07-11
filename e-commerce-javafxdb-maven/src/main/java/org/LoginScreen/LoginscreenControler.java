package org.LoginScreen;

import java.awt.Label;
import java.awt.TextField;

import org.HomeScreen.Homescreen;

import javafx.fxml.FXML;

public class LoginscreenControler {  
	 @FXML
	 TextField loginName ;   
	 @FXML 
	   TextField password ;  
	 @FXML  
	  Label errorMessage ; 
	  
	 public void loginButtonClick () { 
		  String userFromDb = "Admin" ; 
		   String passwordfromDb = "Admin " ; 
		    
		    if (loginName.getText().equals(userFromDb) && password.getText().equals(passwordfromDb) ) {
		    	 errorMessage.setText(" Login Success " );  
		    	  
		    	 
		    	  new Homescreen().show();  
		    	  
		   } else {
			    
		   }
		    errorMessage.setText("Login Failed "); 
		    
	 } 
	 
	     
	  
}
