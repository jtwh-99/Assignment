/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package login;
import java.util.Scanner;

/**
 *
 * @author USER
 */
public class Login {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int control =0;
        String a,b ="";
       do{
        System.out.println("Who you are?\n 1.Customer\n 2.Admin\n 3.exit");
        try{
            control=Integer.parseInt(scan.nextLine());
            if(control == 2)
            {
                 System.out.println("User name: ");
                 a= scan.nextLine();
                  System.out.println("Password: ");
                  b=scan.nextLine();
               if(a.equals("Admin")&&b.equals("class"))   
                System.out.println(toStringA());
               else
                    System.out.println("Wrong password or username!\n");
            }
            else if (control == 1)
                System.out.println(toStringB());
                else
                System.out.println("Please enter 1 or 2  only");
        }catch(Exception e)
        {
            System.out.println("Please enter integer only.");
        }
       }while(control !=3);
    }
    public static String toStringA(){
        String a = "\nWelcome to Admin page.\n";
        
        return a;
    }
    public static String toStringB(){
        String a = "\nWelcome to Guest page.\n";
        
        return a;
    }
}
