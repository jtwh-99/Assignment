/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package add.menu;
import java.util.Scanner;
import add.menu.Catalog;
import add.menu.CatalogInterface;
/**
 *
 * @author USER
 */
public class AddMenu {
     static CatalogInterface<String> ciList = new Catalog<String>();
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
       Scanner scan = new Scanner(System.in);
        menu();
        int control1 = 0 ;
        
        String addItem1 ="";
        String addItem2 = "";
        
        do{
            System.out.println("1. Show menu \n 2. Add new flower\n 99. End programme.\nWhat you want to do? ");
            try{
               control1= Integer.parseInt(scan.nextLine());
               
                    if(control1 == 1) System.out.println(ciList.toString());
                    
                  else if(control1 == 2){ 
                       System.out.println("Flower name : ");
                       addItem1 = scan.nextLine();
                       System.out.println("Flower Detail : ");
                       addItem2 = scan.nextLine();
                       
                       if(addItem1.equals("")||addItem2.equals(""))
                       {
                           System.out.println("Please at least enter any thing.");
                       }
                       else
                       {
                           ciList.add(addItem1, addItem2);
                       }
            }
             
               
           }catch(Exception e)
           {
               System.out.println("Please enter number only.");
           }
        }while(control1 != 99);
        
    }
    
    public static void menu(){
        ciList.add("Orchid","Smells good and best sell!");
        ciList.add("Sun Flower","Easy to plant, no one can ignore it!");
        
        ciList.add("Lady Finger","Beautiful! you also can eat as a vage!");
        
        ciList.add("Rose","Opps, sold out.");
        
        
    }

    
}
