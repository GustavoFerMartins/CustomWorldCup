/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modelo.dao;
import java.sql.ResultSet;
import java.sql.Connection;
import java.sql.SQLException;
import java.sql.PreparedStatement;
import javax.swing.JOptionPane;
import modelo.dto.LoginDTO;
import modelo.dto.UsuarioDTO;

/**
 *
 * @author Gustavo
 */

/*
Entra no banco de dados e faz a verificação sobre que tipo é o usuario para poder fazer o redirecionamento 
*/

public class UsuarioDAO {
    Connection conexao;
    
    public UsuarioDTO autenticacaoUsuario(LoginDTO usuarios) {
        conexao = new ConexaoDAO().getConnection();
        
        try {
            
            String sql = "SELECT * FROM usuarios WHERE nome = ? and senha = ?";
            
            PreparedStatement pstm = conexao.prepareStatement(sql);
            pstm.setString(1, usuarios.getNome());
            pstm.setString(2, usuarios.getSenha());
            
            ResultSet rs = pstm.executeQuery();
            UsuarioDTO user = new UsuarioDTO(rs);
     
            return user;
            
        } catch (SQLException erro) {
            JOptionPane.showMessageDialog(null, "UsuarioDAO" + erro);
            return null;
        }
        
        
    }
}
