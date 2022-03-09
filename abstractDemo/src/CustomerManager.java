public class CustomerManager {

    // hangi veri tabanı sistemini verirsek onun veri tabanı çalışacak
    BaseDatabase databaseManager;

    public  void getCustomers(){

        databaseManager.getData();
//      böyle yapılmaması gerkiyor eğer böyle yapılırsa oracle bagımlı hale geliniyor

//      OracleDatabaseManager oracleDatabaseManager = new OracleDatabaseManager();
//      oracleDatabaseManager.getData();


    }
}
