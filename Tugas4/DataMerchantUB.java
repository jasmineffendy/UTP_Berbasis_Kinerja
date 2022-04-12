
//Jasmine Cecilia Putri Effendy 215150701111041

public class DataMerchantUB {

    static MerchantUB[] merchant = new MerchantUB[0];

    static MerchantUB[] tambahMerchant(MerchantUB ub) {
        MerchantUB[] merchantt = new MerchantUB[DataMerchantUB.merchant.length + 1];

        for (int i = 0; i < DataMerchantUB.merchant.length; i++) {
            merchantt[i] = merchant[i];
        }
        merchantt[DataMerchantUB.merchant.length] = ub;
        return merchantt;
    }

    static MerchantUB cariMerchant(String namamerchant) {
        int a = 0;

        for (int i = 0 ; i < DataMerchantUB.merchant.length ; i++) {
            if (DataMerchantUB.merchant[i].getNamaMerchant() == namamerchant) {
                a = i;
                break;
            }
        }
        return merchant[a];
    }

    static void tampilMerchant (MerchantUB ub) {
        System.out.println ("==== Tampilan Data Merchant UBFOOD ====");
        System.out.println ("Nama Merchant   : " + ub.getNamaMerchant());
        System.out.println ("Nama Produk     : " + ub.getNamaProduk());
        System.out.println ("Harga           : " + (int) ub.getHargaMakanan());
    }

    static void updateMerchant (MerchantUB ub, String name, String product, double price) {
        ub.setNamaMerchant (name);
        ub.setNamaProduk (product);
        ub.setHargaMakanan (price);
    }

    static void getInfo() {
        for (MerchantUB x : DataMerchantUB.merchant) {

            System.out.println ("==== Tampilan Data Merchant UBFOOD ====");
            System.out.println ("Nama Merchant   : " + x.getNamaMerchant());
            System.out.println ("Nama Produk     : " + x.getNamaProduk());
            System.out.println ("Harga           : " + (int) x.getHargaMakanan());

        }
    }
}



