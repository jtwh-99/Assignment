/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package PickUpPart;
import java.util.*;
import PickUpPart.PickUpDetail;
import PickUpPart.ConfirmPickUp;
import PickUpPart.PickUp;
import PickUpPart.AddPickUp;
import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author User
 */
public class ConfirmPickUp {
    
    public ConfirmPickUp(){}
    
    
    public static void confirm()
    {
        Scanner sc=new Scanner(System.in);
        int reader;
        int number;
        String reader1;
        int i;
        PickUpDetail cd = new PickUpDetail();
        
        
        System.out.println("\n\n\nPICKUP LIST");
        System.out.println("Choose the number shown below that customer came to pick. (press 99 to exit)");
        System.out.println("-------------------------------------------------------");
        System.out.println("  Pickup Code\tTime\tDate\t\tDescription");
        System.out.println("-------------------------------------------------------");
       
        
        for (i=0;i<cd.a.size();i++)
        {
            if (cd.a.get(i).Status == false)
            {
                number = i+1;
                System.out.println(number +"."+cd.a.get(i).PickUpNo+"\t\t"+cd.a.get(i).Time+"\t"+cd.a.get(i).Date+"\t"+cd.a.get(i).Description);
                
            }
        }
        
        System.out.println("Choose the number above to proceed!\n");
        try{
            reader = Integer.parseInt(sc.nextLine());
            reader = reader -1;
            
            if (reader == 99)
            {
                PickUp.main(null);
            }
            else if (reader > cd.a.size() || reader < 0)
            {
                System.out.println("The input is unavailable");
                PickUp.main(null);
            }
            
            System.out.println("Are you confirm the customer shown below has come to pickup their flowers?");
            System.out.println("Pickup Code\t:" + cd.a.get(reader).PickUpNo + 
                    "\nName\t\t:" + cd.a.get(reader).CustName + 
                    "\nDate\t\t:" + cd.a.get(reader).Date + 
                    "\nTime\t\t:" + cd.a.get(reader).Time + 
                    "\nDesciption\t:" + cd.a.get(reader).Description);
            System.out.println("Press 1 to confirm the pickup!\nPress anything back to the Menu!");
            reader1 = sc.nextLine();
                
            if (reader1.equals("1")){
                cd.a.get(reader).Status = true;
                System.out.println("The customer get the flowers!");
                PickUp.main(null);
            }
            else{
                PickUp.main(null);
            }
        }
        catch (Exception e)
            {
                System.out.println("The input is not available!");
            }
    }   
}

