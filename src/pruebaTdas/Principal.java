package pruebaTdas;

import tdas.*;
import java.util.Scanner;

/**
 *
 * @author Juan Carlos Navarro
 */
public class Principal {

    //FixedCapacityStackOfStrings stack;
    //FixedCapacityStack <String> stack;
    //FixedCapacityStack <Integer> stack;
    //ResizingCapacityStack<String> stack;
    ArrayQueue<String> queue;
    
    public Principal(/*int maxCap*/){
        //stack = new FixedCapacityStackOfStrings(maxCap);
        //stack = new FixedCapacityStack<>(maxCap);
        //stack = new ResizingCapacityStack<>();
        //stack = new ArrayStack<>();
        queue = new ArrayQueue<>();
    }
    
    private String generarNombre(){
        String[] nombres={"Juan", "Andres", "Carolina", "Sebastián", "Felipe", "Camilo", "Miguel", "Ana", "Alberto", "Paola"};
        String[] apellidos={"Parra", "Mejia", "Viana", "Ramírez", "Riveros", "Sanabria", "Alvarez", "Pardo"};
        return nombres[(int)(Math.random()*nombres.length)] + " " + apellidos[(int)(Math.random()*apellidos.length)];
    }
    
    private int generarNumero(){
        return (int)(Math.random()*100+1);
    }
    
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Principal ppal;
        Scanner sc = new Scanner(System.in);
        int tam, opcion, numero;
        String nombre;
        /*
        System.out.println("Ingrese el tamaño máximo de la pila: ");
        tam = sc.nextInt();
        
        ppal = new Principal(tam);
        */
        ppal = new Principal();
        
        while(true){
            System.out.println("""
                               Seleccione una opci\u00f3n: 
                               1. Insertar un dato ._.
                               2. Eliminar un dato
                               3. Conocer el n\u00famero de datos almacenados
                               4. Mostrar los datos almacenados
                               5. Salir
                               """);
            opcion = sc.nextInt();
            switch(opcion){
                case 1:
                    //if(ppal.stack.size()<tam){
                        nombre = ppal.generarNombre();
                        //numero = ppal.generarNumero();
                        System.out.println("Se adicionó el dato: " + nombre + "\n");
                        //System.out.println("Se adicionó el dato: " + numero + "\n");
                        ppal.queue.enqueue(nombre);
                        //ppal.stack.push(nombre);
                        //ppal.stack.push(numero);
                    /*}
                    else
                        System.out.println("La pila está llena.\n");
                        */
                    break;
                case 2: 
                    if(!ppal.queue.isEmpty()){
                        nombre = ppal.queue.dequeue();        
                        //numero = ppal.stack.pop();        
                        System.out.println("Se eliminó a " + nombre + "\n");
                        //System.out.println("Se eliminó a " + numero + "\n");
                    }
                    else
                        System.out.println("No hay datos para eliminar, la cola está vacía\n");
                    break;
                case 3: 
                    System.out.println(((ppal.queue.isEmpty())?"La cola está vacía" : "La cola tiene " + ppal.queue.size() + " datos almacenados") + "\n");
                    break;
                case 4: 
                    //System.out.println("\nDatos almacenados:\n" + ((ppal.stack.isEmpty())? "La pila está vacía" : ppal.stack ) + "\n");
                    for(String s : ppal.queue){
                        System.out.println(s);
                    }                        
                    System.out.println("");
                    break;
                case 5: 
                    System.out.println("Hasta pronto");
                    System.exit(0);
                default:
                    System.out.println("Error, opción no válida");
            }
        }
    }
    
}
