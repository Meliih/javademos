//built-in
import matematik.DortIslem;
import matematik.Logaritma;

//import matematik.*;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	    Scanner scanner = new Scanner(System.in);

        System.out.println("Adınızı giriniz");

        String sayi = scanner.nextLine();

        DortIslem dortIslem = new DortIslem();
        dortIslem.topla(2,3);
        Logaritma logaritma = new Logaritma();
    }
}
