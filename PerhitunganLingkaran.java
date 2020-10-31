/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package perhitunganlingkaran;
import java.util.*;
/**
 *
 * @author Beta Three
 * NAMA         : Adrian Maidiyangsa
 * KELAS        : IF-1
 * NIM          : 10119029
 * Deskripsi Program : Program ini berisi program perhitungan lingkaran, program ini dibuat sendiri
 * dan dibantu oleh sumber-sumber yang ada diinternet
 */
public class PerhitunganLingkaran {

    /**
     * @param args the command line arguments
     */
    
    
    public static void main(String[] args) {
        // TODO code application logic here
        double diameter, jari, luas, keliling;

        Scanner scanner = new Scanner(System.in);
        System.out.println("=======Perhitungan Lingkaran=======");
        System.out.print("Masukan nilai diameter lingkaran : ");
        diameter = scanner.nextInt(); 
            jari = 0.5 * diameter;
            luas = 3.14 * (jari*jari);
            keliling = 2 * 3.14 * jari;
            System.out.println();
            System.out.println("=======Hasil Perhitungan Lingkaran=======");
            System.out.println("Jari-jari Lingkaran = "+jari);
            System.out.println("Luas Lingkaran = "+luas);
            System.out.println("Luas Lingkaran = "+keliling);
    }
}
