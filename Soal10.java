package Latihan;
import java.util.Scanner;
public class Soal10 {
    public static void main (String[] args){

        Scanner input = new Scanner(System.in);

        int n,m,k;
        int total = 0;
        do {
            System.out.print("Masukkan angka 1 = ");

            n = input.nextInt();
            System.out.print("Masukkan angka 2 = ");
            m = input.nextInt();
            System.out.print("Masukkan angka 3 = ");
            k = input.nextInt();
        } while (n == 0 || m==0 || k==0);
        total= (m+n+k)/3;
        System.out.print(total);







    }
}
