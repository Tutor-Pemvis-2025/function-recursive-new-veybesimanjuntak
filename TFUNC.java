// 12S25024 - Veybe Youlanda K M Simanjuntak
// 12S25014 - Laura Kasih Mutiara
// 12S25033 - Maria Simorangkir

import java.util.*;
import java.lang.Math;

public class TFUNC {
    private static Scanner input = new Scanner(System.in);

    public static void main(String[] args) {
        int angka, hasil;

        angka = Integer.parseInt(input.nextLine());
        hasil = hitungRekursif(angka);
        System.out.println(hasil);
    }
    
    public static int hitungRekursif(int angka) {
        int hasil;

        if (angka == 1) {
            hasil = 1;
        } else {
            hasil = angka + hitungRekursif(angka - 1);
        }
        
        return hasil;
    }
}
