public class Main {

    public static void main(String[] args) {
	    // interfacelerde abstractlar gibi new lenemezler

        CustomerManager customerManager = new CustomerManager(new OracleCustomerDal());
        //customerManager.customerDal = new OracleCustomerDal();
        customerManager.add();

    }
}
