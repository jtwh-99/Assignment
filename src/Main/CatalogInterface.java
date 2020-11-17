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
public interface CatalogInterface <T extends Comparable<T>> {
     public boolean add(T newEntry , T secondEntry);
     
     public String toString2(int cID);
     
    public boolean remove(T anEntry);

    public void clear();

    public int getLength();

    public boolean isEmpty();
    
    public boolean edit(int ID, int choose, T newEntry);
}

