/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pbo3.pkg10117113.latihan21.ratanilai;

import com.sun.org.apache.xalan.internal.xsltc.compiler.sym;
import java.util.Scanner;

/*
 * Nama     : Eka Widyantoro
 * NIM      : 10117113
 * Kelas    : IF-3/PBO-3
 * Desc     : Program untuk mengetahui nilai rata rata 
 */
public class PBO310117113Latihan21RataNilai {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int banyak;
        double rata,total;
        total=0;
        Scanner scanner = new Scanner(System.in);
        System.out.print("Masukan Banyaknya Mahasiswa : ");
        banyak = scanner.nextInt();
       
        int[] nilai = new int[banyak];
        for (int i=0 ; i<banyak ; i++){
            System.out.print("Nilai Mahasiswa Ke-"+i+" : ");
            nilai[i] = scanner.nextInt();
            total=nilai[i]+total;
        }
        rata=total/banyak;
        System.out.println("Maka Rata-Rata Nilai adalah "+rata);
    }
    
}
