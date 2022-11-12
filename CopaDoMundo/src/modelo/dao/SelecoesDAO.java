/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modelo.dao;


import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;



/**
 *
 * @author Gustavo
 */
public class SelecoesDAO {

    Connection conexao;
    PreparedStatement pstm;
    ResultSet rs;

    
    public ResultSet selecoes() {

        conexao = new ConexaoDAO().getConnection();
        String sql = "SELECT * FROM selecoes ORDER BY selecao";

        try {
            pstm = conexao.prepareStatement(sql);
            return pstm.executeQuery();

            
        } catch (SQLException erro) {
            System.out.println(erro.getMessage());
            return null;
        }
        

    }

    
    
}
