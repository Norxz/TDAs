package tdas;

import java.util.Iterator;

/**
 *
 * @author asus
 */
public class ArrayQueue<Item> implements Iterable<Item> {

    private Item[] arr;
    private int count;
    private int first = 0;
    private int last = 0;

    public ArrayQueue() {

    }

    public void enqueue(Item item) {
        if (count == arr.length) {
            resize(arr.length * 2);
        }
        arr[count++] = item;
        if (last++ > arr.length) {
            last = 0;
        }else last++;
        
    }

    public Item dequeue() {
        Item temp = arr[first];
        count--;
        arr[first] = null;
        if (first++ > arr.length) {
            first = 0;
        }else first++;
        if (count <= arr.length / 4 && count > 0) {
            resize(arr.length / 2);
        }
        return temp;
    }

    public boolean isEmpty() {
        return (count == 0);
    }

    public int size() {
        return count;
    }

    private void resize(int maxCap) {

    }

    @Override
    public Iterator<Item> iterator() {
        return new ArrayIterator();
    }

    private class ArrayIterator implements Iterator<Item> {

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
