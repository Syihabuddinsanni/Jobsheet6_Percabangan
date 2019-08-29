package JobSheet6;
import java.util.Scanner;
    public class SaranBahanMasak {
        public static void main(String[] args) {
            
            String identitas = "Muhammad IZzul Haq Syihabuddin Sanni / XRPL2 / no";
            System.out.println("identitas : " +identitas);
            
            System.out.print("\nSaran Resep dari bahan milik anda\n");
            
            Scanner baca = new Scanner(System.in);
            
            System.out.println("Bahan Pertama : ");
            System.out.println("1. Pisang");
            System.out.println("2. Telur");
            System.out.print("Masukan no pilihan anda :");
            int bahan1 = baca.nextInt();
            
            if(bahan1 == 1 || bahan1 == 2)
            {
                System.out.println("Bahan kedua : ");
                if(bahan1 == 1) {
                    System.out.println("1. Susu");
                    System.out.println("2. Minyak Goreng");
                    System.out.println("3. Tidak ada");
                } else {
                        System.out.println("1 Minyak Goreng");
                        System.out.println("2. Roti");
                        System.out.println("3. Tidak ada");
                }
                System.out.print("Masukan no pilihan anda : ");
                
                
            }
            int bahan2 = baca.nextInt();
               
            if(bahan2 >= 1 && bahan2 <=3)
            {
                if(bahan1==1)
                    switch(bahan2)
                    {
                        case 1: System.out.println(
                        "Anda dapat membuat milk shake banana"); break;
                        case 2: System.out.println(
                        "Anda dapat membuat pisang goeng"); break;
                        case 3: System.out.println(
                        "Anda dapat membuat pisang rebus");
                        
                        
                        
                        
                    }
            else
                    switch(bahan2)
                    {
                        case 1 : System.out.println(
                        "Anda dapat membuat telur mata sapi"); break;
                        case 2 : System.out.println(
                        "Anda dapat membuat sandwich telur"); break;
                        case 3 : System.out.println(
                        "Anda dapat membuat telur rebus");
                    }
                
            }else
                System.out.println("Mohon maaf, pilihan tidak ditemukan," +"tidak dapat memberikan saran resep");
            
                    }
            }
            
        
        
        
          
                  
                  
                        
                        
                
           
        
    

