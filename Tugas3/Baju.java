public class Baju {

    String jenis;
    int harga;
    int jumlah;

    public Baju(String a, int b) {
        this.jenis = a;
        this.jumlah = b;
    }

    final int a = 100000;
    final int b = 125000;
    final int c = 175000;

    void PriceA() {
        if (jumlah > 100) {
            harga = 95000;
        } else {
            harga = a;
        }
    }

    void PriceB() {
        if (jumlah > 100) {
            harga = 120000;
        } else {
            harga = b;
        }
    }

    void PriceC() {
        if (jumlah > 100) {
            harga = 160000;
        } else {
            harga = c;
        }
    }

    void print() {

        if (jenis.equalsIgnoreCase("a"))
            PriceA();
        else if (jenis.equalsIgnoreCase("b"))
            PriceB();
        else if (jenis.equalsIgnoreCase("c"))
            PriceC();

        System.out.println("Jenis yang anda beli : " + jenis);
        System.out.println("Harga per buah       : " + harga);
        System.out.println("Total harga          : " + harga * jumlah);
    }
}
