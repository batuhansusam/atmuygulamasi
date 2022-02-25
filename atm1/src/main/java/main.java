
import java.util.Scanner;


public class main {
  public static void main(String[] args){

        System.out.println("Bankamıza hoş geldiniz"); 

          System.out.println("**********************");
          
            System.out.println("Lütfen Giriş Yapınız:...."); 
            
            String kullanici_adi="batuhan";
           
            String sifre="12345";
            int bakiye=2000;
            
            Scanner scanner = new Scanner(System.in);
             
            

      System.out.println("KULLANICI ADI:"); 

           String kullanici_adi1 =scanner.nextLine();

            System.out.println("ŞİFRE:");
            
             String  sifre1 = scanner.nextLine();
  if(kullanici_adi1.equals(kullanici_adi)&& sifre1.equals(sifre)){
  
    System.out.println("giriş başarılı hoş geldiniz"); 
    
    System.out.println("***************************"); 
    
    
    
    System.out.println("****************************");
  
    System.out.println("1.bakiye görüntüleme\n"+
                       "2. para çekme \n"+
                       "3.para yatırma \n" +
            "çıkmak için q'ya basınız.\n"); 
      while(true){
    System.out.println("yapmak istedğiniz işlemi seçiniz:");
    String secim=scanner.nextLine();
    
    if (secim.equals("1")){
        
        System.out.println("Bakineyiz:"+bakiye);
    
   
    }
    else if(secim.equals("2")){
    System.out.println("çekmek istediğiniz tutarı giriniz:");
    int cekme_islemi;
     cekme_islemi=scanner.nextInt();
    
    if(cekme_islemi<bakiye){
    
 bakiye -=cekme_islemi ;
        
        System.out.println("kalan bakiyeniz:"+bakiye);
    }
    else{
        System.out.println("yeterli bakiye yoktur...");
    
    }
    }
    else if(secim.equals("3")){
        System.out.println("yatırmak istedğiniz tutarı giriniz:");
        int yatırma_islemi=scanner.nextInt();
        
        bakiye+=yatırma_islemi;
    
    System.out.println("Yeni bakiyeniz:"+bakiye);
    }
    else if(secim.equals("q")){
    System.out.println("çıkış yapılıyor.... ");
            break;
            
    
    }
    else{
    System.out.println("yanlış seçim yaptınız....");
    }
    }
  }
  else{
     System.out.println("yanlış giriş yaptınız"); 
 
  }
  
  
  
  }
    
    
    
}
