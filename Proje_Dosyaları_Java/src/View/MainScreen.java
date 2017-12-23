/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package View;

import Controller.Veritabani_Degerleri;
import Model.Veritabani_Kayit_Islemleri;
import java.sql.SQLException;
import java.time.LocalDateTime;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

/**
 *
 * @author ogulcan
 */
public class MainScreen extends javax.swing.JFrame {
    
    String ad,soyad,tarih,egzersizSuresi,suMiktari,sonucMetni;
        int yas,boy,beslenme;
        double kilo;
        boolean ekmekTuketimi;
        boolean ilacTuketimi;

    /**
     * Creates new form Deneme
     */
    public MainScreen() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        adTxt = new javax.swing.JTextField();
        soyadTxt = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        yasTxt = new javax.swing.JTextField();
        kacOgunCombo = new javax.swing.JComboBox<>();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        boyTxt = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        kiloTxt = new javax.swing.JTextField();
        egzersizSuresiCombo = new javax.swing.JComboBox<>();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        ekmekTuketimiRadio = new javax.swing.JRadioButton();
        jLabel9 = new javax.swing.JLabel();
        suMiktariCombo = new javax.swing.JComboBox<>();
        sonuclarButton = new javax.swing.JButton();
        temizleButton = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        sonucAlanıText = new javax.swing.JTextArea();
        jLabel10 = new javax.swing.JLabel();
        ilacTuketimiRadio = new javax.swing.JRadioButton();
        jLabel11 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Diyetisyen Uzman Öneri Programı");
        setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        setIconImages(null);
        setLocation(new java.awt.Point(300, 250));
        setResizable(false);
        setType(java.awt.Window.Type.POPUP);

        jPanel2.setBackground(new java.awt.Color(204, 204, 255));

        jLabel1.setText("Adınız:");

        jLabel2.setText("Soyadınız:");

        jLabel3.setText("Yaş");

