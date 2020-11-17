/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Main;
import java.util.Scanner;
import Main.Catalog;
import Main.CatalogInterface;
/**
 *
 * @author USER
 */
public class Catalog_Edit {
   static CatalogInterface<String> ciList = new Catalog<String>();
    
    public static void main(String[] args) {
      Scanner scan = new Scanner(System.in);
      int control1 =  0;
      int control2 = 0 ;
      String editItem = "";
      menu();
        do 
       {
           System.out.print(ciList.toString());
           try{
               control1= Integer.parseInt(scan.nextLine());
               if(control1==99)
                   break;
               System.out.println(ciList.toString2(control1));
               System.out.println("Which one you want to edit for this?\n 1.Flower \n 2.Flower detail\n 3.Exit \n Enter :");
               try{
                   control2 =Integer.parseInt(scan.nextLine());
                   if (control2 == 1 || control2 ==2)
                   { 
                       
                       System.out.println("Change to ?  :");
                   editItem = scan.nextLine();
                   
                   ciList.edit(control1, control2, editItem);
                   }
               }catch(Exception e)
           {
               System.out.println("Please enter number only.");
           }
           }catch(Exception e)
           {
               System.out.println("Please enter number only.");
           }
       }while (control1 != 99);
    }
    public static void menu(){
        ciList.add("Orchid","Smells good and best sell!");
        ciList.add("Sun Flower","Easy to plant, no one can ignore it!");
        
        ciList.add("Lady Finger","Beautiful! you also can eat as a vage!");
        
        ciList.add("Rose","Opps, sold out.");
        
        
    }
    
}
