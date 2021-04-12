package bisapraktikum2;
import java.util.Scanner;
public class utama {
    public static void main(String[]args){
        int repeat;
        do{
        Film film1 = new Film();
        
         System.out.println("========================");
         System.out.println("====Input Rental VCD====");
         System.out.println("========================");
         
        Scanner input = new Scanner(System.in);

        System.out.println("Anda Memilih CD FILM");
        System.out.print("Masukan film      : ");
            film1.judulfilm = input.nextLine();
            System.out.print("Pemain            : ");
            film1.pemain = input.nextLine();
            System.out.print("Sutradara         : ");
            film1.sutradara = input.nextLine();
            System.out.print("Publisher         : ");
            film1.publiser = input.nextLine(); 

        System.out.println("Kategori          : ");
        System.out.println("1.Semua Umur");
        System.out.println("2.Remaja");
        System.out.println("3.Dewasa");
        System.out.println("4.Anak-Anak");
        System.out.print("Masukan Pilihan   : ");
        int pil;
        pil = input.nextInt();
            switch (pil) {
                case 1:
                    film1.kategori = "Semua Umur";
                    break;
                case 2:
                    film1.kategori = "Remaja";
                    break;
                case 3:
                    film1.kategori = "Dewasa";
                    break;
                case 4:
                    film1.kategori = "Anak-Anak";
                    break;
                default:
                    System.out.println("pilihan tidak ada");
                    return;
            }
            System.out.print("Stok              : ");
            film1.stok = input.nextInt();
        System.out.println("Judul Film      : "+film1.judulfilm);
        System.out.println("Pemain          : "+film1.pemain);
        System.out.println("Sutradara       : "+film1.sutradara);
        System.out.println("Publisher       : "+film1.publiser);
        System.out.println("Kategori        : "+film1.kategori);
        System.out.println("Stok            : "+film1.stok);
        
        System.out.println("ingin mengulang kembali atau tidak(1.iya/2.tidak )");
        repeat=input.nextInt();
        }while(repeat<2);
    }
}
