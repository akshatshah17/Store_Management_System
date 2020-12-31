package DateTime;
import java.io.*;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.*;
public class DateTime {
    private static boolean Line;
    public void DateTime(String username) throws IOException {
        Scanner scan = new Scanner(new File("src\\Dateandtime.txt"));
        File file = new File("src\\Dateandtime.txt");
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
        count/=3;
        String user[]=new String[count];
        String date[]=new String[count];
        String time[]=new String[count];
        while(i!=count)
        {
            user[i]=scan.nextLine();
            if(user[i].equals(username)) {
                s="Last time of visiting : "+"\n"+" DATE : "+scan.nextLine()+" \n TIME : "+scan.nextLine();
                try{
                    Thread.sleep(2000);
                }catch(InterruptedException e)
                {
                    System.out.println(e);
                }
                System.out.println(s);
                DateTimeFormatter dtf = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm:ss");
                LocalDateTime now = LocalDateTime.now();
                String str= dtf.format(now);
                String[] datetime = str.split(" ", 2);
                date[i]=datetime[0];
                time[i]=datetime[1];
                flag=1;
            }
            else
            {
                date[i]=scan.nextLine();
                time[i]=scan.nextLine();
            }
            i++;
        }
        if(flag==0)
        {
            FileWriter fw = new FileWriter("src\\Dateandtime.txt", true);
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
            fw.close();
        }
        if(flag==1) {
            FileWriter fw = new FileWriter("src\\Dateandtime.txt");
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
            }
            fw.close();
        }
    }
}