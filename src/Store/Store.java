package Store;
import java.util.*;
public class Store {
    Scanner scan=new Scanner(System.in);
    protected int[] jeans =new int[3];
    protected int[] tshirt =new int[3];
    protected int[] shirt =new int[3];
    protected int[] pjeans =new int[3];
    protected int[] ptshirt =new int[3];
    protected int[] pshirt =new int[3];
    public void setstock(int[] stock)
    {
        for(int i=0;i<3;i++)
        {
            jeans[i]=stock[i];
        }
        for(int i=3;i<6;i++)
        {
            tshirt[i-3]=stock[i];
        }
        for(int i=6;i<9;i++)
        {
            shirt[i-6]=stock[i];
        }
    }
    public void setprice(int[] pri)
    {
        for(int i=0;i<3;i++)
        {
            pjeans[i]=pri[i];
        }
        for(int i=3;i<6;i++)
        {
            ptshirt[i-3]=pri[i];
        }
        for(int i=6;i<9;i++)
        {
            pshirt[i-6]=pri[i];
        }
    }
    public int [] Buy(int sto1[],int price[])
    {
        String cho1=new String("2");
        String cho="5";
        int cart[]=new int[9];
        do {
            System.out.println("\n1 for jeans\n2 for t-shirt\n3 for shirt\n0 for exit");
            try
            {
                Thread.sleep(1000);
            }catch(InterruptedException e)
            {
                System.out.println(e);
            }
            System.out.print("Enter your choice : ");
            cho=scan.next();
            if(cho.equals("1"))
            {
                String je="2";
                String jea="5";
                do {
                    System.out.println("\n1 SIZE=32 PRICE "+price[0]);
                    System.out.println("2 SIZE=34 PRICE "+price[1]);
                    System.out.println("3 SIZE=36 PRICE "+price[2]);
                    System.out.println("0 EXIT");
                    jea=scan.next();
                    if(jea.equals("1"))
                    {
                        if(sto1[0]==0)
                        {
                            System.out.println("Sorry stock is not available");
                        }
                        else
                        {
                            System.out.println("Stock for size 32 : "+sto1[0]);
                            System.out.print("Enter how many jeans you want to buy : ");
                            int num=scan.nextInt();
                            if(num<=sto1[0] && num>0)
                            {
                                cart[0]=num;
                                System.out.println(+num+" jeans of size 32 is added to your cart.");
                            }
                            else
                            {
                                System.out.println("Invalid Input.");
                            }
                        }
                    }
                    else if(jea.equals("2"))
                    {
                        if(sto1[1]==0)
                        {
                            System.out.println("Sorry stock is not available");
                        }
                        else
                        {
                            System.out.println("Stock for size 34 : "+sto1[1]);
                            System.out.print("Enter how many jeans you want to buy : ");
                            int num=scan.nextInt();
                            if(num<=sto1[1] && num>0)
                            {
                                cart[1]=num;
                                System.out.println(+num+" jeans of size 34 is added to your cart.");
                            }
                            else
                            {
                                System.out.println("Invalid Input.");
                            }
                        }
                    }
                    else if(jea.equals("3"))
                    {
                        if(sto1[2]==0)
                        {
                            System.out.println("Sorry stock is not available");
                        }
                        else
                        {
                            System.out.println("Stock for size 36 : "+sto1[2]);
                            System.out.print("Enter how many jeans you want to buy : ");
                            int num=scan.nextInt();
                            if(num<=sto1[2] && num>0)
                            {
                                cart[2]=num;
                                System.out.println(+num+" jeans of size 36 is added to your cart.");
                            }
                            else
                            {
                                System.out.println("Invalid Input.");
                            }
                        }
                    }
                    else if(jea.equals("0"))
                    {
                        je="0";
                    }
                    else
                    {
                        System.out.println("Enter valid choice.");
                    }
                }while(je.equals("2"));
            }
            else if(cho.equals("2"))
            {
                String ts="2";
                String tsh="5";
                do {
                    System.out.println("\n1 SIZE=M  PRICE "+price[3]);
                    System.out.println("2 SIZE=L  PRICE "+price[4]);
                    System.out.println("3 SIZE=XL PRICE "+price[5]);
                    System.out.println("0 EXIT");
                    tsh=scan.next();
                    if(tsh.equals("1"))
                    {
                        if(sto1[3]==0)
                        {
                            System.out.println("Sorry stock is not available");
                        }
                        else
                        {
                            System.out.println("Stock for size M : "+sto1[3]);
                            System.out.print("Enter how many t-shirts you want to buy : ");
                            int num=scan.nextInt();
                            if(num<=sto1[3] && num>0)
                            {
                                cart[3]=num;
                                System.out.println(+num+" t-shirt of size M is added to your cart.");
                            }
                            else
                            {
                                System.out.println("Invalid Input.");
                            }
                        }
                    }
                    else if(tsh.equals("2"))
                    {
                        if(sto1[4]==0)
                        {
                            System.out.println("Sorry stock is not available");
                        }
                        else
                        {
                            System.out.println("Stock for size L : "+sto1[4]);
                            System.out.print("Enter how many t-shirt you want to buy : ");
                            int num=scan.nextInt();
                            if(num<=sto1[4] && num>0)
                            {
                                cart[4]=num;
                                System.out.println(+num+" t-shirt of size  is added to your cart.");
                            }
                            else
                            {
                                System.out.println("Invalid Input.");
                            }
                        }
                    }
                    else if(tsh.equals("3"))
                    {
                        if(sto1[5]==0)
                        {
                            System.out.println("Sorry stock is not available");
                        }
                        else
                        {
                            System.out.println("Stock for size XL : "+sto1[5]);
                            System.out.print("Enter how many t-shirts you want to buy : ");
                            int num=scan.nextInt();
                            if(num<=sto1[5] && num>0)
                            {
                                cart[5]=num;
                                System.out.println(+num+" t-shirt of size  XL is added to your cart.");
                            }
                            else
                            {
                                System.out.println("Invalid Input.");
                            }
                        }
                    }
                    else if(tsh.equals("0"))
                    {
                        ts="0";
                    }
                    else
                    {
                        System.out.println("Enter valid choice.");
                    }
                }while(ts.equals("2"));
            }
            else if(cho.equals("3"))
            {
                String sh="2";
                String shi="5";
                do {
                    System.out.println("\n1 SIZE=M  PRICE "+price[6]);
                    System.out.println("2 SIZE=L  PRICE "+price[7]);
                    System.out.println("3 SIZE=XL PRICE "+price[8]);
                    System.out.println("0 EXIT");
                    shi=scan.next();
                    if(shi.equals("1"))
                    {
                        if(sto1[6]==0)
                        {
                            System.out.println("Sorry stock is not available");
                        }
                        else
                        {
                            System.out.println("Stock for size M : "+sto1[6]);
                            System.out.print("Enter how many shirts you want to buy : ");
                            int num=scan.nextInt();
                            if(num<=sto1[6] && num>0)
                            {
                                cart[6]=num;
                                System.out.println(+num+" shirt of size M is added to your cart.");
                            }
                            else
                            {
                                System.out.println("Invalid Input.");
                            }
                        }
                    }
                    else if(shi.equals("2"))
                    {
                        if(sto1[7]==0)
                        {
                            System.out.println("Sorry stock is not available");
                        }
                        else
                        {
                            System.out.println("Stock for size L : "+sto1[7]);
                            System.out.print("Enter how many shirt you want to buy : ");
                            int num=scan.nextInt();
                            if(num<=sto1[7] && num>0)
                            {
                                cart[7]=num;
                                System.out.println(+num+" shirt of size  is added to your cart.");
                            }
                            else
                            {
                                System.out.println("Invalid Input.");
                            }
                        }
                    }
                    else if(shi.equals("3"))
                    {
                        if(sto1[8]==0)
                        {
                            System.out.println("Sorry stock is not available");
                        }
                        else
                        {
                            System.out.println("Stock for size XL : "+sto1[8]);
                            System.out.print("Enter how many shirts you want to buy : ");
                            int num=scan.nextInt();
                            if(num<=sto1[8] && num>0)
                            {
                                cart[8]=num;
                                System.out.println(+num+" shirt of size  XL is added to your cart.");
                            }
                            else
                            {
                                System.out.println("Invalid Input.");
                            }
                        }
                    }
                    else if(shi.equals("0"))
                    {
                        sh="0";
                    }
                    else
                    {
                        System.out.println("Enter valid choice.");
                    }
                }while(sh.equals("2"));
            }
            else if(cho.equals("0"))
            {
                cho1="1";
            }
            else
            {
                System.out.println("Enter valid choice.");
            }
        }while(cho1.equals("2"));
        return cart;
    }
    public int [] Changecart(int sto1[],int price[],int sto2[])
    {
        String cho1=new String("2");
        String cho="5";
        int cart[]=new int[9];
        do {
            System.out.println("\n1 for jeans\n2 for t-shirt\n3 for shirt\n0 for exit");
            try
            {
                Thread.sleep(1000);
            }catch(InterruptedException e)
            {
                System.out.println(e);
            }
            System.out.print("Enter your choice : ");
            cho=scan.next();
            if(cho.equals("1"))
            {
                String je="2";
                String jea="5";
                do {
                    System.out.println("\n1 SIZE=32 PRICE "+price[0]);
                    System.out.println("2 SIZE=34 PRICE "+price[1]);
                    System.out.println("3 SIZE=36 PRICE "+price[2]);
                    System.out.println("0 EXIT");
                    jea=scan.next();
                    if(jea.equals("1"))
                    {
                        if(sto2[0]==0)
                        {
                            System.out.println("Sorry stock is not available");
                        }
                        else
                        {
                            System.out.println("Stock for size 32 in your cart : "+sto1[0]);
                            System.out.print("Enter how many jeans you want to buy : ");
                            int num=scan.nextInt();
                            if(num<=sto2[0] && num>0)
                            {
                                cart[0]=num;
                                System.out.println(+num+" jeans of size 32 is added to your cart.");
                            }
                            else
                            {
                                System.out.println("Invalid Input.");
                            }
                        }
                    }
                    else if(jea.equals("2"))
                    {
                        if(sto2[1]==0)
                        {
                            System.out.println("Sorry stock is not available");
                        }
                        else
                        {
                            System.out.println("Stock for size 34 in your cart : "+sto1[1]);
                            System.out.print("Enter how many jeans you want to buy : ");
                            int num=scan.nextInt();
                            if(num<=sto2[1] && num>0)
                            {
                                cart[1]=num;
                                System.out.println(+num+" jeans of size 34 is added to your cart.");
                            }
                            else
                            {
                                System.out.println("Invalid Input.");
                            }
                        }
                    }
                    else if(jea.equals("3"))
                    {
                        if(sto2[2]==0)
                        {
                            System.out.println("Sorry stock is not available");
                        }
                        else
                        {
                            System.out.println("Stock for size 36 in your cart : "+sto1[2]);
                            System.out.print("Enter how many jeans you want to buy : ");
                            int num=scan.nextInt();
                            if(num<=sto2[2] && num>0)
                            {
                                cart[2]=num;
                                System.out.println(+num+" jeans of size 36 is added to your cart.");
                            }
                            else
                            {
                                System.out.println("Invalid Input.");
                            }
                        }
                    }
                    else if(jea.equals("0"))
                    {
                        je="0";
                    }
                    else
                    {
                        System.out.println("Enter valid choice.");
                    }
                }while(je.equals("2"));
            }
            else if(cho.equals("2"))
            {
                String ts="2";
                String tsh="5";
                do {
                    System.out.println("\n1 SIZE=M  PRICE "+price[3]);
                    System.out.println("2 SIZE=L  PRICE "+price[4]);
                    System.out.println("3 SIZE=XL PRICE "+price[5]);
                    System.out.println("0 EXIT");
                    tsh=scan.next();
                    if(tsh.equals("1"))
                    {
                        if(sto2[3]==0)
                        {
                            System.out.println("Sorry stock is not available");
                        }
                        else
                        {
                            System.out.println("Stock for size M in your cart : "+sto1[3]);
                            System.out.print("Enter how many t-shirts you want to buy : ");
                            int num=scan.nextInt();
                            if(num<=sto2[3] && num>0)
                            {
                                cart[3]=num;
                                System.out.println(+num+" t-shirt of size M is added to your cart.");
                            }
                            else
                            {
                                System.out.println("Invalid Input.");
                            }
                        }
                    }
                    else if(tsh.equals("2"))
                    {
                        if(sto2[4]==0)
                        {
                            System.out.println("Sorry stock is not available");
                        }
                        else
                        {
                            System.out.println("Stock for size L in your cart : "+sto1[4]);
                            System.out.print("Enter how many t-shirt you want to buy : ");
                            int num=scan.nextInt();
                            if(num<=sto2[4] && num>0)
                            {
                                cart[4]=num;
                                System.out.println(+num+" t-shirt of size  is added to your cart.");
                            }
                            else
                            {
                                System.out.println("Invalid Input.");
                            }
                        }
                    }
                    else if(tsh.equals("3"))
                    {
                        if(sto2[5]==0)
                        {
                            System.out.println("Sorry stock is not available");
                        }
                        else
                        {
                            System.out.println("Stock for size XL in your cart : "+sto1[5]);
                            System.out.print("Enter how many t-shirts you want to buy : ");
                            int num=scan.nextInt();
                            if(num<=sto2[5] && num>0)
                            {
                                cart[5]=num;
                                System.out.println(+num+" t-shirt of size  XL is added to your cart.");
                            }
                            else
                            {
                                System.out.println("Invalid Input.");
                            }
                        }
                    }
                    else if(tsh.equals("0"))
                    {
                        ts="0";
                    }
                    else
                    {
                        System.out.println("Enter valid choice.");
                    }
                }while(ts.equals("2"));
            }
            else if(cho.equals("3"))
            {
                String sh="2";
                String shi="5";
                do {
                    System.out.println("\n1 SIZE=M  PRICE "+price[6]);
                    System.out.println("2 SIZE=L  PRICE "+price[7]);
                    System.out.println("3 SIZE=XL PRICE "+price[8]);
                    System.out.println("0 EXIT");
                    shi=scan.next();
                    if(shi.equals("1"))
                    {
                        if(sto2[6]==0)
                        {
                            System.out.println("Sorry stock is not available");
                        }
                        else
                        {
                            System.out.println("Stock for size M in your cart : "+sto1[6]);
                            System.out.print("Enter how many shirts you want to buy : ");
                            int num=scan.nextInt();
                            if(num<=sto2[6] && num>0)
                            {
                                cart[6]=num;
                                System.out.println(+num+" shirt of size M is added to your cart.");
                            }
                            else
                            {
                                System.out.println("Invalid Input.");
                            }
                        }
                    }
                    else if(shi.equals("2"))
                    {
                        if(sto2[7]==0)
                        {
                            System.out.println("Sorry stock is not available");
                        }
                        else
                        {
                            System.out.println("Stock for size L in your cart : "+sto1[7]);
                            System.out.print("Enter how many shirt you want to buy : ");
                            int num=scan.nextInt();
                            if(num<=sto2[7] && num>0)
                            {
                                cart[7]=num;
                                System.out.println(+num+" shirt of size  is added to your cart.");
                            }
                            else
                            {
                                System.out.println("Invalid Input.");
                            }
                        }
                    }
                    else if(shi.equals("3"))
                    {
                        if(sto2[8]==0)
                        {
                            System.out.println("Sorry stock is not available");
                        }
                        else
                        {
                            System.out.println("Stock for size XL in your cart : "+sto1[8]);
                            System.out.print("Enter how many shirts you want to buy : ");
                            int num=scan.nextInt();
                            if(num<=sto2[8] && num>0)
                            {
                                cart[8]=num;
                                System.out.println(+num+" shirt of size  XL is added to your cart.");
                            }
                            else
                            {
                                System.out.println("Invalid Input.");
                            }
                        }
                    }
                    else if(shi.equals("0"))
                    {
                        sh="0";
                    }
                    else
                    {
                        System.out.println("Enter valid choice.");
                    }
                }while(sh.equals("2"));
            }
            else if(cho.equals("0"))
            {
                cho1="1";
            }
            else
            {
                System.out.println("Enter valid choice.");
            }
        }while(cho1.equals("2"));
        return cart;
    }
    public int Bill(int cart [],int price[])
    {
        int bill=0;
        System.out.println("Your Bill is : ");
        for(int i=0;i<9;i++)
        {
            if(cart[i]!=0)
            {
                if(i==0)
                {
                    System.out.println("JEANS OF SIZE 32 :"+cart[i]+"*"+price[i]+"="+cart[i]*price[i]);
                    bill=bill+(cart[i]*price[i]);
                }
                else if(i==1)
                {
                    System.out.println("JEANS OF SIZE 34 :"+cart[i]+"*"+price[i]+"="+cart[i]*price[i]);
                    bill=bill+(cart[i]*price[i]);
                }
                else if(i==2)
                {
                    System.out.println("JEANS OF SIZE 36 :"+cart[i]+"*"+price[i]+"="+cart[i]*price[i]);
                    bill=bill+(cart[i]*price[i]);
                }
                else if(i==3)
                {
                    System.out.println("T-SHIRT OF SIZE M  :"+cart[i]+"*"+price[i]+"="+cart[i]*price[i]);
                    bill=bill+(cart[i]*price[i]);
                }
                else if(i==4)
                {
                    System.out.println("T-SHIRT OF SIZE L  :"+cart[i]+"*"+price[i]+"="+cart[i]*price[i]);
                    bill=bill+(cart[i]*price[i]);
                }
                else if(i==5)
                {
                    System.out.println("T-SHIRT OF SIZE XL :"+cart[i]+"*"+price[i]+"="+cart[i]*price[i]);
                    bill=bill+(cart[i]*price[i]);
                }
                else if(i==6)
                {
                    System.out.println("SHIRT OF SIZE M  :"+cart[i]+"*"+price[i]+"="+cart[i]*price[i]);
                    bill=bill+(cart[i]*price[i]);
                }
                else if(i==7)
                {
                    System.out.println("SHIRT OF SIZE L  :"+cart[i]+"*"+price[i]+"="+cart[i]*price[i]);
                    bill=bill+(cart[i]*price[i]);
                }
                else
                {
                    System.out.println("SHIRT OF SIZE XL :"+cart[i]+"*"+price[i]+"="+cart[i]*price[i]);
                    bill=bill+(cart[i]*price[i]);
                }
            }
        }
        return bill;
    }
}