
package ipc1.tarea3;

import java.util.Scanner;

/**
 *
 * @author Giovanni
 */
public class IPC1Tarea3 {

    public static void main(String[] args) {
        
        
        int ingreso = 0;
                        
        Scanner sc = new Scanner(System.in);
       
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
                  
                  System.out.println("No:"); 
                  n = sc.nextInt();
                
                    switch (n) {
                
                        case 1:
                            System.out.println("Ingresar Usuarios");  
                            
                        break;    
                
                        
                        case 2:
                            
                        break;
                        
                        
                        case 3:
                            
                        break;
                
                
                        case 4:
                            
                        break;
                
                    }   
                                                             
            break;
                

            case 2:
                System.out.println("Contador de Dígitos");
                break;

            case 3:
                System.out.println("Tres números de mayor a menor");
                break;
                
            case 4:
                System.out.println("Calcular Promedio");
                break;

            default:
            
                System.out.println("Adiós");
                break;
        }
        
    }
    
}
