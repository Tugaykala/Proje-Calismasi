package TKGarageCalisanListesi;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;

public class Tekniker {
    static Scanner scan = new Scanner(System.in);

    static Map<String, String> teknikerMap = new HashMap<>();

    public static void teknikerListe() throws InterruptedException {

        teknikerMap.put("401", "Sabri, Erdim, 28, Motor Teknikeri");
        teknikerMap.put("402", "Kemal, Kabak, 23, Kaporta Teknikeri");
        teknikerMap.put("403", "Hüseyin, Falaz, 35, Mekanik Teknikeri");
        teknikerMap.put("404", "Cengiz, Kiremit, 32, Motor Teknikeri");
        teknikerMap.put("405", "Abdullah, Tasci, 30, Mekanik Teknikeri");
        teknikerMap.put("406", "Mehmet, Yilmaz, 29, Kaporta Teknikeri");
        teknikerMap.put("407", "Dogan, Tahta, 31, Kaporta Teknikeri");
        teknikerMap.put("408", "Umit, Kemik, 34, Elektrik Teknikeri");
        teknikerMap.put("409", "Baris, Bozkurt, 37, Elektrik Teknikeri");
        teknikerMap.put("410", "Bilal, Boz, 37, Mekanik Teknikeri");

        Set<Map.Entry<String, String>> teknikerSeti = teknikerMap.entrySet();


            System.out.println("********************** TK GARAGE **********************\n" +
                    "***************** Tekniker Listesi *****************\n" +
                    "Is yeri Kodu         Isim      Soyisim        Yas       Bolumu ");

            for (Map.Entry<String, String> each : teknikerSeti) {

                String eachKey = each.getKey();
                String eachValue = each.getValue();
                String[] eachValueArr = eachValue.split(", ");

                System.out.printf("%3s                  %-9s  %-8s      %2s        %s \n" ,
                        eachKey, eachValueArr[0],eachValueArr[1],
                        eachValueArr[2],eachValueArr[3]);

            }
            Thread.sleep(4000);

    }
    public static void teknikerEkle (){

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
        teknikerMap.put(isyeriKodu, eklenecekValue);

    }
    public static void teknikerMenu () throws InterruptedException {

        String tercih = "";
        do {
            Set<Map.Entry<String, String>> ustalarSeti = teknikerMap.entrySet();
            System.out.println("********************** TK GARAGE **********************\n" +
                    "***************** Tekniker Listesi *****************\n" +
                    "\n" +
                    " \t   1- Tekniker Listesi \n" +
                    " \t   2- Tekniker Ekle \n");
            tercih = scan.nextLine();

            switch (tercih) {

                case "1": // Usta Listesi Gör
                    Tekniker.teknikerListe();
                    break;
                case "2": // Usta Ekle
                    Tekniker.teknikerEkle();
                    break;
                default :
                    System.out.println("Lutfen gecerli tercih yapiniz");

            }

        }while (!tercih.equalsIgnoreCase("q"));

    }

}

