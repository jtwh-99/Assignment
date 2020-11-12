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
  private static final int limit = 20;
  
    public Catalog() {
    this(limit);
  }

  public Catalog(int initialCapacity) {
    length = 0;
    list = (T[]) new Comparable[initialCapacity];
  }

  public boolean add(T newEntry) {//save nickname 
      int i = 0;
    while (i < length ) {
      i++;
      
    }
    list[i] = newEntry;
    length++;
   
    return true;
  }
public boolean edit(T newEntry){
    
    return true;
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
      outputStr += (index+1)+"."+list[index] + " \n";
    }
outputStr +=  "Which one you want to edit?\n";
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
