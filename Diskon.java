import java.util.Scanner;
import java.util.concurrent.TimeUnit;

public class Diskon {
    public static void main(String[] args) {

        //start

        System.out.println("Kalkulator Diskon");
        System.out.println("====================================================================");

        //input harga

        System.out.println("Masukan harga awal barang. (Angka saja)");
        double harga = new Scanner (System.in).nextDouble();
        System.out.println("=====================================================================");

        //input diskon

        System.out.println("Masukan diskon barang. (Angka saja)");
        double diskon = new Scanner(System.in).nextDouble();
        diskon /=100;
        System.out.println("=====================================================================");

        //input jumlah

        System.out.println("Masukan jumlah barang yang dibeli. (Angka saja)");
        int jumlah = new Scanner(System.in).nextInt();
        System.out.println("=====================================================================");

         // equation

         double totalHarga = (harga - (harga * diskon)) * jumlah;

         // output
 
         System.out.println("Mohon tunggu hasil dari nilai yang anda masukkan.");
         System.out.println("Total harga dari belanjaan anda adalah Rp" + totalHarga + ".");
         System.out.println("===========================================================================================");
         System.out.println("Sekian, terimakasih.");
         System.out.println("Code written by @CokiGantenk.");
 
     }
 
 }

        

        
        


        




        
    
    

