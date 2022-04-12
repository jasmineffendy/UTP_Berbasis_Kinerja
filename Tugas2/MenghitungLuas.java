import java.io.*;
import java.util.*;

public class MenghitungLuas {

        public static void main(String[] args) {

            Scanner inp = new Scanner(System.in);
            int bentuk = inp.nextInt();

            Persegi kotak = new Persegi();
            Segitiga segitiga = new Segitiga();
            Lingkaran bulat = new Lingkaran();

            switch (bentuk){

                case 1:
                    int s = inp.nextInt();
                    kotak.Sisi(s);
                    System.out.println (kotak.Luas());
                    break;
                case 2:
                    int a = inp.nextInt();
                    int t = inp.nextInt();
                    segitiga.Alas(a);
                    segitiga.Tinggi (t);
                    System.out.println (segitiga.Luas());
                    break;
                case 3:
                    int r = inp.nextInt();
                    bulat.Jari(r);
                    System.out.println ((double)bulat.Luas());
                    break;
                default:
                    System.out.println ("Input yang anda masukan tidak sesuai");
            }
        }
    }
    class Persegi{
        int sisi, luas;
        public void Sisi (int sisi){
            this.sisi = sisi;
        }
        public int Luas (){
            luas = this.sisi * this.sisi;
            return luas;
        }
    }
    class Segitiga{
        int alas, tinggi, luas;
        public void Alas (int alas){
            this.alas = alas;
        }
        public void Tinggi (int tinggi){
            this.tinggi = tinggi;
        }
        public int Luas (){
            luas = (this.alas*this.tinggi)/2;
            return luas;
        }
    }
    class Lingkaran {
        int phi, jari, luas;

        public void Jari(int jari) {
            this.jari = jari;
        }

        public int Luas() {
            if (jari % 7 == 0) {
                luas = (int) (22 / 7 * this.jari * this.jari);
                return luas;
            } else {
                int luas = (int) (3.14 * this.jari * this.jari);
                return luas;
            }
        }
    }
