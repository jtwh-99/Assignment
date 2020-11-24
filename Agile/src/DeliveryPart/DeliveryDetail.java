/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DeliveryPart;

import java.util.ArrayList;

/**
 *
 * @author User
 */
public class DeliveryDetail {
    String DeliveryCode;
    String CustName;
    String Date;
    String Time;
    String Description;
    String Address;
    boolean Status;
    ArrayList<DeliveryDetail> b = new ArrayList<DeliveryDetail>();
    
    public DeliveryDetail(String dcode, String cname, String date, String time, String desc, String ad, boolean status)
    {
        DeliveryCode = dcode;
        CustName = cname;
        Date = date;
        Time = time;
        Description = desc;
        Address = ad;
        Status = status;
    }
    
    DeliveryDetail()
    {
        DeliveryDetail exp1 = new DeliveryDetail("5001","Lim Meng","20 DEC 2020","1230","99 roses","19, Jalan Tembikai, Taman Pisang, 82000 Muar, Johor", false);
        DeliveryDetail exp2 = new DeliveryDetail("5002","Chew Jane","20 DEC 2020","1245","30 roses, 20 lily","33, Jalan Tembikai, Taman Pisang, 82000 Muar, Johor", false);
        DeliveryDetail exp3 = new DeliveryDetail("5003","Lim Yi En","20 DEC 2020","1300","50 lily","20, Jalan Mangga, Taman Oren, 82000 Muar, Johor", false);
        b.add(exp1);
        b.add(exp2);
        b.add(exp3);
    }
}
