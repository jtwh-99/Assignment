/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Main;

/**
 *
 * @author USER
 */
public class Catalog <T extends Comparable<T>> implements CatalogInterface<T> {
     private T[] list;
  private int length;
  private T[] detail;
  private T[] price;
  
  private static final int limit = 20;
  
    public Catalog() {
    this(limit);
  }

  public Catalog(int initialCapacity) {
    length = 0;
    list = (T[]) new Comparable[initialCapacity];
    detail=(T[]) new Comparable[initialCapacity];
    price=(T[]) new Comparable[initialCapacity];
  }

  public boolean add(T newEntry, T secondEntry, T thirdEntry) {//save nickname 
      int i = 0;
    while (i < length ) {
      i++;
      
    }
    detail[i] = secondEntry;
    list[i] = newEntry;
    price[i]= thirdEntry;
    length++;
   
    return true;
  }
 
public boolean edit(int cID, int choose, T newEntry){
    
    if(length==0){
       return false;
   }
   else{
      int i = 0;
    while (i < length && i < cID-1) {
      i++;
    }
    if(i==cID-1){
        
        if(choose == 1)
        {
            list[i]=newEntry;
            
        }
            
        else if (choose ==2)
        {
            detail[i]= newEntry;
             
        }
        else if (choose ==2)
          {
            try{
                
                price[i]=newEntry ;
            }catch(Exception e)
            {
                
            }
             
        }  
    }
    
     return true;
    
   
}
}

  public boolean remove(T anEntry) {//remove the nickname
   if(length==0){
       return false;
   }
   else{
      int i = 0;
    while (i < length && list[i].compareTo(anEntry) < 0) {
      i++;
    }
    if(list[i].equals(anEntry)){
        removeGap(i+1);
        length -- ;
        
    }
      return false;
  }
  }
  public void clear() {//clear the all item in array
    length = 0;
  }

  

  public int getLength() {//get the array length
    return length;
  }

  public boolean isEmpty() {//let other module may use
    if(length==0){
        return true;
    }
    else
    return false;
  }

 public String toString() {
    String outputStr = "";
    for (int index = 0; index < length; ++index) {
      outputStr += (index+1)+"."+list[index] + " ID " + (index+1)+"\t "+detail[index]+"\n Price: RM "+price[index]+"\n";
    }
    outputStr += "99. exit\n";
outputStr +=  "Which one you want to edit?\n Please Enter ID number:";
    return outputStr;
  }
 public String toString2(int cID) {
    String outputStr = "";
     if(length==0){
         outputStr = "Error";
         
    }
       
   
   else{
      int i = 0;
    while (i < length && i < cID-1) {
      i++;
    }
    if(i==cID-1){
    
    outputStr+= list[i]+" ID " + (i+1) +"\n Detail: "+detail[i]+"\n";
   
        }
    }
     return outputStr;
 }
 
    
  private boolean isArrayFull() {//for other module may use
    return length == list.length;
  }

 


  private void removeGap(int givenPosition) {//remove child function.
    int removedIndex = givenPosition - 1;
    int lastIndex = length - 1;

    for (int index = removedIndex; index < lastIndex; index++) {
      list[index] = list[index + 1];
    }
  }
}
