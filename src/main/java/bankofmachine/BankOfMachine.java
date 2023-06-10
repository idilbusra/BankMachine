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
    String pwd = "123a";
    String userPwd;

    public void sifreGir(){

        System.out.println("lutfen sifrenizi giriniz");
        userPwd = input.nextLine();
        if(userPwd.equals(pwd)){
            System.out.println("giris basarili");
        }else {
            System.out.println("yanlis giris tekrar deneyiniz");
            sifreGir();
        }


    }


    public void bakiyeOgren(){
        System.out.println("bakiyeniz : " + bakiye);
        start();

    }

    public double paraYatir(){
        System.out.println("yatirmak istediginiz miktari giriniz");
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
            System.out.println("bakiyeniz yetersiz..");
            paraCek();

        }

        return bakiye;

    }

    public void cik(){
        System.out.println("bizi tercih ettiginiz icin tesekkur ederiz..");

    }

    public void start(){
        System.out.println( "Para yatirmak icin     1\n" +
                "para cekmek icin       2\n" +
                "bakiye ogrenmek icin   3\n" +
                "cikis icin             4\n" +
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
                System.out.println("hatali giris. lutfen uygun senek giriniz..");
        }



    }


}