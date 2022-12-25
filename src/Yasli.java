public class Yasli implements IKisi{
    @Override
    public double hesapla() {
        double indirimliTutar=tutar*(0.7);
        return indirimliTutar ;
    }
}
