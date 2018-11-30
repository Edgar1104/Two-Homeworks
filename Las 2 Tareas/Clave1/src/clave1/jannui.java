/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package clave1;

/**
 *
 * @author edgar
 */
public class jannui {
    
    public static void jannui(int disks, int I, int A, int D)
                   {
                   if (disks == 1)
                    {
                        System.out.println("Moviendo de la torre "+I+" a la torre "+D);
                    }
                    else
                    {
                        jannui(disks -1, I, D, A);
                        System.out.println("Moviendo de la torre "+I+" a la torre "+D);
                        jannui(disks -1, A, I, D);
                    }
                    }
}
