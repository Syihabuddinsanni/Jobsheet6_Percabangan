package JobSheet6;

import java.util.Scanner;

public class Percabangan {
    public static void main(String[] args) {
 
        String identitas="Muhammad Izzul Haq Syihabuddin Sanni /XRPL/21";
        System.out.println("identitas:"+identitas); 
        Scanner baca = new Scanner(System.in);
        System.out.println("Nilai a?");
        int a = baca.nextInt();
        
        
     int nilai;
     System.out.println("\nNilai Anda ?");
     nilai = baca.nextInt();
     
    
     
     String grade = (nilai < 75) ? "belum kompeten" : "kompeten";
     System.out.println(nilai + " => " +grade);
     
     
    
        }
    
    
}
        
    


