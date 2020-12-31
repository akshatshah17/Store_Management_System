package PreviousOrder;
import java.io.*;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.*;
public class PreviousOrder {
    private static boolean Line;
    public void Order(String username, int[] cartofuser,int billofuser,int wasd) throws IOException {
        Scanner scan = new Scanner(new File("src\\PreviousOrder.txt"));
        File file = new File("src\\PreviousOrder.txt");
        FileInputStream fileStream = new FileInputStream(file);
        InputStreamReader input1 = new InputStreamReader(fileStream);
        BufferedReader reader = new BufferedReader(input1);
        int count=0,flag=0;
        int i=0;
        String s=" ";
        while(Line = reader.readLine()!=null)
        {
            count++;
        }
        count/=13;
        String user[]=new String[count];
        String date[]=new String[count];
        String time[]=new String[count];
        int cart[][]=new int[count][9];
        int bill[]=new int[count];
        while(i!=count)
        {
            user[i]=scan.nextLine();
            if(user[i].equals(username)) {
                s="\n"+"Last time of Order : "+"\n"+" DATE : "+scan.nextLine()+" \n TIME : "+scan.nextLine();
                if(wasd==0)
                {
                    System.out.println(s);
                }
                int previouscart[]=new int[9];
                for(int k=0;k<9;k++)
                {
                    previouscart[k] = Integer.parseInt(scan.nextLine());
                }
                for(int j=0;j<9;j++)
                {
                    if(previouscart[j]!=0)
                    {
                        if(j==0)
                        {
                            System.out.println("JEANS OF SIZE 32 :"+previouscart[j]);
                        }
                        else if(j==1) {
                            System.out.println("JEANS OF SIZE 34 :"+previouscart[j]);
                        }
                        else if(j==2)
                        {
                            System.out.println("JEANS OF SIZE 36 :"+previouscart[j]);
                        }
                        else if(j==3)
                        {
                            System.out.println("T-SHIRT OF SIZE M  :"+previouscart[j]);
                        }
                        else if(j==4)
                        {
                            System.out.println("T-SHIRT OF SIZE L  :"+previouscart[j]);
                        }
                        else if(j==5)
                        {
                            System.out.println("T-SHIRT OF SIZE XL :"+previouscart[j]);
                        }
                        else if(j==6)
                        {
                            System.out.println("SHIRT OF SIZE M  :"+previouscart[j]);
                        }
                        else if(j==7)
                        {
                            System.out.println("SHIRT OF SIZE L  :"+previouscart[j]);
                        }
                        else
                        {
                            System.out.println("SHIRT OF SIZE XL :"+previouscart[j]);
                        }
                    }
                }
                String bi=scan.nextLine();
                if(wasd==0)
                {
                    System.out.println("Your previous bill is : "+bi);
                }
                DateTimeFormatter dtf = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm:ss");
                LocalDateTime now = LocalDateTime.now();
                String str= dtf.format(now);
                String[] datetime = str.split(" ", 2);
                date[i]=datetime[0];
                time[i]=datetime[1];
                for(int j=0;j<9;j++)
                {
                    cart[i][j]=cartofuser[j];
                }
                bill[i]=billofuser;
                flag=1;
            }
            else
            {
                date[i]=scan.nextLine();
                time[i]=scan.nextLine();
                for(int j=0;j<9;j++)
                {
                    cart[i][j] = Integer.parseInt(scan.nextLine());
                }
                bill[i] = Integer.parseInt(scan.nextLine());
            }
            i++;
        }
        if(flag==0)
        {
            FileWriter fw = new FileWriter("src\\PreviousOrder.txt", true);
            DateTimeFormatter dtf = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm:ss");
            LocalDateTime now = LocalDateTime.now();
            String str= dtf.format(now);
            String[] datetime = str.split(" ", 2);
            for (int j=0;j<username.length();j++)
                fw.append(username.charAt(j));
            fw.append("\n");
            for (int j=0;j<datetime[0].length();j++)
                fw.append(datetime[0].charAt(j));
            fw.append("\n");
            for (int j=0;j<datetime[1].length();j++)
                fw.append(datetime[1].charAt(j));
            fw.append("\n");
            for(int j=0;j<9;j++)
            {
                fw.append(String.valueOf(cartofuser[j]));
                fw.append("\n");
            }
            fw.append(String.valueOf(billofuser));
            fw.append("\n");
            fw.close();
        }
        if(flag==1) {
            FileWriter fw = new FileWriter("src\\PreviousOrder.txt");
            for (i = 0; i < count; i++) {
                for (int j = 0; j < user[i].length(); j++)
                    fw.write(user[i].charAt(j));
                fw.append("\n");
                for (int j = 0; j < date[i].length(); j++)
                    fw.write(date[i].charAt(j));
                fw.append("\n");
                for (int j = 0; j < time[i].length(); j++)
                    fw.write(time[i].charAt(j));
                fw.append("\n");
                for(int j=0;j<9;j++)
                {
                    fw.append(String.valueOf(cart[i][j]));
                    fw.append("\n");
                }
                fw.append(String.valueOf(bill[i]));
                fw.append("\n");
            }
            fw.close();
        }
    }
}