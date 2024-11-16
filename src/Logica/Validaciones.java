/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Logica;
import GUI.DialogoOperacines;
import GUI.HomeStudentsGUI;
import GUI.MenuStudentsGUI;
import Percistencia.DBConexion;
import java.io.FileNotFoundException;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;



/**
 *
 * @author israe
 */
public class Validaciones  {
    
    public static final String LIST_QUERY = "select * from Estudiantes where Matricula = ?";
    // metodo para viladar la matricula 
    public static boolean validarMatricula(int mat) throws FileNotFoundException, SQLException{
        try {
            Connection conexion = DBConexion.getConexion();
            PreparedStatement preparedStatement = conexion.prepareStatement(LIST_QUERY);
            preparedStatement.setInt(1, mat);
            ResultSet resultSet = preparedStatement.executeQuery();
            
            return resultSet.next();
            
            
        } catch (SQLException e) {
            System.out.println("BUQUEDA (ERROR): " + e.getMessage());
        }
        
        return false;
        
        
    }

  
    
   
    

}
