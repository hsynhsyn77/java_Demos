package packagesDemo;
//built-in

import packagesDemo.matematik.*;// o classs daki herşeyi kullan

import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Adınız :");

        String isim = scanner.nextLine();

        System.out.println("Merhaba "+ isim);

        DortIslem dortIslem=new DortIslem();
        dortIslem.topla(7,7);
        Logaritma logaritma=new Logaritma();
        logaritma.loritmaHesapla();

    }
}
