package org.example;

import java.util.Scanner;

public class UcakBileti {
    public static void main(String[] args) {
        double km,yas,normalUcret,yasIndirimi,indirimliUcret,ekstraIndirim,gidisDonusUcret;
        byte yolculukTipi;

        Scanner input = new Scanner(System.in);

        System.out.println("Mesafeyi KM olarak giriniz : ");
        km = input.nextDouble();

        System.out.println("Lütfen yaşınızı giriniz : ");
        yas = input.nextDouble();

        System.out.println("Lütfen Yolculuk Tipini Seçiniz : 1==> Tek Yön 2==> Gidiş Dönüş");
        yolculukTipi = input.nextByte();

        normalUcret = (km) * (0.10);
        gidisDonusUcret = (km*(0.10)) * 2;

        if((yas<0) || (km<0) || (yolculukTipi != 1) && (yolculukTipi != 2)){
            System.out.println("Hatali veri girdiniz");
        }else{
            switch (yolculukTipi){
                case 1:
                    if ((0 <= yas) && (yas < 12)) {
                        yasIndirimi = (normalUcret * 0.50);
                        indirimliUcret = normalUcret - (yasIndirimi);
                        System.out.println("Normal ücret : " + normalUcret);
                        System.out.println("İndirimli uçak bileti fiyatınız : " + indirimliUcret);
                    } else if ((12 <= yas) && (yas < 24)) {
                        yasIndirimi = (normalUcret * 0.10);
                        indirimliUcret = normalUcret - (yasIndirimi);
                        System.out.println("Normal ücret : " + normalUcret);
                        System.out.println("İndirimli uçak bileti fiyatınız : " + indirimliUcret);
                    } else if ((24 <= yas) && (yas <= 65)) {
                        yasIndirimi = (normalUcret * 0);
                        indirimliUcret = normalUcret - (yasIndirimi);
                        System.out.println("Normal ücret : " + normalUcret);
                        System.out.println("İndirimli uçak bileti fiyatınız : " + indirimliUcret);
                    } else {
                        yasIndirimi = (normalUcret * 0.30);
                        indirimliUcret = normalUcret - (yasIndirimi);
                        System.out.println("Normal ücret : " + normalUcret);
                        System.out.println("İndirimli uçak bileti fiyatınız : " + indirimliUcret);
                    }
                    break;
                case 2:
                    if ((0 <= yas) && (yas < 12)) {
                        yasIndirimi = (gidisDonusUcret * 0.30);
                        ekstraIndirim = (gidisDonusUcret * 0.20);
                        indirimliUcret = (gidisDonusUcret - (ekstraIndirim + yasIndirimi));
                        System.out.println("Normal ücret : " + gidisDonusUcret);
                        System.out.println("İndirimli uçak bileti fiyatınız : " + indirimliUcret);
                    } else if ((12 <= yas) && (yas < 24)) {
                        yasIndirimi = (gidisDonusUcret * 0.10);
                        ekstraIndirim = (gidisDonusUcret * 0.20);
                        indirimliUcret = (gidisDonusUcret - (ekstraIndirim + yasIndirimi));
                        System.out.println("Normal ücret : " + gidisDonusUcret);
                        System.out.println("İndirimli uçak bileti fiyatınız : " + indirimliUcret);
                    } else if ((24 <= yas) && (yas <= 65)) {
                        yasIndirimi = (gidisDonusUcret * 0);
                        ekstraIndirim = (gidisDonusUcret * 0.20);
                        indirimliUcret = (gidisDonusUcret - (yasIndirimi + ekstraIndirim));
                        System.out.println("Normal ücret : " + gidisDonusUcret);
                        System.out.println("İndirimli uçak bileti fiyatınız : " + indirimliUcret);
                    } else {
                        yasIndirimi = (gidisDonusUcret * 0.30);
                        ekstraIndirim = (gidisDonusUcret * 0.20);
                        indirimliUcret = (gidisDonusUcret - (yasIndirimi + ekstraIndirim));
                        System.out.println("Normal ücret : " + gidisDonusUcret);
                        System.out.println("İndirimli uçak bileti fiyatınız : " + indirimliUcret);
                    }
                    break;

                default:
                    System.out.println("Hatalı veri girdiniz: ");
                    break;
            }
        }
    }
}
