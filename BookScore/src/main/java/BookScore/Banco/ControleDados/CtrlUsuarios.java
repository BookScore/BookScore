/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package BookScore.Banco.ControleDados;

import BookScore.Banco.ConexaoBanco;
import BookScore.Banco.Querys.Querys;
import BookScore.Model.Usuarios;
import java.awt.List;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import javax.swing.JOptionPane;

public class CtrlUsuarios {

    Querys _Query = new Querys();

    public boolean CadastraUsuarios(String login, String nome, String idade, String sexo, String senha, String tipoLivroFavorito1, String tipoLivroFavorito2, String ativo) {

        String sql = _Query.InsertUsuarios();

        try (Connection c = ConexaoBanco.obtemConexao()) {

            PreparedStatement ps = c.prepareStatement(sql);

            ps.setString(1, login);
            ps.setString(2, nome);
            ps.setString(3, idade);
            ps.setString(4, sexo);
            ps.setString(5, senha);
            ps.setString(6, tipoLivroFavorito1);
            ps.setString(7, tipoLivroFavorito2);
            ps.setString(8, ativo);

            int rs = ps.executeUpdate();

            return true;

        } catch (Exception e) {
            e.printStackTrace();

            JOptionPane.showMessageDialog(null, "Erro ao tentar cadastrar usuario no banco de dados", "ERRO INTERNO", JOptionPane.ERROR_MESSAGE);

            return false;
        }
    }
    
    public int pegarIdUser(String username, String senhaUser) {
        
        String sql = _Query.SelectUsuariosId();
        
        int idUser = 0;
        
        try (Connection c =  ConexaoBanco.obtemConexao()){
            
            PreparedStatement ps = c.prepareStatement(sql);
            ps.setString(1, username);
            ps.setString(2, senhaUser);

            ResultSet resultSet = ps.executeQuery();
            
            if(resultSet.next()){
                idUser = resultSet.getInt("idUser");
            }
        }
        catch (Exception e) {
            e.printStackTrace();
        }
        return idUser;
    }
    
}
