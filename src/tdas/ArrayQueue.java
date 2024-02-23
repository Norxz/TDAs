/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tdas;

import java.util.Iterator;

/**
 *
 * @author asus
 */
public class ArrayQueue <Item> implements Iterable <Item> {
    
    private Item[]arr;
    private int count;
    private int first;
    private int last;
    
    public ArrayQueue(){
        
    }

    public void enqueue(Item item){
        
    }
    
    public Item dequeue(){
        
    }
    
    public boolean isEmpty(){
        return (count == 0);
    }
    
    public int size(){
        return count;
    }
    
    private void resize(int maxCap){
        
    }

    @Override
    public Iterator<Item> iterator() {
        return new ArrayIterator();
    }
    
    private class ArrayIterator implements Iterator<Item>{

        @Override
        public boolean hasNext() {
            throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
        }

        @Override
        public Item next() {
            throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
        }
        
    }
    
    
            
}
