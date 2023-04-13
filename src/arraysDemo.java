public class arraysDemo {
    public static void main(String[] args) {
        String ogrenci1 = "Engin";
        String ogrenci2 = "Simay";
        String ogrenci3 = "Kaan";
        String ogrenci4="Binnur";

        String[] ogrenciler=new String[4];//öğrenci sayısını artıracaksak burayı da artırıcağız.
        ogrenciler[0]="Engin";
        ogrenciler[1]="Simay";
        ogrenciler[2]="Binnur";
        ogrenciler[3]="Hüseyin";

        for (int i = 0; i < ogrenciler.length; i++) {
            System.out.println(ogrenciler[i]);

        }
        System.out.println("------------------------");

        for (String ogrenci:ogrenciler){
            System.out.println(ogrenci);
        }


    }
}
