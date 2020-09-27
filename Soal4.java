package Latihan;
import java.util.Scanner;
public class Soal4 {
    public static void main(String[] args){

        int Tunjangan_anak = 0;
        int Tunjangan_istri = 0;

        Scanner userInput= new Scanner(System.in);
        System.out.println("gaji_pokok = ");
            float gaji_pokok= userInput.nextFloat()   ;

        System.out.println("kawin =  ");
        int kawin = userInput.nextInt();

        if (kawin==0){
            Tunjangan_anak = 0;
            Tunjangan_istri = 0;

        }


        else if(kawin==1){
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


        int Total_Gaji = (int) (Tunjangan_istri+Tunjangan_anak+gaji_pokok);

        System.out.println("Total_Gaji = " + Total_Gaji);









    }











}
