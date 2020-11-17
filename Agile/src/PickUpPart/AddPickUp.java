/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package PickUpPart;
import java.util.*;
import PickUpPart.CustomerDetail;
/**
 *
 * @author User
 */
public class AddPickUp {
    
    static CustomerDetail CustD = new CustomerDetail("","","","","",false);
    static Scanner sc=new Scanner(System.in);
    static String reader;
    static int counter = 0;
    
    public static void Add()
    {
        do{
            System.out.println("Please enter the customer name: ");
            reader = sc.nextLine();
        }while (reader.equals(""));
        CustD.CustName = reader;
        
        do
        {
            System.out.println("Please enter the pick up date: ");
            reader = sc.nextLine();
        }while (reader.equals(""));
        CustD.Date = reader;
        
        do
        {
            System.out.println("Please enter the pick up time: ");
            reader = sc.nextLine();
        }while (reader.equals(""));
        CustD.Time = reader;
        
        do
        {
            System.out.println("Please enter the description(how many flowers): ");
            reader = sc.nextLine();
        }while (reader.equals(""));
        CustD.Description = reader;
        
        System.out.println("The information of the pickup will be above:\nPick up ID\t:" + CustD.PickUpNo 
                + "\nCustomer Name\t:" + CustD.CustName
                + "\nPick up date\t:" + CustD.Date
                + "\nPick up time\t:" + CustD.Time
                + "\nDescription\t:" + CustD.Description);
        System.out.println("Is the information correct?\n2 is redo, else will be count as yes!");
        reader = sc.nextLine();
        
        if (reader.equals("1"))
        {
            counter ++;
            System.out.println("Successful!");
            System.exit(0);
        }
        else
            System.out.println("NO!");
            System.exit(0);
    }
}

 