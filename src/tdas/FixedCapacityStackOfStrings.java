//-> No es genérica, solo permite almacenar cadenas de caracteres
//Es de tamaño fijo
//No es iterable
//Desperdicia espacio (Loitering)


package tdas;

/**
 *
 * @author Juan Carlos Navarro
 */
public class FixedCapacityStackOfStrings {
    
    private String[] arr;
    private int count;
    
    public FixedCapacityStackOfStrings(int cap){
        arr = new String[cap];
        count = 0;
    }
    
    public void push(String item){
        arr[count++] = item;
    }
            
    public String pop(){
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
//        for(String s:arr)
//            salida = s + "\n" + salida;
        return salida;
    }
}
