/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication2;

/**
 *
 * @author TUNÇ
 */
public class uygulama {
    
    private String ad;
    private String banka;
    private double hesap;
    private int sıfre;
    double kredi;
    
    public void setad(String ad){
        this.ad=ad;
    }
    public void setbanka(String banka){
        this.banka=banka;
    }
    public void sethesap(double hesap){
        this.hesap=hesap;
    }
    public void setsıfre(int sıfre){
        this.sıfre=sıfre;
    }
    public String getad(){
        return this.ad;
    }
     public String getbanka(){
        return this.banka;
    }
     public double gethesap(){
        return this.hesap;
    }
     public int  getsıfre(){
        return this.sıfre;
     }
     
     public uygulama(String ad, String banka,int sıfre,double hesap){
         this.ad=ad;
         this.banka=banka;
         this.hesap=hesap;
         this.sıfre=sıfre;
     }
     public void goster(){
         System.out.println(this.ad);
         System.out.println(this.banka);
         System.out.println(this.sıfre);
         System.out.println(this.hesap);
     }
     
     public void kredi_hesap(int tutar){
      kredi=hesap*0.02;
      if(hesap>tutar){
          System.out.println("Kredi alamassınız...");
      }else{
          System.out.println("kredi alabilirsiniz lütfen bir bankaya müracat edin...");
      }
      
     }
     
     public void hesap_goster(){
         System.out.println("hesabınızda"+ hesap+"'TL miktar vardır.");
     }
     public void para_yatır(int tutar){
         hesap=hesap+tutar;
         System.out.println("hesabınızdaki yeni tutar"+ hesap+"' tutarındadır...");
     }
      public void para_cek(int tutar){
          if(tutar>hesap){
              System.out.println("hesabınızda yeterli bakiye bulunmamaktır...");
          }
          else{
              hesap=hesap-tutar;
              System.out.println("hesabınızdaki yeni tutar"+ hesap+"' tutarındadır...");
          }
          
        
      
      }       
    
     
     
     
     
     
     
     
     
     
     
     
     
     
     
     
     
     
     
     
     
     
     
     
     
    
}
