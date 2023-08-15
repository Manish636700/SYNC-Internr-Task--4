/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package online.survey.system;

import java.sql.SQLException;

/**
 *
 * @author mitta
 */
public class OnlineSurveySystem {

    /**
     * @param args the command line arguments
     */
   public static void main(String args[]) throws SQLException {
		Login login = new Login();
		login.loginView();
	}
    
}
