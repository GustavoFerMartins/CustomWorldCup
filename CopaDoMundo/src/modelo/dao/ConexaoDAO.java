/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modelo.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
/**
 *
 * @author Gustavo
 */

public class ConexaoDAO {
    
    private String usuario = "root";
    private String senha = "042310";
    private String host = "localhost";
    private String porta = "3306";
    private String bd = "worldcup";
    
    public Connection getConnection (){
        try{
            Connection conexao = DriverManager.getConnection("jdbc:mysql://" + host + ":" + porta + "/" + bd,usuario,senha);
        return conexao;}
        catch (SQLException e){
            e.printStackTrace();
        return null;
        }
    }
}
   

