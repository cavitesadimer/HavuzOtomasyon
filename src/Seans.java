import java.util.Scanner;

public class Seans {
    int pztSabah=3,pztOgle=0,pztAksam=5;
    int saliSabah=0,saliOgle=2,saliAksam=4;
    int carsSabah=1,carsOgle=1,carsAksam=3;
    int persSabah=5,persOgle=2,persAksam=0;
    int cumaSabah=1,cumaOgle=0,cumaAksam=4;

    public void pzt(){
        System.out.println("Pzt : Sabah: "+(5-pztSabah) +" Ogle: "+(5-pztOgle)+" Aksam: "+(5-pztAksam)+"     Kisilik kontenjan vardir");
    }
    public void sali(){
        System.out.println("Sali: Sabah: "+(5-saliSabah) +" Ogle: "+(5-saliOgle)+" Aksam: "+(5-saliAksam)+"     Kisilik kontenjan vardir");
    }
    public void cars(){
        System.out.println("Cars: Sabah: "+(5-carsSabah) +" Ogle: "+(5-carsOgle)+" Aksam: "+(5-carsAksam)+"     Kisilik kontenjan vardir");
    }
    public void pers(){
        System.out.println("Pers: Sabah: "+(5-persSabah) +" Ogle: "+(5-persOgle)+" Aksam: "+(5-persAksam)+"     Kisilik kontenjan vardir");
    }
    public void cuma(){
        System.out.println("Cuma: Sabah: "+(5-cumaSabah) +" Ogle: "+(5-cumaOgle)+" Aksam: "+(5-cumaAksam)+"     Kisilik kontenjan vardir");
    }
    public void yazdir(){
        pzt();
        sali();
        cars();
        pers();
        cuma();

    }
    public void sec(){
        int flag=0;
        System.out.println("Gun seciniz:");
        System.out.println("1-Pazartesi  2-Sali  3-Carsamba  4-Persembe  5-Cuma");
        Scanner scanner = new Scanner(System.in);
        boolean valid = false;
        int gun =0;
        while (!valid) {
            try {
                gun = scanner.nextInt();
                valid = true;
            }
            catch (Exception e) {
                System.out.print("Gecerli SAYI giriniz(1-5): ");
                scanner.next ();
            }
        }
        while ((gun < 1) || (gun > 5)) {
            System.out.println("Hatali Secim Yaptiniz! Lutfen Tekrar Gun Seciniz.");
            System.out.println("1-Pazartesi  2-Sali  3-Carsamba  4-Persembe  5-Cuma");
            gun = scanner.nextInt();
        }

        while(flag==0){
            if (gun==1){
                System.out.print("Hangi seansi secmek istiyorsunuz(Sabah-Ogle-Aksam): ");
                String seans = scanner.next();
                if (seans.equalsIgnoreCase("sabah")){
                    if (pztSabah==5){
                        System.out.println("Bu seans maalesef dolu");
                        System.out.println("Lutfen tekrardan seciniz");
                    }
                    else{
                        System.out.println("Seansa kaydiniz yapildi ");
                        pztSabah++;
                        flag++;
                    }
                }
                if (seans.equalsIgnoreCase("ogle")){
                    if (pztOgle==5){
                        System.out.println("Bu seans maalesef dolu");
                        System.out.println("Lutfen tekrardan seciniz");
                    }
                    else{
                        System.out.println("Seansa kaydiniz yapildi ");
                        pztOgle++;
                        flag++;
                    }
                }
                if (seans.equalsIgnoreCase("aksam")){
                    if (pztAksam==5){
                        System.out.println("Bu seans maalesef dolu");
                        System.out.println("Lutfen tekrardan seciniz");
                    }
                    else{
                        System.out.println("Seansa kaydiniz yapildi ");
                        pztAksam++;
                        flag++;
                    }
                }
            }
            else if (gun==2){
                System.out.print("Hangi seansi secmek istiyorsunuz(Sabah-Ogle-Aksam): ");
                String seans = scanner.next();
                if (seans.equalsIgnoreCase("sabah")){
                    if (saliSabah==5){
                        System.out.println("Bu seans maalesef dolu");
                        System.out.println("Lutfen tekrardan seciniz");
                    }
                    else{
                        System.out.println("Seansa kaydiniz yapildi ");
                        saliSabah++;
                        flag++;
                    }
                }
                if (seans.equalsIgnoreCase("ogle")){
                    if (saliOgle==5){
                        System.out.println("Bu seans maalesef dolu");
                        System.out.println("Lutfen tekrardan seciniz");
                    }
                    else{
                        System.out.println("Seansa kaydiniz yapildi ");
                        saliOgle++;
                        flag++;
                    }
                }
                if (seans.equalsIgnoreCase("aksam")){
                    if (saliAksam==5){
                        System.out.println("Bu seans maalesef dolu");
                        System.out.println("Lutfen tekrardan seciniz");
                    }
                    else{
                        System.out.println("Seansa kaydiniz yapildi ");
                        saliAksam++;
                        flag++;
                    }
                }
            }
            else if (gun==3){
                System.out.print("Hangi seansi secmek istiyorsunuz(Sabah-Ogle-Aksam): ");
                String seans = scanner.next();
                if (seans.equalsIgnoreCase("sabah")){
                    if (carsSabah==5){
                        System.out.println("Bu seans maalesef dolu");
                        System.out.println("Lutfen tekrardan seciniz");
                    }
                    else{
                        System.out.println("Seansa kaydiniz yapildi ");
                        carsSabah++;
                        flag++;
                    }
                }
                if (seans.equalsIgnoreCase("ogle")){
                    if (carsOgle==5){
                        System.out.println("Bu seans maalesef dolu");
                        System.out.println("Lutfen tekrardan seciniz");
                    }
                    else{
                        System.out.println("Seansa kaydiniz yapildi ");
                        carsOgle++;
                        flag++;
                    }
                }
                if (seans.equalsIgnoreCase("aksam")){
                    if (carsAksam==5){
                        System.out.println("Bu seans maalesef dolu");
                        System.out.println("Lutfen tekrardan seciniz");
                    }
                    else{
                        System.out.println("Seansa kaydiniz yapildi ");
                        carsAksam++;
                        flag++;
                    }
                }
            }
            else if (gun==4){
                System.out.print("Hangi seansi secmek istiyorsunuz(Sabah-Ogle-Aksam): ");
                String seans = scanner.next();
                if (seans.equalsIgnoreCase("sabah")){
                    if (persSabah==5){
                        System.out.println("Bu seans maalesef dolu");
                        System.out.println("Lutfen tekrardan seciniz");
                    }
                    else{
                        System.out.println("Seansa kaydiniz yapildi ");
                        persSabah++;
                        flag++;
                    }
                }
                if (seans.equalsIgnoreCase("ogle")){
                    if (persOgle==5){
                        System.out.println("Bu seans maalesef dolu");
                        System.out.println("Lutfen tekrardan seciniz");
                    }
                    else{
                        System.out.println("Seansa kaydiniz yapildi ");
                        persOgle++;
                        flag++;
                    }
                }
                if (seans.equalsIgnoreCase("aksam")){
                    if (persAksam==5){
                        System.out.println("Bu seans maalesef dolu");
                        System.out.println("Lutfen tekrardan seciniz");
                    }
                    else{
                        System.out.println("Seansa kaydiniz yapildi ");
                        persAksam++;
                        flag++;
                    }
                }
            }
            else if (gun==5){
                System.out.print("Hangi seansi secmek istiyorsunuz(Sabah-Ogle-Aksam): ");
                String seans = scanner.next();
                if (seans.equalsIgnoreCase("sabah")){
                    if (cumaSabah==5){
                        System.out.println("Bu seans maalesef dolu");
                        System.out.println("Lutfen tekrardan seciniz");
                    }
                    else{
                        System.out.println("Seansa kaydiniz yapildi ");
                        cumaSabah++;
                        flag++;
                    }
                }
                if (seans.equalsIgnoreCase("ogle")){
                    if (cumaOgle==5){
                        System.out.println("Bu seans maalesef dolu");
                        System.out.println("Lutfen tekrardan seciniz");
                    }
                    else{
                        System.out.println("Seansa kaydiniz yapildi ");
                        cumaOgle++;
                        flag++;
                    }
                }
                if (seans.equalsIgnoreCase("aksam")){
                    if (cumaAksam==5){
                        System.out.println("Bu seans maalesef dolu");
                        System.out.println("Lutfen tekrardan seciniz");
                    }
                    else{
                        System.out.println("Seansa kaydiniz yapildi ");
                        cumaAksam++;
                        flag++;
                    }
                }
            }
        }
    }
}
