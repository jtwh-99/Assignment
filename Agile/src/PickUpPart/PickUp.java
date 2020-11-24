/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package PickUpPart;
import DeliveryPart.EditDetail;
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
public class PickUp {

    /**
     * @param args the command line arguments
     */
    
    
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner sc=new Scanner(System.in);
        AddPickUp apu = new AddPickUp();
        ConfirmPickUp cpu = new ConfirmPickUp();
        int reader=0;
        int counter=0;
        String choice;
        
        System.out.println("choose 1 to go delivery, else to proceed");
        choice = sc.nextLine();
        if (choice.equals("1"))
        {
            EditDetail.EditCustDetail();
        }
        
        
        do
        {
            System.out.println("What action do you want to take?");
            System.out.println("1.Add pickup\n2.Record pickup\n3.Exit");
        
            try 
            {
                reader = Integer.parseInt(sc.nextLine());
                if (reader == 1){
                    apu.Add();
                    counter++;
                }
                else if(reader == 2)
                cpu.confirm();
                else if(reader == 3)
                {
                    System.exit(0);
                }
                else
                    System.out.println("Please choose between 1 to 3");
            }
            catch (Exception e)
            {
                System.out.println("The input is not available!");
            }
        }while (reader != 3);
    }

}