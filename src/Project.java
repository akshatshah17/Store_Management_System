import PreviousOrder.PreviousOrder;
import Signup.Signup;
import Login.*;
import Store.*;
import Admin.Admin;
import DateTime.*;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;
public class Project {
    public static void main(String[] args) throws IOException, InterruptedException {
        Scanner scan = new Scanner(System.in);
        Scanner scan1 = new Scanner(new File("src\\Stock.txt"));
        Scanner scan2 = new Scanner(new File("src\\Price.txt"));
        Login l = new Login();
        Signup s = new Signup();
        Store st = new Store();
        Admin adm = new Admin();
        DateTime dt=new DateTime();
        PreviousOrder pre=new PreviousOrder();
        int[] sto = new int[9];
        int[] price = new int[9];
        int cart[]=new int[9];
        int sto1[]=new int[9];
        int bill=0;
        int w = 0, q = -1;
        String ch="50000";String c;
        while (w != 9) {
            sto[w] = Integer.parseInt(scan1.nextLine());
            w++;
        }
        w=0;
        while (w != 9) {
            price[w] = Integer.parseInt(scan2.nextLine());
            w++;
        }
        st.setstock(sto);
        st.setprice(price);
        Details d=new Details();
        do {
            System.out.println("\n1 for LOGIN\n2 for SIGN UP");
            Thread.sleep(1000);
            System.out.print("Enter your choice : ");
            c = scan.next();
            int f = 1, e = 1;
            if (c.equals("1")) {
                while (f != 2) {
                    q = l.check();
                    if (q != -1 && q!=-2) {
                        System.out.println("You are logged in successfully.");
                        System.out.println("Welcome again " + l.name[q]+"\n");
                        dt.DateTime(l.user[q]);
                        f = 2;
                    }
                    else if(q==-2) {
                        System.out.println("Invalid Password or user name. Login Again.");
                        f = 1;
                    }
                    else
                    {
                        System.out.println("User name does not exist.please enter proper user name or sign up first.");
                        System.out.println("\n1 for LOGIN\n2 for SIGN UP");
                        System.out.print("Enter your choice : ");
                        int y=scan.nextInt();
                        if(y==1)
                        {
                            f=1;
                        }
                        else if(y==2)
                        {
                            String u=s.add();
                            System.out.println("Signed up Successfully.Please Login again.");
                        }
                        else
                        {
                            System.out.println("Invalid choice.");
                        }
                    }
                }
                ch=c;
            }
            else if (c.equals("2")) {
                String u=s.add();
                System.out.println("Signed up Successfully.Please Login again.");
                while (e != 2) {
                    q = l.check();
                    if (q != -1) {
                        System.out.println("You are logged in successfully.");
                        System.out.println("Welcome " + l.name[q]);
                        dt.DateTime(l.user[q]);
                        e = 2;
                    } else {
                        System.out.println("Invalid Password or user name . Login Again.");
                        e = 1;
                    }
                }
                ch=c;
            }
            else {
                ch="50000";
                System.out.println("Invalid choice.");
            }
        }while(ch.equals("50000"));
        System.out.println("\n\n"+":::::::::USER INFORMATION::::::::::");
        l.UserDetails(q);
        System.out.println("\n \n");
        int wasd=0;
        pre.Order(l.name[q],cart,bill,wasd);
        System.out.println("\n\n");
        if (l.role[q].equals("admin")) {
            String ro="5";
            String rol;
            d.details(sto,price);
            do
            {
                System.out.println("\n1 for Change in stock \n2 for Change in price \n0 for Exit");
                try
                {
                    Thread.sleep(1000);
                }catch(InterruptedException e)
                {
                    System.out.println(e);
                }
                System.out.print("Enter your choice : ");
                rol=scan.next();
                if(rol.equals("1"))
                {
                    sto=adm.changestock(sto);
                    st.setstock(sto);
                }
                else if(rol.equals("2"))
                {
                    price=adm.changeprice(price);
                    st.setprice(price);
                }
                else if(rol.equals("0"))
                {
                    ro="0";
                }
                else
                {
                    System.out.println("Invalid choice.");
                }
            }while(ro.equals("5"));
        }
        System.out.println("WELCOME TO FASHION HUB");
        d.details(sto,price);
        sto1=sto;
        cart=st.Buy(sto1,price);
        bill=st.Bill(cart,price);
        System.out.println("TOTAL :"+bill);
        int cou=1;
        String h="1",hi;
        do {
            System.out.println("Do you want to change in your cart ?"+"\n"+"1 YES "+"\n"+"2 NO");
            scan.skip("\\n");
            hi=scan.nextLine();
            if(hi.equals("1"))
            {
                cart=st.Changecart(cart,price,sto1);
                bill=st.Bill(cart,price);
                if(bill!=0)
                {
                    System.out.println("TOTAL :"+bill);
                }
                h="2";
            }
            else if(hi.equals("2"))
            {
                cou=0;
                System.out.println("Please visit Again.");
                h="2";
            }
            else
            {
                System.out.println("Invalid choice.");
                h="1";
            }
        }while(h.equals("1"));
        String bu=" ";
        if(bill!=0) {
            String bu1 = "0";
            do {
                    System.out.println("DO YOU WANT TO BUY ? \n 1 YES \n 2 NO");
                    try {
                        Thread.sleep(1000);
                    } catch (InterruptedException e) {
                        System.out.println(e);
                    }
                    System.out.print("Enter your choice : ");
                    bu = scan.next();
                    if (bu.equals("1")) {
                        for (int i = 0; i < 9; i++) {
                            sto[i] = sto1[i] - cart[i];
                        }
                        System.out.println("Your order will be deliver to following address.");
                        System.out.println(l.address[q]);
                        bu1 = "1";
                    }
                    else if (bu.equals("2")) {
                        bu1 = "1";
                    }
                    else {
                        System.out.println("Invalid choice");
                    }
            } while (bu1.equals("0"));
        }
        if (bill == 0 && cou==1)
        {
            System.out.println("Please visit Again.");
        }
        wasd=1;
        if(bu.equals("1"))
        {
            pre.Order(l.name[q],cart,bill,wasd);
        }
        st.setstock(sto);
        st.setprice(price);
        FileWriter fw = new FileWriter("src\\Stock.txt");
        for (int i = 0; i < 9; i++) {
            String a=Integer.toString(sto[i]);
            fw.write(a);
            fw.write("\n");
        }
        fw.close();
        FileWriter fw1 = new FileWriter("src\\Price.txt");
        for (int i = 0; i < 9; i++) {
            String a=Integer.toString(price[i]);
            fw1.write(a);
            fw1.write("\n");
        }
        fw1.close();
    }
}