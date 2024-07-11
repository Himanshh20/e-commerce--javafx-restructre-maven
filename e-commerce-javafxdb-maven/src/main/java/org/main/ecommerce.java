 package org.main ; 
import org.Common.Stageholder;
import org.HomeScreen.Homescreen;
import org.LoginScreen.Loginscreen;

import javafx.application.Application;
import javafx.stage.Stage;

public class  ecommerce extends Application  { 
	 public static void main (String args []) {
		 launch(args);  
	 }

	@Override 
	public void start(Stage  Stagebyjavafx ) throws Exception { 
	     Stageholder.stage= Stagebyjavafx ; 
	      Stageholder.stage.setTitle(" Ecommerce Application ")  ; 
	       new Homescreen().show();  																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																	
	       																																																								
		
	}
	    
  }  																																																												