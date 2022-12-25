public class Ogretmen implements IKisi{
    @Override
    public double hesapla() {
        double indirimliTutar = tutar * (0.6);
        return indirimliTutar ;
    }
}


