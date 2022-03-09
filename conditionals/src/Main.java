public class Main {

    public static void main(String[] args) {
	    int number = 15;
        if(number < 20){
            System.out.println("Sayı 20 den küçük");
        }
        else if(number == 20){
            System.out.println("Sayı 20 eşittir");
        }
        else {
            System.out.println("Sayı 20 den küçük degildir");
        }

        char grade = 'A';

        switch(grade) {
            case 'A':
                System.out.println("Mükemmel : Geçtiniz");
                break;
            case 'B':
                System.out.println("Çok Güzel : Geçtiniz");
                break;
            case 'C':
                System.out.println("İyi : Geçtiniz");
                break;
            case 'D':
                System.out.println("Fena Değil : Geçtiniz");
                break;
            case 'F':
                System.out.println("Malesef Kaldınız");
                break;
            default:
                System.out.println("Geçersiz not girdiniz");
        }


    }
}
