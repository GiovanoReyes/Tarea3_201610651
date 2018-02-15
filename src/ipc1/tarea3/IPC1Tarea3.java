
package ipc1.tarea3;

import java.util.Scanner;

/**
 *
 * @author Giovanni
 */
public class IPC1Tarea3 {

    public static void main(String[] args) {
        
        
        int ingreso = 0;
        boolean x = false; // usada para poder regresar al menu principal
    
    
        Scanner sc = new Scanner(System.in);
    do {
        System.out.println("MENÚ:\n  1. Usuarios\n  "
                + "2. Contador de Dígitos\n  3. Tres números de mayor a menor\n "
                + " 4. Calcular Promedio\n  5. Salir\n ");
                
        System.out.print("Ingresar opción: "); 
        ingreso = sc.nextInt();  

      
          switch (ingreso) {
            
            case 1:
               System.out.println("Usuarios\n ");

                 int n = 0;
                 
                  System.out.println(" 1. Ingresar Usuarios\n "
                          + "2. Mostrar Usuarios Ascendente\n "
                          + "3. Mostrar Usuarios Descendente\n "
                          + "4. Menú Principal\n");
                  
                  System.out.print("Ingresar opción:"); 
                  n = sc.nextInt();
            
            
                    switch (n) {
                
                        case 1:
                            
                            System.out.println("\n\n\n");
                            System.out.println("Ingresar Usuarios");
                            x = false;
                        break;    
                            
                        
                        case 2:
                            
                            System.out.println("\n\n\n");
                            System.out.println("2. Mostrar Usuarios Ascendente");
                            x = false;                            
                        break;
                        
                        
                        case 3:
                            
                            System.out.println("\n\n\n");
                            System.out.println("3. Mostrar Usuarios Descendente");
                            x = false; // para que no cumpla la condición del do while
                        break;
                
                
                        case 4:
                            
                            System.out.println("\n\n\n");
                            System.out.println("4. Menú Principal");
                            x = true; //si el usuario escoge la opción 4, x tomará el valor true 
                        break;
                
                    }   
                                                             
            break; // break del case 1 del switch(ingreso)
                

            case 2:
                
                System.out.println("\n\n\n");
                System.out.println("Contador de Dígitos\n");
                x = false;
                
                
                int nu = 0;
                int a = 0;
                double b = 0 ;
                boolean val = false;
                 
                do {  
                    
                  
                 
                
                System.out.println(" 1. Ingresar número\n "
                          + "2. Mostrar número de dígitos\n "
                          + "4. Menú Principal\n");
                  
                  System.out.print("Ingresar opción:"); 
                  nu = sc.nextInt();
                    
                 
                  
                  switch (nu) {
                      
                      case 1:
                                          
                        System.out.println("Ingresar un número"); 
                        a = sc.nextInt();
                      
                        b = Math.floor( (Math.log(a))/Math.log(10) ) + 1 ;//floor para la parte entera del logaritmo
                      
                        val = true;  
                      break;
                                           
                      case 2:
                              
                        System.out.println("El número "+ a +" tiene: " + b +" dígitos");        
                        val = false;                           
                      break;
                      
                  }
                  
            } while(val == true);
                  
                break;
                

            case 3:
                System.out.println("Tres números de mayor a menor");
                x = false;
                break;
                
            case 4:
                System.out.println("Calcular Promedio");
                x = false;
                break;

            default:
            
                System.out.println("Adiós");
                x = false;
                break;
        }
          
     }   while (x == true ); // Comparando el valor de la variable x
        
    } 
      
      
    
}
