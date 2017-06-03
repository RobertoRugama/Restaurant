package Config;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
//import pojo.Empleado;


public class HibernateUtil {
    
    private static Connection conexion;
    private static SessionFactory sessionFactory;
    //public static Empleado empleadoconectado;
    
    public static void buildSessionFactory(String user,String pass) throws ClassNotFoundException, SQLException{

       Conectar(user,pass);
       Configuration conf = new Configuration().configure();
       conf.setProperty("hibernate.connection.username", user);
       conf.setProperty("hibernate.connection.password", pass);
    
       sessionFactory = conf.buildSessionFactory();
    }
 
    public static SessionFactory getSessionFactory(){
        return sessionFactory;
    }
 
    public static Connection getConnection(){

       return conexion;
    }
    
    public static void CerrarSession(){
    	getSessionFactory().close();
    }
    
    static private void Conectar(String user,String pass) throws ClassNotFoundException, SQLException{
       Class.forName("com.mysql.jdbc.Driver");
       conexion = DriverManager.getConnection("jdbc:mysql://localhost:3306/CFI", user, pass);
   }    
}
