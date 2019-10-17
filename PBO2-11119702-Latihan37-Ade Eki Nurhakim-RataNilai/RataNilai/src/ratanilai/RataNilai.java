/*Nama 	 : Ade Eki Nurhakim
NIM 	 : 10119702
Fakultas : Teknik Dan Ilmu Komputer
Prodi 	 : Teknik Informatika
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ratanilai;

/**
 *
 * @author Ekiw
 */
import java.util.Scanner;
public class RataNilai {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n, jml, nilai[];
        float rata, jumlah = 0;
 
        System.out.print("Masukkan Banyaknya Mahasiswa : ");
        n = input.nextInt();
 
        nilai = new int[n];
 
        for(int i=0;i<= n-1;i++){
            System.out.print("Nilai Mahasiswa " + (i+1) + " : ");
            nilai[i] = input.nextInt();
            System.out.println();
        }
 
        for(int j=0;j<= n-1;j++){
            jumlah = jumlah + nilai[j];
        }
 
        rata = jumlah/n;
 
        System.out.println("Daftar Nilai Mahasiswa");
        System.out.println("----------------");
        System.out.println("Maka, Rata-rata Nilai Mahasiswa : " + rata);
    }
}
