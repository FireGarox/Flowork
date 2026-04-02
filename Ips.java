import java.util.Scanner;

public class Ips {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String nama = "", nim = "";
        double ips = 0;
        System.out.println("Silahkan masukkan namamu");
        nama = scan.nextLine();
        System.out.println("Silahkan masukkan nim");
        nim = scan.nextLine();
        System.out.println("Silahkan masukkan IPS");
        ips = scan.nextDouble();


        System.out.println("Nama: " + nama);
        System.out.println("NIM: " + nim);



        if (ips > 4) {
        System.out.println("Ips tidak valid");
        } else if (ips >= 3.5) {
        System.out.println("Beban belajar yang harus dipenuhi adalah 24");
        } else if (ips >= 3) {
        System.out.println("Beban belajar yang harus dipenuhi adalah 22");
        } else if (ips >= 2) {
        System.out.println("Beban belajar yang harus dipenuhi adalah 20");
        } else if (ips < 2) {
        System.out.println("Beban belajar yang harus dipenuhi adalah 18");
        } else if (ips < 0) {
        System.out.println("Ips tidak valid");
        }


        }
        
    }
   
    
