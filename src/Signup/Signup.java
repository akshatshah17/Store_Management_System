package Signup;
import java.io.*;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
public class Signup {
    private String name;
    private String user;
    private String role;
    private String temp;
    private String mobile;
    private String email;
    private String address;
    private static boolean Line;
    public String add() throws IOException {
        Scanner input=new Scanner(System.in);
        Scanner scan = new Scanner(new File("src\\Login.txt"));
        FileWriter fw=new FileWriter("src\\Login.txt",true);
        File file = new File("src\\Login.txt");
        FileInputStream fileStream = new FileInputStream(file);
        InputStreamReader input1 = new InputStreamReader(fileStream);
        BufferedReader reader = new BufferedReader(input1);
        int choice;
        String p="password";
        int i=0,count=0,flag=0;
        System.out.print("Enter your Name : ");
        name=input.nextLine();
        while(Line = reader.readLine()!=null)
        {
            count++;
        }
        count/=7;
        String[] checkuser =new String[count];
        while(i!=count) {
            scan.nextLine();
            checkuser[i] = scan.nextLine();
            scan.nextLine();
            scan.nextLine();
            scan.nextLine();
            scan.nextLine();
            scan.nextLine();
            i++;
        }
        int ch=-1;
        while(ch==-1)
        {
            System.out.print("Enter Username : ");
            user=input.nextLine();
            ch=checkinfo(count,checkuser,user);
        }
        String inpPass = "pass";
        String inpPass1 = "conpass";
        int check=0;
        while(check==0)
        {
            System.out.print("Enter password : ");
            inpPass = input.nextLine();
            System.out.print("Confirm password : ");
            inpPass1 = input.nextLine();
            if(inpPass.equals(inpPass1))
            {
                check=1;
            }
            else{
                System.out.println("Invalid password . Try again");
            }
        }
        String mo="1";
        do {
            System.out.print("Enter Mobile number : ");
            mobile=input.nextLine();
            if(MobileNumberValidation.isValidnum(mobile))
                mo="0";
            else{
                System.out.println("Invalid Number.");
                mo="1";
            }
        }while(mo.equals("1"));
        String em="1";
        do {
            System.out.print("Enter E-mail Id: ");
            email=input.nextLine();
            if(Test.isValid(email))
                em="0";
            else{
             System.out.println("Invalid ID");
             em="1";
            }
        }while(em.equals("1"));
        System.out.print("Enter Address : ");
        address=input.nextLine();
        System.out.print("Enter your ROLL for USER enter 1 and for ADMIN enter 2 : ");
        choice=input.nextInt();
        if(choice==1)
        {
            role="user";
        }
        else
        {
            System.out.print("Enter Admin Password : ");
            temp=input.next();
            if(p.equals(temp))
            {
                role="admin";
            }
            else
            {
                System.out.println("Admin password is wrong. Your role is user.");
                role="user";
            }
        }
        for (i = 0; i < name.length(); i++)
            fw.append(name.charAt(i));
        fw.append("\n");
        for (i = 0; i < user.length(); i++)
            fw.append(user.charAt(i));
        fw.append("\n");
        for (i = 0; i < inpPass.length(); i++)
            fw.append(inpPass.charAt(i));
        fw.append("\n");
        for (i = 0; i < role.length(); i++)
            fw.append(role.charAt(i));
        fw.append("\n");
        for (i = 0; i < mobile.length(); i++)
            fw.append(mobile.charAt(i));
        fw.append("\n");
        for (i = 0; i < email.length(); i++)
            fw.append(email.charAt(i));
        fw.append("\n");
        for (i = 0; i < address.length(); i++)
            fw.append(address.charAt(i));
        fw.append("\n");
        fw.close();
        return user;
    }
    private int checkinfo(int count,String[] checkuser,String user) {
        Scanner input=new Scanner(System.in);
        int j=0;
        for (int i = 0; i < count; i++) {
            if (user.equals(checkuser[i])) {
                System.out.println("Username is already exist");
                j=1;
                break;
            }
        }
        if(j==1)
        {
            return -1;
        }
        else{
            return 1;
        }
    }
}
class Test {
    public static boolean isValid(String email) {
        String emailRegex = "^[a-zA-Z0-9_+&*-]+(?:\\." +
                "[a-zA-Z0-9_+&*-]+)*@" +
                "(?:[a-zA-Z0-9-]+\\.)+[a-z" +
                "A-Z]{2,7}$";

        Pattern pat = Pattern.compile(emailRegex);
        if (email == null)
            return false;
        return pat.matcher(email).matches();
    }
}
class MobileNumberValidation {
    public static boolean isValidnum(String s) {
        Pattern p = Pattern.compile("(0/91)?[7-9][0-9]{9}");
        Matcher m = p.matcher(s);
        return (m.find() && m.group().equals(s));
    }
}