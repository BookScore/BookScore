/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package BookScore.Banco.Querys;

public class Querys {
    
    public String InsertUsuarios(){
        
        String query = "INSERT INTO usuarios (login, nome, idade, sexo, senha, tipoLivro1, tipoLivro2, ativo)" +
                        "VALUES (?,?,?,?,?,?,?,?);";
        
        return query;
    }
    
    
    public String SelectLogin(){
        
        String query = "SELECT * FROM tb_usuarios WHERE login = ? and senha = ?";
        
        return query;
    }
    
    public String SelectUsuarios(){
        
       String query = "SELECT * FROM tb_usuarios";
        
       return query;
    }
    
    public String SelectUsuariosId(){
        
       String query = "SELECT * FROM tb_usuarios WHERE login = ? AND senha = ?";
        
       return query;
    }
     
    public String InsertNotas() {
         
        String query = "INSERT INTO tb_notaslivros (idLivro, idUsuario, nota) VALUES (?, ?, ?)";
         
        return query;
    }
     
    public String InsertLivros() {
         
        String query = "INSERT INTO tb_livros (titulo, autor, tipo) VALUES (?,?,?)";
         
        return query;
    }
    
    
    public String SelectLivros() {
         
        String query = "SELECT * FROM tb_livros WHERE nome = ?";
         
        return query;
    }
}
