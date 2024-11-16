
package Logica;
import GUI.HomeStudentsGUI;
import Percistencia.DBConexion;


import java.io.FileNotFoundException;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;


public class Operaciones extends  HomeStudentsGUI{
    
    
     // sql
    
    private static final String INSERT_QUERY = "insert into Residencia_entrada_salida (MatriculaEST_RSD, Fecha_entradaRSD) values (?,?)";
    
    
   // metodo para registra la entrada
    public static void OpRegitrarEntrara() throws SQLException, FileNotFoundException{
        
        String fecha_entrada = FechaHora.obtenerFechaHoraActual();
        System.out.println(fecha_entrada);
        
        int mat = getMatricula();
        System.out.println(mat);
        
        try {
            
            Connection conexion = DBConexion.getConexion();
            PreparedStatement ps = conexion.prepareStatement(INSERT_QUERY);
            ps.setInt(1, mat);
            ps.setString(2, fecha_entrada);
            int resultSet = ps.executeUpdate();
            System.out.println(mat);
            if (resultSet > 0) {
                System.out.println("Entrada regitrada exitosamente");
            }else{
                System.out.println("No se pudo regitra tu entrada");
            }
            
            
            
        } catch (SQLException e) {
            System.out.println("Registrar (ERROR): " + e.getMessage());
            
            
        }
        
        
        
        
    }
    
}
