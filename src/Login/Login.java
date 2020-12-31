package Login;
import java.io.*;
import java.util.Scanner;
public class Login {
    public String[] user;
    public  String[] pass;
    public String[] name;
    public String[] role;
    public String[] mobile;
    public String[] email;
    public String[] address;
    private static boolean Line;
    public int check() throws IOException {
        Scanner scan = new Scanner(new File("src\\Login.txt"));
        File file = new File("src\\Login.txt");
        FileInputStream fileStream = new FileInputStream(file);
        InputStreamReader input1 = new InputStreamReader(fileStream);
        BufferedReader reader = new BufferedReader(input1);
        int i=0,flag=-1,count=0;
        while(Line = reader.readLine()!=null)
        {
            count++;
        }
        count/=7;
        user=new String[count];
        pass=new String[count];
        name=new String[count];
        role=new String[count];
        mobile=new String[count];
        email=new String[count];
        address=new String[count];
        while(i!=count)
        {
            name[i] = scan.nextLine();
            user[i] = scan.nextLine();
            pass[i] = scan.nextLine();
            role[i] = scan.nextLine();
            mobile[i]=scan.nextLine();
            email[i]=scan.nextLine();
            address[i]=scan.nextLine();
            i++;
        }
        i=0;
        Scanner keyboard = new Scanner (System.in);
        System.out.print("Enter username : ");
        String inpUser = keyboard.nextLine();
        System.out.print("Enter password : ");
        String inpPass = keyboard.nextLine();
        while(i!=count){
            if (inpUser.equals(user[i])){
                flag=-2;
                if(inpPass.equals(pass[i]))
                {
                    flag=i;
                }
                break;
            }
            i++;
        }
        return flag;
    }
    public void UserDetails(int m)
    {
        try{
            Thread.sleep(2000);
        }catch(InterruptedException e)
        {
            System.out.println(e);
        }
        System.out.println("-->"+"User Name         : "+user[m]);
        System.out.println("-->"+"E-mail ID         : "+email[m]);
        System.out.println("-->"+"Mobile Number     : "+mobile[m]);
        System.out.println("-->"+"Permanent Address : "+address[m]);
    }
}