/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package PickUpPart;



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
    
    public CustomerDetail(String pno, String custn, String d, String t, String desc, boolean s)
    {
        PickUpNo = pno;
        CustName = custn;
        Date = d;
        Time = t;
        Description = desc;
        Status= s;
    }
}
