package JavaCalisma;

public class stringDemo {
    public static void main(String[] args) {
        String mesaj = "Bugün hava çok güzel.";
        System.out.println(mesaj);

//        System.out.println("Eleman sayısı:" + mesaj.length());
//        System.out.println("5.eleman:" + mesaj.charAt(4));//belirli bir sırada ki karakteri buluruz.
//        System.out.println(mesaj.concat(" Yaşasın!"));
//        System.out.println(mesaj.startsWith("A"));//büyük küçük harf duyarlı true false döndürür
//        System.out.println(mesaj.endsWith("."));
//        char[] karakterler=new char[5];
//        mesaj.getChars(0,5,karakterler,0);
//        System.out.println(karakterler);
//        System.out.println(mesaj.indexOf("av"));
//        System.out.println(mesaj.lastIndexOf("a"));

        String yeniMesaj = mesaj.replace(' ', '-');
        System.out.println(yeniMesaj);
        System.out.println(mesaj.substring(2, 5));//5 i dahil etmez.
        System.out.println("--------------------");
        for (String kelime:mesaj.split(" ")) {
            System.out.println(kelime);
        }
        System.out.println("--------------------");
        System.out.println(mesaj.toLowerCase());//bütün kelimeleri küçük yapar.
        System.out.println(mesaj.toUpperCase());// bütün kelimerli byük harf yapar.
        System.out.println("--------------------");
        System.out.println(mesaj.trim());




    }
}
