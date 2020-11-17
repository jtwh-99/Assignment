/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package PickUpPart;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author User
 */
public class ConfirmPickUp {
    
    public ConfirmPickUp(){}
    
    
    public static void confirm(int counter)
    {
        Scanner sc=new Scanner(System.in);
        int reader, number;
        String reader1;
        int i;
        ArrayList<CustomerDetail> a = new ArrayList<CustomerDetail>();
        
        CustomerDetail myPickUp = new CustomerDetail("1001","Chong King","17 Nov 2020","2020","99 rose",false);
        CustomerDetail myPickUp2 = new CustomerDetail("1002","Cong King","18 Nov 2020","1500","5 roses 10 lily 20 waterlily",false);
        
        a.add(myPickUp);
        a.add(myPickUp2);
        
        System.out.println("PICKUP LIST");
        System.out.println("-------------------------------------------------------");
        System.out.println("  Pickup Code\tTime\tDate\t\tDescription");
        System.out.println("-------------------------------------------------------");
       
        System.out.println("Choose the number shown below that customer came to pick. (press 99 to exit)");
        
        for (i=0;i<a.size();i++)
        {
            number = 0;
            number = i+1;
            System.out.println(number+"."+a.get(i)+"\n");
        }
        
        System.out.println("Choose the number above to proceed!\n");
        
        try{
            reader = Integer.parseInt(sc.nextLine());
            reader = i;
            if (reader==i)
            {
                System.out.println("Are you confirm the customer shown below has come to pickup their flowers?");
                System.out.println("Pickup Code\t:" + myPickUp.PickUpNo + 
                    "\nName\t\t:" + myPickUp.CustName + 
                    "\nDate\t\t:" + myPickUp.Date + 
                    "\nTime\t\t:" + myPickUp.Time + 
                    "\nDesciption\t:" + myPickUp.Description);
                System.out.println("Press 1 to confirm the pickup!\nPress 2 back to the pickup list!");
                reader1 = sc.nextLine();
                
                if (reader1.equals("1")){
                myPickUp.Status = true;
                System.out.println("The customer get the flowers!");
                System.exit(0);
                }
                else{
                    System.exit(0);
                }
                
            }
            else if (reader == 99)
            {
                System.exit(0);
            }
            else if (reader > a.size() || reader < 0)
            {
                System.out.println("The input is unavailable");
            }
            
        }
        catch (Exception e)
            {
                System.out.println("The input is not available!");
            }
    }   
}

