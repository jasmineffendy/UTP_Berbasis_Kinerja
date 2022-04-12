
//Jasmine Cecilia Putri Effendy 215150701111041

import java.util.Scanner;

    public class ErigoStore {

                public static void main(String[] args) {

                    Scanner inp = new Scanner(System.in);

                    System.out.println("Baju yang tersedia : ");
                    System.out.println("Baju A dengan harga 100000");
                    System.out.println("Baju B dengan harga 125000");
                    System.out.println("Baju C dengan harga 175000");

                    System.out.print("Baju yang anda beli bertipe : ");
                    String type = inp.nextLine();

                    System.out.print("Jumlah baju yang akan anda beli : ");
                    int quan = inp.nextInt();

                    Baju erigostore = new Baju(type, quan);
                    erigostore.print();
                }
            }