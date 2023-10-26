
package BookScore.Model;

import BookScore.Banco.ConexaoBanco;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import javax.swing.JOptionPane;

public class Login {
    
    private String login; 
    private String senha;
    
    public Login(){}
    
    public Login(String loginRecebido, String senhaRecebida){
        this.login = loginRecebido;
        this.senha = senhaRecebida;
    }
    
    public void setLogin(String loginRecebido){
        this.login = loginRecebido;
    }
    
    public String getLogin(){
        return login;
    }
    
    public void setSenha(String senhaRecebida){
        this.senha = senhaRecebida;
    }
    
    public String getSenha(){
        return senha;
    }
    
    public boolean RealizaLogin(String login, String senha){
        String sql = "SELECT * FROM usuarios WHERE nome = ? and senha = ?";
        boolean resultado = false;
        
        try (Connection c =  ConexaoBanco.obtemConexao()) {
            
            PreparedStatement ps = c.prepareStatement(sql);
            
            ps.setString(1, login); 
            ps.setString(2, senha); 
            
            ResultSet rs = ps.executeQuery();  
            
            while (rs.next()) {
                resultado = true;
            }
        }
        catch (Exception e) {
            e.printStackTrace();
            
            JOptionPane.showMessageDialog(null,"Erro ao tentar executar o banco de dados" ,"ERRO INTERNO", JOptionPane.ERROR_MESSAGE );
        }
        return resultado;
    } 
    
}
