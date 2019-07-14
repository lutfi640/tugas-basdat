/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package database;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import aplikasiLama.PenjualGui;
import aplikasiLama.PenjualData;
/**
 *
 * @author AtlantisSeeker
 */
public class databaseOperation {
    Connection connection;
    PreparedStatement preparedStatement;
    
    public void setConnection(Connection connection){
        this.connection=connection;
    }
    
    public void save(PenjualData contoh) throws SQLException{
        preparedStatement=connection.prepareStatement("insert into contoh(judul_item, image) values(?,?)");
        preparedStatement.setString(1, contoh.getTitle());
        preparedStatement.setString(2, contoh.getImage());
        preparedStatement.executeUpdate();
    }
   
    
    public void delete() throws SQLException{
        PenjualGui n = new PenjualGui();
        preparedStatement=connection.prepareStatement("delete from contoh where judul_item = ? ");
        preparedStatement.setString(1, n.isi_txt());
        preparedStatement.executeUpdate();
    }
    
    public List<PenjualData> findAll() throws SQLException{
        List<PenjualData> listOfcontoh=new ArrayList<>();
        preparedStatement=connection.prepareStatement("Select * from contoh");
        ResultSet rs = preparedStatement.executeQuery();
        
        while(rs.next()){
            PenjualData contoh1=new PenjualData();
            contoh1.setId(rs.getInt("id_item"));
            contoh1.setTitle(rs.getString("judul_item"));
            contoh1.setImage(rs.getString("image"));
            listOfcontoh.add(contoh1);
        }
        return listOfcontoh;
    }
}
