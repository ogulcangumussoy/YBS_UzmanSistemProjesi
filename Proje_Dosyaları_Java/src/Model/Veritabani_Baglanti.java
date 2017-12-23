/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;

import java.sql.Connection;
import java.sql.DriverManager;
import javax.swing.JOptionPane;

/**
 *
 * @author ogulcan
 */
public class Veritabani_Baglanti {
    
    private String url ="jdbc:mysql://localhost:3306/";
    private String driver ="com.mysql.jdbc.Driver";
    private String dbName ="ybs_diyetisyen";
    private String username ="root";
    private String password ="";
    
    public Connection connection;
    
    public boolean connectToDatabase(){
        try{
            
            Class.forName(driver).newInstance();
            connection = (Connection)DriverManager.getConnection(url+dbName,
                    username, password);
            System.out.println("Bağlantı Başarılı.");
            return true;
            
        }
        catch(Exception e){
            JOptionPane.showMessageDialog(null, "Bağlantı Başarısız Hata: "
                    + e);
            System.out.println("Bağlantı Başarısız Hata: "+ e);
            return false;
        }
    }
         
    
    
}
