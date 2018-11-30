/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package clave1;

import java.util.Scanner;
/**
 *
 * @author edgar
 */
public class Clave1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int op;
        Scanner leer = new Scanner(System.in);
        
        
        do{
            System.out.println("-------MENU-------");
            System.out.println("1. Torres de Hanoie");
            System.out.println("2. Montecarlo");
            System.out.println("3. Salir");
            System.out.print("Ingrese su opcion: ");
           op = leer.nextInt(); 
            
           switch(op)
           {
               
               case 1:
               {
                   System.out.println("Ingrese cuantos discos son: ");
                   int disks = leer.nextInt();
                   jannui.jannui(disks, 1, 2, 3);
                   int movimientos = (int)(Math.pow(2, disks) -1);
                   System.out.println("El numero minimo de movimientos para "+disks+" discos es "+movimientos+" movimientos.");
                   break;   
               }
               
               
               case 2:
               {
                   MountCarlo MC = new MountCarlo();
                   for(int i = 0;i < MC.totalsim; i++ )
                    {
                    MC.suma = (float) (MC.suma +Math.random());
                    }
                   MC.resultadosim = MC.suma/MC.totalsim;
                   System.out.println("La resultado tras montecarlo fue: "+MC.resultadosim);
                break;
               }
               case 3:
               {
                   System.exit(0);
               }
            }
           
        }while (op!=0);
    

   
}
}

