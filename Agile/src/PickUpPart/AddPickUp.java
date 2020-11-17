/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package PickUpPart;
import java.util.*;
import PickUpPart.CustomerDetail;
import PickUpPart.ConfirmPickUp;
import PickUpPart.PickUp;
import PickUpPart.AddPickUp;
import java.util.ArrayList;
import java.util.Scanner;
/**
 *
 * @author User
 */
public class AddPickUp {
    
    static Scanner sc=new Scanner(System.in);
    static String reader;
    static String name, date, time, desc, pickupno;
    CustomerDetail cd = new CustomerDetail();
    int i;
    
    public static void Add()
    {
        
        do{
            System.out.println("Please enter the customer name: ");
            reader = sc.nextLine();
        }while (reader.equals(""));
        name = reader;
        
        do
        {
            System.out.println("Please enter the pick up date: ");
            reader = sc.nextLine();
        }while (reader.equals(""));
        date = reader;
        
        do
        {
            System.out.println("Please enter the pick up time: ");
            reader = sc.nextLine();
        }while (reader.equals(""));
        time = reader;
        
        do
        {
            System.out.println("Please enter the description(how many flowers): ");
            reader = sc.nextLine();
        }while (reader.equals(""));
        desc = reader;
        
        System.out.println("The information of the pickup will be above:\nPick up ID\t:" + pickupno 
                + "\nCustomer Name\t:" + name
                + "\nPick up date\t:" + date
                + "\nPick up time\t:" + time
                + "\nDescription\t:" + desc);
        System.out.println("Is the information correct?\n2 is redo, else will be count as yes!");
        reader = sc.nextLine();
        
        if (reader.equals("1"))
        {
            CustomerDetail add1 = new CustomerDetail(pickupno,name,date,time,desc,false);
            cd.a.add(add1);
            System.out.println("Successful!");
            System.exit(0);
        }
        else
            System.out.println("NO!");
            System.exit(0);
    }
}

 