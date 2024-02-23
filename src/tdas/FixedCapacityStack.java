//OK -> No es genérica, solo permite almacenar cadenas de caracteres
//Es de tamaño fijo
//No es iterable
//Desperdicia espacio (Loitering)


package tdas;

/**
 *
 * @author Juan Carlos Navarro
 * @param <Item>
 */
public class FixedCapacityStack<Item> {
    
    private Item[] arr;
    private int count;
    
    public FixedCapacityStack(int cap){
        arr = (Item[]) new Object[cap];
        count = 0;
    }
    
    public void push(Item item){
        arr[count++] = item;
    }
            
    /**
     *
     * @return
     */
    public Item pop(){
        return arr[--count];
    }
            
    public boolean isEmpty(){
        return(count == 0);
    }
                    
    public int size(){
        return count;
    }
    
    @Override
    public String toString(){
        String salida = "";
        for (int i = count-1 ; i >= 0; i--)
            salida += arr[i] + "\n";
        return salida;
    }

}
