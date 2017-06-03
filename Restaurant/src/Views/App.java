package Views;

import Views.Login.JFLogin;
import javax.swing.UIManager;
import javax.swing.UnsupportedLookAndFeelException;

public class App {
   
    public static void main(String[] args) {
        try{
            UIManager.setLookAndFeel("com.sun.java.swing.plaf.windows.WindowsLookAndFeel");
        }catch(ClassNotFoundException | InstantiationException | IllegalAccessException | UnsupportedLookAndFeelException e){}
        
        java.awt.EventQueue.invokeLater(() -> {
            JFLogin login = new JFLogin();
            login.addWindowListener(new java.awt.event.WindowAdapter() {
                @Override
                public void windowClosing(java.awt.event.WindowEvent e) {
                    System.exit(0);
                }
            });
            login.setLocationRelativeTo(null);
            login.setVisible(true);
        });
    }    
}
