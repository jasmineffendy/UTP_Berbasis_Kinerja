import java.io.*;
import java.util.*;

public class Selde {

    static boolean SeldeNum(int selde) {
        int num, rev, sisa;

        rev = 0;
        num = selde;

        while (selde != 0) {
            sisa = selde % 10;
            rev = rev * 10 + sisa;
            selde /= 10;
        }
        if (num == rev) {
            return true;
        } else {
            return false;
        }
    }

    public static void main(String[] args) {

        Scanner inp = new Scanner(System.in);
        int selde = inp.nextInt();

        if (SeldeNum(selde)) {
            System.out.println("" + selde + " adalah selde.");
        } else {
            System.out.println("" + selde + " bukan selde.");
        }
    }
}



