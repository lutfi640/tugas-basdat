/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package database;

import database.service;
import com.mysql.jdbc.jdbc2.optional.MysqlDataSource;
import aplikasi.PenjualGui;
import java.sql.SQLException;

/**
 *
 * @author AtlantisSeeker
 */
public class SaveImageDB {
    private static service service1;
    
    public static service getservice(){
        return service1;
    }
    
    public static void init() throws SQLException{
        MysqlDataSource dataSource = new MysqlDataSource();
        dataSource.setUser("root");
        dataSource.setPassword("");
        dataSource.setServerName("localhost");
        dataSource.setDatabaseName("gui_image"); 
        
        service1= new service(dataSource);        
    }
    public static void main(String[] args) throws SQLException {
        init();
        new PenjualGui().setVisible(true);
    }
}
    