import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class DosyaIslemleri {
    //Okuldaki bilgisayarda .txt dosyasi olusturup onun adresini pathName at
    static String pathName = "C:\\Users\\Esad\\Desktop\\HavuzKayitli\\kayitliogrenciler.txt";

    public static void dosyaYaz(String yazi) {
        File file = new File(pathName);
        try {
            BufferedWriter writer = new BufferedWriter(new FileWriter(pathName,true));
            writer.write(yazi+"\n");
            writer.close();
        } catch (Exception e) {
            System.out.println("Dosya Yazilirken Hata Olustu!!!");
        }
    }
}
