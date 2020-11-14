/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ConfirmPickUp;
import java.util.*;
/**
 *
 * @author User
 */
public class Agile {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner sc=new Scanner(System.in);
        String reader;
        String reader1;
        ConfirmPickUp myPickUp = new ConfirmPickUp("A10001", "Mr.Kennedy Chong", "15 Nov 2020", "1500", "5 Roses", false);
        
        System.out.println("PICKUP LIST");
        System.out.println("-------------------------------------------------------");
        System.out.println("  Pickup Code\tTime\tDate\t\tDescription");
        System.out.println("-------------------------------------------------------");
        System.out.println("1."+ myPickUp.PickUpNo +"\t"+ myPickUp.Time + "\t" + myPickUp.Date + "\t" + myPickUp.Description);
        System.out.println("Choose the number shown below that customer came to pick. (press z to exit)");
        
        reader = sc.nextLine();
        
        
        if (reader.equals("1")){
            System.out.println("Are you confirm the customer shown below has come to pickup their flowers?");
            System.out.println("Pickup Code\t:" + myPickUp.PickUpNo + 
                    "\nName\t\t:" + myPickUp.CustName + 
                    "\nDate\t\t:" + myPickUp.Date + 
                    "\nTime\t\t:" + myPickUp.Time + 
                    "\nDesciption\t:" + myPickUp.Description);
            System.out.println("Press 1 to confirm the pickup!\nPress 2 back to the pickup list!");
            reader1 = sc.nextLine();
        
        //If the user confirm, turn the boolean to true, it will be delivered, if not will back to menu
            if (reader1.equals("1")){
                myPickUp.Status = true;
                System.out.println("The customer get the flowers!");
                System.exit(0);
            }
            else{
                System.exit(0);
            }
        }
        
        //if the user enter z or Z it will back to the last page.
        if(reader.equals("Z")){
            System.exit(0);
        }
        
        if(reader.equals("z")){
            System.exit(0);
        }
        
        System.out.println("The input is not available!");
}