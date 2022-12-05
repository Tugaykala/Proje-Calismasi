package TKGarageCalisanListesi;

import java.util.Scanner;

public class CalisanListesiDepo {

    static Scanner scan = new Scanner(System.in);

    public  static void anamenu() throws InterruptedException {

        String tercih="";
        do {
        System.out.println("********************** TK GARAGE **********************\n" +
                "***************** ANA MENU *****************\n"+
                "\n" +
                "\t   1- Ustalar Listesi \n" +
                "\t   2- Tekniker Listesi \n" +
                "\t   3- Ofis Elaman Listesi \n" +
                "\t   4- Teknik Eleman Listesi \n" +
                "\t   5- Yeni Eleman Ekleme \n" +
                "\t   Q- ÇIKIŞ\n");
        System.out.println("Lutfen Menuden tercihinizi yapiniz");
        tercih = scan.nextLine();

        switch (tercih){

            case "1" : // Usta Listesi
                Usta.ustaMenu();
                break;

            case "2" : // Tekniker Listesi
                Tekniker.teknikerMenu();
                break;

            case "3" : // Ofis eleman listesi
                OfisElemani.ofisElemanMenu();
                break;

            case "4" : // Teknik eleman listesi
                TeknikKadro.teknikKadroEkle();
                break;

            case "q" :
            case "Q" :
                break;
            default :
                System.out.println("Lutfen gecerli bir tercih yapiniz");

            }
        }while (!tercih.equalsIgnoreCase("q"));

        CalisanListesiDepo.projeyiDurdur();



    }

    public static void projeyiDurdur() {
        System.out.println("Projeden Cikiniz");
        System.exit(0);
    }
}
