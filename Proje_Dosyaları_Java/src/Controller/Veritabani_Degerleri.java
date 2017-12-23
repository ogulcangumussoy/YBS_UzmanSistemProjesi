/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller;
import java.sql.Date;
import java.time.LocalDateTime;

/**
 *
 * @author ogulcan
 */
public class Veritabani_Degerleri {
    
    private static String Ad;
    private static String Soyad;
    private static int Yas;
    private static int Boy;
    private static double Kilo;
    private static int Beslenme;
    private static String EgzersizSuresi;
    private static String SuMiktari;
    private static boolean EkmekTuketimi;
    private static boolean IlacTuketimi;
     private static LocalDateTime Tarih;

    public static String getAd() {
        return Ad;
    }

    public static void setAd(String Ad) {
        Veritabani_Degerleri.Ad = Ad;
    }

    public static String getSoyad() {
        return Soyad;
    }

    public static void setSoyad(String Soyad) {
        Veritabani_Degerleri.Soyad = Soyad;
    }

    public static int getYas() {
        return Yas;
    }

    public static void setYas(int Yas) {
        Veritabani_Degerleri.Yas = Yas;
    }

    public static int getBoy() {
        return Boy;
    }

    public static void setBoy(int Boy) {
        Veritabani_Degerleri.Boy = Boy;
    }

    public static double getKilo() {
        return Kilo;
    }

    public static void setKilo(double Kilo) {
        Veritabani_Degerleri.Kilo = Kilo;
    }

    public static int getBeslenme() {
        return Beslenme;
    }

    public static void setBeslenme(int Beslenme) {
        Veritabani_Degerleri.Beslenme = Beslenme;
    }

    public static String getEgzersizSuresi() {
        return EgzersizSuresi;
    }

    public static void setEgzersizSuresi(String EgzersizSuresi) {
        Veritabani_Degerleri.EgzersizSuresi = EgzersizSuresi;
    }

    public static String getSuMiktari() {
        return SuMiktari;
    }

    public static void setSuMiktari(String SuMiktari) {
        Veritabani_Degerleri.SuMiktari = SuMiktari;
    }

    public static boolean isEkmekTuketimi() {
        return EkmekTuketimi;
    }

    public static void setEkmekTuketimi(boolean EkmekTuketimi) {
        Veritabani_Degerleri.EkmekTuketimi = EkmekTuketimi;
    }

    public static boolean isIlacTuketimi() {
        return IlacTuketimi;
    }

    public static void setIlacTuketimi(boolean IlacTuketimi) {
        Veritabani_Degerleri.IlacTuketimi = IlacTuketimi;
    }

    public static LocalDateTime getTarih() {
        return Tarih;
    }

    public static void setTarih(LocalDateTime Tarih) {
        Veritabani_Degerleri.Tarih = Tarih;
    }
    
     
     
    
}
