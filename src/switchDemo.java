import com.sun.org.apache.bcel.internal.generic.BREAKPOINT;

public class switchDemo {
    public static void main(String[] args) {
        char grade ='C';

        switch (grade){
            case 'A':
                System.out.println("Mükemmel : Geçtiniz");
                break;
            case 'B':
                System.out.println("Çok güzel : Geçtiniz");
                break;
            case 'C':
                System.out.println("iyi : Geçtiniz");
                break;
            case 'D':
                System.out.println("Fena değil : Geçtiniz");
                break;
            case 'F':
                System.out.println("Maalesef KALDINIZ");
                break;
            default:
                System.out.println("Geçersiz not girdiniz");
        }
    }
}
