package Latihan;
import java.util.Scanner;
public class Soal5 {
    public static void main (String[] args){

        int Tunjangan_anak = 0;
        int Tunjangan_istri = 0;
        int Pph = 0;

        Scanner userInput = new Scanner(System.in);
        System.out.println("Gaji_pokok = ");
            int Gaji_pokok= userInput.nextInt();

        System.out.println("Status Kawin");
        System.out.println("Kawin = ");
            int Kawin= userInput.nextInt();

            if (Kawin== 0 ){
                Tunjangan_anak = 0;
                Tunjangan_istri = 0;

            }
            else if (Kawin == 1) {
                Tunjangan_istri = 500000;

            }

        System.out.println("Jumlah_anak =  ");
        int Jumlah_anak = userInput.nextInt();
        if(Jumlah_anak==0) {
            Tunjangan_anak = (int) 0;
        }
        else if (Jumlah_anak==1){
            Tunjangan_anak= (int) 100000;
        }
        else if (Jumlah_anak>=2) {
            Tunjangan_anak = (int) 200000;
        }

        if (Gaji_pokok<= 3000000) {
             Pph =   Gaji_pokok *5/100;

        }
        else if (Gaji_pokok>= 3000000){

           Pph = Gaji_pokok *10/100 ;
        }
        float Tunjangan_Kesehatan= Gaji_pokok * 5/100;
        System.out.println("Tunjangan_Kesehatan = " + Tunjangan_Kesehatan);

        float Total_Gaji = Gaji_pokok + Tunjangan_anak+Tunjangan_istri+ Tunjangan_Kesehatan-Pph;

        System.out.println("Total Gaji = " + Total_Gaji);

        System.out.println("Pajak Penghasilan = " + Pph);

    }
}

