/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ecuacionesdif;

/**
 *
 * @author edgar
 */
public class RungeKutta {
    public double mathfunc(double t, double y)
    {
        return y-t*t+1;
    }
    public void calculate()
    {
        double y = 0.5;
        double h = 0.1;
        
        double t = 0;
        
        while( t < 2)
        {
            double k1 = h*mathfunc(t,y);
            double k2 = h*mathfunc(t+0.5*h,y+0.5*k1);
            double k3 = h*mathfunc(t+0.5*h,y+0.5*k2);
            double k4 = h*mathfunc(t+h,y+k3);
            double yo = y;
            y += (k1+k2+k3+k4)/6;
            System.out.println("f("+t+","+yo+") = "+y);
            t+=h;
        }
    }
}
