/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modelo.dao;

import java.sql.Connection;
import java.sql.ResultSet;
import modelo.dto.AutenticaDTO;
import modelo.dao.ConexaoDAO;
import java.sql.SQLException;
import javax.swing.JOptionPane;
import java.sql.PreparedStatement;

/**
 *
 * @author Gustavo
 */
public class AutenticaDAO {

    Connection conexao;

    public ResultSet autenticacaoUsuario(AutenticaDTO objautenticadto) {
        conexao = new ConexaoDAO().getConnection();
        try {
            String sql = "SELECT * FROM usuarios WHERE nome = ? and senha = ?";
            
            PreparedStatement pstm = conexao.prepareStatement(sql);
            pstm.setString(1, objautenticadto.getNome());
            pstm.setString(2, objautenticadto.getSenha());

            ResultSet rs = pstm.executeQuery();
            return rs;
            
                    
        } catch (SQLException erro) {
            JOptionPane.showMessageDialog(null, "Usuário ou Senha Incorreta! AUTENTICA DAO");
            return null;
        }
    }

}
