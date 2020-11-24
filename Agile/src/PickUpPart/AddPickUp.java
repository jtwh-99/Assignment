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
public class AddPickUp {
    
    static Scanner sc=new Scanner(System.in);
    static String reader;
    static String name, date, time, desc;
    int pickupno;
    PickUpDetail cd = new PickUpDetail();
    int i;
    
    public void Add()
    {
        pickupno = cd.a.size()+1001;
        
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
        System.out.println("Is the information correct?\n1 is confirm, 99 is exit to menu, else will be count as no and redo!");
        reader = sc.nextLine();
        
        if (reader.equals("1"))
        {
            PickUpDetail add1 = new PickUpDetail(Integer.toString(pickupno),name,date,time,desc,false);
            cd.a.add(add1);
            System.out.println("Successful!");
            PickUp.main(null);
        }
        else if (reader.equals("99"))
        {
            PickUp.main(null);
        }
        else
            Add();
            System.exit(0);
    }
}

 