package overriding;

import inheritanceDemo.BaseKrediManager;
import inheritanceDemo.OgretmenKrediManager;

public class Main {
    public static void main(String[] args) {
        BaseKrediManager2[] krediManagers = new BaseKrediManager2[]
                {new OgretmenKrediManager2(), new TarimKrediManager2(), new OgrenciKrediManager()};

        for (BaseKrediManager2 krediManager : krediManagers) {
            System.out.println(krediManager.hesapla(1000));
        }

    }

}
