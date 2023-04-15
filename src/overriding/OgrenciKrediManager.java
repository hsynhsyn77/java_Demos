package overriding;

public class OgrenciKrediManager extends BaseKrediManager2 {
    public double hesapla(double tutar) {
        return tutar * 1.10;
    }

}
