/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package logincontrol;

import java.sql.Connection;
import modelo.dao.Conexao;
import telas.RegistrarUsuario;
import java.sql.SQLException;
import modelo.dao.LoginDAO;
import telas.TelaLogin;


/**
 *
 * @author Gustavo
 */
public class LoginController {
    
    public void cadastroUsuario(RegistrarUsuario view) throws SQLException{
        Connection conexao = new Conexao().getConnection(); 
        LoginDAO cadastro = new LoginDAO();
        cadastro.cadastrarUsuario(view.getUsuarioCadastro().getText(), view.getEmailCadastro().getText(), view.getSenhaCadastro().getText());
    }
    
    public void loginUsuario(TelaLogin view) throws SQLException{
        Connection conexao = new Conexao().getConnection(); 
        LoginDAO login = new LoginDAO();
        login.login(view.getUsuario().getText(), view.getSenha().getText());
    }
}
