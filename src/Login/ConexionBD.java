/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Login;

import java.io.File;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;

/**
 *
 * @author Abdellatif
 */
public class ConexionBD {
    public static String path;
    
    
    public static Connection Conexion(){
       try {
    	 //Chargement du pilote JDBC pour MYSQL puis creation de la connection
    	   //DriverManager.registerDriver(new com.mysql.jdbc.Driver());
    	// ou bien 
       Class.forName("com.mysql.cj.jdbc.Driver");
       Connection conn = DriverManager.getConnection("jdbc:mysql://localhost/humanresourcesfinal","root","");
				if (conn!=null)
	System.out.println("Connexion à la base de données a été établie avec succès");
				 else 
				System.out.println("Problème de connexion à la base");
						
       return conn;
       
       }catch(ClassNotFoundException | SQLException e) {
           System.out.println("--> SQLException : " + e) ;
           
       return null;
       }
    }
}



