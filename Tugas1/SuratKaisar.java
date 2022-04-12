import java.io.*;
import java.util.*;

public class SuratKaisar {

        public static void main (String[] args){
            Scanner inp = new Scanner (System.in);
            String kata = inp.nextLine();
            int n = inp.nextInt();
            mycaesar (kata, n);
        }
        public static void mycaesar(String kata, int n){

            int i;
            String ct = "";
            char huruf;
            for (i = 0; i < kata.length(); i++){
                huruf = kata.charAt(i);
                if (huruf >= 'a' && huruf <= 'z'){
                    huruf = (char)(huruf + n);
                    if (huruf > 'z'){
                        huruf -= 26;
                    }
                    ct = ct + huruf;
                }
                else if (huruf >= 'A' && huruf <= 'Z'){
                    huruf = (char) (huruf + n);
                    if (huruf > 'Z'){
                        huruf -= 26;
                    }
                    ct = ct + huruf;
                }
                else {
                    ct = ct + huruf;
                }
            }
            System.out.println(ct);
        }
    }
