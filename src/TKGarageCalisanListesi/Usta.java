package TKGarageCalisanListesi;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;

public class Usta {

    static Scanner scan = new Scanner(System.in);

    static Map<String, String> ustalarMap = new HashMap<>();

    public static void ustaListe() throws InterruptedException {


        ustalarMap.put("301", "Mahmut,   Kaya,     45, Motor Ustasi");
        ustalarMap.put("302", "Hasan,    Can,      40, Kaporta Ustasi");
        ustalarMap.put("303", "Alper,    Kul,      38, Mekanik Ustasi");
        ustalarMap.put("304", "Ali,      Buyuk,    50, Bas Usta");
        ustalarMap.put("305", "Mustafa,  Cengiz,   42, Motor Ustasi");
        ustalarMap.put("306", "Faruk,    Kahyalar, 47, Elektrik Ustasi");


        Set<Map.Entry<String, String>> ustaListesiSeti = ustalarMap.entrySet();


        System.out.println("********************** TK GARAGE **********************\n" +
                "***************** Usta Listesi *****************\n" +
                "Is yeri Kodu     Isim     Soyisim        Yas      Bolumu ");

        for (Map.Entry<String, String> each : ustaListesiSeti) {

            String eachKey = each.getKey();
            String eachValue = each.getValue();
            String[] eachValueArr = eachValue.split(", ");

            System.out.printf("%3s                  %-9s  %-8s      %2s        %s \n" ,
                    eachKey, eachValueArr[0],eachValueArr[1],
                    eachValueArr[2],eachValueArr[3]);

        }
        Thread.sleep(4000);

    }

    public static void ustaEkle() throws InterruptedException {

        System.out.println("Is yeri Kodu");
        String isyeriKodu=scan.nextLine();
        System.out.println("isim");
        String isim=scan.nextLine();
        System.out.println("soyisim");
        String soyisim=scan.nextLine();
        System.out.println("Yas");
        String yas=scan.nextLine();
        System.out.println("Depertmani");
        String departman=scan.nextLine();

        String eklenecekValue= isim + ", " + soyisim+ ", " + yas+ ", " + departman;
        ustalarMap.put(isyeriKodu, eklenecekValue);



    }
    public static void ustaMenu ()throws InterruptedException{
        String tercih = "";
        do {
            Set<Map.Entry<String, String>> ustalarSeti = ustalarMap.entrySet();
            System.out.println("********************** TK GARAGE **********************\n" +
                    "***************** Usta Listesi *****************\n" +
                    "\n" +
                    " \t   1- Ustalar Listesi \n" +
                    " \t   2- Usta Ekle \n");
            tercih = scan.nextLine();

            switch (tercih) {

                case "1": // Usta Listesi Gör
                    Usta.ustaListe();
                    break;
                case "2": // Usta Ekle
                    ustaEkle();
                    break;
                default :
                    System.out.println("Lutfen gecerli tercih yapiniz");

            }

        }while (!tercih.equalsIgnoreCase("q"));

    }

}



