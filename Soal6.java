package Latihan;
import java.util.Scanner;
public class Soal6 {
    public static void main (String [] args){
        int diskon = 0;
        int harga = 0;
        int total_belanja = 0;

        Scanner userInput = new Scanner(System.in);
        System.out.println("Kode Minuman : ");
            int Kode_Minuman = userInput.nextInt();

            if (Kode_Minuman==1) {
                harga = 7500;
            }
            else if (Kode_Minuman==2){

                harga = 4000;
            }
            else if (Kode_Minuman==3){

               harga = 3500;
            }
            else if (Kode_Minuman==4){

                harga = 5000;
            }
        System.out.println("Kuantitas : ");
            int kuantitas = userInput.nextInt();

            if(kuantitas==1){
                total_belanja = harga*1;
            }
            else if (kuantitas==2){
                total_belanja = harga*2;
            }
            else if (kuantitas==3){
                total_belanja = harga*3;
            }
            else if (kuantitas==5){
                total_belanja = harga*5;
            }

            else if (kuantitas==5){
                total_belanja = harga*5;
            }
            else if (kuantitas==6){
                total_belanja = harga*6;
            }
            else if (kuantitas==7){
                total_belanja = harga*7;
            }
            else if (kuantitas==8){
                total_belanja = harga*8;
            }
            else if (kuantitas==9){
                total_belanja = harga*9;
            }
            else if (kuantitas==10){
                total_belanja = harga*10;
            }
            else if (kuantitas==11){
                total_belanja = harga*11;
            }
            else if (kuantitas==12){
                total_belanja = harga*12;
            }
            else if (kuantitas==13){
                total_belanja = harga*13;
            }
            else if (kuantitas==14){
                total_belanja = harga*14;
            }
            else if (kuantitas==15){
                total_belanja = harga*15;
            }
            else if (kuantitas==16){
                total_belanja = harga*16;
            }
            else if (kuantitas==17){
                total_belanja = harga*17;
            }
            else if (kuantitas==18){
                total_belanja = harga*19;
            }
            else if (kuantitas==20){
                total_belanja = harga*20;
            }
            else if (kuantitas==21){
                total_belanja = harga*21;
            }
            else if (kuantitas==22){
                total_belanja = harga*22;
            }
            else if (kuantitas==23){
                total_belanja = harga*23;
            }
            else if (kuantitas==24){
                total_belanja = harga*24;
            }

        if (total_belanja>=100000) {
                diskon = total_belanja*15/100;
            }
            else if (total_belanja<100000&&total_belanja>50000){
                diskon = total_belanja*75/1000;

            }

            else if (total_belanja<50000){
                diskon = 0;
            }

        System.out.println("total_belanja = " + total_belanja);
            long total_pembelian =total_belanja-diskon;
        System.out.println("diskon = " + diskon);

        System.out.println(" total_pembelian = " + total_pembelian);












    }
}
