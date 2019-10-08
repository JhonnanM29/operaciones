
package array;

import java.util.Scanner;
public class Operaciones {
    
    public int [] arreglo = new int [10];
    public int opcion;
    
    //Constructor
    public Operaciones(){
      this.mostrarMenu();
      
        
    }
    
    //Muestra el menu en pantalla
    public void mostrarMenu(){
        System.out.println(" opciones\n"
                + "1.Llennar array\n"
                + "2.Escribir arrays\n"
                + "3.Sumatoria\n"
                + "4.Productoria\n"
                + "5.Tamaño del array\n"
                + "6.Salir\n"
                + "Escoja opcion ");
       Scanner lectura=new Scanner(System.in);
       opcion=lectura.nextInt();
       this.cargarOpcion(opcion);
        
    }
    //leer arreglo 
   public void leerArreglo(){
       System.out.println(" la opcion escogida es leer arreglo");
       
   }
    //Escribe el arreglo
    public void escribirArreglo(){
        
       System.out.println(" la opcion escogida es escribir arreglo");  
    }
    //Generar sumatoria
    public void sumatoria(){
        
       System.out.println(" la opcion escogida es sumatoria");
        
    }
    //Generar productoria
    public void productadoria(){
        
       System.out.println(" la opcion escogida es productadoria");
    }
    //cargar opcion
    public void cargarOpcion(int op){
        
        //System.out.println("la opcion escogida es "+op);  
        
        switch(op){
            case 1:
                this.leerArreglo();
                break;
            case 2:
                this.escribirArreglo();
                break;
            case 3:
                this.sumatoria();
                break;
            case 4: 
                this.productadoria();
                break;
            case 5:
                break;
            case 6: System.out.println(" usted ha finalizado el programa ");
            break;
                
                       
            
        
    }    
    
}
    
    
    
    
}
