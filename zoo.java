import java.util.Scanner;

public class zoo {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int in = 0, total = 0,subtotal = 0, jumlah = 0;
    
        String[] category;
        int[] harga, banyak;
        category = new String[jumlah];
        harga = new int[jumlah];
        banyak = new int[jumlah];
        
        do {   
            System.out.println("pilih menu");
            System.out.println("1.  Isi jenis dan harga tiket");
            System.out.println("2.  Isi jumlah tiket");
            System.out.println("3.  Print");
            System.out.println("4.  Exit");
            in = scan.nextInt();
            switch (in) {
            case 1:
                System.out.print("banyak kategori");
                jumlah = scan.nextInt();
                 category = new String[jumlah];
                 harga = new int[jumlah];
                 banyak = new int[jumlah];
                
                
                for (int i = 0; i < category.length;i++){
                    
                    System.out.print("Tiket ke-" + (i+1) + " : ");
                    category[i] = scan.nextLine();
                    category[i] = scan.nextLine();
                    System.out.print("Harga : ");
                    harga[i] = scan.nextInt();
                };
                continue;
            case 2:
                for (int i = 0; i < category.length;i++){
                    System.out.println("jumlah tiket ke-" + (i+1));
                    banyak[i] = scan.nextInt();

                };
                continue;
            case 3:
                System.out.println("==============================");
               
                for (int i = 0; i < category.length;i++){
                System.out.println("Tiket ke-" + (i+1));
                System.out.println("jenis tiket: " + category[i]);
                System.out.println("harga tiket: " + harga[i]);
                System.out.println("banyak tiket: " + banyak[i]);
                subtotal = banyak[i]*harga[i];
                System.out.println("subtotal: " + subtotal);
                total += subtotal;

                }
                System.out.println("==============================");
                System.out.println("Total: " + total);
                System.out.println("==============================");
                continue;
            case 4:
                break;
            default:
                break;
        } 
            
        } while (in < 4);
        
         
    } 
    
}

