public class mukemmelSayı {

    public static void main(String[] args){
        int number = 7;
        int total = 0;

        for (int i=1; i < number;i++){
            if(number % i == 0){
                total += i;
            }
        }
        if(number == total){
            System.out.println("Mükemmel Sayı");
        }
        else{
            System.out.println("Mükemmel Sayı Değildir ");
        }

    }
}
