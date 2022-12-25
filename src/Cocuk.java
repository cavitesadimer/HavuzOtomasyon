public class Cocuk implements IKisi{
    @Override
    public double hesapla() {
        double indirimliTutar=tutar*(0.4);
        return indirimliTutar ;
    }
}
