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
public class CustomerDetail {
    String PickUpNo;
    String CustName;
    String Date;
    String Time;
    String Description;
    boolean Status;
    ArrayList<CustomerDetail> a = new ArrayList<CustomerDetail>();
    
    public CustomerDetail(String pno, String custn, String d, String t, String desc, boolean s)
    {
        PickUpNo = pno;
        CustName = custn;
        Date = d;
        Time = t;
        Description = desc;
        Status= s;
        
        
    }

    CustomerDetail() 
    {
        CustomerDetail exp1 = new CustomerDetail("1001","Chong King","17 Nov 2020","2020","99 rose",false);
        CustomerDetail exp2 = new CustomerDetail("1002","Cong King","18 Nov 2020","1500","5 roses 10 lily 20 waterlily",false);
        a.add(exp1);
        a.add(exp2); 
    }
    
    
}
