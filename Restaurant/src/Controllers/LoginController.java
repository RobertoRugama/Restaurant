/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controllers;

import Views.Home.JFHome;
import Views.Login.JFLogin;
import javax.swing.JTextField;

/**
 *
 * @author BETO
 */
public class LoginController{
     
     private JFLogin login;
     
     public LoginController(){}
     public LoginController(JFLogin login){
         this.login = login;
     }
     
     public void login(JTextField userNameTxt, JTextField passwordTxt){
        
         String userName = userNameTxt.getText();
         String password = passwordTxt.getText();
         
         JFHome home = new JFHome();           
         home.setVisible(true);
     }
}
