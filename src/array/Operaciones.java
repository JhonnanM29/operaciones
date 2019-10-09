
package array;

import java.util.Scanner;
public class Operaciones {
    
    public int [] arreglo = new int [10];
     Scanner lectura=new Scanner(System.in);
       
    
    //Constructor
    public Operaciones(){
    this.mostrarMenu();
      
        
    }
    
    
    //Muestra el menu en pantalla
    public void mostrarMenu(){
        
       //limpiar pantalla 
        System.out.println(" opciones\n"
                + "1.Llennar array\n"
                + "2.Escribir arrays\n"
                + "3.Sumatoria\n"
                + "4.Productoria\n"
                + "5.Tamaño del array\n"
                + "6.Salir\n"
                + "Escoja una opcion ");
        
      
       int opcion = lectura.nextInt();
       //opcion=lectura.nextInt();
       this.cargarOpcion(opcion);
       
    }
    //leer arreglo 
   public void leerArreglo(){
       System.out.println(" la opcion escogida es leer arreglo");
       System.out.println(" digite numero ");
       for (int i=0;i<10;i++){
           
           arreglo[i]=lectura.nextInt();
       }
       this.mostrarMenu();
       
   }
    //Escribe el arreglo
    public void escribirArreglo(){
        
       System.out.println(" la opcion escogida es escribir arreglo");  
        System.out.println(" los arreglos son ");
        for (int i=0;i<10;i++){
            arreglo[i]=lectura.nextInt();

              
        }
        this.mostrarMenu();
    }
    //Generar sumatoria
    public void sumatoria(){
        
       System.out.println(" la opcion escogida es sumatoria");
        System.out.println(" la sumatoria es ");
        
       
        this.mostrarMenu();
        
    }
    //Generar productoria
    public void productadoria(){
        
       System.out.println(" la opcion escogida es productadoria");
       
         this.mostrarMenu();
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
