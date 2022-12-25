import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        ArrayList<Kayit> yeniKayit = new ArrayList<>();
        Seans seans= new Seans();
        String yeniIslem;
        double odenecekMiktar;
        String onay;
        int flag=0;


        System.out.println("***Yuzme Bilmeyen Kalmasin Uygulamasina Hosgeldiniz ***");
        System.out.println("Lutfen yapmak istediginiz islemi seciniz");

        while (true) {
            System.out.println("******************************************************");
            System.out.println("1-Seans Goruntule");
            System.out.println("2-Yeni Kayit");
            System.out.println("3-Kayit Silme");
            System.out.println("4-Kayitli Ogrencileri Yazdir");
            System.out.println("5-Yeni Kayitlari Dosyaya Yazdir");
            System.out.println("6-Programi Sonlandir");
            System.out.println("****************************************************** \n");

            Scanner scanner = new Scanner(System.in);
            int tercih = 0;
            boolean valid = false;
            while (!valid) {
                try {
                    tercih = scanner.nextInt();
                    valid = true;
                }
                catch (Exception e) {
                    System.out.print("Gecerli SAYI giriniz(1-6): ");
                    scanner.next ();
                }
            }

            while ((tercih < 0) || (tercih > 6)) {
                System.out.println("Hatali Secim Yaptiniz! Lutfen Tekrar Seciniz.");
                System.out.println("******************************************************");
                System.out.println("1-Seans Goruntule");
                System.out.println("2-Yeni Kayit");
                System.out.println("3-Kayit Silme");
                System.out.println("4-Kayitli Ogrencileri Yazdir");
                System.out.println("5-Yeni Kayitlari Dosyaya Yazdir");
                System.out.println("6-Programi Sonlandir");
                tercih = scanner.nextInt();
            }
            switch (tercih) {
                case 1:
                    seans.yazdir();
                    break;

                case 2:

                    Kayit kayit = new Kayit();
                    System.out.print("Isim: ");
                    String isim = scanner.next();
                    kayit.setIsim(isim);

                    System.out.print("Soyisim: ");
                    String soyIsim = scanner.next();
                    kayit.setSoyIsim(soyIsim);

                    System.out.print("Kan grubu: ");
                    String kanGrubu = scanner.next();
                    kayit.setKanGrubu(kanGrubu);


                    System.out.print("Boy(cm): ");
                    int boy = 0;
                    boolean valid2 = false;
                    while (!valid2) {
                        try {
                            boy = scanner.nextInt();
                            valid2 = true;
                        }
                        catch (Exception e) {
                            System.out.print("Gecerli SAYI giriniz: ");
                            scanner.next ();
                        }
                    }
                    kayit.setBoy(boy);

                    System.out.print("Kilo(kg): ");
                    int kilo = 0;
                    boolean valid3 = false;
                    while (!valid3) {
                        try {
                            kilo = scanner.nextInt();
                            valid3 = true;
                        }
                        catch (Exception e) {
                            System.out.print("Gecerli SAYI giriniz: ");
                            scanner.next ();
                        }
                    }
                    kayit.setKilo(kilo);

                    System.out.print("E-Mail: ");
                    String eMail = scanner.next();
                    kayit.seteMail(eMail);



                    System.out.print("Unvan:(Cocuk-Yasli-Ogrenci-Ogretmen-Hicbiri) ");
                    String unvan = scanner.next();
                    kayit.setUnvan(unvan);
                    int flag3=0;
                    while(flag3==0) {
                        if(unvan.equalsIgnoreCase("Cocuk")) {
                            Cocuk cocuk = new Cocuk();
                            flag=0;
                            odenecekMiktar = cocuk.hesapla() - 2*(Math.random()*100);
                            System.out.print("Ekstra indirimler ile kayit olmak icin odemeniz gereken miktar: " + Math.floor(odenecekMiktar));
                            System.out.print(" TL Onayliyor musunuz? (e/h): ");
                            onay = scanner.next();
                            while(flag==0){
                                if (onay.equalsIgnoreCase("e")) {
                                    yeniKayit.add(kayit);
                                    seans.sec();
                                    System.out.println("Kisi kaydedildi...\nAna sayfaya yonlendiriliyorsunuz");
                                    flag++;

                                }
                                else if (onay.equalsIgnoreCase("h")) {
                                    System.out.println("Kayit Reddedildi.\nAna sayfaya yonlendiriliyorsunuz...");
                                    flag++;
                                }
                                else {
                                    System.out.print("Hatali giris yaptiniz e veya h giriniz:  ");
                                    String yeniOnay = scanner.next();
                                    onay = yeniOnay;
                                }
                            }
                            flag3++;
                        }

                        else if(unvan.equalsIgnoreCase("Yasli")) {
                            Yasli yasli = new Yasli();
                            flag=0;
                            odenecekMiktar = yasli.hesapla() - 2*(Math.random()*100);
                            System.out.print("Ekstra indirimler ile kayit olmak icin odemeniz gereken miktar: " + Math.floor(odenecekMiktar));
                            System.out.print(" TL Onayliyor musunuz? (e/h): ");
                            onay = scanner.next();
                            while(flag==0){
                                if (onay.equalsIgnoreCase("e")) {
                                    yeniKayit.add(kayit);
                                    seans.sec();
                                    System.out.println("Kisi kaydedildi...\nAna sayfaya yonlendiriliyorsunuz");
                                    flag++;

                                }
                                else if (onay.equalsIgnoreCase("h")) {
                                    System.out.println("Kayit Reddedildi.\nAna sayfaya yonlendiriliyorsunuz...");
                                    flag++;
                                }
                                else {
                                    System.out.print("Hatali giris yaptiniz e veya h giriniz:  ");
                                    String yeniOnay = scanner.next();
                                    onay = yeniOnay;
                                }
                            }
                            flag3++;
                        }

                        else if(unvan.equalsIgnoreCase("Ogrenci")){
                            Ogrenci ogrenci = new Ogrenci();
                            flag=0;
                            odenecekMiktar = ogrenci.hesapla() - 2*(Math.random()*100);
                            System.out.print("Ekstra indirimler ile kayit olmak icin odemeniz gereken miktar: " + Math.floor(odenecekMiktar));
                            System.out.print(" TL Onayliyor musunuz? (e/h): ");
                            onay = scanner.next();
                            while(flag==0){
                                if (onay.equalsIgnoreCase("e")) {
                                    yeniKayit.add(kayit);
                                    seans.sec();
                                    System.out.println("Kisi kaydedildi...\nAna sayfaya yonlendiriliyorsunuz");
                                    flag++;

                                }
                                else if (onay.equalsIgnoreCase("h")) {
                                    System.out.println("Kayit Reddedildi.\nAna sayfaya yonlendiriliyorsunuz...");
                                    flag++;
                                }
                                else {
                                    System.out.print("Hatali giris yaptiniz e veya h giriniz:  ");
                                    String yeniOnay = scanner.next();
                                    onay = yeniOnay;
                                }
                            }
                            flag3++;
                        }


                        else if(unvan.equalsIgnoreCase("Ogretmen")){
                            Ogretmen ogretmen = new Ogretmen();
                            flag=0;
                            odenecekMiktar = ogretmen.hesapla() - 2*(Math.random()*100);
                            System.out.print("Ekstra indirimler ile kayit olmak icin odemeniz gereken miktar: " + Math.floor(odenecekMiktar));
                            System.out.print(" TL Onayliyor musunuz? (e/h): ");
                            onay = scanner.next();
                            while(flag==0){
                                if (onay.equalsIgnoreCase("e")) {
                                    yeniKayit.add(kayit);
                                    seans.sec();
                                    System.out.println("Kisi kaydedildi...  Ana sayfaya yonlendiriliyorsunuz");
                                    flag++;

                                }
                                else if (onay.equalsIgnoreCase("h")) {
                                    System.out.println("Kayit Reddedildi.\nAna sayfaya yonlendiriliyorsunuz...");
                                    flag++;
                                }
                                else {
                                    System.out.print("Hatali giris yaptiniz e veya h giriniz:  ");
                                    String yeniOnay = scanner.next();
                                    onay = yeniOnay;
                                }
                            }
                            flag3++;
                        }

                        else if(unvan.equalsIgnoreCase("Hicbiri")){
                            IKisi iKisi = new IKisi() {
                                @Override
                                public double hesapla() {
                                    return 800;
                                }
                            };
                            flag=0;
                            odenecekMiktar = iKisi.hesapla() - 2*(Math.random()*100);
                            System.out.print("Ekstra indirimler ile kayit olmak icin odemeniz gereken miktar: " + Math.floor(odenecekMiktar));
                            System.out.print(" TL Onayliyor musunuz? (e/h): ");
                            onay = scanner.next();
                            while(flag==0){
                                if (onay.equalsIgnoreCase("e")) {
                                    yeniKayit.add(kayit);
                                    seans.sec();
                                    System.out.println("Kisi kaydedildi...\nAna sayfaya yonlendiriliyorsunuz");
                                    flag++;

                                }
                                else if (onay.equalsIgnoreCase("h")) {
                                    System.out.println("Kayit Reddedildi.\nAna sayfaya yonlendiriliyorsunuz...");
                                    flag++;
                                }
                                else {
                                    System.out.print("Hatali giris yaptiniz e veya h giriniz:  ");
                                    String yeniOnay = scanner.next();
                                    onay = yeniOnay;
                                }
                            }
                            flag3++;
                        }
                        else {
                            System.out.println("Hatali giris yaptiniz");
                            System.out.print("Lutfen(Cocuk-Yasli-Ogrenci-Ogretmen-Hicbiri) Seklinde Giriniz! ");
                            String yeniUnvan = scanner.next();
                            unvan=yeniUnvan;
                            kayit.setUnvan(unvan);
                        }

                    }
                    break;

                    case 3:
                    System.out.print("Silmek istediginiz kisinin E-Mail adresini giriniz: ");
                    String mailKontrol = scanner.next();

                    if(yeniKayit.size()==0) System.out.println("Henuz kayitli ogrenci yok");

                    for (int i = 0; i < yeniKayit.size(); i++) {
                        if (yeniKayit.get(i).geteMail().equalsIgnoreCase(mailKontrol)) {
                            yeniKayit.remove(yeniKayit.get(i));
                            System.out.println("Kisi silindi...");
                            System.out.println("***************");
                            break;
                        }
                        else {
                            System.out.println("Boyle bir kayit bulunamadi! ");
                            break;
                        }
                    }

                    System.out.print("Baksa islem yapmak istiyor musunuz? (e/h): ");
                    yeniIslem = scanner.next();
                    int flag1=0;
                    while(flag1==0){
                        if (yeniIslem.equalsIgnoreCase("e")) {
                            flag1++;
                        }
                        else if (yeniIslem.equalsIgnoreCase("h")) {
                            System.out.println("Iyi gunler dileriz");
                            System.out.println("Program kapatiliyor...");
                            System.exit(0);
                        }
                        else {
                            System.out.print("Yanlis giris yaptiniz lutfen e veya h giriniz: ");
                            String yeniIslem2 = scanner.next();
                            yeniIslem = yeniIslem2;
                        }
                    }
                    break;

                    case 4:
                        for (int i=0; i<yeniKayit.size();i++)
                        {
                            System.out.println("Isim: "+yeniKayit.get(i).getIsim()+"\nSoyisim: "+yeniKayit.get(i).getSoyIsim());
                            System.out.println("E-mail: "+yeniKayit.get(i).geteMail());
                            System.out.println("--------------------------");
                        }
                        if (yeniKayit.size()==0) System.out.println("Kayitli ogrenci yok!");
                        break;

                    case 5:
                        for (int i=0; i<yeniKayit.size();i++){
                            DosyaIslemleri.dosyaYaz(yeniKayit.get(i).getIsim());
                            DosyaIslemleri.dosyaYaz(yeniKayit.get(i).getSoyIsim());
                            DosyaIslemleri.dosyaYaz(yeniKayit.get(i).geteMail());
                            DosyaIslemleri.dosyaYaz("------------------------");
                        }
                        break;

                    case 6:
                        System.out.println("Program kapatiliyor. Iyi gunler dileriz");
                        System.exit(0);
                        break;
                }
            }
        }
    }
