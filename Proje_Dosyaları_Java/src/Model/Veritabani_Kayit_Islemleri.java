/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;

import Model.Veritabani_Baglanti;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import Controller.Veritabani_Degerleri;

/**
 *
 * @author ogulcan
 */
public class Veritabani_Kayit_Islemleri {
    
        PreparedStatement ps;
        
    
    public void kayitEkle(Veritabani_Degerleri vd) throws SQLException{
        
        Veritabani_Baglanti baglanti = new Veritabani_Baglanti();
        baglanti.connectToDatabase();
        
        String sql = "insert into girdiler(Ad, Soyad, Yas,Boy,Kilo,Beslenme,EgzersizSuresi,SuMiktari,EkmekTuketimi,IlacTuketimi,Tarih)"
                + "values(?, ?, ?,?,?,?,?,?,?,?,?)";
        ps = baglanti.connection.prepareStatement(sql);
        ps.setString(1, vd.getAd());
        ps.setString(2, vd.getSoyad());
        ps.setInt(3, vd.getYas());
        ps.setInt(4,vd.getBoy());
        ps.setDouble(5,vd.getKilo());
        ps.setInt(6, vd.getBeslenme());
        ps.setString(7, vd.getEgzersizSuresi());
        ps.setString(8,vd.getSuMiktari());
        ps.setBoolean(9,vd.isEkmekTuketimi());
        ps.setBoolean(10, vd.isIlacTuketimi());
        ps.setString(11,vd.getTarih().toString());
        
        ps.execute();        
    }
    
    
}
