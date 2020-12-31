package Store;

public class Details extends Store {
    public void details(int sto1[],int price[])
    {
        try{
            Thread.sleep(1000);
        }catch(InterruptedException e)
        {
            System.out.println(e);
        }
        System.out.println("<<<<<<<<<<<<<<<<<<<FASHION HUB>>>>>>>>>>>>>>>>>>");
        System.out.println("------------------------------------------");
        System.out.println("-----------------JEANS--------------------");
        System.out.println("  SIZE 32   STOCK "+sto1[0]+"  PRICE  "+price[0]);
        System.out.println("  SIZE 34   STOCK "+sto1[1]+"  PRICE  "+price[1]);
        System.out.println("  SIZE 36   STOCK "+sto1[2]+"  PRICE  "+price[2]);
        System.out.println("------------------------------------------");
        System.out.println("----------------T-SHIRT-------------------");
        System.out.println("  SIZE M    STOCK "+sto1[3]+"  PRICE  "+price[3]);
        System.out.println("  SIZE L    STOCK "+sto1[4]+"  PRICE  "+price[4]);
        System.out.println("  SIZE XL   STOCK "+sto1[5]+"  PRICE  "+price[5]);
        System.out.println("--------------------------------------------");
        System.out.println("------------------SHIRT---------------------");
        System.out.println("  SIZE M    STOCK "+sto1[6]+"  PRICE  "+price[6]);
        System.out.println("  SIZE L    STOCK "+sto1[7]+"  PRICE  "+price[7]);
        System.out.println("  SIZE XL   STOCK "+sto1[8]+"  PRICE  "+price[8]);
        System.out.println("--------------------------------------------");
    }
}
