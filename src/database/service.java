/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package database;

import com.mysql.jdbc.jdbc2.optional.MysqlDataSource;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import aplikasi.PenjualData;
/**
 *
 * @author AtlantisSeeker
 */
public class service {
    Connection connection;
    databaseOperation databaseOperation1;
    
    public service(MysqlDataSource dataSource) throws SQLException{
        this.connection=dataSource.getConnection();
        databaseOperation1=new databaseOperation();
        databaseOperation1.setConnection(connection);
    }
    
    public void save (PenjualData contoh1){
        try{
            connection.setAutoCommit(false);
            databaseOperation1.save(contoh1);
            connection.commit();
            connection.setAutoCommit(true);
        } catch(SQLException exception){
            try{
                //exception.printStackTrace();
                connection.rollback();
            } catch(SQLException ex){
                ex.printStackTrace();
            }
        }
    }
    public void delete (){
        try{
            connection.setAutoCommit(false);
            databaseOperation1.delete();
            connection.commit();
            connection.setAutoCommit(true);
        } catch(SQLException exception){
            try{
                //exception.printStackTrace();
                connection.rollback();
            } catch(SQLException ex){
                ex.printStackTrace();
            }
        }
    }
     public List<PenjualData> findAll(){
         try{
             return databaseOperation1.findAll();
         } catch(SQLException ex){
             ex.printStackTrace();
         }
         return null;
     }
}
