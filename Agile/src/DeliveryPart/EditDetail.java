/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DeliveryPart;
import PickUpPart.PickUp;
import java.util.ArrayList;
import java.util.Scanner;
/**
 *
 * @author User
 */
public class EditDetail {
    
    
    
    public static void EditCustDetail(){
        
        Scanner sc=new Scanner(System.in);
        int choice;
        DeliveryDetail dd = new DeliveryDetail();
        int i, number;
        int reader;
        int reader1;
        String reader2;
        String custname, date, time, address, desc, dcode;
        boolean status;
    
        System.out.println("Please choose the customer that you want to edit.(press 99 to exit)");
        
        System.out.println("PICKUP LIST");
        System.out.println("---------------------------------------------------------------------------------------------------");
        System.out.println("  Delivery Code\tDate\tTime\t\tDescription\t\t\tAddress");
        System.out.println("---------------------------------------------------------------------------------------------------");
        
        for (i=0;i<dd.b.size();i++)
        {
            if (dd.b.get(i).Status == false)
            {
                number = i+1;
                System.out.println(number +"."+dd.b.get(i).DeliveryCode+"\t\t"+dd.b.get(i).Time+"\t"+dd.b.get(i).Date+"\t"+dd.b.get(i).Description+"\t\t"+dd.b.get(i).Address);
                
            }
        }
        
        System.out.println("Press enter the option that you want to edit!\nPress 99 to the Menu!");
        
        try{
            reader = Integer.parseInt(sc.nextLine());
            
             if (reader == 99)
            {
                PickUp.main(null);
            }
             else if (reader > dd.b.size() || reader < 0)
            {
                System.out.println("The input is unavailable");
                PickUp.main(null);
            }
             
            reader = reader -1;
            
            System.out.println("Do you want to edit the customer detail?");
            System.out.println("----------------------------------------------------");
            System.out.println("Delivery Code\t:" + dd.b.get(reader).DeliveryCode + "\n----------------------------------------------------\n" +
                    "\n1.Name\t\t:" + dd.b.get(reader).CustName + 
                    "\n2.Date\t\t:" + dd.b.get(reader).Date + 
                    "\n3.Time\t\t:" + dd.b.get(reader).Time + 
                    "\n4.Desciption\t:" + dd.b.get(reader).Description +
                    "\n5.Address\t:" + dd.b.get(reader).Address);
            System.out.println("Press enter the option that you want to edit!\nPress 99 to the Menu!");
            
            reader1 = Integer.parseInt(sc.nextLine());
            if (reader1 == 99)
            {
                PickUp.main(null);
            }
            else if (reader1 > 5 || reader1 < 1)
            {
                System.out.println("The input is unavailable");
                EditCustDetail();
            }
            
            switch(reader1){
                case 1:
                    System.out.println("Please enter the name of the customer:");
                    reader2 = sc.nextLine();
                    custname = dd.b.get(reader).CustName;
                    
                    date = dd.b.get(reader).Date;
                    time = dd.b.get(reader).Time;
                    desc = dd.b.get(reader).Description;
                    address = dd.b.get(reader).Address;
                    dcode = dd.b.get(reader).DeliveryCode;
                    DeliveryDetail add1 = new DeliveryDetail(dcode, custname, date, time, desc, address, false);
                    dd.b.remove(reader1);
                    dd.b.add(add1);
                    System.out.println("The changes is success!");
                    PickUp.main(null);
                case 2:
                    System.out.println("Please enter the date delivery:");
                    reader2 = sc.nextLine();
                    date = dd.b.get(reader).Date;
                    
                    custname = dd.b.get(reader).CustName;
                    time = dd.b.get(reader).Time;
                    desc = dd.b.get(reader).Description;
                    address = dd.b.get(reader).Address;
                    dcode = dd.b.get(reader).DeliveryCode;
                    add1 = new DeliveryDetail(dcode, custname, date, time, desc, address, false);
                    dd.b.remove(reader1);
                    dd.b.add(add1);
                    System.out.println("The changes is success!");
                    PickUp.main(null);
                case 3:
                    System.out.println("Please enter the time delivery:");
                    reader2 = sc.nextLine();
                    time = dd.b.get(reader).Time;
                    
                    date = dd.b.get(reader).Date;
                    custname = dd.b.get(reader).CustName;
                    desc = dd.b.get(reader).Description;
                    address = dd.b.get(reader).Address;
                    dcode = dd.b.get(reader).DeliveryCode;
                    add1 = new DeliveryDetail(dcode, custname, date, time, desc, address, false);
                    dd.b.remove(reader1);
                    dd.b.add(add1);
                    System.out.println("The changes is success!");
                    PickUp.main(null);
                case 4:
                    System.out.println("Please enter the description(order):");
                    reader2 = sc.nextLine();
                    desc = dd.b.get(reader).Description;
                    
                    date = dd.b.get(reader).Date;
                    time = dd.b.get(reader).Time;
                    custname = dd.b.get(reader).CustName;
                    address = dd.b.get(reader).Address;
                    dcode = dd.b.get(reader).DeliveryCode;
                    add1 = new DeliveryDetail(dcode, custname, date, time, desc, address, false);
                    dd.b.remove(reader1);
                    dd.b.add(add1);
                    System.out.println("The changes is success!");
                    PickUp.main(null);
                case 5:
                    System.out.println("Please enter the new address:");
                    reader2 = sc.nextLine();
                    address = dd.b.get(reader).Address;
                    
                    date = dd.b.get(reader).Date;
                    time = dd.b.get(reader).Time;
                    desc = dd.b.get(reader).Description;
                    custname = dd.b.get(reader).CustName;
                    dcode = dd.b.get(reader).DeliveryCode;
                    add1 = new DeliveryDetail(dcode, custname, date, time, desc, address, false);
                    dd.b.remove(reader1);
                    dd.b.add(add1);
                    System.out.println("The changes is success!");
                    PickUp.main(null);
            }
            
        }
        catch (Exception e)
            {
                System.out.println("The input is not available!");
            }
        
    }
    
}
