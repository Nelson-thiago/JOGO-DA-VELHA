package classes;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import static javax.swing.JOptionPane.ERROR_MESSAGE;

public class Conexao {
    private Connection conexao;
    private Connection retorno;
    
    public Connection openConnection(){
        String url = "jdbc:mysql:// sql10.freesqldatabase.com:3306/sql10626272";
        String usuario = "sql10626272";
        String senha = "EcJexB8tKy";
        
        try {
            conexao = DriverManager.getConnection(url, usuario, senha);
            
        } catch (SQLException ex) {
            Logger.getLogger(Conexao.class.getName()).log(Level.SEVERE, null, ex);
            JOptionPane.showMessageDialog(null, "Erro ao conectar-se na base de dados!!", "Erro" ,ERROR_MESSAGE);
            System.exit(0);
        }
        
        return conexao;
    }
    
    public void closeConnection(){
        try{
            conexao.close();
        } catch (SQLException ex){
            Logger.getLogger(Conexao.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
}
