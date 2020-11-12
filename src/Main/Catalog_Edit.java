/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Main;
import java.util.Scanner;
import Main.Catalog;
import Main.CatalogInterface;
/**
 *
 * @author USER
 */
public class Catalog_Edit {
   CatalogInterface<String> ciList = new Catalog<String>();
    
    public static void main(String[] args) {
       
    }
    public void menu(){
        ciList.add("Orchid ID 1");
        ciList.add("Sun Flower ID 2");
        ciList.add("Lady Finger ID 3");
        ciList.add("Rose ID 4");
        
    }
    
}
