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
import java.util.Scanner;


class musteri{
    private String  işlem;
    
    public musteri(String no){
        this.işlem=işlem;
    }
    public String getno(){
        return işlem ;
    }
    public void  setno(String no){
        this.işlem=işlem;
    }
    public void Islem(){
        System.out.println("işlemini yapınız ");
    }
      
}

 class selam1 extends musteri{
   public selam1(String işlem){
       super(işlem);
       
   } 
   public void Islem(){
       System.out.println(getno()+ "bankaya gidiniz...");
   }
   
}
class selam2 extends musteri{
     public selam2(String işlem){
       super(işlem);
       
   } 
     public void Islem(){
         System.out.println(getno() +"telesekretere başvurunuz...");
     }
}

public class JavaApplication2  {

    /**
     * @param args the command line arguments
     */
    
    private static void çıkış(){
    int hesap=1000;   
    System.out.println("hesabınızdan çıkılıyor...");
}
    
    public static void main(String[] args) {
        uygulama uyg= new uygulama("hilal","ziraat",1111,1000);
        
        musteri musteri=new musteri("kredi");
        selam1 selam1= new selam1("faiz");
        selam2 selam2= new selam2("fatura");
        
        selam1.Islem();
        selam2.Islem();
        musteri.Islem();
        
        
        
        Scanner scan= new Scanner(System.in);
        System.out.println("1.hesabı görüntüle"+
                            "2. hesaba para yatır"+
                            "3. hesabtan paa çek"+
                             "çıkış yap");
        kredi kredi= new kredi("hilal","ziraat",1111,1000);
        kredi.goster();
      
       int sayı;
        
     
       while(true){
            System.out.print("Seçimini yap: ");
           int seçim= scan.nextInt();
       if(seçim==1){
          uyg.hesap_goster();
       }
       else if(seçim==2){
           System.out.println("yatırılıcak tutarı giiniz: ");
           sayı=scan.nextInt();
           uyg.para_yatır(sayı);
       }
       else if(seçim==3){
           System.out.println("çekilecek tutarı giiniz: ");
           sayı=scan.nextInt();
           uyg.para_cek(sayı);
       }
       else if(seçim==4){
           System.out.println("almak istediğiniz krediği beklirtiniz: ");
           sayı=scan.nextInt();
           kredi.kredi_hesap(sayı);
       }
       else{
          çıkış();
          break;
       }
       }
        
        
        
        
        
        
        
        
    }
    
}
