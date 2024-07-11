package org.HomeScreen;

import java.awt.Button;

import javafx.fxml.FXML;


public class Homescreencontroler { 
	 

		@FXML
		Button  productmanagementclick;

		@FXML
		Button usermanagementclick;

		@FXML
		Button logoutclick;

		public void productmanagementclick() {
			System.out.println("Welcome to Product Management");

		}

		public void usermanagementclick() {
			System.out.println("Welcome to User Management");

		}

		public void logoutclick() {
			System.out.println("  logout");

		}

	}






