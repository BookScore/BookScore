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
    
     public String SelectUsuarios(){
        
        String query = "SELECT * FROM usuarios";
        
        return query;
    }
}
