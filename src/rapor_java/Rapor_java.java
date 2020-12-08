package rapor_java;
import java.util.Scanner;

public class Rapor_java {

    public static void main(String[] args) {
        //deklarasi varible
        String nama , nisn ;
        char grade ;
        double n_tugas , n_pts , n_pas , n_akhir ;
        boolean running = true ;
        Scanner input = new Scanner (System.in);
        String jawab ;
        //menginput data
        while (running){
            System.out.println("====Nilai Raport Siswa/i====\n");
            System.out.print("Masukkan Nama : ");
            nama = input.next();
            System.out.print("Masukan NISN : ");
            nisn = input.next();
            System.out.print("Nilai Tugas : ");
            n_tugas = input.nextInt();
            System.out.print("Nilai PTS : ");
            n_pts = input.nextInt();
            System.out.print("Nilai PAS : ");
            n_pas = input.nextInt();
            
            //proses perhitungan data
            n_akhir = (0.30 * n_tugas + 0.30 * n_pts + 0.40 * n_pas);
            if (n_akhir >= 85 && n_akhir <=100){
                grade = 'A';
            }
            else if (n_akhir > 75 && n_akhir < 85){
                grade = 'B' ;
            }
            else if (n_akhir > 65 && n_akhir < 75){
                grade = 'C';
            }
            else if (n_akhir > 50 && n_akhir < 65){
                grade = 'D';
            }
            else {
                grade = 'E';
            }
            
            //penentuan nilai
            switch (grade){
                case 'A' :
                    System.out.println("\n"+nama+"dengan NISN "+nisn+"memiliki nilai akhir "+n_akhir+" = ("+grade+")"+""
                    + "\n dan dinyatakan lulus");
                    break;
                case 'B' :
                    System.out.println("\n"+nama+"dengan NISN "+nisn+"memiliki nilai akhir "+n_akhir+" = ("+grade+")"+""
                    + "\n dan dinyatakan lulus");
                    break;
                case 'C' :
                    System.out.println("\n"+nama+"dengan NISN "+nisn+"memiliki nilai akhir "+n_akhir+" = ("+grade+")"+""
                    + "\n dan dinyatakan lulus");
                    break;
                case 'D' :
                    System.out.println("\n"+nama+"dengan NISN "+nisn+"memiliki nilai akhir "+n_akhir+" = ("+grade+")"+""
                    + "\n dan dinyatakan tidak lulus");
                    break;
                case 'E' :
                    System.out.println("\n"+nama+"dengan NISN "+nisn+"memiliki nilai akhir "+n_akhir+" = ("+grade+")"+""
                    + "\n dan dinyatakan tidak lulus");
                    break;
            }
            //pengulangan sistem
            
            System.out.println("Apakah anda ingin mengulangi ? [jawab " + "ya/tidak]");
            jawab = input.next();
            if (jawab.equalsIgnoreCase("ya")){
                running = true;
            }
            if (jawab.equalsIgnoreCase("tidak")){
                running = false ;
                
            }System.out.println("\nTerimakasih telah menggunakan program ini");
                  
        }
      
    }
    
}
