/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modelo.dao;

import com.mysql.cj.jdbc.Blob;
import java.awt.List;
import java.awt.image.BufferedImage;
import java.io.InputStream;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Arrays;

/*import java.util.ArrayList;
import javax.swing.JOptionPane;
import modelo.dto.SelecoesDTO;*/
/**
 *
 * @author Gustavo
 */
public class SelecoesDAO {

    Connection conexao;
    PreparedStatement pstm;
    ResultSet rs;

    /*ResultSet rs;*/
 /*ArrayList<SelecoesDTO> lista = new ArrayList<>();*/
    public ResultSet selecoes() {

        conexao = new ConexaoDAO().getConnection();
        String sql = "SELECT * FROM selecoes ORDER BY selecao";

        try {
            pstm = conexao.prepareStatement(sql);
            return pstm.executeQuery();

            /*while(rs.next()){
                SelecoesDTO selecoesdto = new SelecoesDTO();
                selecoesdto.setSelecoes(rs.getString("selecao"));
                
                lista.add(selecoesdto);*/
        } catch (SQLException erro) {
            System.out.println(erro.getMessage());
            return null;
        }
        /*return lista;*/

    }

    
    
}
