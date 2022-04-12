
//Jasmine Cecilia Putri Effendy 215150701111041

import java.util.Scanner;

public class UBFood {

        public static void main(String[] args) {

            Scanner in = new Scanner(System.in);

            DataMerchantUB.merchant = DataMerchantUB.tambahMerchant (new MerchantUB  ("Bakso Pak Sahid", "Bakso", 8000));
            DataMerchantUB.merchant = DataMerchantUB.tambahMerchant (new MerchantUB ("Nasgor Mblebes", "Nasi Goreng Jawa", 10000));
            DataMerchantUB.merchant = DataMerchantUB.tambahMerchant (new MerchantUB ("Ayam Geprek Kak Ros", "Ayam Kota Ekstra Nasi", 10000));

            System.out.println ("< Jasmine Cecilia Putri Effendy 215150701111041 >");
            System.out.println();

            DataMerchantUB.getInfo();

            System.out.println();
            System.out.println ("==== Masukkan Data Merchant UB FOOD ====");
            System.out.print ("Nama Merchant   : ");
            String name = in.nextLine();
            System.out.print ("Nama Produk     : ");
            String product = in.nextLine();
            System.out.print ("Harga Produk    : ");
            double price = in.nextInt();
            in.nextLine();
            System.out.println();

            DataMerchantUB.merchant = DataMerchantUB.tambahMerchant (new MerchantUB (name, product, price));

            DataMerchantUB.getInfo();

            DataMerchantUB.updateMerchant (DataMerchantUB.cariMerchant ("Ayam Geprek Kak Ros"), "Ayam Geprek Kak Ros", "Ayam Geprek Sao Madu", 20000);

            System.out.println();
            System.out.println ("< Jasmine Cecilia Putri Effendy 215150701111041 >");

        }
    }
