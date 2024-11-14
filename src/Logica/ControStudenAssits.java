
package Logica;

import Percistencia.DBConexion;
import java.io.FileNotFoundException;
import java.sql.SQLException;


public class ControStudenAssits {

    
    public static void main(String[] args) throws FileNotFoundException, SQLException{
        // TODO code application logic here
        
        DBConexion conexion = new DBConexion();
        conexion.getConexion();
    }
    
}
