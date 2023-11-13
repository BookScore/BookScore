/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package BookScore.Banco.ControleDados;

import BookScore.Banco.ConexaoBanco;
import BookScore.Banco.Querys.Querys;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;


public class CtrlLivro {
    
    Querys _Query = new Querys();
    
    public boolean novoLivro (String nomeLivro, String nomeAutor, String tipo) {
        
        String sql = _Query.InsertLivros();
        
        try (Connection c = ConexaoBanco.obtemConexao()) {

            PreparedStatement ps = c.prepareStatement(sql, PreparedStatement.RETURN_GENERATED_KEYS);

            ps.setString(1, nomeLivro);
            ps.setString(2, nomeAutor);
              ps.setString(3, tipo);

            int linhasAfetadas = ps.executeUpdate();
            
            return linhasAfetadas > 0;
        }
        catch (Exception e) {
            
            e.printStackTrace();
            
            return false;
        }
    }
    
    public int pegarIdLivro(String nomeLivro) {
        
        String sql = _Query.SelectLivros();
        
        int idLivro = 0;
        
        try (Connection c =  ConexaoBanco.obtemConexao()){
            
            PreparedStatement ps = c.prepareStatement(sql);
            ps.setString(1, nomeLivro);

            ResultSet resultSet = ps.executeQuery();
            
            if(resultSet.next()){
                idLivro = resultSet.getInt("id");
            }
        }
        catch (Exception e) {
            e.printStackTrace();
        }
        return idLivro;
    }
}