        kacOgunCombo.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "1", "2", "3", "4", "5", "6" }));
        kacOgunCombo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                kacOgunComboActionPerformed(evt);
            }
        });

        jLabel4.setText("Günde Kaç Öğün Besleniyorsunuz?");

        jLabel5.setText("Boyunuz:");

        jLabel6.setText("Kilonuz:");

        egzersizSuresiCombo.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "30-", "30-45", "45-60", "60-90", "90+" }));

        jLabel7.setText("Günde ne kadar süre egzersiz Yapıyorsunuz?");

        jLabel8.setText("Ekmek Tüketiyor musunuz?");

        ekmekTuketimiRadio.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ekmekTuketimiRadioActionPerformed(evt);
            }
        });

        jLabel9.setText("Günde kaç Litre su içiyorsunuz?");

        suMiktariCombo.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "1-", "1-1.5", "1.5-2", "2+" }));

        sonuclarButton.setText("Sonuçları Gör");
        sonuclarButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                sonuclariGoster(evt);
            }
        });

        temizleButton.setText("Temizle");
        temizleButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                temizleButtonActionPerformed(evt);
            }
        });

        sonucAlanıText.setColumns(20);
        sonucAlanıText.setRows(5);
        jScrollPane1.setViewportView(sonucAlanıText);

        jLabel10.setText("İlaç Kullanıyor musunuz?");

        ilacTuketimiRadio.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ilacTuketimiRadioActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jScrollPane1)
                        .addContainerGap())
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel3)
                            .addComponent(jLabel2)
                            .addComponent(jLabel1)
                            .addComponent(jLabel5)
                            .addComponent(jLabel6))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addComponent(soyadTxt, javax.swing.GroupLayout.PREFERRED_SIZE, 135, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(adTxt, javax.swing.GroupLayout.PREFERRED_SIZE, 135, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(yasTxt, javax.swing.GroupLayout.PREFERRED_SIZE, 135, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(kiloTxt, javax.swing.GroupLayout.PREFERRED_SIZE, 135, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(boyTxt, javax.swing.GroupLayout.PREFERRED_SIZE, 135, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 151, Short.MAX_VALUE)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel2Layout.createSequentialGroup()
                                    .addComponent(jLabel4)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(kacOgunCombo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGap(96, 96, 96))
                                .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel2Layout.createSequentialGroup()
                                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                        .addComponent(jLabel9, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(jLabel7))
                                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(jPanel2Layout.createSequentialGroup()
                                            .addGap(18, 18, 18)
                                            .addComponent(egzersizSuresiCombo, javax.swing.GroupLayout.PREFERRED_SIZE, 135, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                                            .addGap(18, 18, 18)
                                            .addComponent(suMiktariCombo, javax.swing.GroupLayout.PREFERRED_SIZE, 135, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                            .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addGroup(jPanel2Layout.createSequentialGroup()
                                    .addComponent(jLabel10)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(ilacTuketimiRadio))
                                .addGroup(jPanel2Layout.createSequentialGroup()
                                    .addComponent(jLabel8)
                                    .addGap(104, 104, 104)
                                    .addComponent(ekmekTuketimiRadio))))
                        .addGap(120, 120, 120))))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(temizleButton)
                .addGap(18, 18, 18)
                .addComponent(sonuclarButton)
                .addGap(22, 22, 22))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(26, 26, 26)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(kacOgunCombo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel4))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(egzersizSuresiCombo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel7))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(suMiktariCombo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel9))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel8)
                            .addComponent(ekmekTuketimiRadio))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel10)
                            .addComponent(ilacTuketimiRadio)))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel1)
                            .addComponent(adTxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel2)
                            .addComponent(soyadTxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel3)
                            .addComponent(yasTxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel5)
                            .addComponent(boyTxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(6, 6, 6)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel6)
                            .addComponent(kiloTxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(13, 13, 13)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(sonuclarButton)
                    .addComponent(temizleButton))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 217, Short.MAX_VALUE)
                .addContainerGap())
        );

        jLabel11.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel11.setText("Diyetisyen Uzman Öneri Programı ");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(269, 269, 269)
                        .addComponent(jLabel11)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel11)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void ekmekTuketimiRadioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ekmekTuketimiRadioActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_ekmekTuketimiRadioActionPerformed

    private void kacOgunComboActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_kacOgunComboActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_kacOgunComboActionPerformed

    private void ilacTuketimiRadioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ilacTuketimiRadioActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_ilacTuketimiRadioActionPerformed

    public void temizle(){
        adTxt.setText("");
        soyadTxt.setText("");
        yasTxt.setText("");
        boyTxt.setText("");
        kiloTxt.setText("");
    }
    private void temizleButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_temizleButtonActionPerformed
        temizle();
    }//GEN-LAST:event_temizleButtonActionPerformed

    private void sonuclariGoster(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_sonuclariGoster
        // Değerler alındı.  
        ad=adTxt.getText();
        soyad=soyadTxt.getText();
        if(!yasTxt.getText().isEmpty()){
            yas=Integer.parseInt(yasTxt.getText());
        }
        if(!boyTxt.getText().isEmpty()){
            boy=Integer.parseInt(boyTxt.getText());
        }
        if(!kiloTxt.getText().isEmpty()){
            kilo=Double.parseDouble(kiloTxt.getText());
        }
        beslenme=Integer.parseInt(kacOgunCombo.getSelectedItem().toString());
        egzersizSuresi=egzersizSuresiCombo.getSelectedItem().toString();
        suMiktari=suMiktariCombo.getSelectedItem().toString();
        if(ekmekTuketimiRadio.isSelected()){
            ekmekTuketimi=true;
        }else{
            ekmekTuketimi=false;
        }
        if(ilacTuketimiRadio.isSelected()){
            ilacTuketimi=true;
        }else{
            ilacTuketimi=false;
        }
        //Alanların boş olma durumu incelendi boş olması durumunda kayıt izni vermedi.
        if(ad.isEmpty() || soyad.isEmpty() || yasTxt.getText().isEmpty() || boyTxt.getText().isEmpty() || kiloTxt.getText().isEmpty()){
            JOptionPane.showMessageDialog(null, "Alanlar Boş olamaz", "Sonuç" , JOptionPane.INFORMATION_MESSAGE);
        }else{//Alanların Boş  olamam Durumu
            /* Vucut Kitle İndeksi : Kilo / Boy(m) * Boy(m)
               
                VKİ 18.5'in altındaysa -----------> Zayıf
                VKİ 18.5 ile 25 arasındaysa   ----------> Normal
                VKİ 25 ile 30 arasındaysa  -------> Fazla Kilolu
                VKİ 30'un üstündeyse ----------> Obez

            */
            double boy2=boy/100.0;
            double hesaplama=kilo/Math.pow(boy2,2);
 
            String Vucut_Kutle_Indeksi=String.valueOf(hesaplama);
            String hesapSonucu="";
            String ekmekDurumu="";
            String ilacDurumu="";
            String egzersizDurumu="";
            String beslenmeDurumu="";
            String yasDurumu="";
            if(hesaplama < 18.5){
                 hesapSonucu = "Zayıf";
                 if(yas<15){
                     if(beslenme<3){
                         yasDurumu="15 yaşından küçük olduğunuzdan dolayı beslenmenize çok daha fazla dikkat etmelisiniz.";
                     }else{
                         if(ilacTuketimi){
                             yasDurumu="15 yaşından küçük olmanıza rağmen iyi besleniyorsunuz ilaç kullanmanız kilo almanızı engelliyor olabilir.";
                         }else if((suMiktari.equals("1.5-2") ||suMiktari.equals("2+")) && (egzersizSuresi.equals("60-90") ||egzersizSuresi.equals("90+")) ){
                             yasDurumu="15 yaşından küçük olmanıza rağmen iyi besleniyorsunuz. Zayıf olmanız çok su içtiğinizden ve çok egzersiz yapmanızdan kaynaklı olabilir.";
                         }
                     }
                     
                 }else{
                     if(beslenme<3){
                         if(!ekmekTuketimi){
                         yasDurumu="Günde 3 öğünden aşağı tükettiğiniz için daha çok kalori için ekmek tüketebilirsiniz..";
                         }else{
                         yasDurumu="Ekmek tüketmenize rağmen kilonuz zayıf. Daha fazla öğün beslenin..";   
                         }
                     }else{
                         if(ilacTuketimi){
                             yasDurumu="İyi besleniyorsunuz ilaç kullanmanız kilo almanızı engelliyor olabilir.";
                         }else if((suMiktari.equals("1.5-2") ||suMiktari.equals("2+")) && (egzersizSuresi.equals("60-90") ||egzersizSuresi.equals("90+")) ){
                             yasDurumu="İyi besleniyorsunuz ve ilaç kullanmıyorsunuz. Zayıf olmanız çok su içtiğinizden ve çok egzersiz yapmanızdan kaynaklı olabilir.";
                         }
                     }
              
                }
                 if(ilacTuketimi){
                     ilacDurumu="Zayıf olmanızın nedenlerinden birisi ilaç kullanmanız.";
                 }
            }else if(hesaplama >= 18.5 && hesaplama<25){
                hesapSonucu = "Kilonuz gayet normal. Mevcut durumunuzu korumanız sizin adınıza yararlı olacaktır.";
            }else if(hesaplama >= 25 && hesaplama<30){
                hesapSonucu = "Fazla Kilolu";
  
                
                
                if(yas<15){
                     if(beslenme<3){
                         yasDurumu="15 yaşından küçük olduğunuzdan dolayı daha sık aralıklarla azar azar beslenin.";
                     }else{
                         if(ilacTuketimi){
                             yasDurumu="Yaşınıza göre fazla beslenmeniz ve ilaç kullanmanız kilo almanıza neden oluyor olabilir.";
                         }else if((suMiktari.equals("1-") ||suMiktari.equals("1-1.5")) && (egzersizSuresi.equals("30-")) ){
                             yasDurumu="Yaşınıza göre fazla besleniyorsunuz.Kilolu olmanız çok su içtiğinizden ve az egzersiz yapmanızdan kaynaklı olabilir.";
                         }
                     }
                     
                 }else{
                     if(beslenme<3){
                         if(!ekmekTuketimi){
                         yasDurumu="Ekmek tüketmemenize rağmen kilolusunuz.Daha sık aralıklarla azar azar beslenin.";
                         }else{
                         yasDurumu="Ekmek tüketmeniz ve az öğünde beslenmeniz kilolu olmanıza neden oluyor olabilir.";   
                         }
                     }else{
                         if(ekmekTuketimi){
                            if(ilacTuketimi){
                                yasDurumu="Çok öğün yiyorsunuz ve ekmek tüketiyorsunuz. Ek olarak ilaç kullanmanız kilo almanıza neden oluyor olabilir.";
                            }
                         }else if((suMiktari.equals("1.5-2") ||suMiktari.equals("1-")) && egzersizSuresi.equals("30-") ){
                             if(ilacTuketimi){
                             yasDurumu="Çok öğün yemenize rağmen ekmek tüketmiyorsunz.İlaç kullanmanız,az su içtiğinizden ve az egzersiz yapmanızdan kaynaklı olabilir.";
                            }
                        }
                     }
              
                }
                
     
            }else if(hesaplama>=30){
                hesapSonucu = "Obez";
                if(ekmekTuketimi){
                    ekmekDurumu="Çok kilolusunuz ekmekten uzak durun";
                }else{
  
                   if(beslenme<3){
                         yasDurumu="Ekmek tüketmemenize rağmen aşırı kilolusunuz.Daha sık aralıklarla azar azar beslenin.";   
                     }else{ 
                            if(ilacTuketimi){
                                yasDurumu="Çok öğün yiyorsunuz ve ekmek tüketiyorsunuz. Ek olarak ilaç kullanmanız kilo almanıza neden oluyor olabilir.";
                           
                         }else if((suMiktari.equals("1.5-2") ||suMiktari.equals("1-")) && egzersizSuresi.equals("30-") ){
                             if(ilacTuketimi){
                             yasDurumu="Çok öğün yemenize rağmen ekmek tüketmiyorsunz.İlaç kullanmanız,az su içtiğinizden ve az egzersiz yapmanızdan kaynaklı olabilir.";
                            }
                        }
                     }
                    
                }
            }
            sonucMetni="Merhaba Sayın "+ad+" " +soyad+ ", Diyetisyen uzman sistem programına hoşgeldiniz..\n"+
                    ""
                    + "******************\nVücut Kütle İndeksi Değeriniz: "+Vucut_Kutle_Indeksi+"\n******************\n"+hesapSonucu+"\n"+ekmekDurumu+" "+yasDurumu;
            sonucAlanıText.setText(sonucMetni);
            
         



            //Alanlar boş değilse veritabanına eklendi.
         
         
            LocalDateTime tarih = java.time.LocalDateTime.now();
            Veritabani_Degerleri veritabaniDegerleri = new Veritabani_Degerleri();
            Veritabani_Kayit_Islemleri kayit = new Veritabani_Kayit_Islemleri();
            veritabaniDegerleri.setAd(ad);
            veritabaniDegerleri.setSoyad(soyad);
            veritabaniDegerleri.setBoy(boy);
            veritabaniDegerleri.setBeslenme(beslenme);
            veritabaniDegerleri.setEgzersizSuresi(egzersizSuresi);
            veritabaniDegerleri.setSuMiktari(suMiktari);
            veritabaniDegerleri.setTarih(tarih);
            if(ekmekTuketimiRadio.isSelected()){
                veritabaniDegerleri.setEkmekTuketimi(true);
             }else{
                veritabaniDegerleri.setEkmekTuketimi(false);
            }
            if(ilacTuketimiRadio.isSelected()){
                veritabaniDegerleri.setIlacTuketimi(true);
            }else{
                veritabaniDegerleri.setIlacTuketimi(false);
            }
            
            try {
                kayit.kayitEkle(veritabaniDegerleri);
                
            } catch (SQLException ex) {
                Logger.getLogger(MainScreen.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }//GEN-LAST:event_sonuclariGoster

    /**
     * @param args the command line arguments

*/
    
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(MainScreen.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MainScreen.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MainScreen.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MainScreen.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        
        
        
        
            
        
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MainScreen().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField adTxt;
    private javax.swing.JTextField boyTxt;
    private javax.swing.JComboBox<String> egzersizSuresiCombo;
    private javax.swing.JRadioButton ekmekTuketimiRadio;
    private javax.swing.JRadioButton ilacTuketimiRadio;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JComboBox<String> kacOgunCombo;
    private javax.swing.JTextField kiloTxt;
    private javax.swing.JTextArea sonucAlanıText;
    private javax.swing.JButton sonuclarButton;
    private javax.swing.JTextField soyadTxt;
    private javax.swing.JComboBox<String> suMiktariCombo;
    private javax.swing.JButton temizleButton;
    private javax.swing.JTextField yasTxt;
    // End of variables declaration//GEN-END:variables
}
