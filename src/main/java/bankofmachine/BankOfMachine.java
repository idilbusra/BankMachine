package bankofmachine;

import java.util.Scanner;

public class BankOfMachine{
    /* Q01
    Bakiye (baslangic bakiyesi 1000 tl)
    ogrenme,
    para yatirma
    cekme,
    cikis
    islemlerinin yapildigi bir Bank Of Machine (ATM) method create ediniz.
    */
    double bakiye =1000;
    double para;
    Scanner input = new Scanner(System.in);
    int secenek;
    String password = "123a";
    String kullaniciSifresi;

    public void sifreGir(){

        System.out.println("Lutfen sifrenizi girin");
        kullaniciSifresi = input.nextLine();

        if(kullaniciSifresi.equals(password)){
            System.out.println("Giris basarili");
        }else {
            System.out.println("Yanlis giris, tekrar deneyin");
            sifreGir();
        }


    }


    public void bakiyeOgren(){
        System.out.println("Bakiyeniz : " + bakiye);
        start();

    }

    public double paraYatir(){
        System.out.println("Yatirmak istediginiz miktari giriniz");
        para = input.nextDouble();
        bakiye = bakiye + para;
        start();
        return bakiye;
    }

    public double paraCek(){
        System.out.println("Ckemek istediginiz miktari giriniz");

        para = input.nextDouble();
        if(bakiye>=para){
            bakiye = bakiye - para;
            start();
        } else{
            System.out.println("Yetersiz Bakiye");
            paraCek();

        }

        return bakiye;

    }

    public void cik(){
        System.out.println("Bizi tercih ettiginiz icin tesekkurler");

    }

    public void start(){
        System.out.println( "Para yatirmak icin     1\n" +
                "Para cekmek icin       2\n" +
                "Bakiye ogrenmek icin   3\n" +
                "Cikis icin             4\n" +
                "tuslayiniz");

        secenek = input.nextInt();

        switch (secenek){
            case 1:
                paraYatir();
                break;
            case 2:
                paraCek();
                break;
            case 3:
                bakiyeOgren();
                break;
            case 4:
                cik();
                break;
            default:
                System.out.println("Hatali giris, lutfen uygun secenegi giriniz");
        }



    }


}