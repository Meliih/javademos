public class Main {

    public static void main(String[] args) {
	    AccountManager manager = new AccountManager();
        System.out.println("Hesap = "+manager.getBalance());
        manager.deposite(100);
        System.out.println("Hesap = "+manager.getBalance());
        try {
            manager.withdraw(90);

        }catch (BalanceInsufficentException e){
            System.out.println(e.getMessage());
            //e.printStackTrace();
        }
        System.out.println("Hesap = "+manager.getBalance());

        try {
            manager.withdraw(20);

        }catch (BalanceInsufficentException e){
            System.out.println(e.getMessage());

        }
        System.out.println("Hesap = "+manager.getBalance());


    }
}
