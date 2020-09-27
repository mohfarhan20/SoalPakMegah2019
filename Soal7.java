package Latihan;
import java.util.Scanner;
public class Soal7 {


    public static void main(String [] args){


        Scanner userInput = new Scanner(System.in);
        System.out.println("Masukkan Nilai");
            int Masukkan_Nilai = userInput.nextInt();

            if (Masukkan_Nilai<30&&Masukkan_Nilai>0){

                System.out.println(" Grade = E");
            }

        else if (Masukkan_Nilai<50&&Masukkan_Nilai>30){
            System.out.println(" Grade = D");
        }
        else if (Masukkan_Nilai<70&&Masukkan_Nilai>50){
            System.out.println("Grade = C");
        }
        else if (Masukkan_Nilai<80&&Masukkan_Nilai>70){
            System.out.println("Grade = B");
        }
        else if (Masukkan_Nilai<100&&Masukkan_Nilai>80){
            System.out.println("Grade = A");
        }


    }
}
