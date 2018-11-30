/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ecuacionesdif;

import java.util.Scanner;
/**
 *
 * @author edgar
 */
public class EcuacionesDif {

      
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner leer = new Scanner(System.in);
        
        
        int op;
        
        
        do{
            System.out.println("-------MENU-------");
            System.out.println("1. Runga Kuta");
            System.out.println("2. Newton Rapzor");
            System.out.println("3. Bitacora");
            System.out.println("4. Salir");
            System.out.print("Ingrese su opcion: ");
           op = leer.nextInt(); 
           
           switch(op)
           {
               case 1:
               {
                   System.out.println("        ");
                   System.out.println("Funcion:");
                   System.out.println("        ");
                   System.out.println("y' = f(x,y)= y - t ^ 2 + 1");
                   System.out.println("y(0) = 0.5");
                   System.out.println("         ");
                   RungeKutta runge = new RungeKutta();
                   runge.calculate();
                   System.out.println("        ");
                   break;
               }
               case 2:
               {
                   IFuncion f = new UnaFuncion()
                   {
                       @Override
                       public double eval(double x) {
                           return x*x-2;
                       }
                       
                   };
                   IFuncion df = new UnaFuncion() {
                       @Override
                       public double eval(double x) {
                          return 2*x;
                       }
                   };
                   NewtonRaphson nr = new NewtonRaphson();
                   
                   System.out.println("        ");
                   System.out.println("Raiz Cuadrada de 2: ");
                   System.out.println("        ");
                   
                   System.out.println(nr.raiz(f, df, 1, 1e-6, 100));
                   System.out.println("        ");
                   break;
               }
               case 3:
               {
                   System.out.println("        ");
                   System.out.println("Funcion:");
                   System.out.println("        ");
                   System.out.println("y' = f(x,y)= y - t ^ 2 + 1");
                   System.out.println("y(0) = 0.5");
                   System.out.println("         ");
                   RungeKutta runge = new RungeKutta();
                   runge.calculate();
                   System.out.println("        ");
                   IFuncion f = new UnaFuncion()
                   {
                       @Override
                       public double eval(double x) {
                           return x*x-2;
                       }
                       
                   };
                   IFuncion df = new UnaFuncion() {
                       @Override
                       public double eval(double x) {
                          return 2*x;
                       }
                   };
                   NewtonRaphson nr = new NewtonRaphson();
                   
                   System.out.println("        ");
                   System.out.println("Raiz Cuadrada de 2: ");
                   System.out.println("        ");
                   
                   System.out.println(nr.raiz(f, df, 1, 1e-6, 100));
                   System.out.println("        ");
                   
               break;
               }
               case 4:
               {
                   System.exit(0);
               }
               
           }
           
        }while(op !=0);
    
}
}
