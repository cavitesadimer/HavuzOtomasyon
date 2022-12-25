public class Ogrenci implements IKisi{
    @Override
    public double hesapla() {
        double indirimliTutar=tutar*(0.5);
        return indirimliTutar ;
    }
}
