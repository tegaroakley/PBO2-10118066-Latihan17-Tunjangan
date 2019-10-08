/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pbo2.pkg10118066.latihan17.tunjangan;
import java.util.Scanner;

/**
 *
 * @author
 * NAMA    : Tegar Lucky'q Oakley
 * KELAS   : IF 2
 * NIM     : 10118066
 */
public class PBO210118066Latihan17Tunjangan {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
       Scanner scanner = new Scanner (System.in);
        System.out.println("=================Program Tunjangan=================");
        System.out.print("Berapa gaji pokok anda perbulan ?\t : Rp. ");
        double gajipokok = scanner.nextDouble();
        System.out.print("Status anda ? (Menikah/Belum) \t\t : ");
        String status = scanner.next();
        System.out.println(" ");
        System.out.println("============Hasil Perhitungan Gaji Anda============");
        System.out.println("Gaji Pokok\t\t = Rp. " + gajipokok);
        double tunjangan;
        char Menikah;
        Menikah='Y';
        tunjangan =(status.equals("Menikah"))?0.35*gajipokok:0;    
        System.out.println("Tunjangan\t\t = Rp. " + tunjangan);
        System.out.println("Total Gaji\t\t = Rp. "+ (tunjangan+gajipokok));
        System.out.println("(Developed by : Tegar Lucky'Q Oakley)");
        }
        
         
    }
    

