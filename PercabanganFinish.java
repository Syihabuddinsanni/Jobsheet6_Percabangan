package JobSheet6;

import java.util.Scanner;

public class Percabangan {
    public static void main(String[] args) {
 
        String identitas="Muhammad Izzul Haq Syihabuddin Sanni /XRPL/21";
        System.out.println("identitas:"+identitas); 
        Scanner baca = new Scanner(System.in);
        System.out.println("Nilai a?");
        int a = baca.nextInt();
        
        System.out.println("\nIF.. 1");
        if(a<5) System.out.println("nilai a kurang dari 5");
         
        System.out.println("\nIF.. 2");
        if (a==5)
            System.out.println("nilai a sama dengan 5");
        
        System.out.println("\nIF.. 3");
        if (a>5){
        System.out.println("isi variable a:"+a);
        System.out.println("nilai a lebih dari 5");
        }
    // IF ELSE 
    System.out.println("\nIF..Else..");
    if (a<5){
        System.out.println("ISI VARIABLE A"+a);
        System.out.println("nilai a kurang dari 5");
    } else System.out.println("nili a lebih dari atau sama dengan 5");   
   System.out.println("===========================================");
// IF ELSE 2
    System.out.println("\nIF..Else IF..Else..1");
    if (a<5){
    System.out.println("nilai a kurang dari 5");
    }else if (a==5){
    System.out.println("nilai a sama dengan 5");
    } else 
        System.out.println("nilai a lebih dari 5");
    
    System.out.println("\nIF..Else IF..Else..2");
    if (a<2){
     System.out.println("nilai a kurang dari 2");}
    else if (a<4){
    System.out.println("nilai a kurang dari 4");}
    else if (a<6){
    System.out.println("nilai a kurang dari 6");}
    else if (a==6){
    System.out.println("nilai a sama dengan dari 6");}
    else
        System.out.println("nilai a lebih dari 6");
   
   
    System.out.println("===========================================");
//METHOD MAIN (14)
     System.out.println("\nNested IF");
     if (a<7){
      System.out.println("nilai a kurang dari 7");
     if (a>2)
          System.out.println("nilai a lebih dari 2");
     if(a<4)
          System.out.println("nilai a kurang dari 4");
     }
     
     
     System.out.println("\nNested..CASE");
     switch (a) {
         case 1:System.out.println("nilai a =>1");break;
         case 2:System.out.println("nilai a =>2");break;
         case 3:
         case 4:System.out.println("nilai a => 3 atau 4");break;
         case 5:System.out.println("nilai a => 5");break;
         default:System.out.println("nilai a bukan antara 1-5");break;
                  }
     
     int nilai;
     System.out.println("\nNilai Anda ?");
     nilai = baca.nextInt();
     
    
     
     String grade = (nilai < 75) ? "belum kompeten" : "kompeten";
     System.out.println(nilai + " => " +grade);
     
     
    
        }
    
    
}
        
    


