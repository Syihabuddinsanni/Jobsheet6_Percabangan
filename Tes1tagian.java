
package REWORKED;


import java.util.Scanner;

public class Tes1tagian {
      

    public static void main(String[] args) {
    Scanner baca = new Scanner(System.in);
    int p, rms, m ;    
    double pajak, total;
    
  System.err.println("===============TOOLS CEK TAGIHAN LISTRIQ==============="); 
  System.out.println("1. Listrik Rumah Tangga"); 
  System.out.println("2. Cara pakai tools nya"); 
 
  System.out.println("𝘽𝙖𝙘𝙖 𝙙𝙪𝙡𝙪 𝙜𝙖𝙣 :𝘿");
  System.out.println("Pilih salah 1 / 2 sam :v :");
  
   System.err.println("=====================================================");
          
  p = baca.nextInt();
  
   
  if (p==1){
        System.out.println("=====Listrik Rumah Tangga=====");
        
        System.out.println("1. Pemakaian 0 - 450kwh     = Golongan C");
        System.out.println("2. Pemakaian 450 - 900kwh   = Golongan B");
        System.out.println("3. Pemakaian 900 - 1200kwh  = Golongan A");

  
        
        System.out.println("Tentukan Anda masuk golongan mana? : ");
        p = baca.nextInt();
     
        
        
        
          System.out.println("Kalau boleh tau berapa :v ? :");
          m = baca.nextInt();
          
                  
      
       
        
        if (p == 1){
           
       rms = (20000 + (m * 1000));
       System.out.println("Tarif Anda adalah rp."+rms);
       pajak = (0.1 * rms);
       System.out.println("pajak : " +pajak );
       total = (rms + pajak);
       
       System.err.println("TOTAL BIAYA : Rp." + total);
       
       }
        
        
        
        if (p == 2){
            rms = (  35000 + (m * 2500));
            System.out.println("Tarif Anda adalah rp."+rms);
                pajak = (0.15 * rms);
       System.out.println("pajak : " +pajak );
       total = (rms + pajak);
       
       System.err.println("TOTAL BIAYA : Rp." + total);
        }
        
        
         if (p == 3){
            rms = ( 50000 + (m * 3000));
            System.out.println("Tarif Anda adalah rp." +rms);
            pajak = (0.20 * rms);
       System.out.println("pajak : " +pajak );
       total = (rms + pajak);
       
       System.err.println("TOTAL BIAYA : Rp." + total);
}
    
    
    } else if (p==2) {
        System.out.println("===================================================");
        System.out.println("1. Pilih Angka 1 pada menu awal"); 
      System.out.println("2. Pilih Golongan yang sesuai dengan kwh anda"); 
      System.out.println("3. Tulis berapa kwh anda"); 
      System.out.println("4. Jeng jeng :v tagihan anda keluar "); 
      System.out.println("5. Jangan lupa bayar sob!!! :V"); 
      System.out.println("===================================================");
      System.err.println("𝗧𝗢𝗢𝗟𝗦 𝗕𝗬 @𝗦𝘆𝗶𝗵𝘂𝗯"); 
      System.out.println("99. back menu awal : ");
      
      
    }
  
    }
}

    
    
  
    
    
            
            
        
        
            
            
        
    
    
        
         



     
  
        

      
     
    
