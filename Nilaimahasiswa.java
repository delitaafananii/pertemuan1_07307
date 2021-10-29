
package nilaimahasiswa;

import java.util.Scanner;

public class Nilaimahasiswa {

    public static void main(String[] args) {
       int input;
       Scanner Scanner = new Scanner(System.in);
       int i = 0, j=1, jumlah=0; // int i digunakan sebagai inisialisasi
       double rata;
       System.out.print("Masukkan Jumlah Mata Kuliah : ");
       input = Scanner.nextInt();
       String[]nama = new String[input];
       double[]nilai = new double[input];
       
       do{
           System.out.print("Masukkan Nilai Mata Kuliah ke - "+j+":");
           nilai[i]= Scanner.nextInt();
           jumlah += nilai[i]; 
           i++;
           j++;
       }while (i < input);
       
       rata = jumlah/input;
       System.out.println("Nilai Rata-Rata : "+rata);
       if (rata>=71){
           System.out.println(" Keterangan : LULUS");
       }else{
           System.out.println(" Keterangan : GUGUR");
       }
    }
    
}
