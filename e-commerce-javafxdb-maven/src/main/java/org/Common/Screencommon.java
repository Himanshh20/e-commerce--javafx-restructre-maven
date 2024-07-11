package org.Common;

import java.io.IOException;
import java.net.URL;
import java.nio.file.Paths;

import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;

public class Screencommon { 

		
		 public void show() { 
			  String myClassName = getClass().getSimpleName();  
			  String classPath  = getClass().getResource(myClassName + ".class ").toString();
			  String fxmlFilepath = classPath.replace(".class "," .fxml" );  
			  
			  URL fxmlUrl ; 
			   try { 
				   fxmlUrl = Paths.get(fxmlFilepath).toUri().toURL(); 
						   
				   Parent actorgroup = (Parent) FXMLLoader.load(fxmlUrl);
				   Scene scene = new Scene (actorgroup , 600 , 400 ) ; 
				  
				   Stageholder.stage.setScene(scene ); 
				   Stageholder.stage.show();
				    
				    	 
				    } 
			     catch (IOException e ) { 
			    	  e.printStackTrace();
			    	  
			     }
			    
		 }
	}



