package TKGarageCalisanListesi;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;

public class OfisElemani {

    static Scanner scan = new Scanner(System.in);

    static Map<String, String> ofisElemaniMap = new HashMap<>();

    public static void ofisElemaniListesi() throws InterruptedException {

        ofisElemaniMap.put("101", "Rafet,    Bulut,   55, Müdür");
        ofisElemaniMap.put("102", "Yuksel,   Yazici,  50, Muhasebe Sefi");
        ofisElemaniMap.put("103", "Hayati,   Soy,     35, Muhasebe Elemani");
        ofisElemaniMap.put("104", "Tugce,    Kara,    30, Muhasebe Elemani ");
        ofisElemaniMap.put("105", "Derya,    Dogan,   42, Insan Kaynaklari Sefi");
        ofisElemaniMap.put("106", "Simay,    Bilgi,   28, Insan Kaynaklari Elemani");
        ofisElemaniMap.put("107", "Verda,    Tercih,  27, Insan Kaynaklari Elemani");
        ofisElemaniMap.put("108", "Fatma,    Kurt,    45, Halk ve Iliskiler Sefi");
        ofisElemaniMap.put("109", "Ceren,    Gokmen,  34, Halk ve Iliskiler");

        Set<Map.Entry<String, String>> ofisElemaniSeti = ofisElemaniMap.entrySet();


        System.out.println("********************** TK GARAGE **********************\n" +
                "***************** Ofis Elemani Listesi *****************\n" +
                "Is yeri Kodu     Isim     Soyisim        Yas      Bolumu ");

        for (Map.Entry<String, String> each : ofisElemaniSeti) {

            String eachKey = each.getKey();
            String eachValue = each.getValue();
            String[] eachValueArr = eachValue.split(", ");

            System.out.println(eachKey + "            " + eachValueArr[0] + "    " + eachValueArr[1] + "     " +
                    eachValueArr[2] + "     " + eachValueArr[3]);


        }
        Thread.sleep(4000);

    }
    public static void ofisElemaniEkle () {

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
        ofisElemaniMap.put(isyeriKodu, eklenecekValue);

    }
    public static void ofisElemanMenu () throws InterruptedException {

        String tercih = "";
        do {
            Set<Map.Entry<String, String>> ustalarSeti = ofisElemaniMap.entrySet();
            System.out.println("********************** TK GARAGE **********************\n" +
                    "***************** Ofis Eleman Listesi *****************\n" +
                    "\n" +
                    " \t   1- Ofis Eleman Listesi \n" +
                    " \t   2- Ofis Eleman Ekle \n");
            tercih = scan.nextLine();

            switch (tercih) {

                case "1": // Usta Listesi Gör
                    OfisElemani.ofisElemaniListesi();
                    break;
                case "2": // Usta Ekle
                    OfisElemani.ofisElemaniEkle();
                    break;
                default :
                    System.out.println("Lutfen gecerli tercih yapiniz");

            }

        }while (!tercih.equalsIgnoreCase("q"));

    }

}



