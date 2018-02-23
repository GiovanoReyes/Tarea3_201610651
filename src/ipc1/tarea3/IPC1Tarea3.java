
package ipc1.tarea3;

import java.util.Scanner;
import jdk.nashorn.internal.parser.TokenType;

/**
 *
 * @author Giovanni
 */
public class IPC1Tarea3 {

    public static void main(String[] args) {
        
        
        int ingreso = 0;
        boolean x = false; // usada para poder regresar al menu principal
    
    
        Scanner sc = new Scanner(System.in); // escaner para el ingreso de datos
    do {
        System.out.println("__________MENÚ PRINCIPAL__________\n  1. Usuarios\n  "
                + "2. Contador de Dígitos\n  3. Tres números de mayor a menor\n "
                + " 4. Calcular Promedio\n  5. Salir\n ");
                
        System.out.print("Ingresar opción: "); 
        ingreso = sc.nextInt();  

      
          switch (ingreso) {
            
            case 1:
               System.out.println("\n\n__________1. Usuarios__________\n ");

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
                            x = true; //si el usuario escoge la opción 4, x tomará el valor true 
                        break;
                
                    }   
                                                             
            break; // break del case 1 del switch(ingreso)
                

            case 2:
                
                System.out.println("\n\n\n");
                               
                
                int nu = 0;
                int a = 0;
                double b = 0 ;
                boolean val = false; //Para regresar al Submenu Contador de Digitos
                 
                do {  
                    System.out.println("__________2. Contador de Dígitos__________\n");
                    System.out.println(" 1. Ingresar número\n "
                    + "2. Mostrar número de dígitos\n "
                     + "3. Menú Principal\n");
                  
                  System.out.print("Ingresar opción:"); 
                  nu = sc.nextInt();
                  System.out.println("\n");  
                 
                  
                  switch (nu) {
                      
                      case 1:
                                          
                        System.out.println("\nIngresar un número"); 
                        a = sc.nextInt();
                        
                        if((a>0)&&(a<1000000)){
                                                                     
                        b = Math.floor( (Math.log(a))/Math.log(10) ) + 1 ;//floor para la parte entera del logaritmo
                      
                        val = true; 
                        x = false;
                        
                        }
                        else{
                            System.err.println("\n\nRango excedido, ingrese un número dentro del rango (0 - 100000)");
                            x = false;
                            val = true;
                        }
                      break;
                                           
                      case 2:
                          
                          System.out.println("\n\n\n El número "+ a +" tiene: " + b +" dígitos\n");  
                          x = false;
                          val = true;
                          break;
                         
                          
                      case 3:
                         System.out.println("\n\n\n");
                         x = true;
                         val = false;
                         break;
                 }
                  
                                  
            } while(val == true); // Para ciclo de Submenu Contador de digitos
                  
            break;        

            case 3:
                
                System.out.println("\n\n\n");
                
                int num = 0; // variable para el switch
                int n1 = 0;
                int n2 = 0;
                int n3 = 0;
                boolean val_1=false; //Para regresar al Submenu Tres numeros de mayor a menor
                
                                
                do {
                
                    System.out.println("__________Tres números de mayor a menor__________");
                    System.out.println(" 1. Ingresar números\n "
                    + "2. Mostrar ordenados\n "
                     + "3. Menú Principal\n");
                  
                  System.out.print("Ingresar opción:"); 
                  num = sc.nextInt();
                  System.out.println("\n");  
                  
                  
                  switch (num){
                  
                      case 1:
                      
                        System.out.println("\n Ingresar no.1: ");
                        n1 = sc.nextInt();
                        
                        System.out.println("\n Ingresar no.2: ");
                        n2 = sc.nextInt();
                        
                        System.out.println("\n Ingresar no.3: ");
                        n3 = sc.nextInt();
                        
                        val_1 = true; 
                        x = false;    
                      break;
                      
                      case 2:
                          
                          if( (n3>n2)&&(n2>n1) ){
                            System.out.println("Mayor: "+n3);  
                            System.out.println("Medio: "+n2);
                            System.out.println("Menor: "+n1);         
                           } 
        
                            else
                                if((n2>n3)&&(n3>n1)){
                                    System.out.println("Mayor: "+n2);  
                                    System.out.println("Medio: "+n3);
                                    System.out.println("Menor: "+n1);
                                }       
                           if ((n3>n1)&&(n1>n2)){
                                System.out.println("Mayor: "+n3);  
                                System.out.println("Medio: "+n1);
                                System.out.println("Menor: "+n2);
                            }
                              else 
                                 if((n2>n1)&&(n1>n3)){
                                    System.out.println("Mayor: "+n2);  
                                    System.out.println("Medio: "+n1);
                                    System.out.println("Menor: "+n3);
                                 }
                        if((n1>n2)&&(n2>n3)){
                            System.out.println("Mayor: "+n1);  
                            System.out.println("Medio: "+n2);
                            System.out.println("Menor: "+n3);
                        }
                          else
                            if((n1>n3)&&(n3>n2)){
                                System.out.println("Mayor: "+n1);  
                                System.out.println("Medio: "+n3);
                                System.out.println("Menor: "+n2);
            
            }
                      val_1 = true; 
                      x = false;         
                      break;
                      
                      case 3:
                          
                      System.out.println("\n\n\n");
                      val_1 = false; 
                      x = true;        
                      break;    
                  
                  
                  
                  }
                 
                
                } while(val_1==true);
                
                
                                   
                break;
                
            case 4:
              
                
                System.out.println("\n\n\n");
                
                int nume = 0; // variable para el switch
                boolean val_2=false; // para regresar a este submenú
                int ma [] [] = new int[6][6];
                int fil;
                int col;
                
             do {  
                System.out.println("\n\n\n"); 
                System.out.println("__________4. Calcular Promedio__________");
                System.out.println(" 1. Ingresar id y notas\n "
                    + "2. Mostrar tabla\n "
                     + "3. Menú Principal\n");
                
                  System.out.print("Ingresar opción:"); 
                  nume = sc.nextInt();
                  System.out.println("\n");
                
                switch(nume){
                    case 1:
                        Scanner ado = new Scanner(System.in); 
                        Scanner gio = new Scanner(System.in); 
      
                        
                    
                         
                        for(fil = 0; fil<ma.length; fil++){
               
                           System.out.println("Ingresar id:");
                           ma[fil][0] = ado.nextInt();    
               
                             for(col = 1; col<5; col++){
               
                                System.out.println("Ingresar nota:"+ col );
               
                                ma[fil][col] = gio.nextInt();
               
                                ma[fil][5]=(ma[fil][1]+ma[fil][2]+ma[fil][3]+ma[fil][4])/4;   
                            } 
           
           
                        }  
      
                            val_2 = true;    
                            x = false;
                            break;
                    
                    case 2:
                        
                      for(fil = 0; fil<ma.length; fil++){             
                        for(col = 0; col<ma.length; col++){
                
                        System.out.print("\t"+ma[fil][col]+" ");
                
                        }
                            System.out.println("");
                      }  
                        
                                           
                    val_2 = true;    
                    x = false;
                    break;    
                    
                    case 3:
                    
                    System.out.println("\n\n\n");
                    val_2 = false; 
                    x = true;        
                    break;    
                }   
                
             } while(val_2==true);
             
             break;
            
            default:
            
                System.out.println("\n\n ------Adiós-------");
                x = false;
                break;
        }
          
     }   while (x == true ); // Comparando el valor de la variable x
        
    } 
      
      
    
}
