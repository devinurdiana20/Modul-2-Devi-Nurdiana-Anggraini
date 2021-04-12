package bisapraktikum2;
public class Film extends Rental {
    public String pemain;
    public String sutradara;
    public String kategori;
    public Film(String pemain, String sutradara, String kategori, String judul, String publiser, int stok) {
        super(judul, publiser, stok);
        this.pemain = pemain;
        this.sutradara = sutradara;
        this.kategori = kategori;
    }
   Film() {
    }
}   
