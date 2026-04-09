import java.util.Scanner;

public class Bintang_PDQ1252_latihanPerulangan {
    public static void main(String[] args) {
        int n = 0,total = 0, p = 0;
        Scanner input = new Scanner(System.in);
        int [] harga = {2000,3000,4000,2500,5000};
        String [] menu = {"kopi","teh","susu","telur","teler"};
        System.out.println("============================");
        System.out.println("Daftar menu");
        for (int i=0; i < menu.length; i++) {
            System.out.println((i+1)+"."+menu[i] + " : "+ harga[i]);
         }
        System.out.println("============================");
         System.out.println("Masukkan jumlah barang yang dibeli");
         n = input.nextInt();
        for (int i=0; i < n; i++) {
            System.out.println("Masukkan barang ke"+ (i+1));
            p = 0;
            p = input.nextInt();
            total += harga[p-1];
            }
        System.out.println("total: "+total);
    }
        
}
