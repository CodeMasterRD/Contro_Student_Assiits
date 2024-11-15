
package Logica;

import Percistencia.DBConexion;
import java.io.FileNotFoundException;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class ValidarMatricula {
    
    public static final String LIST_QUERY = "select * from Estudiantes where Matricula = ?";
    // metodo para viladar la matricula 
    public static boolean validar(int mat) throws FileNotFoundException, SQLException{
        try {
            Connection conexion = DBConexion.getConexion();
            PreparedStatement preparedStatement = conexion.prepareStatement(LIST_QUERY);
            preparedStatement.setInt(1, mat);
            ResultSet resultSet = preparedStatement.executeQuery();
            System.out.println(mat);
            return resultSet.next();
            
            
        } catch (SQLException e) {
            System.out.println("INSERT (ERROR): " + e.getMessage());
        }
        
        return false;
        
        
    }
    
}
